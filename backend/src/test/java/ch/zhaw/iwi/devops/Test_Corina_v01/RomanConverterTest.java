package ch.zhaw.iwi.devops.Test_Corina_v01;

import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {

   
    @Test
    public void convertertTest1() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("I", abc.toRoman(1));

    }
    @Test
    public void convertertTest2() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("II", abc.toRoman(2));

    }
    @Test
    public void convertertTest3() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("III", abc.toRoman(3));

    }
    @Test
    public void convertertTest4() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("IV", abc.toRoman(4));

    }
    @Test
    public void convertertTest5() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("V", abc.toRoman(5));

    }
    @Test
    public void convertertTest9() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("IX", abc.toRoman(9));

    }
    @Test
    public void convertertTest21() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("XXI", abc.toRoman(21));

    }
    @Test
    public void convertertTest50() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("L", abc.toRoman(50));

    }
    @Test
    public void convertertTest100() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("C", abc.toRoman(100));

    }
}