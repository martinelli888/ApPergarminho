package com.pergaminhos.appergarminho;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import butterknife.ButterKnife;


public class barrona extends AppCompatActivity {

    Toolbar mToolbar;
    Toolbar mToolbarBotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barrona);
        ButterKnife.bind(this);

        mToolbar = (Toolbar) findViewById(R.id.tb_main);
        mToolbar.setTitle("Titulo da Bagaça");
        mToolbar.setSubtitle("dia 3/03");
        mToolbar.setLogo(R.drawable.ic_action_youtube);
        setSupportActionBar(mToolbar);


        mToolbarBotton = (Toolbar) findViewById(R.id.inc_tb_bottom);
        mToolbarBotton.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent it = null;
                switch (menuItem.getItemId()) {
                    case R.id.action_goleft:
                        it = new Intent(Intent.ACTION_VIEW);
                        it.setData(Uri.parse("http://www.facebook.com"));
                        break;
                    case R.id.action_youtube:
                        it = new Intent(Intent.ACTION_VIEW);
                        it.setData(Uri.parse("http://www.youtube.com"));
                        break;
                }
                startActivity(it);
                return true;
            }
        });
        mToolbarBotton.inflateMenu(R.menu.menu_baixo);

        mToolbarBotton.findViewById(R.id.iv_settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(barrona.this, "Settings pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setSupportActionBar(Toolbar mToolbar) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.tituloBonus) {
            startActivity(new Intent(this, rosto.class));
        }
        return super.onOptionsItemSelected(item);
    }
}


