package exersice_1.exersice_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Testt :-)
     */
    @Test
    public void exe_2_Partition_D_min() {
    	String result =App.NumberToChar(60);
    	String expected_result="D";
    	org.junit.Assert.assertEquals(expected_result, result);
    	
    }
    @Test
    public void exe_2_Partition_D_min_plus1() {
    	String result =App.NumberToChar(61);
    	String expected_result="D";
    	org.junit.Assert.assertEquals(expected_result, result);
    	
    }
    @Test
    public void exe_2_Partition_D_Nominal() {
    	String result =App.NumberToChar(65);
    	String expected_result="D";
    	org.junit.Assert.assertEquals(expected_result, result);
    	
    }
    @Test
    public void exe_2_Partition_D_Max_Minus1() {
    	String result =App.NumberToChar(68);
    	String expected_result="D";
    	org.junit.Assert.assertEquals(expected_result, result);
    	
    }
    @Test
    public void exe_2_Partition_D_Max() {
    	String result =App.NumberToChar(69);
    	String expected_result="D";
    	org.junit.Assert.assertEquals(expected_result, result);
    	
    }
    

}
