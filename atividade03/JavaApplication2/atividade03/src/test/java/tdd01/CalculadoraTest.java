/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd01;

import com.utfpr.atividade03.tdd01.Calculadora;
import com.utfpr.atividade03.tdd01.Proposta;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testeLimite1000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(800);
        assertEquals(2, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        
        assertEquals(1600f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800f, p1.getValorParcela(), 0.01);
        
        assertEquals(1600f, p2.getTotal(), 0.01);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33f, p2.getValorParcela(), 0.01);
    }
    
    @Test
    public void testeEntre1000e5000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(1800);
        assertEquals(3, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);
        
        assertEquals(2340f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(1170f, p1.getValorParcela(), 0.01);
        
        assertEquals(2700f, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(675, p2.getValorParcela(), 0.01);
        
        assertEquals(2700f, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(270, p3.getValorParcela(), 0.01);
    }
    
    @Test
    public void testeAcimaDe5000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(5500);
        assertEquals(4, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);
        Proposta p4 = propostas.get(3);

        assertEquals(6050f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(3025f, p1.getValorParcela(), 0.01);
        
        assertEquals(7150f, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(1787.5f, p2.getValorParcela(), 0.01);
        
        assertEquals(7150f, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(715, p3.getValorParcela(), 0.01);
        
        assertEquals(7700f, p3.getTotal(), 0.01);
        assertEquals(20, p3.getNumeroParcelas());
        assertEquals(385, p3.getValorParcela(), 0.01);
    }
}
