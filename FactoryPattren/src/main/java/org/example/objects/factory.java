package org.example.objects;

public class factory {
    public shape getShape(String type){
        if(type.equalsIgnoreCase("circle")){
            return new circle();
        }
        else if(type.equalsIgnoreCase("square")){
            return new square();
        }
        else {
            return null;
        }
    }
}
