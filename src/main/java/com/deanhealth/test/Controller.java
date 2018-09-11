package com.deanhealth.test;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value="SonarqubeTest Rest controller")
@RestController
public class Controller {

    @RequestMapping(value="/helloWorld",method= RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }
}
