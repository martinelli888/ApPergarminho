package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Principal extends AppCompatActivity {

        @Bind(R.id.button1)
        Button chamaP1;

        @Bind(R.id.button2)
        Button chamaP2;

        @Bind(R.id.button3)
        Button chamaP3;

        @Bind(R.id.button4)
        Button chamaP4;

        @Bind(R.id.button5)
        Button chamaP5;

        @Bind(R.id.button6)
        Button chamaP6;

        @Bind(R.id.button7)
         Button chamaP7;

        @Bind(R.id.button8)
        Button chamaP8;

        @Bind(R.id.button9)
        Button chamaP9;

        @Bind(R.id.button10)
        Button chamaP10;

//        @Bind(R.id.button11)
//        Button fechar;

    int pt1= R.string.pt1;
        int tit1= R.string.titulo1;
    int pt2= R.string.pt2;
        int tit2= R.string.titulo2;
    int pt3= R.string.pt3;
        int tit3= R.string.titulo3;
    int pt4= R.string.pt4;
        int tit4= R.string.titulo4;
    int pt5= R.string.pt5;
        int tit5= R.string.titulo5;
    int pt6= R.string.pt6;
        int tit6= R.string.titulo6;
    int pt7= R.string.pt7;
        int tit7= R.string.titulo7;
    int pt8= R.string.pt8;
        int tit8= R.string.titulo8;
    int pt9= R.string.pt9;
        int tit9= R.string.titulo9;
    int pt10= R.string.pt10;
        int tit10= R.string.titulo10;
    int bonus= R.string.textoBonus;
        int titbonus= R.string.tituloBonus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button1)
    public void Correios1(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto", pt1);
        intent.putExtra("carregaTitulo", tit1);
        startActivity(intent);
    }
    @OnClick(R.id.button2)
    public void Correios2(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt2);
        intent.putExtra("carregaTitulo",tit2);
        startActivity(intent);
    }
    @OnClick(R.id.button3)
    public void Correios3(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt3);
        intent.putExtra("carregaTitulo",tit3);
        startActivity(intent);
    }
    @OnClick(R.id.button4)
    public void Correios4(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt4);
        intent.putExtra("carregaTitulo",tit4);
        startActivity(intent);
    }
    @OnClick(R.id.button5)
    public void Correios5(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt5);
        intent.putExtra("carregaTitulo",tit5);
        startActivity(intent);
    }
    @OnClick(R.id.button6)
    public void Correios6(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt6);
        intent.putExtra("carregaTitulo",tit6);
        startActivity(intent);
    }
    @OnClick(R.id.button7)
    public void Correios7(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt7);
        intent.putExtra("carregaTitulo",tit7);
        startActivity(intent);
    }
    @OnClick(R.id.button8)
    public void Correios8(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt8);
        intent.putExtra("carregaTitulo",tit8);
        startActivity(intent);
    }
    @OnClick(R.id.button9)
    public void Correios9(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt9);
        intent.putExtra("carregaTitulo",tit9);
        startActivity(intent);
    }
    @OnClick(R.id.button10)
    public void Correios10(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",pt10);
        intent.putExtra("carregaTitulo",tit10);
        startActivity(intent);
    }
    @OnClick(R.id.buttonBonus)
    public void Correios11(){
        Intent intent= new Intent(Principal.this, Mecanismo.class);
        intent.putExtra("carregaTexto",bonus);
        intent.putExtra("carregaTitulo",titbonus);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
