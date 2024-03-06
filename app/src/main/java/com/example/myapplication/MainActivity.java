package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText txtuname,txtpass;
    String strusername="admin",strpass="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setLanguageForApp("en");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuname=(EditText) findViewById(R.id.txtuname);
        txtpass=(EditText) findViewById(R.id.txtpassword);
    }

    public void btnlogin_click(View v)
    {
        if(txtuname.getText().toString().equals(strusername) && txtpass.getText().toString().equals(strpass)) {
            startActivity(new Intent(MainActivity.this, actHomeScreen.class));
            finish();
        }
        else
        {
            Toast.makeText(this, "invalid pass", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnsignup_click(View v)
    {
        startActivity(new Intent(MainActivity.this, actSignup.class));
    }

    /*private void setLanguageForApp(String language){

        String languageToLoad  = language; //pass the language code as param
        Locale locale;
        if(languageToLoad.equals("not-set")){
            locale = Locale.getDefault();
        }
        else {
            locale = new Locale(languageToLoad);
        }
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
    }*/
}