package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a piece to move and a location to move to:");
            String message = scanner.nextLine();
            engine.handleMessage(message);
        }
    }
}
