package com.example.demo;

import java.util.HashMap;

public class Cache extends HashMap<Integer, String> {

    public String get(String key)
    {
        return key;
    }


    public void set(int key, String value)
    {
        super.put(key, value);
    }


    public boolean has(int key)
    {
        return super.containsKey(key);
    }


    public void delete (int key)
    {
        super.remove(key);
    }

}
