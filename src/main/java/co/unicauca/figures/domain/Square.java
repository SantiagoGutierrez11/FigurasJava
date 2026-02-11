package co.unicauca.figures.domain;

/**
 *
 * @author santi
 */
public class Square implements Figure {
    
    private double side;    
    
    public Square (double side){
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public double calculatePerimeter() {
        return this.side * 4; 
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }    
    
}
