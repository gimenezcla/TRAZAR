package com.example.trazabilidadg;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {
    public static void showError(Context context, String msg, int length){
        Toast toast = Toast.makeText(context,
                msg,
                length);//.show();

        try {
            View view = toast.getView();
            //To change the Background of Toast
            if (view != null){
                view.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                TextView text = (TextView) view.findViewById(android.R.id.message);
                //Shadow of the Of the Text Color
                text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
                text.setTextColor(Color.WHITE);
            }
        }catch(Exception e){ }

        toast.show();
        try{
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 200);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT,200);
        }catch(Exception e)
        {}
    }

    public static void showSuccess(Context context, String msg, int length){
        Toast toast = Toast.makeText(context,
                msg,
                length);//.show();
        try {
            View view = toast.getView();
            //To change the Background of Toast
            if (view != null){
                view.setBackgroundColor(Color.rgb(74,146,0));
                TextView text = (TextView) view.findViewById(android.R.id.message);
                //Shadow of the Of the Text Color
                text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
                text.setTextColor(Color.WHITE);
            }
        }catch(Exception e){ }

        toast.show();

        try{
            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 400);
            toneGen1.startTone(ToneGenerator.TONE_CDMA_PRESSHOLDKEY_LITE,300);
        }catch(Exception e)
        {}

    }

    public static void showInfo(Context context, String msg, int length){
        Toast toast = Toast.makeText(context,
                msg,
                length);//.show();
        try {
            View view = toast.getView();
            //To change the Background of Toast
            if (view != null){
                view.setBackgroundColor(Color.rgb(214,214,0));
                TextView text = (TextView) view.findViewById(android.R.id.message);
                //Shadow of the Of the Text Color
                text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
                text.setTextColor(Color.BLACK);
            }
        }catch(Exception e){ }
        toast.show();
    }
}
