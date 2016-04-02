package com.pergaminhos.appergarminho;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Bonus extends AppCompatActivity {

    @Bind(R.id.textoBonus)
    TextView textoBonusB;

    Integer TamanhoNewB = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus);
        ButterKnife.bind(this);
    }

//    @OnClick(R.id.button15)
//      public void volta(){
//        finish();
//    }
//
//    @OnClick(R.id.botaoP140)
//        public void volta2(){
//        finish();
//    }


    @OnClick(R.id.aMais1)
    public void Sobe1() {
        TamanhoNewB = TamanhoNewB + 1;
        if (TamanhoNewB < 25)
            textoBonusB.setTextSize(TamanhoNewB);
    }

    @OnClick(R.id.aMenos1)
    public void Desce1() {
        if (TamanhoNewB > 12)
            TamanhoNewB = TamanhoNewB - 1;
        textoBonusB.setTextSize(TamanhoNewB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bonus, menu);
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