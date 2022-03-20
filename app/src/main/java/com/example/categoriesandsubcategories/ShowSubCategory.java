package com.example.categoriesandsubcategories;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowSubCategory extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sub_category);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        Bundle extras = getIntent().getExtras();
        if(extras != null ){
            String key_name = extras.getString("cat");
            show_sub(key_name);
        }//end if
    }//end od on/create()
    public void show_sub(String key_name ){
        switch (key_name){
            case "Plastic":
                imageView1.setImageResource(R.drawable.plastic_pipes);
                imageView2.setImageResource(R.drawable.plastic_sprayer);
                imageView3.setImageResource(R.drawable.plastic_siphon);
                break;
            case "Parts":
                imageView1.setImageResource(R.drawable.parts_iron_pipes);
                imageView2.setImageResource(R.drawable.parts_plastic_pipes);
                imageView3.setImageResource(R.drawable.parts_trolly);
                break;
            case "Tools":
                imageView1.setImageResource(R.drawable.tools_collection);
                imageView2.setImageResource(R.drawable.tools_paint);
                imageView3.setImageResource(R.drawable.water_mixers);
                break;
            default:
                break;
        }//end switch()
    }//end show_sub()
}//end class