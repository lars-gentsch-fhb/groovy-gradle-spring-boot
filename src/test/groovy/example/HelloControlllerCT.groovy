package example

import spock.lang.Specification

class HelloControlllerCT extends Specification {

	def "GET on Hello resource returns a 200OK and a non-empty body"() {
		expect: println "Hello, I am a ComponentTest!" 
	}
}
