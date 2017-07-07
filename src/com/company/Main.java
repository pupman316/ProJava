package com.company;

import java.io.IOException;
import java.lang.System;
import java.io.Console;

// Comment added 7-6-17 @ 9:57
public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseEntity beOne = new BaseEntity("Bart", 16);

        System.out.print(beOne.TakeDamage(12));

        // Handles the "pause" so output can be seen before window closes
//        try {
//            System.in.read();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
