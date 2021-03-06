package com.project.snakeysnake;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;

//Delete unused imports later


public interface IAudioPlayer {
    //play(audio file)
    public void playAppleEatingSound(SoundPool mSP) throws IOException;
    public void playSnakeDeathSound(SoundPool mSP) throws IOException;
    public SoundPool build(SoundPool mSP);


}
