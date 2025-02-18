package com.java.wipro;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/game_db";
        String user = "root";
        String password = "Madhuri@1234";
        
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        
        System.out.println("Guess the number between 1 and 100");
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        // Store player data in the database
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database.");
            
            String sql = "INSERT INTO players (name, attempts) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, playerName);
                pstmt.setInt(2, attempts);
                pstmt.executeUpdate();
                System.out.println("Game data saved successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }
}

