package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    Integer TamanhoNew = 16;

// aqui começa parte do menu


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecanismo);
        ButterKnife.bind(this);

        final Intent intent = getIntent();
        TextoMuda.setText(intent.getIntExtra("carregaTexto", 1));
        Intent intent2 = getIntent();
        TituloMuda.setText(intent2.getIntExtra("carregaTitulo", 1));
    }

    @OnClick(R.id.aMais)
    public void Sobe() {
        TamanhoNew = TamanhoNew + 1;
        if (TamanhoNew < 25)
            TextoMuda.setTextSize(TamanhoNew);
    }

    @OnClick(R.id.aMenos)
    public void Desce() {
        if (TamanhoNew > 12)
            TamanhoNew = TamanhoNew - 1;
        TextoMuda.setTextSize(TamanhoNew);
    }

    @OnClick(R.id.button12)
    public void volta() {
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
                Intent intent = new Intent(Mecanismo.this, config.class);
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
                Intent intent3 = new Intent(Mecanismo.this, Principal.class);
                startActivity(intent3);
                return true;

            case R.id.mSobre:
                Intent intent4 = new Intent(Mecanismo.this, Sobre.class);
                startActivity(intent4);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}