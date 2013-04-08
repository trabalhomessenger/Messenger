package br.edu.unisep.felipe;

/// uma calculadora que faz as 4 operaçoe basicas sem if  e nem estrutura de exeçao somente reflexao.

import java.lang.reflect.Method;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
            String opcao;
            Scanner sc = new Scanner(System.in);

            Class classe = Class.forName("br.edu.unisep.felipe.Calculadora");
            Object obj = classe.newInstance();
            do{
                System.out.println("-------------CALCULADORA-------------");
                System.out.println("Digite a operação desejada");
                System.out.println("Somar: \nSubtrair: \nMultiplicar: \nDividir:");
                String opcao1 = sc.nextLine().trim();
                
                System.out.println("Digite o primeiro Valor:");
                float Num1 = sc.nextFloat();
                
                System.out.println("Digite o segundo Valor:");
                float Num2 = sc.nextFloat();
                
                Method set = classe.getMethod("setNumero", float.class, float.class);
                set.invoke(obj,Num1,Num2); 
                
                switch (opcao1.trim()) {
                    case "Somar":
                        Method get = classe.getDeclaredMethod("getSomar");
                        System.out.println("O resultado da soma eh:"+get.invoke(obj));
                        break;
                    case "Subtrair":    
                        Method get1 = classe.getDeclaredMethod("getSubtrair");
                        System.out.println("O resultado da Subtração eh:"+get1.invoke(obj));
                        break;
                    case "Multiplicar":
                        Method get2 = classe.getDeclaredMethod("getMultiplicar");
                        System.out.println("O resultado da Multiplicação eh:"+get2.invoke(obj));
                        break;
                    case "Dividir":    
                        Method get3 = classe.getDeclaredMethod("getDividir");
                        System.out.println("O resultado da Divisão eh:"+get3.invoke(obj));
                        break;
                }        
                
                System.out.println("Deseja continuar s/n ");
                opcao = sc.nextLine().trim();
                
            }while(opcao.equalsIgnoreCase("s"));
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
