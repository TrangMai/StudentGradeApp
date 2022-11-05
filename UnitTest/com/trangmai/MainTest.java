package com.trangmai;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

//    @Test
//    public void averageScoreCalculator() {
//        fail();
//    }

    @Test
    public void averageScore_100() {
        assertTrue(Main.gradeCalculator(100)=='A');
    }

    @Test
    public void averageScore_50() {
        assertTrue(Main.gradeCalculator(50)=='F');
    }

    @Test
    public void averageScore_0() {
        assertTrue(Main.gradeCalculator(0)=='F');
    }


    @Test(expected = IllegalArgumentException.class)
    public void anyScoreInput_Below() {
        int score1 = 50;
        int score2 = 40;
        int score3 = -10;
        Main.averageScoreCalculator(score1, score2, score3);

//        try{
//            Main.averageScoreCalculator(score1, score2, score3);
//        }
//        catch (Exception ex){
//            Assert.assertThrows(IllegalArgumentException.class, () -> Main.averageScoreCalculator(score1,score2,score3));
//            return;
//        }
//        Assert.fail("The expected exception was not thrown");
    }

    @Test(expected = IllegalArgumentException.class)
    public void anyScoreInput_Above100() {
        int score1 = 90;
        int score2 = 60;
        int score3 = 110;
        Main.averageScoreCalculator(score1, score2, score3);

//        try{
//            Main.averageScoreCalculator(score1, score2, score3);
//        }
//        catch (Exception ex){
//            Assert.assertThrows(IllegalArgumentException.class, () -> Main.averageScoreCalculator(score1,score2,score3));
//            return;
//        }
//        Assert.fail("The expected exception was not thrown");
    }

    @Test
    public  void allScoreInput_0(){
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        try{
            Main.averageScoreCalculator(score1, score2, score3);
        }
        catch (Exception ex){
            Assert.fail("An exception was throw");
            return;
        }
        Assert.assertTrue("Pass the test",true);
    }


}