package com.jxjxjxm.apptest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @RequestMapping(value="/simple", method=RequestMethod.GET)
    public String hello(){
        return "Hola";
    }

    @RequestMapping(value="/simple/{name}", method=RequestMethod.GET)
    public String hello(@PathVariable String name){

        return "Hola "+name;
    }

    @RequestMapping(value="/simple2", method=RequestMethod.GET)
    public String helloName(@RequestParam String name){

        return "Hola "+name;
    }
}