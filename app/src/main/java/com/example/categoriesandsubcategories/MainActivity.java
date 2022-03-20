package com.example.categoriesandsubcategories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView cat1, cat2, cat3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat1 = findViewById(R.id.tv_Cat1);
        cat2 = findViewById(R.id.tv_Cat2);
        cat3 = findViewById(R.id.tv_Cat3);

        cat1.setOnClickListener(this);
        cat2.setOnClickListener(this);
        cat3.setOnClickListener(this);
    }//end of onCreate()
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.tv_Cat1){
            Intent cat1_intent = new Intent(MainActivity.this,ShowSubCategory.class);
            cat1_intent.putExtra("cat","Plastic");
            startActivity(cat1_intent);
        }else if (v.getId()==R.id.tv_Cat2){
            Intent cat2_intent = new Intent(MainActivity.this,ShowSubCategory.class);
            cat2_intent.putExtra("cat","Parts");
            startActivity(cat2_intent);
        }else if (v.getId()==R.id.tv_Cat3){
            Intent cat3_intent = new Intent(MainActivity.this,ShowSubCategory.class);
            cat3_intent.putExtra("cat","Tools");
            startActivity(cat3_intent);
        }//end if
    }//end of onClick()
}//end class