package entities;

public class Retangulo {
    public double heigth;
    public double width;

    public double area(){
        return heigth*width;
    }
    public double perimetro(){
        return (heigth+width)*2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(heigth,2)+Math.pow(width,2));
    }
}