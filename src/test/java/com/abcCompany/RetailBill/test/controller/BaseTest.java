package com.abcCompany.RetailBill.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseTest {

    public String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
