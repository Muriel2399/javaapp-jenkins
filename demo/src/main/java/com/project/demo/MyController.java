package com.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/home")
    public String home() {
        return "index"; // This maps to /WEB-INF/views/home.jsp
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // This maps to /WEB-INF/views/about.jsp
    }
}