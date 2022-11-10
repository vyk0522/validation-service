package com.onejava.controller;

import com.onejava.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/validations")
public class ValidationController {
    @Autowired
    private ValidationService validationService;

    @GetMapping("/password")
    public boolean validatePassword(String password){
        return validationService.validate(password);
    }
}
