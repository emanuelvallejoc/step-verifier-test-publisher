package org.example.demo.services;

import reactor.core.publisher.Flux;

public class UppercaseConverter {
    private final Flux<String> source;

    public UppercaseConverter(Flux<String> source) {
        this.source = source;
    }
    Flux<String> getUpperCase() {
        return source
                .map(String::toUpperCase);
    }
}
