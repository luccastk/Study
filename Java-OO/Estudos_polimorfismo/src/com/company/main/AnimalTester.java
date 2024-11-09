package com.company.main;

import com.company.animals.Animal;
import com.company.animals.Bird;
import com.company.animals.Cat;
import com.company.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class AnimalTester {
    public static void main(String[] args) {
        Animal cachorro = new Dog();
        Animal gato = new Cat();
        Animal animal = new Animal();

        cachorro.makeSound();
        gato.makeSound();
        animal.makeSound();

        System.out.println("-----------------------------");

        Animal passaro = new Bird();

        List<Animal> meusAnimais = new ArrayList<>();

        meusAnimais.add(cachorro);
        meusAnimais.add(gato);
        meusAnimais.add(passaro);

        for (int i = 0; i < meusAnimais.size(); i++) {
            meusAnimais.get(i).makeSound();
        }
    }
}