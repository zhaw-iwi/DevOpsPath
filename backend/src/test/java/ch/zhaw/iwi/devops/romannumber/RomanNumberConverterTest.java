package ch.zhaw.iwi.devops.romannumber;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {
    //TDD https://kata-log.rocks/roman-numerals-kata

    @Test
    public void romanNumberTest1() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("I", converter.convertToRoman(1));
    }

    @Test
    public void romanNumberTest2() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("II", converter.convertToRoman(2));
    }

    @Test
    public void romanNumberTest3() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("III", converter.convertToRoman(3));
    }

    @Test
    public void romanNumberTest4() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("IV", converter.convertToRoman(4));
    }

    @Test
    public void romanNumberTest5() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("V", converter.convertToRoman(5));
    }

    @Test
    public void romanNumberTest6() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("VI", converter.convertToRoman(6));
    }

    @Test
    public void romanNumberTest7() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("VII", converter.convertToRoman(7));
    }

    @Test
    public void romanNumberTest8() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("VIII", converter.convertToRoman(8));
    }

    @Test
    public void romanNumberTest9() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("IX", converter.convertToRoman(9));
    }

    @Test
    public void romanNumberTest10() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("X", converter.convertToRoman(10));
    }

    @Test
    public void romanNumberTest21() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("XXI", converter.convertToRoman(21));
    }

    @Test
    public void romanNumberTest50() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("L", converter.convertToRoman(50));
    }

    @Test
    public void romanNumberTest100() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("C", converter.convertToRoman(100));
    }

    @Test
    public void romanNumberTest500() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("D", converter.convertToRoman(500));
    }

    @Test
    public void romanNumberTest1000() {
        var converter = new RomanNumberConverter();
        Assert.assertEquals("M", converter.convertToRoman(1000));
    }

}