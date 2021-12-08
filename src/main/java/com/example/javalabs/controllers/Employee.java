package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import com.example.javalabs.interfaces.IPet;

public class Employee {
    private IPet pet;
    private ICar car;
    private String name;
    private int age;
    private String path;

    public Employee(IPet pet){
        this.pet = pet;
    }
    public void setCar(ICar car){
        this.car = car;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPath(String path){
        this.path = path;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){ return this.age; }

    public void CallMethods(){
        pet.MakeASound();
        car.GoTo();
        car.GoTo(this.path);
    }
}
