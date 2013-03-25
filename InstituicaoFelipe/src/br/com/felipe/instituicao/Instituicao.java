package br.com.felipe.instituicao;

import java.util.ArrayList;

public class Instituicao {
    ArrayList<Turma> turmas = new ArrayList<>();
    
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
