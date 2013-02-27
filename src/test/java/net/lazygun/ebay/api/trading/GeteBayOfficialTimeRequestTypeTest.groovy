package net.lazygun.ebay.api.trading

import spock.lang.Specification

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBIntrospector
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller

class GeteBayOfficialTimeRequestTypeTest extends Specification {

    def token = System.properties.token
    def endpoint = new URL(System.properties.endpoint as String ?: "https://api.sandbox.ebay.com/ws/api.dll")
    def headers = [
        'X-EBAY-API-COMPATIBILITY-LEVEL': 805,
        'X-EBAY-API-DEV-NAME': System.properties.devId,
        'X-EBAY-API-APP-NAME': System.properties.appId,
        'X-EBAY-API-CERT-NAME': System.properties.certId,
        'X-EBAY-API-SITEID': 0,
        'X-EBAY-API-CALL-NAME': 'GeteBayOfficialTime'
    ]
    Marshaller marshaller
    Unmarshaller unmarshaller
    def request

    URLConnection prepareConnection() {
        def connection = endpoint.openConnection() as HttpURLConnection
        headers.each { header, value -> connection.addRequestProperty(header, value as String) }
        connection.setDoOutput(true)
        connection.setRequestMethod('POST')
        connection
    }

    def setup() {
        def context = JAXBContext.newInstance('net.lazygun.ebay.api.trading')
        marshaller = context.createMarshaller()
        unmarshaller = context.createUnmarshaller()
        request = new GeteBayOfficialTimeRequestType()
        request.requesterCredentials = new XMLRequesterCredentialsType(eBayAuthToken: token)
    }

    def "request is marshalled correctly"() {
        when:
        def writer = new StringWriter()
        marshaller.marshal(request, writer)
        writer.close()

        then:
        writer.toString() == '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>' +
            '<GeteBayOfficialTimeRequest xmlns="urn:ebay:apis:eBLBaseComponents">' +
            '<RequesterCredentials>' +
            "<eBayAuthToken>$token</eBayAuthToken>" +
            '</RequesterCredentials>' +
            '</GeteBayOfficialTimeRequest>'

    }

    def "get eBay official time"() {
        when:
        def connection = prepareConnection()
        marshaller.marshal(request, connection.outputStream)
        def result = JAXBIntrospector.getValue(unmarshaller.unmarshal(connection.content as InputStream))

        then:
        result instanceof GeteBayOfficialTimeResponseType
        result.errorsLength == 0
        result.timestamp?.time != null
    }

}