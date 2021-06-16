package Ejercicio7.src; 

/*
Crea una clase Fraccion con métodos para sumar,
restar, multiplicar y dividir fracciones.
*/

public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion (int num, int den){
    
        this.numerador=num;
        this.denominador=den;  
    }
    
    public int getNumerador(){
        return numerador;
    }
    
    public int getDenominador(){
        return denominador;
    }
    
    
    public Fraccion sumar(Fraccion f1){
    
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador+denominador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }        
    }

    
    public Fraccion restar(Fraccion f1){
    
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador-(denominador*f1.numerador), denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public Fraccion multiplicar(Fraccion f1){
    
        try{
        Fraccion aux = new Fraccion(numerador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }         
    }
    
 
    public Fraccion dividir(Fraccion f1){
    
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador, denominador*f1.numerador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }              
    }
    
    
    public int mcd(){
    
        int num=numerador, den=denominador;
        
        if(num==0){
            return 1;
        }else{
            
            if(num<0){
                num=num*-1; 
            }

            if(den<0){
                den = den * -1; 
            }
            
            
            if(den>num){
                int aux = num;
                num=den;
                den=aux;
            }
            
            int mcd=1;
                           
            while(den!=0){
                
                mcd=den;   
                den = num % den;  
                num = mcd;  
            }

            return mcd;   
        }        
    }
    
    
    public void simplificar(){
    
        int mcd = mcd();
        
        numerador = numerador / mcd;
        denominador = denominador / mcd;        
                
        if(numerador<0 && denominador<0){
        
            numerador=numerador*-1;         
            denominador=denominador*-1;            
        
        }else if (numerador >=0 && denominador>0){
            
            numerador=numerador*-1;         
            denominador=denominador*-1;              
        }   
    }
    
    
    
    @Override
    public String toString(){
        
        if(denominador!=0){
        
                simplificar();
                if(denominador!=1){        
                    return numerador+"/"+denominador;
                }else{
                    return numerador+"";
                }
        }else{
            
            return "El denominador debe ser distinto de 0";        
        }        
    }
    
    public static void main(String[] args) {

        Fraccion F1 = new Fraccion(3,2);
        Fraccion F2 = new Fraccion(-4,5);
        System.out.println("\n****************");
        System.out.println("Fracciones dadas");
        System.out.println(F1);
        System.out.println(F2);
        System.out.println("****************\n");
        
        
        System.out.println("La suma es: "+ F1.sumar(F2));
        System.out.println("La rsta es: "+ F1.restar(F2));
        System.out.println("La multiplicaion es: "+F1.multiplicar(F2));
        System.out.println("La divicion es:"+ F1.dividir(F2));                           
    }    
}