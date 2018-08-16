package com.utfpr.atividade03.tdd01.pm;

import java.util.List;
import com.utfpr.atividade03.tdd01.Calculadora;
import com.utfpr.atividade03.tdd01.Proposta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Notebook
 */
public class SimularPropostasPM {

    String nome;
    float salario;
    int idade;
    float valorDoEmprestimo;
    String MsgDeErro;
    Calculadora c = new Calculadora();

    public MostrarPropostasPM pressionarBotaoElaborar() {
        validar();
        if (MsgDeErro.equals("")) {
            List<Proposta> propostas = c.calcular(salario, valorDoEmprestimo);
            return new MostrarPropostaPM(propostas);
        } else {
            return null;
        }
    }
    public void validar() {
        MsgDeErro = "";
        if (nome.equals("")) {
            MsgDeErro += "nome vazio\n"
                    + "salario vazio\n"
                    + "idade vazia\n"
                    + "valor vazio\n";
        }
        if (salario <= 0) {
            MsgDeErro += "salario vazio\n";
        }
        if (idade <= 0) {
            MsgDeErro += "idade vazia\n";
        } else if (idade < 18 || idade > 70) {
            MsgDeErro += "Idade ivalida\n";
        }
        if (valorDoEmprestimo <= 0) {
            MsgDeErro += "valor vazio\n";
        }
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorDoEmprestimo(float valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public String getMsgDeErro() {
        return MsgDeErro;
    }

    public void setMsgDeErro(String MsgDeerro) {
        this.MsgDeErro = MsgDeerro;
    }
}
