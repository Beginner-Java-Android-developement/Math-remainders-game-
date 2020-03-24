package com.golan.amit.puzekmathgame;

import com.golan.amit.puzekmathgame.helper.DatabaseHelper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

//        assertEquals(4, 2 + 2);
        DatabaseHelper dbh = new DatabaseHelper(null);
        dbh.insertHighScore(1000);
        int a = 100;
        a = dbh.getHighScore();
        System.out.println(a);

    }
}