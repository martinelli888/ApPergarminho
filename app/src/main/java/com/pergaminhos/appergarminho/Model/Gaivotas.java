package com.pergaminhos.appergarminho.Model;

import java.io.Serializable;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.Query;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;

@Table("Gaivotas")

public class Gaivotas extends Model implements Serializable {


    @AutoIncrement
    @Key
    @Column("id")
    private long id;
    @Column("nome")
    private String nomeAtual;
    @Column("pergaminho")
    private String pergaminhoAtual;
    @Column("data")
    private String dataAtual;
    @Column("inicio")
    private String inicio;

    static public Gaivotas BuscarUltimaGaivota() {
        Gaivotas Ultima = Query.one(Gaivotas.class, "SELECT * FROM Gaivotas order by id desc limit 1").get();
        return Ultima;
    }


    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeAtual() {
        return nomeAtual;
    }

    public void setNomeAtual(String nomeAtual) {
        this.nomeAtual = nomeAtual;
    }

    public String getPergaminhoAtual() {
        return pergaminhoAtual;
    }

    public void setPergaminhoAtual(String pergaminhoAtual) {
        this.pergaminhoAtual = pergaminhoAtual;
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gaivotas)) return false;

        Gaivotas gaivotas = (Gaivotas) o;

        if (getId() != gaivotas.getId()) return false;
        if (!getNomeAtual().equals(gaivotas.getNomeAtual())) return false;
        if (!getPergaminhoAtual().equals(gaivotas.getPergaminhoAtual())) return false;
        if (!getDataAtual().equals(gaivotas.getDataAtual())) return false;
        return getInicio().equals(gaivotas.getInicio());

    }

    //hashcode
    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getNomeAtual().hashCode();
        result = 31 * result + getPergaminhoAtual().hashCode();
        result = 31 * result + getDataAtual().hashCode();
        result = 31 * result + getInicio().hashCode();
        return result;
    }

    //to string
    @Override
    public String toString() {
        return "Gaivotas{" +
                "Id=" + id +
                ", nomeAtual='" + nomeAtual + '\'' +
                ", pergaminhoAtual='" + pergaminhoAtual + '\'' +
                ", dataAtual='" + dataAtual + '\'' +
                ", inicio='" + inicio + '\'' +
                '}';
    }
}
