package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.pergaminhos.appergarminho.Model.Gaivotas;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class config extends AppCompatActivity {

    @Bind(R.id.NomeAtualx)
    EditText NomeNovo;
    @Bind(R.id.PergaminhoAtualx)
    EditText PergaminhoNovo;
    @Bind(R.id.Datax)
    EditText DataNovo;
    @Bind(R.id.Idatax)
    EditText InicioNovo;
    Double dataInicial;
    Double dataHoje;
    Double diferencaDatas;
    int pergaminhoCalculado;
    Double diaCalculado;
    Double etapasConcluidas;
    Double resto;
    String mensagem;
    private Gaivotas fernaoPai;
    private Gaivotas gaivotaBuscada;
    private Gaivotas gaivotaCalculada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        ButterKnife.bind(this);

    // esse metodo chama o banco de dados dentro da Classe Gaivotas e pega a UltimaGaivota usando Metodo BuscarUltimaGaivota
        // isso se tiver alguma gaivota gravada.
        gaivotaBuscada = Gaivotas.BuscarUltimaGaivota();
        if (gaivotaBuscada != null) {
            NomeNovo.setText(gaivotaBuscada.getNomeAtual());
            PergaminhoNovo.setText(gaivotaBuscada.getPergaminhoAtual());
            DataNovo.setText(gaivotaBuscada.getDataAtual());
            InicioNovo.setText(gaivotaBuscada.getInicio());
        }
    }

//Esse metodo calcula a diferença e em qual pergaminho a gaivotinha ta

    public String CalculaMensagem() {

        //busca as datas
        Gaivotas gaivotaCalculada = Gaivotas.BuscarUltimaGaivota();
        if (gaivotaCalculada != null) {
            dataInicial = Double.parseDouble(gaivotaCalculada.getInicio());
            dataHoje = 0.00;
            //calcula a diferença de dias
            diferencaDatas = dataInicial - dataHoje;

            //verifica qual pergaminho e dia a gaivota esta
            if (diferencaDatas == 0) {
                diaCalculado = 1.0;
                pergaminhoCalculado = 1;
                String mensagem = "Você iniciará uma nova jornada, hoje é seu 1º dia do Pergaminho nº1";
            }
            if (diferencaDatas != 0) {
                etapasConcluidas = diferencaDatas / 30;
                if (etapasConcluidas > 10) {
                    String mensagem = "Parabens, você é um(a) vencedor(a), continue a aplicar o maravilhoso conteúdo dos Pergaminhos";
                    if (etapasConcluidas < 10) {
                        resto = etapasConcluidas - 9;
                        diaCalculado = resto * 30;
                        pergaminhoCalculado = 10;

                        if (etapasConcluidas < 9) {
                            resto = etapasConcluidas - 8;
                            diaCalculado = resto * 30;
                            pergaminhoCalculado = 9;

                            if (etapasConcluidas < 8) {
                                resto = etapasConcluidas - 7;
                                diaCalculado = resto * 30;
                                pergaminhoCalculado = 8;

                                if (etapasConcluidas < 7) {
                                    resto = etapasConcluidas - 6;
                                    diaCalculado = resto * 30;
                                    pergaminhoCalculado = 7;

                                    if (etapasConcluidas < 6) {
                                        resto = etapasConcluidas - 5;
                                        diaCalculado = resto * 30;
                                        pergaminhoCalculado = 6;

                                        if (etapasConcluidas < 5) {
                                            resto = etapasConcluidas - 4;
                                            diaCalculado = resto * 30;
                                            pergaminhoCalculado = 5;

                                            if (etapasConcluidas < 4) {
                                                resto = etapasConcluidas - 3;
                                                diaCalculado = resto * 30;
                                                pergaminhoCalculado = 4;

                                                if (etapasConcluidas < 3) {
                                                    resto = etapasConcluidas - 2;
                                                    diaCalculado = resto * 30;
                                                    pergaminhoCalculado = 3;

                                                    if (etapasConcluidas < 2) {
                                                        resto = etapasConcluidas - 1;
                                                        diaCalculado = resto * 30;
                                                        pergaminhoCalculado = 2;

                                                        if (etapasConcluidas < 1) {
                                                            resto = etapasConcluidas;
                                                            diaCalculado = resto * 30;
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
                }

            }
            String mensagem = gaivotaBuscada.getNomeAtual() + ", você está no " + diaCalculado + "dia do pergaminho 7" + pergaminhoCalculado;
        }
        //coloca as informaçoes na mensagem a ser exibida

        String CalculaMensagem = mensagem;
        return CalculaMensagem;
    }


    @OnClick(R.id.button13)
    public void volta() {
        finish();
    }
// salva as informacoes atuais no Fernao Pai, que leva pra salvar na Gaivotas
    @OnClick(R.id.buttonSalvarN)
    public void salvar() {
        if (fernaoPai == null)
            fernaoPai = new Gaivotas();
        if (!TextUtils.isEmpty(NomeNovo.getText()))
            fernaoPai.setNomeAtual(NomeNovo.getText().toString());
        //inseri a linha abaixo
        PergaminhoNovo.setFilters(new InputFilter[]{new InputFilterMinMax("1", "10")});

        // aqui implantei o codigo do Cesar , era assim o antigo
//if (!TextUtils.isEmpty(PergaminhoNovo.getText()))
//fernaoPai.setPergaminhoAtual(PergaminhoNovo.getText().toString())

        if (!TextUtils.isEmpty(PergaminhoNovo.getText()))
            //PergaminhoNovo.setFilters(new InputFilter[]{new InputFilterMinMax("1", "10")});
            fernaoPai.setPergaminhoAtual(PergaminhoNovo.getText().toString());
// terminei aqui
        if (!TextUtils.isEmpty(DataNovo.getText()))
            fernaoPai.setDataAtual(DataNovo.getText().toString());

        if (!TextUtils.isEmpty(InicioNovo.getText()))
            fernaoPai.setInicio(InicioNovo.getText().toString());

        //Sprinkles vai salvar o usuario editado como esta
        fernaoPai.save();
            /* Aqui, a ideia é fazer com que esse intent seja fechada e enviar um extra para
             * a activity que tem a lista de usuário dizendo que o usuário foi salvo com sucesso! */
        Intent i = new Intent(config.this, Principal.class);
        Toast.makeText(config.this, "Cadastro Feito no BD!", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
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
                Intent intent = new Intent(config.this, config.class);
                startActivity(intent);
                return true;

            case R.id.mSair:
                super.onDestroy();
                Toast.makeText(this, "Obrigado. Até a Próxima!", Toast.LENGTH_SHORT).show();
                finish();
                System.exit(0);
                return true;

            case R.id.mAvaliar:
                Intent it = null;
                it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.google.com"));
                return true;

            case R.id.mMenu:
                Intent intent3 = new Intent(config.this, Principal.class);
                startActivity(intent3);
                return true;

            case R.id.mSobre:
                Intent intent4 = new Intent(config.this, Sobre.class);
                startActivity(intent4);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
