package com.example.burak.cenganadoludeneme;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;


import java.util.ArrayList;
import java.util.List;

public class GirisActivity extends AppCompatActivity {

    EditText kullaniciadi, sifre;
    TextView tv;
    HttpPost httppost;
    StringBuffer buffer;
    HttpResponse response;
    HttpClient httpclient;
    List<NameValuePair> nameValuePairs;
    ProgressDialog dialog = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        kullaniciadi = (EditText)findViewById(R.id.username);
        sifre = (EditText) findViewById(R.id.password);
        tv = (TextView) findViewById(R.id.tv);


        ImageButton girisButonu = (ImageButton) findViewById(R.id.loginButton);
        girisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = ProgressDialog.show(GirisActivity.this, "",
                        "Validating user...", true);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        login();
                    }
                }).start();
            }
        });

    }

    void login() {
        try {
            httpclient = new DefaultHttpClient();
            httppost = new HttpPost("http://buraktunc.com/gerceklogin.php");

            nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("username", kullaniciadi.getText().toString().trim()));
            nameValuePairs.add(new BasicNameValuePair("password", sifre.getText().toString().trim()));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            response = httpclient.execute(httppost);

            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            final String response = httpclient.execute(httppost, responseHandler);

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    tv.setText("Response from PHP : " + response);
                    dialog.dismiss();
                }
            });

            if (response.equalsIgnoreCase("Login Success")) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        Toast.makeText(GirisActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    }
                });
                startActivity(new Intent(GirisActivity.this, MenuActivity.class));
            } else {
                showAlert();
            }


        } catch (Exception e) {
            dialog.dismiss();
            System.out.println("exception : " + e.getMessage());
        }
    }

    public void showAlert() {
        GirisActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(GirisActivity.this);
                builder.setTitle("Login Error.");
                builder.setMessage("User not Found.")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

    }
}

