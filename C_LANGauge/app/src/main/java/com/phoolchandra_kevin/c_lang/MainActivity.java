package com.phoolchandra_kevin.c_lang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view){
        Intent intent = new Intent(this, EmptyActivity.class);
        startActivity(intent);
    }

    public void changeActivity2(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void changeActivity3(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void changeActivity4(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void changeActivity5(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void changeActivity6(View view){
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }

    public void changeActivity7(View view){
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    public void changeActivity8(View view){
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }

    public void changeActivity9(View view){
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }

    public void changeActivity10(View view){
        Intent intent = new Intent(this, Main10Activity.class);
        startActivity(intent);
    }

    public void changeActivity11(View view){
        Intent intent = new Intent(this, Main11Activity.class);
        startActivity(intent);
    }

    public void changeActivity12(View view){
        Intent intent = new Intent(this, Main12Activity.class);
        startActivity(intent);
    }




}
