package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

@RestController
public class HelloController {
    
    private final List<Quote> quotes = Arrays.asList(
        new Quote("Be yourself; everyone else is already taken.", "Oscar Wilde"),
        new Quote("Do what you can, with what you have, where you are.", "Theodore Roosevelt"),
        new Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"),
        new Quote("It's not whether you get knocked down, it's whether you get up.", "Vince Lombardi"),
        new Quote("The way to get started is to quit talking and begin doing.", "Walt Disney")
    );
    
    private final Random random = new Random();

    @GetMapping("/quote")
    public Quote getRandomQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }

    @GetMapping("/quotes")
    public List<Quote> getAllQuotes() {
        return quotes;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to the Fun Quotes API!";
    }
}