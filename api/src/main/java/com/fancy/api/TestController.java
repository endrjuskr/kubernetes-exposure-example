package com.fancy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private IPersonService personService;

    private boolean checkDatabaseConnection() {
        try {
            int count = personService.findAll().size();
            System.out.println(String.format("Found %d people.", count));
            return count == 3;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @RequestMapping("/check")
    public String check() {
        return checkDatabaseConnection() ? "Everything is all right" : "Can't connect to database";
    }
}
