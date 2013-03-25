package br.com.felipe.instituicao;

import br.com.unisep.luiz.io.Console;
import br.com.unisep.luiz.valida.VerificaNumeros;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Turma tmpTurma = null;
        Instituicao tmpInstituicao = null;
        
        Console.escreverln("Digite o codigo e descrição da instituição: ");
        String _intituicao = Console.ler();
        String[] instituicao1 = _intituicao.split(",");
        
        int A1 = Integer.parseInt(instituicao1[0]);
        String B1 = String.valueOf(instituicao1[1]);
        
        Instituicao instituicaoA;
        instituicaoA = new Instituicao(A1,B1);
        
         Console.escreverln("Instituição = " + _intituicao);
    }
}
