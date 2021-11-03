package com.example.test2.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class User {
    UUID id;
    String name;
    Currency currency;
}
