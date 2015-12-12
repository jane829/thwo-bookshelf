package com.thoughtworks.jimmy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ModelAndView greeting(@PathVariable String name) {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("hello");
        modelAndView.addObject("name",  name.toUpperCase());

        return modelAndView;

    }

}
