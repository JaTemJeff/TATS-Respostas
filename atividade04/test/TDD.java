/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codigo.ControladorCargo;
import codigo.Funcionario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Notebook
 */
public class TDD {
    Funcionario f;
    ControladorCargo calculadora;
    
    @Before
    public void inicializa(){
        f = new Funcionario();
        calculadora = new ControladorCargo();
    }
    
    @Test
    public void desenvolvedorComSalarioMaiorQue3Mil(){
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("dev@email.com");
        f.setNome("Nome dev");
        f.setSalarioBase(5000f);
        
        float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        
        assertEquals(4000f, res);
    }
    @Test public void desenvolvedorComSalarioMenorQue3Mil(){
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("dev@email.com");
        f.setNome("Nome dev");
        f.setSalarioBase(1000f);
        
        float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        
        assertEquals(900f, res);
    }
    
}
