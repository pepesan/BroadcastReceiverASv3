package com.cursosdedesarrollo.broadcastreceiverasv2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by pepesan on 16/09/14.
 */
public class OnChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context ctx, Intent i) {
        // TODO Auto-generated method stub
        Log.d("App","Recibido!");
        Toast.makeText(ctx, "Ha conectado el cargador.", Toast.LENGTH_SHORT).show();
    }
}
