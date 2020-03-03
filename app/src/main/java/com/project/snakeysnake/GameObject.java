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
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;


public class GameObject {

    Point point;
    Context context;
    int blockSize;
    Apple apple;
    Snake snake;

    Apple createApple() {
        Apple newApple = new Apple.AppleBuilder(
                context, new Point(NUM_BLOCKS_WIDE, mNumBlocksHigh), blockSize)
                .mBitmapApple()
                .build();
    }

    Snake createSnake() {
        Snake newSnake = new Snake(context, point, blockSize);
        //move call from SnakeGame class to here


    }

}
