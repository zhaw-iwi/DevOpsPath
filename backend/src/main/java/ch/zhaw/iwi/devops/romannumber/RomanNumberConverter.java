package ch.zhaw.iwi.devops.romannumber;


public class RomanNumberConverter {
    //TDD https://kata-log.rocks/roman-numerals-kata

    public String convertToRoman(int number) {
        /**
         * Based on https://stackoverflow.com/a/39411250 
         * but improved for java 11
        */
        return "I".repeat(number)
            .replace("IIIII", "V")
            .replace("IIII", "IV")
            .replace("VV", "X")
            .replace("VIV", "IX")
            .replace("XXXXX", "L")
            .replace("XXXX", "XL")
            .replace("LL", "C")
            .replace("LXL", "XC")
            .replace("CCCCC", "D")
            .replace("CCCC", "CD")
            .replace("DD", "M")
            .replace("DCD", "CM");
    }

}
