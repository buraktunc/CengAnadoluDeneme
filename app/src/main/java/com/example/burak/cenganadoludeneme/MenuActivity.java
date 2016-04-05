package com.example.burak.cenganadoludeneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //CoursesActivity'e Geç
        ImageButton coursButton = (ImageButton) findViewById(R.id.coursesButton);
        coursButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent (MenuActivity.this, CoursesActivity.class);
                startActivity(i1);
            }
        });



        //Department Activity'e geç
        ImageButton departButton = (ImageButton) findViewById(R.id.departmentButton);
        departButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(MenuActivity.this, DepartmentActivity.class);
                startActivity(i2);
            }
        });

        ImageButton extraButton = (ImageButton) findViewById(R.id.extrasButton);
        extraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MenuActivity.this, ExtrasActivity.class);
                startActivity(i3);
            }
        });


    }


}
