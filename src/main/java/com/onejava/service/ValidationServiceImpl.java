package com.onejava.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validate(String input) {
        return true;
    }
}
