package com.example.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void varify(View view) {
        // copy and display the text
        EditText editText = (EditText) findViewById(R.id.editText);
        String s = editText.getText().toString();
        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.textView);
          String sLevel = "";

        if(tooLong(s)) {
            sLevel = "Too Long";
        }

        if(needUpperCase(s)) {
            sLevel = "Need UpperCase Letter";
        }

        if(needInteger(s)) {
            sLevel = "Need Integer";
        }

        if(length(s)) {
            sLevel = "Too Short";
        }

        if(notPassword(s)) {
            sLevel = "Not password";
        }

        textView1.setText(sLevel);
    }


    public Boolean length(String s) {
        boolean x = false;
        if(s.length()<8) {
            x = true;
        }

        return x;
    }

    public Boolean notPassword(String s) {
        boolean x = false;
        if(s.equals("password")) {
            x = true;
        }

        return x;
    }

    public Boolean needInteger(String s) {
        boolean x = true;
        if(s.matches(".*\\d+.*")){;
            x = false;
        }


        return x;
    }

    public Boolean needUpperCase(String s) {
        boolean x = true;
        if(Pattern.matches("[A-Z]+[a-z]+[0-9]", s)){;
            x = false;
        }


        return x;
    }

    public Boolean tooLong(String s) {
        boolean x = false;
        if(s.length()>10){;
            x = true;
        }


        return x;
    }
}
