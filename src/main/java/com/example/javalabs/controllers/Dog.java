package com.example.javalabs.controllers;
import com.example.javalabs.interfaces.IPet;

public class Dog implements IPet
{
    @Override
    public void MakeASound(){
        System.out.println("Мой Пёсель");
    }
}