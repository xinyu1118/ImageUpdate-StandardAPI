package io.github.imageupdate_standardapi;


import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

public class ImageObserver extends ContentObserver {
    Context context;
    Handler handler;

    public ImageObserver(Context context, Handler handler) {
        super(handler);
        this.context = context;
        this.handler = handler;
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
        Log.d("Log", "Image updated!");
    }
}
