package bautistacarpintero.sistemamovilidadtandil.DataBase.Tasks.Cards;

import android.content.Context;
import android.os.AsyncTask;

import bautistacarpintero.sistemamovilidadtandil.DataBase.AppDataBase;
import bautistacarpintero.sistemamovilidadtandil.DataBase.Card;

public class UpdateCardTask extends AsyncTask<Void,Void,Void> {
    private Context context;
    private Card card;

    public UpdateCardTask(Context context, Card card) {
        this.context = context;
        this.card = card;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        AppDataBase.getAppDatabase(context).cardDao().updateAllCards(card);
        return null;
    }
}
