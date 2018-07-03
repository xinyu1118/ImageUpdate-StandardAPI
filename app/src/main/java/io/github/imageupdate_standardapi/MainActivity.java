package io.github.imageupdate_standardapi;

import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Monitor media data updated, including adding, deleting, modifying.
 */
public class MainActivity extends AppCompatActivity {
    private ImageObserver imageObserver;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageObserver = new ImageObserver(this, handler);
        getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, imageObserver);

    }
}
