package Ejercicio2.src;

import java.util.Scanner;

public class cuadrado{
    
    private int cont;
    
    public cuadrado(){
        this.cont = cont;
    }
    

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void Area(){
        cont *= cont;
    }
    
    public void perimetro(){
        cont = 4 *cont;
    }
    
    public static void main(String[] args) {    
        Scanner leer = new Scanner(System.in);
        
        int lado;
        System.out.println("Ingrese el lado del cuadrado");
        lado = leer.nextInt();
        
        cuadrado thunder = new cuadrado();
        
        // asignar el valor lado a --> cont para area
        thunder.setCont(lado);
        
        //Hallar el area del cuadrado
        System.out.println("El area de cuadrado es: ");
        thunder.Area();
        System.out.println(thunder.getCont()+" u^2 ");
        
        // asignar el valor lado a -->cont para perimetro
        thunder.setCont(lado);
        //Hallar el perimetro del cuadrado
        System.out.println("El perimetro es: ");
        thunder.perimetro(); 
        System.out.println(thunder.getCont()+ " u ");
    }    
}