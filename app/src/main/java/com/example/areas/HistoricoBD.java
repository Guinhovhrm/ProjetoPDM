package com.example.areas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class HistoricoBD extends SQLiteOpenHelper {

    protected static final String TABELA_USUARIO = "TABELA_USUARIO";
    protected static final String USUARIO_ID = "ID";
    protected static final String USUARIO_NOME = "USUARIO_NOME";
    protected static final String USUARIO_PONTUACAO = "USUARIO_PONTUACAO";

    protected static final String TABELA_HISTORICO = "TABELA_HISTORICO";
    protected static final String HISTORICO_ID = "HISTORICO_ID";
    protected static final String HISTORICO_TP_CONTA = "HISTORICO_TP_CONTA";
    protected static final String HISTORICO_VAL1 = "HISTORICO_VAL1";
    protected static final String HISTORICO_VAL2 = "HISTORICO_VAL2";
    protected static final String HISTORICO_VAL3 = "HISTORICO_VAL3";
    protected static final String HISTORICO_RESULTADO = "HISTORICO_RESULTADO";
    protected static final String HISTORICO_PONTUACAO = "HISTORICO_PONTUACAO";


    public HistoricoBD(@Nullable Context context) {
        super(context, "HistBD", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String statement = "CREATE TABLE " + TABELA_HISTORICO +
                " (" + HISTORICO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HISTORICO_TP_CONTA + " TEXT, " + HISTORICO_VAL1 + " INT,"
                + HISTORICO_VAL2 + " INT," + HISTORICO_VAL3 + " INT,"
                + HISTORICO_RESULTADO + "INT," + HISTORICO_PONTUACAO + "INT)";

        db.execSQL(statement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean adicionarHistorico(Historico historico) {

        SQLiteDatabase db = this.getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        //O ID é autoincrement, entao nao precisa dele aqui
        contentValues.put(HISTORICO_TP_CONTA, historico.getTipConta());
        contentValues.put(HISTORICO_VAL1, historico.getVal1());
        contentValues.put(HISTORICO_VAL2, historico.getVal2());
        contentValues.put(HISTORICO_VAL3, historico.getVal3());
        contentValues.put(HISTORICO_RESULTADO, historico.getResultado());
        contentValues.put(HISTORICO_PONTUACAO, historico.getPontuacao());

        long inserirSucedido = db.insert(TABELA_HISTORICO, null, contentValues);
        db.close();

        return inserirSucedido != -1;


    }


    //Para adicionar um Historico
    public boolean atualizarHistorico(Historico historico) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //O ID é autoincrement, entao nao precisa dele aqui
        contentValues.put(HISTORICO_TP_CONTA, historico.getTipConta());
        contentValues.put(HISTORICO_VAL1, historico.getVal1());
        contentValues.put(HISTORICO_VAL2, historico.getVal2());
        contentValues.put(HISTORICO_VAL3, historico.getVal3());
        contentValues.put(HISTORICO_RESULTADO, historico.getResultado());
        contentValues.put(HISTORICO_PONTUACAO, historico.getPontuacao());

        long atualizarSucedido = db.update(TABELA_HISTORICO, contentValues, HISTORICO_ID + "=" + historico.getIdHist(), null);//nullColumnHack é null quando deseja-se adicionar uma linha não nula. Quando intencionalmente deseja inserir uma linha vazia, é necessário informar o valor de uma coluna da tabela usada. No caso da tabela usuário, pode ser nome ou idade.
        db.close();

        return atualizarSucedido != -1;


    }

    public List<Historico> getListaHistorico() {
        List<Historico> listaHistorico = new ArrayList<>();

        String queryStatement = "SELECT * FROM " + TABELA_HISTORICO;
        SQLiteDatabase db = this.getReadableDatabase();
        try (Cursor cursor = db.rawQuery(queryStatement, null)) {

            if (cursor.moveToFirst()) {
                do {
                    int historicoCod = cursor.getInt(0);//A primeira coluna da tabela usuário é código
                    String historicoTpConta = cursor.getString(1);
                    int historicoVal1 = cursor.getInt(2);
                    int historicoVal2 = cursor.getInt(3);
                    int historicoVal3 = cursor.getInt(4);
                    int historicoResultado = cursor.getInt(5);
                    float historicoPontuacao = cursor.getInt(6);

                    Historico historico = new Historico(historicoCod, historicoTpConta, historicoVal1, historicoVal2, historicoVal3, historicoResultado, historicoPontuacao); //Ver se o construtor nao ira ter conflito
                    listaHistorico.add(historico);
                } while (cursor.moveToNext());
            } else {

            }
            cursor.close();
        }
        db.close();
        return listaHistorico;
    }


    public boolean excluirHistorico(Historico historico) {
        SQLiteDatabase db = this.getWritableDatabase();
        String queryString =
                "DELETE FROM " + TABELA_HISTORICO + " WHERE " + HISTORICO_ID + " = " + historico.getIdHist();

        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToFirst()) {
            return true;
        } else {
            return false;
        }

    }
}