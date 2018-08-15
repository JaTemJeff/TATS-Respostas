/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.atividade03.tdd01;

/**
 *
 * @author Notebook
 */
public class Proposta {
    float total; 
    int numeroParcelas;
    float valorParcela;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
    
    
}
