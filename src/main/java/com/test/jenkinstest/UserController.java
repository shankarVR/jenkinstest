package com.test.jenkinstest;

import com.test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@GetMapping("/user")
    public String getUser(){
    return new User("Shankar","V","R",39).getUser();
}

@GetMapping("greet")
    public String greet(){
    return "Hello";
}


}


