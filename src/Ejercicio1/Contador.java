package Ejercicio1.src;

import java.util.Scanner;


public class Contador {
    
    private int cont;
    
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
       
        //Utilizar el constructor por defecto
        Contador contador1 = new Contador();
      
        int n;
        System.out.println("Introduce valor para inicializar el contador: ");                                     
        n = leer.nextInt();
       
        //asignar un valor al contador
        contador1.setCont(n);
        //incrementar el contador
        contador1.incrementar();
        //mostrar el valor actual
        System.out.println(contador1.getCont());
        //decrementar el contador
        contador1.decrementar();
        //mostrar el valor actual. 
        System.out.println(contador1.getCont());
    }

    //constructor por defecto
    public Contador() {
        this.cont=0;
    }

    //constructor con parámetros
    public Contador(int cont) {
        this.cont = cont;
    }

    //constructor copia
    public Contador(Contador copia) {                                                                           
        this.cont = copia.cont;
    }

    //getter
    public int getCont() {
        return cont;
    }

    //setter
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    //método incrementar contador
    public void incrementar() {
        cont++;
    }

    //método decrementar contador
    public void decrementar() {
        cont--;
    }
    
}