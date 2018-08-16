/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.atividade03.tdd01.pm;

import com.utfpr.atividade03.tdd01.Proposta;
import java.util.List;

/**
 *
 * @author Notebook
 */
class MostrarPropostasPM {
    List<Proposta> propostas;
    
    public MostrarPropostasPM(List<Proposta> pPropostas) {
        propostas = pPropostas;
    }
    public List<Proposta>getPropostas(){
        return propostas; 
    }
}
