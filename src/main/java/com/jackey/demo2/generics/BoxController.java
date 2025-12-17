package com.jackey.demo2.generics;

public class BoxController {
    public static void main(String[] args) {
        //Using BoxString
        BoxString strBox = new BoxString();
        strBox.setValue("Hello Generics");
        String strValue = strBox.getValue();
        System.out.println(strValue);


        // Using BoxInteger
        BoxInteger intBox = new BoxInteger();
        intBox.setValue(5);
        Integer intValue = intBox.getValue();
        System.out.println("Integer Value: " + intValue);

        // Using BoxPencil
        BoxPencil pencilBox = new BoxPencil();
        Pencil pencil = new Pencil();
        pencil.setColor("Red");
        pencilBox.setValue(pencil);
        Pencil retrievedPencil = pencilBox.getValue();
        System.out.println("Pencil Color: " +retrievedPencil.getColor());


    }
}
