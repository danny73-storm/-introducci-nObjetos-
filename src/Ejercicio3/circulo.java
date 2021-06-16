package Ejercicio3.src;

import java.util.Scanner;

/*
Cree una clase circulo. Esta clase debe tener
métodos como calcular el área y el perimetro.
*/

public class circulo {
    
    private double cont;
    private double pi = 3.1416;
    
    public circulo(){
        this.cont = cont;
    }
    

    public double  getCont() {
        return cont;
    }

    public void setCont(double cont) {
        this.cont = cont;
    }
    
    public void Area(){
        cont = 2 * pi *cont;
    }
    
    public void perimetro(){
        cont *= cont*pi;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int radio;
        System.out.println("Ingrese el radio del circulo: ");
        radio = leer.nextInt();
        
        circulo thunder = new circulo();
        
        // asignar el valor radio a --> cont para area
        thunder.setCont(radio);
        
        //Hallar el area del cuadrado
        System.out.println("El area del circulo es: ");
        thunder.Area();
        System.out.println(thunder.getCont()+" u^2 ");
        
        // asignar el valor radio a --> cont para perimetro
        thunder.setCont(radio);
        //Hallar el perimetro del cuadrado
        System.out.println("El perimetro del circulo es: ");
        thunder.perimetro(); 
        System.out.println(thunder.getCont()+" u ");
    }
    
}