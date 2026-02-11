/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 *
 * @author santi
 */
public class Triange implements Figure {
    private double base;
    private double heigth;
    
    public Triange(double base, double heigth){
        this.base = base;
        this.heigth = heigth;
    }
    public double getBase(){
        return this.base;
    }
    
    public double getHeigth(){
        return this.heigth;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setHeight(double height){
        this.heigth = height;
    }
    
    //Con los datos que se obtienen no se puede calcular el perimetro
    @Override
    public double calculatePerimeter() {
        throw new UnsupportedOperationException(
        "No se puede calcular el perimetro solo con base y altura"
    );
    }
    
    @Override
    public double calculateArea() {
        double r;
        r = this.base * this.heigth;
        return r;
    }
}
