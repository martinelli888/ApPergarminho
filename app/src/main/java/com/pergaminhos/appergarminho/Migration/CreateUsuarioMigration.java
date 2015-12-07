package com.pergaminhos.appergarminho.Migration;

import android.database.sqlite.SQLiteDatabase;

import se.emilsjolander.sprinkles.Migration;

public class CreateUsuarioMigration extends Migration {

    @Override
    protected void doMigration(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Gaivotas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT, " +
                "pergaminho TEXT, " +
                "data TEXT, " +
                "inicio TEXT)");
    }
}
//    @Override
//    protected void doMigration(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE Gaivota (" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "nome TEXT, " +
//                "pergaminho DOUBLE, " +
//                "data DOUBLE, " +
//                "inicio DATE)");
//    }
//}