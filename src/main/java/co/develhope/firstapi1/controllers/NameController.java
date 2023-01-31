package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/name")
public class NameController {
    private String name = "Marco";

    @GetMapping("/")
    public String getNameController() {
        return "My name is" + name;
    }

    @PostMapping ("/")
    public String sayReverseName() {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}