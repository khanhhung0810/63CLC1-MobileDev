package vn.edu.luhuynhkhanhhung.savethebunny;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Spike {
    Bitmap spike[] = new Bitmap[3];
    int spikeFrame =0;
    int spikeX, spikeY, spikeVelocity;
    Random random;
    public Spike(Context context){
        spike[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.carrot0);
        spike[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.carrot1);
        spike[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.carrot2);
        random = new Random();
        resetPositon();

    }

    public Bitmap getSpike(int spikeFrame){
        return spike[spikeFrame];
    }
    public int getSpikeWith(){
        return spike[0].getWidth();
    }
    public int getSpikeHeight(){
        return spike[0].getHeight();
    }
    public void resetPositon() {
        spikeX = random.nextInt(GameView.dWith-getSpikeWith());
        spikeY = -200 + random.nextInt(600) * -1;
        spikeVelocity = 5 + random.nextInt(16); //tốc độ rơi
    }
}