package com.pergaminhos.appergarminho;

import java.io.Serializable;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;

@Table("Gaivotas")

public class Gaivotas extends Model implements Serializable {

@Key
@AutoIncrement
@Column("id")
private Long Id;


@Column("Nome")
private String NomeAtual;
@Column("Pergaminho")
private String PergaminhoAtual;
@Column("Data")
private String DataAtual;
@Column("Inicio")
private String Inicio;


}
