/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Complejos {
    private int real;
    private int imaginario;
    
    public Complejos(int real, int imaginario){
        this.real=real;
        this.imaginario=imaginario;
        
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
    public Complejos sumar(Complejos c2){
        int r1,cp1;
        Complejos c; 
        r1=(this.real+c2.real);
        cp1=this.imaginario+c2.imaginario;
        
        c=new Complejos(r1,cp1);
        return c;
        
    }
    public Complejos restar(Complejos c2){
      int r1,cp1;
        Complejos c; 
        r1=(this.real-c2.real);
        cp1=this.imaginario-c2.imaginario;
        
        c=new Complejos(r1,cp1);
        return c;   
    }
    public Complejos Multiplicar(Complejos c2){
     int r1,ri1,i2,ri2,real,imaginario;
        Complejos c; 
        r1=this.real*c2.real;
        ri1=this.real*c2.imaginario;
        ri2=this.imaginario*c2.real;
        i2=this.imaginario*c2.imaginario;
        
            real=(r1)+(+i2);   
            imaginario=(ri1)+(ri2);
        
        
        c=new Complejos(real,imaginario);
        return c;     
    }
    public Complejos dividir(Complejos c2){
    int    numeradorr,denominador,real,imaginario,r1,ri1,ir1,i1,r2,i2,numeradori;
    Complejos c;
    r1=(this.real*c2.real);
    ri1=(this.real*c2.imaginario);
    ir1=(this.imaginario*c2.real);
    i1=(this.imaginario*c2.imaginario);
    r2=(c2.real*c2.real);
    i2=(c2.imaginario*c2.imaginario);
    
    
    
    numeradorr= (r1+i1);
          numeradori=  (ri1+ir1);
          denominador=(i2+r2);
          
          real=(numeradorr/denominador);
          imaginario=(numeradori/denominador);
          
    c= new Complejos(real,imaginario);
    
    return c;
    
   
    
    }
}
