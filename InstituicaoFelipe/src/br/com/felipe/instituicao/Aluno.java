package br.com.felipe.instituicao;

public class Aluno {
    public int RA;
    public String Nome;
    public float NotaG1,NotaG2;
    public Turma turma;

    public Aluno(int RA, String Nome, float NotaG1, float NotaG2, Turma turma) {
        this.RA = RA;
        this.Nome = Nome;
        this.NotaG1 = NotaG1;
        this.NotaG2 = NotaG2;
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.RA;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.RA != other.RA) {
            return false;
        }
        return true;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public void setRA(int RA){
        this.RA = RA;
    }
    
    public void setNotaG1(float notaG1){
        this.NotaG1 = notaG1;
    }
    
    public void setNotaG2(float notaG2){
        this.NotaG2 = notaG2;
    }
    
    public String getNome(){
        return Nome;
    }

    public int getRA() {
        return RA;
    }

    public float getNotaG1() {
        return NotaG1;
    }

    public float getNotaG2() {
        return NotaG2;
    }
    
    public float Media(){
        return(NotaG1+NotaG2*2)/3;
    }
}

