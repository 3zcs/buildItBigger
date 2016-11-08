package com.example;

import java.util.Random;

public class MyClass {
    String Jokes [] = new String[]{
        "Joke 1", "Joke 2","Joke 3","Joke 4"};

    public String getter(){
        Random random = new Random();
        int a = random.nextInt(3);
        return Jokes[a];
    }
}
