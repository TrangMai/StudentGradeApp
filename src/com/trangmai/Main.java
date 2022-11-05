package com.trangmai;

import java.util.Scanner;

public class Main {
    static int score1;
    static int score2;
    static int score3;
    static double averageScore = 0;
    static char grade;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Grade App");
        System.out.println("-------------------\n");

        System.out.println("Please enter the first score: ");
        score1 = Integer.parseInt(input.nextLine());
        System.out.println("\n");

        System.out.println("Please enter the second score: ");
        score2 = Integer.parseInt(input.nextLine());
        System.out.println("\n");

        System.out.println("Please enter the third score: ");
        score3 = Integer.parseInt(input.nextLine());
        System.out.println("\n");

        averageScoreCalculator(score1, score2, score3);

        System.out.println("The average score of the results is " + averageScore);
        System.out.println("The grade that has been awarded is: " + grade);

        System.out.println("Please press enter to continue... ");
        input.nextLine();
    }

    public static void averageScoreCalculator(int score1, int score2, int score3){
        if (score1 > 100 || score2 > 100 || score3 > 100){
            throw new IllegalArgumentException("Score should be smaller or equal than 100");
        } else if (score1 < 0 || score2 < 0 || score3 < 0) {
            throw new IllegalArgumentException("Score should be greater or equal 0");
        }
        else {
            averageScore = (score1 + score2 + score3)/3;
            gradeCalculator(averageScore);
        }
    }
    
    public static char gradeCalculator(double averageScore){
        if (averageScore >= 90){
            return grade = 'A';
        } else if (averageScore >= 70) {
            return grade = 'B';
        }
        else if (averageScore >= 60) {
            return grade = 'C';
        }
        else if (averageScore > 50) {
            return grade = 'D';
        }
        else {
            return grade = 'F';
        }
    }


}
