package com.javaacademy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Runner
 * Создает город, который является источником мусора
 * Город, создает мусор
 * Далее, создается журнал переработки (файл journal.txt в корневой папке)
 * После чего происходит процесс переработки
 */
public class Runner {
    public static void main(String[] args) throws IOException, GarbageNotRefactorableException {
        City paris = new City("Paris", 10_000_000);
        Garbage[] garbageArray = paris.createGarbage();
        try (BufferedWriter journal = new BufferedWriter(new FileWriter("journal.txt"))) {
            UtilizationFactory.refactorGarbage(garbageArray, journal);
        }
    }
}

