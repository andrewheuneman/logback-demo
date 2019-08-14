package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/example")
public class ExampleController {

    @GetMapping(path="/success", produces = "application/json")
    public String success()
    {
        return "{'ok':True}";
    }
    @GetMapping(path="/fail", produces = "application/json")
    public String fail() throws Exception {
        throw new Exception("Failure Example Exception");
//        return "{'ok':False}";
    }

}
