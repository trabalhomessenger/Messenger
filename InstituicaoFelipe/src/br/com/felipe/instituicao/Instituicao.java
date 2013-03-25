package br.com.felipe.instituicao;

import java.util.ArrayList;

public class Instituicao {
    private int codigo;
    private String descricao;
    
    ArrayList<Turma> turmas = new ArrayList<>();
    
    Turma turma = new Turma(1,"Grau");  
    
    public Instituicao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setTurma(Turma turma){
        turmas.add(turma);
    }
   
    public void getTurma(Turma turma){
        turmas.remove(turma);
    }
    
    public void mostraTurma(){
        for(Turma tmpTurma : turmas){
            System.out.println("Turma: "+tmpTurma.getCodigo()+""+tmpTurma.getDescricao());
        }
    }
}
