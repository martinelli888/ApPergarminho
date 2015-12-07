package com.pergaminhos.appergarminho;

import java.io.Serializable;
import java.util.Date;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;


public class Gaivota extends Model implements Serializable {

    String NomeAtual;
    int DataAtual;
    int PergaminhoAtual;
    int Inicio;


    //getters and setters
    public int getInicio() {
        return Inicio;
    }

    public void setInicio(int inicio) {
        Inicio = inicio;
    }

    //getters and setters
    public String getNomeAtual() {
        return NomeAtual;
    }

    public void setNomeAtual(String nomeAtual) {
        NomeAtual = nomeAtual;
    }

    public int getDataAtual() {
        return DataAtual;
    }

    public void setDataAtual(int dataAtual) {
        DataAtual = dataAtual;
    }

    public int getPergaminhoAtual() {
        return PergaminhoAtual;
    }

    public void setPergaminhoAtual(int pergaminhoAtual) {
        PergaminhoAtual = pergaminhoAtual;
    }

}


