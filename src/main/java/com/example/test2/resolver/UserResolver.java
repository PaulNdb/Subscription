package com.example.test2.resolver;

import java.util.UUID;
import com.example.test2.domain.User;
import com.example.test2.domain.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserResolver implements GraphQLQueryResolver {
    public User user(UUID id){
        log.info("Retrieving user info:{}", id);

       return User.builder().id(id).name("Paul").currency(Currency.USD).currency(Currency.BTC).build();

    }
}
