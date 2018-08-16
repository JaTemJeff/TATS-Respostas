/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.utfpr.atividade03.tdd01.pm.SimularPropostasPM;
import com.utfpr.atividade03.tdd01.pm.SimularPropostasPM;
import com.utfpr.atividade03.tdd01.pm.SimularPropostasPM;
import tdd01.MostrarPropostasPM;

/**
 *
 * @author Notebook
 */
public class SimularPropostaPMTest {
    
    @Test
    public void testeTodosCamposVazios(){
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("");
        pm.setSalario(0.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(0.0f);
        pm.pressionarBotaoElaborar();
        
        assertEquals("nome vazio\nsalario vazio\nidade vazia\nvalor vazio\n", pm.setMsgDeerro());
    }
    
    @Test
    public void testeSoIdadeVazia(){
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao da Silva");
        pm.setSalario(1000.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(800.0f);
        assertNull (pm.pressionarBotaoElaborar());
        
        assertEquals("idade vazia\n", pm.setMsgDeErro());
    }
    
    @Test
    public void testeDadosCorretos(){
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao da Silva");
        pm.setSalario(800.0f);
        pm.setIdade(25);
        pm.setValorDoEmprestimo(1000.0f);
        pm.pressionarBotaoElaborar();
        MostrarPropostasPM mostarPm = pm.pressionarBotaoElaborar();
        assertEquals("", pm.getMsgDeErro());
        assertEquals(2, mostrarPm.getPropostas().size());
    }
    
}

