package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textView = (TextView) findViewById(R.id.txtview_test);
        Intent intent = getIntent();

        Toast mytoast = Toast.makeText(getApplicationContext(), "하하핳 바보", Toast.LENGTH_SHORT);
        mytoast.show();
        
        String name = intent.getStringExtra("name");
        textView.setText(name + "바보멍충이");

        Log.println(Log.WARN,name,"dd: "+name);

        ImageView imgview = (ImageView) findViewById(R.id.img_laugh);
        imgview.setImageResource(R.drawable.laughing2);


    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        int action = motionEvent.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "하하하하하하핳 바보네 바보야", Toast.LENGTH_SHORT).show();
                ImageView imgview = (ImageView) findViewById(R.id.img_laugh);
                imgview.setImageResource(R.drawable.cry_laughing);
                break;
        }
        return false;
    }
}