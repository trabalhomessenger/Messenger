package br.com.felipe.instituicao;

import java.util.ArrayList;

public class Turma {
    private int Codigo;
    private String Descricao;
    private Aluno tmpAluno;
    private Turma turma;
    
    ArrayList<Aluno> alunos = new ArrayList<>();
            
    public Turma(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
    }
       
    Aluno aluno = new Aluno(1, "Felipe Mozer",7.0f,7.0f,turma);
    Aluno aluno1 = new Aluno(2, "Brizola",8.0f,2.0f,turma);
    //Aluno aluno2 = new Aluno(3, "Ana");
    //Aluno aluno3 = new Aluno(4, "Debora");


    public int getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }    
    
    public int quantidadeAlunos(){
        return alunos.size();
    }
    
    public int quantidadeAlunosAprovados(){                
        /*float media = tmpAluno.Media();
        int quantidadeAprovado =0,quantidadeReprovado=0;
        if (media >= 7){
           return quantidadeAprovado++;
            
        }else{
            System.out.println("\nAlunos reprovados :"+quantidadeReprovado);// QTD DE ALUNOS REPROVADOS  
            return quantidadeReprovado++;
        }*/
        return 0;
    }    
}
