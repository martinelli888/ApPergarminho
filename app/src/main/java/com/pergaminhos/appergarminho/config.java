package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.net.Uri;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import se.emilsjolander.sprinkles.annotations.Column;

public class config extends AppCompatActivity {

    @Bind(R.id.NomeAtualx)
    EditText NomeNovo;
    @Bind(R.id.PergaminhoAtualx)
    EditText PergaminhoNovo;
    @Bind(R.id.Datax)
    EditText DataNova;
    @Bind(R.id.idatax)
    EditText InicioNovo;

    private Gaivota fernaoPai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        ButterKnife.bind(this);

        if (getIntent().getExtras() != null)
                if (getIntent().getExtras().containsKey("BARCO")) {
                    fernaoPai = (Gaivota) getIntent().getExtras().getSerializable("BARCO");
                    if (fernaoPai != null) {
                        NomeNovo.setText(fernaoPai.getNomeAtual());
                        PergaminhoNovo.setText(fernaoPai.getPergaminhoAtual());
                        DataNova.setText(fernaoPai.getDataAtual());
                        InicioNovo.setText(fernaoPai.getInicio());
                        Toast.makeText(config.this, "Cadastro Carregado", Toast.LENGTH_SHORT).show();}
        } else {
                        NomeNovo.setText("Seu Nome");
                        PergaminhoNovo.setText("01");
                        DataNova.setText("01");
                        InicioNovo.setText("30");
                        Toast.makeText(config.this, "Faça um Novo Cadastro!", Toast.LENGTH_SHORT).show();}
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_config, menu);
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

    @OnClick(R.id.buttonSalvar)
        public void salvar() {
            if (fernaoPai == null)
                fernaoPai = new Gaivota();
            if (!TextUtils.isEmpty(NomeNovo.getText()))
                fernaoPai.setNomeAtual(NomeNovo.getText().toString());

            if (!TextUtils.isEmpty(PergaminhoNovo.getText()))
                fernaoPai.setPergaminhoAtual(Integer.parseInt(PergaminhoNovo.getText().toString()));

            if (!TextUtils.isEmpty(DataNova.getText()))
                fernaoPai.setDataAtual(Integer.parseInt(DataNova.getText().toString()));

            if (!TextUtils.isEmpty(InicioNovo.getText()))
                fernaoPai.setInicio(Integer.parseInt(InicioNovo.getText().toString()));

            //Sprinkles vai salvar o usuario
            fernaoPai.save();
            /* Aqui, a ideia é fazer com que esse intent seja fechada e enviar um extra para
             * a activity que tem a lista de usuário dizendo que o usuário foi salvo com sucesso! */
            Intent i = new Intent(config.this,Principal.class);
            Toast.makeText(config.this, "Registro inserido com sucesso!", Toast.LENGTH_SHORT).show();
            startActivity(i);
            finish();
    }
}