package com.monentreprise.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test 
    public void TestSub(){
        int a = 10;
        int b = 4;
        int attendu = 6;
        
        int resultat = App.sub(a, b);
        assertEquals(attendu, resultat,"la soustraction devrait donner 6");
    }
}
