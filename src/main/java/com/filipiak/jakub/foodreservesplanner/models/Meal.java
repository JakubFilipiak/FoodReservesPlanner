package com.filipiak.jakub.foodreservesplanner.models;

/**
 * Created by Jakub Filipiak on 26.04.2020
 */

import lombok.Data;

import java.util.Map;

@Data
public class Meal {

    private String name;
    private int portionsNumber;
    private Map<Ingredient, IngredientAmount> ingredientsAmount;
}
