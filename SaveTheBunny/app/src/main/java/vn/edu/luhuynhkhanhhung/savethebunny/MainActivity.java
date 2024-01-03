package vn.edu.luhuynhkhanhhung.savethebunny;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static MediaPlayer nhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        nhac = MediaPlayer.create(this, R.raw.beat1);
        nhac.setLooping(true);

    }

    public void startGame(View view) {
        GameView gameView = new GameView(this);
        setContentView(gameView);
        nhac.start();
    }
}