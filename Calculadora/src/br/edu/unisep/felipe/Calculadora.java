package br.edu.unisep.felipe;

public class Calculadora {
    private float Num1,Num2;

    public Calculadora() {
    //    this.Num1 = Num1;
    //    this.Num2 = Num2;
    }

    public void setNumero(float Num1,float Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
    }
    
    public float getDividir(){
        return (Num1 / Num2);
    }
    
    public float getSomar(){
        return (Num1 + Num2);
    }
    
    public float getMultiplicar(){
        return (Num1 * Num2);
    }
    
    public float getSubtrair(){
        return (Num1 - Num2);
    }
    @Override
    public String toString() {
        return "Calculadora{" + "Num1=" + Num1 + ", Num2=" + Num2 + '}';
    }
    
    
    
}
