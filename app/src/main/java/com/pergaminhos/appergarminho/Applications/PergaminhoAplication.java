package com.pergaminhos.appergarminho.Applications;

import android.app.Application;

import com.pergaminhos.appergarminho.Migration.CreateUsuarioMigration;

import se.emilsjolander.sprinkles.Sprinkles;

public class PergaminhoAplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Instanciar Sprinkles
        Sprinkles sprinkles = Sprinkles.init(getApplicationContext());
        //Sprinkles execuar os migrations das entidades
        sprinkles.addMigration(new CreateUsuarioMigration());
    }
}
