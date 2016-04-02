package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class rosto extends AppCompatActivity  {
//    implements Runnable
    @Bind(R.id.ButtonRosto1)
    Button BotaoNovo;
    @Bind(R.id.ButtonRosto2)
    Button BotaoContinua;
    @Bind(R.id.ButtonRostoMeio)
    Button BotaoConfig;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rosto);
            ButterKnife.bind(this);
        }

    @OnClick(R.id.ButtonRosto1)
    public void VaiparaCompromisso(){
        Intent intent= new Intent(rosto.this,compromisso.class);
        startActivity(intent);
    }

    @OnClick(R.id.ButtonRostoMeio)
    public void VaiparaConfig(){
        Intent intent= new Intent(rosto.this,config.class);
        startActivity(intent);
    }
    @OnClick(R.id.ButtonRosto2)
    public void VaiparaPrincipal(){
        Intent intent= new Intent(rosto.this,Principal.class);
        startActivity(intent);
    }
}

