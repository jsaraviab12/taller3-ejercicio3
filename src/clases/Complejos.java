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
        r1=(this.getReal()+c2.getReal ());
        cp1=this.getImaginario()+c2.getImaginario();
        
        c=new Complejos(r1,cp1);
        return c;
        
    }
    public Complejos restar(Complejos c2){
      int r1,cp1;
        Complejos c; 
        r1=(this.getReal()-c2.getReal());
        cp1=this.getImaginario()-c2.getImaginario();
        
        c=new Complejos(r1,cp1);
        return c;   
    }
    public Complejos Multiplicar(Complejos c2){
     int r1,ri1,i2,ri2,real,imaginario;
        Complejos c; 
        r1=this.getReal()*c2.getReal();
        ri1=this.getReal()*c2.getImaginario();
        ri2=this.getImaginario()*c2.getReal();
        i2=this.getImaginario()*c2.getImaginario();
        
            real=(r1)+(+i2);   
            imaginario=(ri1)+(ri2);
        
        
        c=new Complejos(real,imaginario);
        return c;     
    }
    public Complejos dividir(Complejos c2){
    int    numeradorr,denominador,real,imaginario,r1,ri1,ir1,i1,r2,i2,numeradori;
    Complejos c;
    r1=(this.getReal()*c2.getReal());
    ri1=(this.getReal()*c2.getImaginario());
    ir1=(this.getImaginario()*c2.getReal());
    i1=(this.getImaginario()*c2.getImaginario());
    r2=(c2.getReal()*c2.getReal());
    i2=(c2.getImaginario()*c2.getImaginario());
   
    numeradorr= (r1+i1);
          numeradori=  (ri1+ir1);
          denominador=(i2+r2);
          
          real=(numeradorr/denominador);
          imaginario=(numeradori/denominador);
          
    c= new Complejos(real,imaginario);
    
    return c;
    
   
    
    }
}
