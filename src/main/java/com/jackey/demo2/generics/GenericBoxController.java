package com.jackey.demo2.generics;

// What are the Generics ?
// -> Generics enable types (Classes and interfaces) to be parameters when  defining classes, interfaces and methods.
// -> allows you to write type safe and reusable code by parameterizing types.

// Why Generics ?
// -> Code Reusability: Write Once, use multiple times with different data types.
// better compile type safety or checking

public class GenericBoxController {
    public static void main(String[] args) {
        //Using Generic Box
        Box<Pencil> pencilBox = new Box<>();
        Pencil pencil = new Pencil();
        pencil.setColor("Black");
        pencilBox.setValue(pencil);
        // automatic casting
        System.out.println("Pencil Color: " + pencilBox.getValue().getColor());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println("Integer Value: " + intBox.getValue());

        // Using Non-Generics Boxes
        BoxInteger boxInteger = new BoxInteger();
        boxInteger.setValue(456);
        // helps you with type safety
        // intBox.setValue(pencil);
        System.out.println("Box Integer value:  "+ boxInteger.getValue());
    }
}
