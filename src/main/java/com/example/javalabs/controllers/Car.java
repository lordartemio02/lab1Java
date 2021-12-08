package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;

public class Car implements ICar {
    @Override
    public void GoTo() {
        System.out.println("Ездим по кругу");
    }

    @Override
    public void GoTo(String path) {
        System.out.println("Ехать в " + path);
    }
}
