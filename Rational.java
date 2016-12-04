/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetscci;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Rational {
    private int num;
    private int denom;
    
    void afficher() {
    System.out.println(this.num + " / " + this.denom);   
    }
    
    public Rational(int n, int d) {
        this.num = n;
        this.denom = d;
        if (this.denom == 0) throw new IllegalArgumentException("Dénominateur nul");
    }
    
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer le numérateur");
        int a = clavier.nextInt();
        System.out.println("Entrer le dénominateur");
        int b = clavier.nextInt();
        Rational s = new Rational(a,b);
        Rational r = new Rational(3,2);
        System.out.println(s.mult(r).toString());
        
        
    }

    public Rational mult(Rational b) {
        this.setNum(this.getNum()*b.getNum());
        this.setDenom(this.getDenom()*b.getDenom());
        return this;
    }  
      
    public String toString() {
        String str="";
        str += this.num;
        str += " / ";
        str += this.denom;
        return str;
    }
      
    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
   

      

    
    
}
