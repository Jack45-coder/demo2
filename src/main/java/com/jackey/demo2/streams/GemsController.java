package com.jackey.demo2.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GemsController {
    public static void main(String[] args) {
        Supplier<String> colorSupplier = () -> {
            String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};
            int randomIndex = (int) (Math.random() * colors.length);
            return colors[randomIndex];
        };

        Supplier<Integer> capacitySupplier = () -> (int) (Math.random()*10)+1;
        List<Gems> gemsList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            gemsList.add(createAGems(capacitySupplier, colorSupplier));
        }

        for (Gems gems : gemsList){
            System.out.println("Gems with capacity: " +gems.getCapacity() + " ");
            for (Gem gem : gems.getGemList()){
                System.out.println(" Gem color: " + gem.getColor());
            }
        }

        // source -> io -> to

        System.out.println(gemsList.stream().flatMap(gems -> gems.getGemList().stream())
                .filter(gem -> gem.getColor().equals("Yellow")).count());
//                .forEach(gem -> System.out.println("Streamed Gem color: "+gem.getColor()));

        // count of gems by color
        Map<String, Long> gemColorMap = gemsList.stream().flatMap(gems -> gems.getGemList().stream()).collect(Collectors.groupingBy(
                Gem::getColor,
                Collectors.counting()
        ));
        gemColorMap.forEach((color, count) -> System.out.println("Color: "+ color + " Count: " + count));
    }

    private static Gems createAGems(Supplier<Integer> capacitySupplier, Supplier<String> colorSupplier){
        Gems gems = new Gems(capacitySupplier.get());
        for (int j = 0; j < gems.getCapacity(); j++){
            String color = colorSupplier.get();
            Gem gem = new Gem(color);
            gems.getGemList().add(gem);
//            System.out.println("Added Color: "+color);
        }
        return gems;
    }
}
