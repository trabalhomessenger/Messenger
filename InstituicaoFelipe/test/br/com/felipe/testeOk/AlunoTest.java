package br.com.felipe.testeOk;

import br.com.felipe.instituicao.Aluno;
import br.com.felipe.instituicao.Turma;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AlunoTest {
   Aluno a1;
    
   @Before
   public void init(){
       a1 = new Aluno(1, "Felipe");
   }
    
   @Test
   public void Media(){
       Aluno a1 = new Aluno(1, "Felipe");
       assertEquals(7,a1.Media(),0);
   }
    
}