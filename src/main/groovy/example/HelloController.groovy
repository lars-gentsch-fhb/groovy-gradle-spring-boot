package example

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloController {

    @RequestMapping("/")
    String index() {
        return "\n Greetings from Spring Boot! \n"
    }

}