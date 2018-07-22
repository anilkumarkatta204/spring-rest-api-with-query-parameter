package com.anilkumar.katta;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping(value="/greeting", method = RequestMethod.POST)
    public Greeting greeting(@RequestParam(value="name") String name) {
        return new Greeting(name);
    }

}
