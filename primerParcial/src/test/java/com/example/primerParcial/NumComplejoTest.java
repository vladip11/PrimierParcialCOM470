 //LinkGithub:  https://github.com/vladip11/PrimierParcialCOM470.git
package com.example.primerParcial;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumComplejoTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
             {1, 4, 4, 1}, {7, -1, 0, 7}, {7, -4, 7, 2},{2, 7, 1, 6}, {4, 3, 5, 4}, {15, 1, 16, 22},
            {2, 0, 18, 6}, {11, 3, -4, 2}, {5, -10, 400, 2},{705, 1, 2, 302}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public int valor3;
    @Parameterized.Parameter(3)
    public int valor4;
    
    
    @Test
    public void testSumar() {
        NumComplejo nc = new NumComplejo(valor1, valor2);
        NumComplejo res = nc.sumar(new NumComplejo(valor3, valor4));
        NumComplejo esp = new NumComplejo(valor1+valor3, valor2+valor3);
        assertEquals(esp.getClass(), res.getClass());
    }
    
    @Test
    public void testRestar() {
        NumComplejo nc = new NumComplejo(valor1, valor2);
        NumComplejo res = nc.restar(new NumComplejo(valor3, valor4));
        NumComplejo esp = new NumComplejo(valor1-valor3, valor2-valor3);
        assertEquals(esp.getClass(), res.getClass());
    }
    
}

//LinkGithub:  https://github.com/vladip11/PrimierParcialCOM470.git
