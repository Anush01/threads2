package com.example.anushmp.asyncfun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

import com.google.android.material.progressindicator.CircularProgressIndicator;

public class MainActivity extends AppCompatActivity {




    CircularProgressIndicator progbar;

    Handler mainthreadhandler = new Handler(Looper.getMainLooper()){

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            if(msg.what == 1) {

                int progress = (int) msg.obj;

                progbar.setProgress(progress);
            }

            if(progbar.getProgress() == 100){progbar.setVisibility(View.INVISIBLE);}

        }
    };







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        progbar = findViewById(R.id.progressBar);


        //if(progbar.getProgress() == 100){progbar.setVisibility(View.INVISIBLE);}


        WorkerHandler h = new WorkerHandler("ok",mainthreadhandler);

        h.start();


        //thinking in android
        //remote controlled light and fan
        //Async task
        //learn
        //distribution
        //live coding an android app
        //passion
        //no issues its allgood.


        //retrofit multipart download.
        //lambda people
        //cap mars.
        //The math of mars.
        //intimading.
        //what kind of system do you need. intimate sessions



        /*
        * forgot practise pick fight.
        * multipart upload.
        * thread.
        * dont abandon
        * trick and manipulate.
        *
        * Handler Thread
        *
        * looper functions built in.
        * dominate?
        * onlooperprepared()
        * runnable progress.
        *
        * workerHandler constructor lets you name the thread.
        *
        * Thread.currentThread.getname
        * Every Activity has a different Thread but Every fragment runs on the main thread? No.
        * Every act is on the main thread
        *
        * pass a handler to the thread
        * perform android.
        * System
        * progressbar
        * interface
        *
        * Message object Android.os
        * Message.obtain
        * Message.obj = progress.
        *
        * notes.
        * typecast to int.
        * progress speed
        * lambo
        * peer programming.
        * burned out.
        *
        *
        * activity.
        *
        * quit quitsafely
        *
        * Handler Thread big data.
        * handler jobscheduler
        * Android os
        * anonymous.
        *
        * its fun until it isnt
        * Message.what
        * ok
        *
        * Thread
        * HandlerThread
        * priority
        * Looper.prepare
        * Loop.loop
        * empty for loop
        * Handler post msgQ
        * Stacks queues and heaps
        * update ui using handler of the main thread
        * AsyncTask WorkManager.
        * nullcheck
        * leaking
        * clear the instance.
        * coroutines
        * thread attached to the process
        *
        *
        * android live
        * code Chef recipiebook
        * mars math.
        *
        * optics youtube
        *
        *
        * */






    }
}


