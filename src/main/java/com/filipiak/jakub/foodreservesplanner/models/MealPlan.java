package com.filipiak.jakub.foodreservesplanner.models;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by Jakub Filipiak on 26.04.2020
 */

@Data
public class MealPlan {

    private List<Meal> meals;
    private Map<Ingredient, IngredientAmount> totalIngredientsAmount;
}
