package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
//
//            Handler handler = new Handler();
//            handler.postDelayed(this, 5000);
        }

//        public void run() {
//            startActivity(new Intent(this, Principal.class));
//            finish();
//        }

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

