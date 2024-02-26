package com.javaacademy;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Garbage {
    private final GarbageType garbageType;
    private final double weight;
    private final String cityFrom;
}