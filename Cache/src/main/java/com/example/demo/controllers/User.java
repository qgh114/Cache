package com.example.demo.controllers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {
    private int id;

    public User(int id)
    {

    }

    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
