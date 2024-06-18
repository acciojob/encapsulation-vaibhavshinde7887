package com.driver;

public class Main {
    public static void main(String[] args) {
     RWOnly rwOnly = new RWOnly();
//     RWOnly.name = "Vaibhav";
//     System.out.println(RWOnly.name);
        rwOnly.setName("Vaibhav");
        System.out.println(rwOnly.getName());
    }
}