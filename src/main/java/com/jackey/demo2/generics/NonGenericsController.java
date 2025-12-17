package com.jackey.demo2.generics;

public class NonGenericsController {
    public static void main(String[] args) {
        NonGenericsBox nonGenericsBoxA = new NonGenericsBox();
        NonGenericsBox nonGenericsBoxB = new NonGenericsBox();
        NonGenericsBox nonGenericsBoxC = new NonGenericsBox();

        Pencil pencil = new Pencil();
        pencil.setColor("Blue");

        nonGenericsBoxA.setValue("Hii My Name: Jackey!");
        nonGenericsBoxB.setValue(1234);
        nonGenericsBoxC.setValue(pencil);

        System.out.println(nonGenericsBoxA.getValue());
        System.out.println(nonGenericsBoxB.getValue());
        // type casting needed
        System.out.println(((Pencil)nonGenericsBoxC.getValue()).getColor());
    }
}
