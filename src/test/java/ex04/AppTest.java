/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_noun_adjective_verb_adverb_and_story() {
        App myApp = new App();

        String noun = "dog";
        String verb = "walk";
        String adjective = "blue";
        String adverb = "quickly";

        String expectedOutput = "Do you walk your blue dog quickly? That's hilarious!";

        String actualOutput = myApp.interpolateString(noun, verb, adjective, adverb);

        assertEquals(expectedOutput, actualOutput);
    }
}