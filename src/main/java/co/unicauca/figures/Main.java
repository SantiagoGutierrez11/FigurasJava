package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Figure;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Triange;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brada
 */
public class Main {

    public static void main(String[] args) {
        
        Figure c1 = new Circle(2.5);
        Figure c2 = new Circle(3);
        
        Figure s1 = new Square(4.5);
        Figure s2 = new Square(3);

        Triange t1 = new Triange(4.1,4.5);
        Triange t2 = new Triange(2,3);

        List<Figure> figures = new ArrayList<>();
        figures.add(c1);
        figures.add(c2);
        figures.add(s1);
        figures.add(s2);
        figures.add(t1);
        figures.add(t2);

        for (Figure fig : figures) {

            if (fig instanceof Circle) {
                Circle c = (Circle) fig;
                System.out.println("Figura: Circulo");
                System.out.println("Radio: " + c.getRadio());
            }

            if (fig instanceof Square) {
                Square s = (Square) fig;
                System.out.println("Figura: Cuadrado");
                System.out.println("Lado: " + s.getSide());
            }

            if (fig instanceof Triange) {
                Triange t = (Triange) fig;
                System.out.println("Figura: Triangulo");
                System.out.println("Base: " + t.getBase());
                System.out.println("Altura: " + t.getHeigth());
            }

            System.out.println("Area: " + fig.calculateArea());
            // se atrapa excepcion en caso de que la figura sea un triangulo
            try {
                System.out.println("Perimetro: " + fig.calculatePerimeter());
            }   catch (UnsupportedOperationException e) {
                    System.out.println("Perimetro: no disponible");
                }
            System.out.println("-------------------------");
        }
    }
}
