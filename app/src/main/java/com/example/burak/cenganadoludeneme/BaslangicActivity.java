package com.example.burak.cenganadoludeneme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class BaslangicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslangic);

        girisEkraninaGec();
    }
        private void girisEkraninaGec()
    {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        ImageView baslangiclogo = (ImageView) findViewById(R.id.baslangicLogoImageView);
        anim.reset();
        baslangiclogo.clearAnimation();
        baslangiclogo.startAnimation(anim);


        anim.setAnimationListener(new Animation.AnimationListener() {


            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(BaslangicActivity.this, GirisActivity.class);
                startActivity(intent);
                BaslangicActivity.this.finish();
            }
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
    }

    }
