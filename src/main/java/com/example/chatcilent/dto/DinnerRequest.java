package com.example.chatcilent.dto;

import java.util.List;

public record DinnerRequest(
        List<DiscountedProductDto> products,
        String mealType
) {}
