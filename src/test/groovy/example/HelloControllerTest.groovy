package example

import spock.lang.Specification

class HelloControllerTest extends Specification {

	HelloController helloController = new HelloController()
	
	void "Return a greeting when called"() {
		when: def greeting = helloController.index()
		then:
		greeting
	}

}
