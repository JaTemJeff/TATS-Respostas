/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.atividade03.tdd01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class Calculadora {

    public List<Proposta> calcular(float valorDoEmprestimo) {
        ArrayList<Proposta> propostas = new ArrayList();
        if (valorDoEmprestimo <= 1000) {
            propostas.add(new Proposta(2 * valorDoEmprestimo, 2));
            propostas.add(new Proposta(2 * valorDoEmprestimo, 3));

            return propostas;
        } else{
            propostas.add(new Proposta(1.3f * valorDoEmprestimo, 2));
            propostas.add(new Proposta(1.5f * valorDoEmprestimo, 4));
            propostas.add(new Proposta(1.5f * valorDoEmprestimo, 10));

            return propostas;
        }
    }
}
    
