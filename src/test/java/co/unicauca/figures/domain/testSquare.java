
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
 * @author santi
 */
public class testSquare {
    
    public testSquare() {
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Square square = new Square(2.5);
        double expResult = 5;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
   
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Square square = new Square(2.5);
        double expResult = 6.25;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
