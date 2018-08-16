/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import codigo.Funcionario;
import codigo.ControladorCargo;

/**
 *
 * @author Notebook
 */
public class TesteSemTDD {
    Funcionario f;
    ControladorCargo calculadora;
    
    @Before
    public void inicializa(){
        f = new Funcionario();
        calculadora = new ControladorCargo();
    }
    
    @Test
    public void teste01(){
        f.setCargo("DBA");
        f.setEmail("dba@email.com");
        f.setNome("Nome DBA");
        f.setSalarioBase(1000);
        
        calculadora.calcular(f.getCargo(), f.getSalarioBase());
    }
}
