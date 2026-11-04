package com.example.chatcilent.dto;

import java.math.BigDecimal;

public record DiscountedProductDto (
    String offerId,
    String name,
    BigDecimal price,
    String currency,
    String image
){}
