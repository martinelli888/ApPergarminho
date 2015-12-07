package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class compromisso extends AppCompatActivity {
//    @Bind(R.id.checkBox1)
//    Button check1;
//    @Bind(R.id.checkBox2)
//    Button check2;

    @Bind(R.id.Nome)
    EditText Nome;
    int Dia = 1;
    int Pergaminho = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compromisso);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_compromisso, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
//
////metodo pra retornar a data do sistema
//    private String getDateTime(){
//        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
//        Date datareal = new Date();
//        return dateFormat.format(datareal);}
////    int datareal = Integer.parseInt(getDateTime());
//    String datareal =getDateTime();

    //metodo cria um objeto gaivota e seta

    public Gaivota fernao() {
        Gaivota fernao = new Gaivota();
        fernao.setNomeAtual(String.valueOf(Nome));
        fernao.setPergaminhoAtual(Pergaminho);
        fernao.setDataAtual(Dia);
        fernao.setInicio(1);
        return fernao;
    }

    //fazer um botao
    @OnClick(R.id.buttonAceitar)
     public void VaiparaConfig(){
        Intent intent= new Intent(compromisso.this,config.class);
        intent.putExtra("BARCO", fernao());
        startActivity(intent);
    }
}


