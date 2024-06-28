package com.example.recyclerviewapplication;

import java.util.ArrayList;

public class DataModel {
    private static DataModel instance = new DataModel();

    private DataModel(){
        products.add(
                new Product("Maça",1)
        );
        products.add(
                new Product("Banana",1)
        );
        products.add(
                new Product("Alface",3)
        );
        products.add(
                new Product("Pão",10)
        );
        products.add(
                new Product("Nescau",18)
        );
        products.add(
                new Product("Toddy",18)
        );
        products.add(
                new Product("Carne",20)
        );
        products.add(
                new Product("Iogurte",10)
        );
        products.add(
                new Product("Frango",12)
        );
    }

    public static DataModel getInstance() {
        return instance;
    }

    public ArrayList<Product>products = new ArrayList<>();
}
