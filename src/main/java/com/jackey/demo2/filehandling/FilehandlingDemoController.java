package com.jackey.demo2.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilehandlingDemoController {
    public static void main(String[] args) throws FileNotFoundException {
        // Checked Exception => this is the exception which is checked at compile time.
//        FileReader file = null;
//        BufferedReader bufferedReader = null;
//        try {
//            file = new FileReader("src/main/resources/demo.txt");
//            bufferedReader = new BufferedReader(file);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                int a = Integer.parseInt(line.split(" ")[0]);
//                int b = Integer.parseInt(line.split(" ")[1]);
//                System.out.println(a + b);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found exception occurred: " + e.getMessage());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            try {
//                bufferedReader.close();
//            }catch (IOException e){
//                throw new RuntimeException(e);
//            }
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/demo.txt"))){
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                int a = Integer.parseInt(line.split(" ")[0]);
//                int b = Integer.parseInt(line.split(" ")[1]);
//                System.out.println(a + b);
//            }
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }

        String path ="src/main/resources/demo.txt";
        // Try-with-resources
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                String[] parts = line.split(" ");
                try {
                    int a = Integer.parseInt(parts[0]);
                    int b = Integer.parseInt(parts[1]);
                }catch (NumberFormatException e){
                    System.out.println("Invalid number found! Skipping...");
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}


