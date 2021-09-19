package com.example.anushmp.asyncfun;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;

public class WorkerHandler extends HandlerThread {

    Handler passedfromMain;

    public WorkerHandler(String name, Handler passedfromMain) {
        super(name);
        this.passedfromMain = passedfromMain;
    }

    @Override
    protected void onLooperPrepared() {
        super.onLooperPrepared();

        int progress = 0;

        for(int i = 0; i<10; i++){


                SystemClock.sleep(1000);

                progress = progress + 10;

                Message message = Message.obtain();

                message.obj = progress;

                message.what = 1;

                passedfromMain.sendMessage(message);




        }


    }
}
