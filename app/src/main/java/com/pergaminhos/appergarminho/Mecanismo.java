package com.pergaminhos.appergarminho;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Mecanismo extends AppCompatActivity {

    @Bind(R.id.aMais)
    Button Sobe;

    @Bind(R.id.aMenos)
    Button Desce;

    @Bind(R.id.textoChange)
    TextView TextoMuda;

    @Bind(R.id.tituloChange)
    TextView TituloMuda;

    Integer TamanhoNew=18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecanismo);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        TextoMuda.setText(intent.getIntExtra("carregaTexto", 1));
        Intent intent2 = getIntent();
        TituloMuda.setText(intent2.getIntExtra("carregaTitulo", 1));
    }

    @OnClick(R.id.aMais)
     public void Sobe(){
        TamanhoNew=TamanhoNew+1;
        if(TamanhoNew<25)
            TextoMuda.setTextSize(TamanhoNew);
    }

    @OnClick(R.id.aMenos)
    public void Desce(){
        if(TamanhoNew>12)
            TamanhoNew=TamanhoNew-1;
        TextoMuda.setTextSize(TamanhoNew);
    }

    @OnClick(R.id.button12)
    public void volta(){
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mecanismo, menu);
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
}
