package application;
import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a altura e lagura do retangulo: ");
        retangulo.heigth= sc.nextDouble();
        retangulo.width= sc.nextDouble();
        System.out.println("AREA TRIANGULO: "+retangulo.area());
        System.out.println("PERIMETRO TRIANGULO: "+retangulo.perimetro());
        System.out.println("DIAGONAL TRIANGULO: "+retangulo.diagonal());
        sc.close();
    }
}
