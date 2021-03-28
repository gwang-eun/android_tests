package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHomepage = findViewById(R.id.btnHomepage);
        Button btnCall = findViewById(R.id.btnCall);
        Button btnGallery = findViewById(R.id.btnGallery);
        Button btnMove = findViewById(R.id.btnMove);
        Button btnClose = findViewById(R.id.btnClose);

        TextView textView = findViewById(R.id.txtview_test);
        EditText editText = findViewById(R.id.txt_test);

        btnHomepage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent site = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kkhosp.com"));
                startActivity(site);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-8012-3389"));
                startActivity(call);
            }
        });

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent gallery = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(gallery);*/

                Intent intent = new Intent(getApplicationContext(), BeaconActivity.class);
                startActivity(intent);
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(editText.getText());
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                intent.putExtra("name",editText.getText().toString());
                startActivity(intent);
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}