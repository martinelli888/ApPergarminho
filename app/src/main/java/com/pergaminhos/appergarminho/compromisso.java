package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pergaminhos.appergarminho.Model.Gaivotas;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class compromisso extends AppCompatActivity {

    @Bind(R.id.Nome)
    EditText Nome;
    @Bind(R.id.aquio)
    TextView aquio;

    int Dia = 1;
    int Pergaminho = 1;
    Double dataInicial;
    Double dataHoje;
    Double diferencaDatas;
    int pergaminhoCalculado;
    double diaCalculado;
    int idiaCalculado;
    Double etapasConcluidas;
    Double resto;
    String mensagem;
    Gaivotas gaivotaCalculada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compromisso);
        ButterKnife.bind(this);
        CalculaMensagem();
        posta();
    }

    public String CalculaMensagem() {

        //busca as datas
        gaivotaCalculada = Gaivotas.BuscarUltimaGaivota();
        if (gaivotaCalculada != null) {
            dataInicial = Double.parseDouble(gaivotaCalculada.getInicio());
            dataHoje = 0.00;
            //calcula a diferença de dias
            diferencaDatas = dataInicial - dataHoje;

            //verifica qual pergaminho e dia a gaivota esta
            if (diferencaDatas == 0) {
                diaCalculado = 1;
                pergaminhoCalculado = 1;
                mensagem = "Você iniciará uma nova jornada, hoje é seu 1º dia do Pergaminho nº1";
            }
            if (diferencaDatas != 0) {
                etapasConcluidas = diferencaDatas / 30;
                if (etapasConcluidas < 10) {
                    resto = etapasConcluidas - 9;
                    diaCalculado = resto * 30;
                    if (diaCalculado == 30) {
                        idiaCalculado = (int) diaCalculado;
                    }
                    if (diaCalculado > 30) {
                        idiaCalculado = (int) diaCalculado + 1;
                    }

                    pergaminhoCalculado = 10;

                    if (etapasConcluidas < 9) {
                        resto = etapasConcluidas - 8;
                        diaCalculado = resto * 30;
                        if (diaCalculado == 30) {
                            idiaCalculado = (int) diaCalculado;
                        }
                        if (diaCalculado != 30) {
                            idiaCalculado = (int) diaCalculado + 1;
                        }
                        pergaminhoCalculado = 9;

                        if (etapasConcluidas < 8) {
                            resto = etapasConcluidas - 7;
                            diaCalculado = resto * 30;
                            if (diaCalculado == 30) {
                                idiaCalculado = (int) diaCalculado;
                            }
                            if (diaCalculado != 30) {
                                idiaCalculado = (int) diaCalculado + 1;
                            }
                            pergaminhoCalculado = 8;

                            if (etapasConcluidas < 7) {
                                resto = etapasConcluidas - 6;
                                diaCalculado = resto * 30;
                                if (diaCalculado == 30) {
                                    idiaCalculado = (int) diaCalculado;
                                }
                                if (diaCalculado != 30) {
                                    idiaCalculado = (int) diaCalculado + 1;
                                }
                                pergaminhoCalculado = 7;

                                if (etapasConcluidas < 6) {
                                    resto = etapasConcluidas - 5;
                                    diaCalculado = resto * 30;
                                    if (diaCalculado == 30) {
                                        idiaCalculado = (int) diaCalculado;
                                    }
                                    if (diaCalculado != 30) {
                                        idiaCalculado = (int) diaCalculado + 1;
                                    }
                                    pergaminhoCalculado = 6;

                                    if (etapasConcluidas < 5) {
                                        resto = etapasConcluidas - 4;
                                        diaCalculado = resto * 30;
                                        if (diaCalculado == 30) {
                                            idiaCalculado = (int) diaCalculado;
                                        }
                                        if (diaCalculado != 30) {
                                            idiaCalculado = (int) diaCalculado + 1;
                                        }
                                        pergaminhoCalculado = 5;

                                        if (etapasConcluidas < 4) {
                                            resto = etapasConcluidas - 3;
                                            diaCalculado = resto * 30;
                                            if (diaCalculado == 30) {
                                                idiaCalculado = (int) diaCalculado;
                                            }
                                            if (diaCalculado != 30) {
                                                idiaCalculado = (int) diaCalculado + 1;
                                            }
                                            pergaminhoCalculado = 4;

                                            if (etapasConcluidas < 3) {
                                                resto = etapasConcluidas - 2;
                                                diaCalculado = resto * 30;
                                                if (diaCalculado == 30) {
                                                    idiaCalculado = (int) diaCalculado;
                                                }
                                                if (diaCalculado != 30) {
                                                    idiaCalculado = (int) diaCalculado + 1;
                                                }
                                                pergaminhoCalculado = 3;

                                                if (etapasConcluidas < 2) {
                                                    resto = etapasConcluidas - 1;
                                                    diaCalculado = resto * 30;
                                                    if (diaCalculado == 30) {
                                                        idiaCalculado = (int) diaCalculado;
                                                    }
                                                    if (diaCalculado != 30) {
                                                        idiaCalculado = (int) diaCalculado + 1;
                                                    }
                                                    pergaminhoCalculado = 2;

                                                    if (etapasConcluidas < 1) {
                                                        resto = etapasConcluidas;
                                                        diaCalculado = resto * 30;
                                                        if (diaCalculado == 30) {
                                                            idiaCalculado = (int) diaCalculado;
                                                        }
                                                        if (diaCalculado != 30) {
                                                            idiaCalculado = (int) diaCalculado + 1;
                                                        }
                                                        pergaminhoCalculado = 1;

                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                mensagem = gaivotaCalculada.getNomeAtual() + ", você está no " + idiaCalculado + "º dia do pergaminho " + pergaminhoCalculado + ".";

                if (etapasConcluidas >= 10) {
                    mensagem = "Parabens, você é um(a) vencedor(a), continue a aplicar o maravilhoso segredo dos Pergaminhos";
                }
            }
        }
        //coloca as informaçoes na mensagem a ser exibida
        return mensagem;
    }

    public void posta() {
        aquio.setText(mensagem);
    }

    //metodo cria um objeto gaivota e seta

    public Gaivota fernao() {
        Gaivota fernao = new Gaivota();
        fernao.setNomeAtual(String.valueOf(Nome));
        fernao.setPergaminhoAtual(Pergaminho);
        fernao.setDataAtual(Dia);
        fernao.setInicio(1);
        return fernao;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mecanismo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mConfig:
                Intent intent = new Intent(compromisso.this, config.class);
                startActivity(intent);
                return true;

            case R.id.mSair:
                super.onDestroy();
                Toast.makeText(this, "Obrigado. Até a Próxima!", Toast.LENGTH_SHORT).show();
                finish();
                System.exit(1);
                return true;

            case R.id.mAvaliar:
                Intent intent8 = new Intent(compromisso.this, Principal.class);
                startActivity(intent8);
                return true;

            case R.id.mMenu:
                Intent intent3 = new Intent(compromisso.this, Principal.class);
                startActivity(intent3);
                return true;

            case R.id.mSobre:
                Intent intent4 = new Intent(compromisso.this, Sobre.class);
                startActivity(intent4);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

//
////metodo pra retornar a data do sistema
//    private String getDateTime(){
//        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
//        Date datareal = new Date();
//        return dateFormat.format(datareal);}
////    int datareal = Integer.parseInt(getDateTime());
//    String datareal =getDateTime();


    //fazer um botao
    @OnClick(R.id.buttonAceitar)
    public void VaiparaConfig() {
        Intent intent = new Intent(compromisso.this, config.class);
        intent.putExtra("BARCO", fernao());
        startActivity(intent);
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getPergaminho() {
        return Pergaminho;
    }

    public void setPergaminho(int pergaminho) {
        Pergaminho = pergaminho;
    }

    public EditText getNome() {
        return Nome;
    }

    public void setNome(EditText nome) {
        Nome = nome;
    }
}


