package com.example.melque.ufgsolition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by melqu on 12/07/2016.
 */
//Define a SplashCreen
public class SplashScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splashscreen);
        //instancia a thread para
        Thread timerThread = new Thread(){

            //instancia a classe run para execução da trhead
            public void run(){

                try{

                    sleep(3000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }

            }

        };
       timerThread.start();
    }
    //função para dar um pause na execução da thread
    protected void onPause(){

        super.onPause();
        finish();

    }
}
