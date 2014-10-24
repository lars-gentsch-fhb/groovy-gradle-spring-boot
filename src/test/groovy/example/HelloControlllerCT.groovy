package example

import spock.lang.Specification

class HelloControlllerCT extends Specification {

    def "GET on Hello resource returns a 200OK and a non-empty body"() {
        when: def data = new URL('http://localhost:8080/').getText()
        then: data
    }

    def "GET on Info resource returns a 200OK and a non-empty body"() {
        when: def data = new URL('http://localhost:8080/info').getText()
        then: data
    }
}