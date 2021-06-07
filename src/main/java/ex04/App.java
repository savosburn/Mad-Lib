/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex04;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String myNoun = myApp.readNoun();
        String myVerb = myApp.readVerb();
        String myAdjective = myApp.readAdjective();
        String myAdverb = myApp.readAdverb();

        // Interpolation
        String interpolation = myApp.interpolateString(myNoun, myVerb, myAdjective, myAdverb);

        // Output
        myApp.printOutput(interpolation);
    }

    public String readNoun() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }

    public String readVerb() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    public String readAdjective() {
        System.out.print("Enter an adjective: ");
        return in.nextLine();
    }

    public String readAdverb() {
        System.out.print("Enter an adverb: ");
        return in.nextLine();
    }

    public String interpolateString(String noun, String verb, String adjective, String adverb) {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }

    public void printOutput(String out) {
        System.out.println(out);
    }
}
