package Ejercicio4.src;

import java.util.Scanner;

/*
Cree una clase rectangulo. Esta clase cuenta con
los métodos de calcular área, calcular perimetro.
El constructor debe de permitir ingresar ancho y
el largo. Debe verificar que no sean iguales.
*/
public class rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    private int largo;
    private int ancho;
    
    
    public rectangulo(){
        this.largo = largo;
        this.ancho = ancho;
        
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = leer.nextInt();
        
        System.out.println("Ingrese el largo del rectangulo");
        largo =leer.nextInt();
               
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    //Hallar el area del rectangulo
    public void Area(){

        if (ancho != largo) {
            int area = getLargo()*getAncho();
            System.out.println(area+" u^2 ");
        }else{
            System.out.println("Las dimenciones ingresadas son iguales");
        }
    }
    
    //hallar el perimetro del rectamgulo
    public void perimetro(){

        if (ancho != largo) {
            int perimetro = (2*getLargo()) + (2 *getAncho());
            System.out.println(perimetro+" u ");
        }else{
            System.out.println("Las dimenciones ingresadas son iguales");
        } 
    }
    
    public static void main(String[] args) {
         
        rectangulo thunder = new rectangulo();
        
        //Mostrar el area del rectangulo
        System.out.println("El area del rectangulo es: ");
        thunder.Area();
        
        //Mostrar el perimetro del rectangulo
        System.out.println("El perimetro del rectangulo es: ");
        thunder.perimetro(); 
    }   
}