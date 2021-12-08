package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.IPet;

public class Cat implements IPet
{
    @Override
    public void MakeASound(){
        System.out.println("Моя кыця");
    }
}
