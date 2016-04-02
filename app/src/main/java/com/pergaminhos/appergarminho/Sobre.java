package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class Sobre extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        ButterKnife.bind(this);
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
                Intent intent = new Intent(Sobre.this, config.class);
                startActivity(intent);
                return true;

            case R.id.mSair:
                Toast.makeText(this, "Obrigado. Até a Próxima!", Toast.LENGTH_SHORT).show();
                finish();
                System.exit(0);
                return true;

            case R.id.mAvaliar:
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.google.com"));
                return true;
            case R.id.mMenu:
                Intent intent3 = new Intent(Sobre.this, Principal.class);
                startActivity(intent3);
                return true;

            case R.id.mSobre:
                Intent intent4 = new Intent(Sobre.this, rosto.class);
                startActivity(intent4);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @OnClick(R.id.button99)
    public void qmerde() {
        finish();
    }
}