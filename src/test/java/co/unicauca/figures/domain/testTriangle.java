/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.unicauca.figures.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Santiago Felipe Gutierrez Astaiza
 */

public class testTriangle {
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Triange triange = new Triange(1.4,2.5);
        assertThrows(UnsupportedOperationException.class,
                 () -> triange.calculatePerimeAAter());
    }
   
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Triange triange = new Triange(1.4,2.5);
        double expResult = 3.5;
        double result = triange.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
