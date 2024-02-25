package com.javaacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.NonNull;
import lombok.Setter;

/**
 * Город
 */
@AllArgsConstructor
@Getter
@ToString(of = {"name"})
public class City {
    @NonNull
    public final String name;
    @Setter
    public int peopleCount;

    public Garbage[] createGarbage() {
        return new Garbage[] {
            new Garbage(GarbageType.GLASS, 1000d, this.name),
            new Garbage(GarbageType.PAPER, 15000d, this.name),
            new Garbage(GarbageType.MIXED, 200000d, this.name),
        };
    }
}