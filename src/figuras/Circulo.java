package figuras;

public class Circulo {

    public static final double PI = 3.1416;
    public double radio;

    public Circulo() {
        radio = 0.00;
    }

    public void setRadio(double añadirRadio) {
        radio = añadirRadio;
    }

    public double getRadio() {
        return radio;
    }

    public double areaCirculo() {
        double area;
        area = PI * (radio * radio);
        return area;
    }

    public double Perimetro() {
        double Perimetro;
        Perimetro = 2 * PI * radio;
        return Perimetro;
    }

}
