package com.nmuzychuk;

import java.util.Random;

public final class RandomNameGenerator {
    private static final String[] ADJECTIVES = {
            "important", "large", "popular", "mad", "lonely",
            "hot", "useful", "scared", "old", "healthy", "strong",
            "cute", "helpful", "nice", "serious", "rare",
            "pretty", "hungry", "famous", "careful", "boring",
            "strict", "angry", "lucky", "anxious", "curious"
    };

    private static final String[] NOUNS = {
            "alligator", "bear", "bird", "camel", "chicken",
            "cow", "deer", "dog", "dolphin", "duck",
            "elephant", "fish", "goat", "hamster", "lion",
            "octopus", "panda", "rabbit", "shark", "spider",
            "squirrel", "tiger", "turtle", "wolf", "zebra"
    };

    private RandomNameGenerator() {
    }

    public static String getName() {
        int i;
        String template = "%s_%s";

        i = new Random().nextInt(ADJECTIVES.length);
        String adj = ADJECTIVES[i];

        i = new Random().nextInt(NOUNS.length);
        String noun = NOUNS[i];

        return String.format(template, adj, noun);
    }
}
