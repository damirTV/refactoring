package com.javaacademy;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Фабрика по переработке мусора
 */
public class UtilizationFactory {
    public static final double BOTTLE_SIZE = 500;

    private UtilizationFactory() {
    }

    @SneakyThrows
    private static Bottle refactorGlassGarbage(Garbage garbage) {
        if (garbage.getGarbageType() != GarbageType.GLASS) {
            throw GarbageNotRefactorableException.builder()
                    .message("Мусор не состоит полностью из стекла!")
                    .build();
        }
        return new Bottle(BOTTLE_SIZE, garbage.getCityFrom());
    }

    @SneakyThrows
    private static Cartoon refactorPaperGarbage(Garbage garbage) {
        if (garbage.getGarbageType() != GarbageType.PAPER) {
            throw GarbageNotRefactorableException.builder()
                    .message("Мусор не состоит полностью из бумаги!")
                    .build();
        }
        return new Cartoon(garbage.getWeight() / 2);
    }

    public static void refactorGarbage(Garbage[] garbageArray, BufferedWriter journal)
            throws GarbageNotRefactorableException, IOException {
        for (Garbage garbage : garbageArray) {
            switch (garbage.getGarbageType()) {
                case GLASS -> journal.write(new JournalRecord(UtilizationFactory.refactorGlassGarbage(garbage)).toString());
                case PAPER -> journal.write(new JournalRecord(UtilizationFactory.refactorPaperGarbage(garbage)).toString());
                default -> journal.write(new JournalRecord(garbage.getWeight()).toString());
            }
        }
    }
}
