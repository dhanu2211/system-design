package org.example;

import org.example.objects.factory;
import org.example.objects.shape;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //client is not creating the object here
        System.out.println("Enter the shape you want to print");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        factory fac = new factory();

        shape object = fac.getShape(type);
        object.draw();
    }
}