package com.example.chatcilent.dto;

import java.util.List;

public record DinnerIdea(
        String title,
        List<String> productsUsed,
        List<String> extraIngredients,
        List<String> steps
) {}
