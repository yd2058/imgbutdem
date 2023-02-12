package com.example.imgbutdem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    Random rnd = new Random();
    int stor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        iv = (ImageView)findViewById(R.id.imageView);
    }

    public void randi(View view) {
    stor = rnd.nextInt(3);
    System.out.println(stor);
    if (stor==0){
        btn.setBackgroundResource(R.drawable.uno);
        iv.setImageResource(R.drawable.happy);
    }
    if (stor==1){
        btn.setBackgroundResource(R.drawable.dos);
        iv.setImageResource(R.drawable.sad);
    }
    if (stor==2){
        btn.setBackgroundResource(R.drawable.shitree);
        iv.setImageResource(R.drawable.shocshokaim);
    }
    }
}