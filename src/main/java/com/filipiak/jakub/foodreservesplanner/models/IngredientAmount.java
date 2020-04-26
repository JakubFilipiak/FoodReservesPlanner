package com.filipiak.jakub.foodreservesplanner.models;

import lombok.Data;

/**
 * Created by Jakub Filipiak on 26.04.2020
 */

@Data
public class IngredientAmount {

    private double amount;
    private IngredientUnit unit;
}
