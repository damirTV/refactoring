package com.javaacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public enum GarbageType {
    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");
    @NonNull
    private final String value;
}
