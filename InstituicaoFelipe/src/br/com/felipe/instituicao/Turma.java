package br.com.felipe.instituicao;

import java.util.ArrayList;

public class Turma {
    private int Codigo;
    private String Descricao;
 
    ArrayList<Aluno> alunos = new ArrayList<>();
            
    public Turma(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
    }

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
        int quantAprovados = 0;
        for(Aluno tmpAlunos : alunos){
            if (tmpAlunos.Media() >= 7){
                return quantAprovados++;
            }
        }
        return 0;
    }
    
    public int quantidadeAlunosReprovados(){                
        int quantReprovados = 0;
        for(Aluno tmpAlunos : alunos){
            if (tmpAlunos.Media() < 7){
                return quantReprovados++;
            }
        }
        return 0;
    }
    
    public float porcAlunosAprovados(){
        return((quantidadeAlunosAprovados() / alunos.size()) * 100);
    }
    
    public float porcAlunosReprovados(){
        return((quantidadeAlunosReprovados() / alunos.size()) * 100);
    }
    
    public void matricula(Aluno aluno){
        alunos.add(aluno);
        aluno.setTurma(this);
    }
    
    public void cancelarMatricula(Aluno aluno){
        alunos.remove(aluno);
        aluno.setTurma(null);
    }
    
    public float mediaGeral(){
        float mediaGeral=0;
        int x;
        for(x = 0;x < quantidadeAlunos();x++){
            mediaGeral++;
        }       
        return(mediaGeral / quantidadeAlunos());
    }
}