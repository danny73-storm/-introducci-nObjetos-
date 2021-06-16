package Ejercicio6.src;

import java.util.Scanner;

/*
Crea una clase Libro con los métodos préstamo,
devolución y mostrarInformación. La clase
contendrá un constructor por defecto, un
constructor con parámetros y los métodos getters
y setters.
*/

/* 
Que tine de atributos un libro?
-> nombre o titulo.
-> Escritor o autor.
-> Editorial. 
-> cantidad de libros.
-> Cantidad prestados.
*/

public class Libro{
    
    Scanner leer = new Scanner(System.in);
    
    private String nombre;
    private String escritor;
    private String editorial;
    private int cantLibro;
    private int cantPres;
    
    //constructor por defecto
    public Libro(){
        System.out.print("Introduce titulo: ");
        nombre = leer.nextLine();
        System.out.print("Introduce Escritor: ");
        escritor = leer.nextLine();
        System.out.print("Introduce la editorial: ");
        editorial = leer.nextLine();
        System.out.print("Ingrese la cantidad de libros: ");
        cantLibro = leer.nextInt();
        leer.nextLine();
    }
    
    //constructor con parametros
    public Libro(String nombre,String escritor, String editorial,int cantLibro,int cantPres){
        this.nombre = nombre;
        this.escritor = escritor;
        this.editorial = editorial;
        this.cantLibro = cantLibro;
        this.cantPres = cantPres;
    }
    
    //metodos getters y setters.
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEscritor(){
        return escritor;
    }   
    public void setEscritor(String escritor){
        this.escritor = escritor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public int getCantLibro() {
        return cantLibro;
    }
    public void setCantLibro(int cantLibro) {
        this.cantLibro = cantLibro;
    }

    public int getCantPres() {
        return cantPres;
    }
    public void setCantPres(int cantPres) {
        this.cantPres = cantPres;
    }
    
    
    
    //metodo para prestar un libro
    public boolean prestamo(){
        boolean prestado = true;
        if (cantPres < cantLibro) {
            cantPres++;
        } else {
            prestado = false;
        }
        return prestado;
    }
    
    //metodo para devolver un libro
    public boolean devolver(){
        boolean devuelto = true;
        if (cantPres == 0) {
            devuelto = false;
        } else {
            cantPres--;
        }
        return devuelto;
    }
    
    // metodo para mostrar datos
    public String mostarDatos{
        return " Titulo: "+nombre+ " Escritor: "+escritor +" Editorial: " +editorial+
                "\n Cantidad de libros: " +cantLibro+
                "\n Cantidad de libros prestados: "+cantPres; 
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre,escritor,editorial;
        int cantLibro;
        
        //utilizamoes el contructor con parametros
        Libro libro1 = new Libro(" álgebra "," Charles H.Lehmann "," Limusa Noriega ",1,0);
        
        //utilizamos el contructor por defecto
        Libro libro2 = new Libro();
        
        System.out.print("Introduce titulo: ");
        nombre = leer.nextLine();
        System.out.print("Introduce Escritor: ");
        escritor = leer.nextLine();
        System.out.print("Introduce la editorial: ");
        editorial = leer.nextLine();
        System.out.print("Ingrese la cantidad de libros: ");
        cantLibro = leer.nextInt();
        leer.nextLine();
        
        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro2.setNombre(nombre);
        libro2.setEscritor(escritor);
        libro2.setEditorial(editorial);
        libro2.setCantPres(cantLibro);
        
        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getNombre());
        System.out.println("Autor: " + libro1.getEscritor());
        System.out.println("Ejemplares: " + libro1.getCantLibro());
        System.out.println("Prestados: " + libro1.getCantPres());
        
        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getNombre());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getNombre() + " para prestar");         
        }
        
        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.devolver()) {
            System.out.println("Se ha devuelto el libro " + libro1.getNombre());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getNombre() + " prestados");
        }
        
        //se realiza otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getNombre());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getNombre() + " para prestar");
        }

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getNombre());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getNombre() + " para prestar");         
        }
        
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getNombre());
        System.out.println("Escritor: " + libro1.getEscritor());
        System.out.println("Editorial " + libro1.getEditorial() );
        System.out.println("Ejemplares: " + libro1.getCantLibro());
        System.out.println("Prestados: " + libro1.getCantPres());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getNombre());
        System.out.println("Escritor: " + libro2.getEscritor());
        System.out.println("Editorial " + libro2.getEditorial() );
        System.out.println("Ejemplares: " + libro2.getCantLibro());
        System.out.println("Prestados: " + libro2.getCantPres());
        System.out.println();
    }
}
