package com.ge.portbinding;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/demo")
    @ResponseStatus(HttpStatus.OK)
    public String doSomething() {
        return "OK";
    }

}
