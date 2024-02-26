package com.javaacademy;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

/**
 * Картон
 */
@Data
public class Cartoon {
    @NonNull
    @EqualsAndHashCode.Exclude
    public double weight;
}
