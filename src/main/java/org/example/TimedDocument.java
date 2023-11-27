package org.example;

import java.time.Duration;
import java.time.Instant;

public class TimedDocument implements Document {
    private Document document;
    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        Instant start = Instant.now();
        String result = document.parse();
        Instant end = Instant.now();
        long elapsedTime = Duration.between(start, end).toMillis();

        System.out.println("Time taken (milliseconds): " + elapsedTime);
        return result;
    }
}
