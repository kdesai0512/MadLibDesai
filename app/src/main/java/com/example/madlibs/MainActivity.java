package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fillInTheBlanks(View v) {
        EditText myAdj = (EditText) findViewById(R.id.adjective);
        EditText myNoun = (EditText) findViewById(R.id.noun);
        EditText myVerb = (EditText) findViewById(R.id.verb);
        EditText myNum = (EditText) findViewById(R.id.number);

        if (myAdj.length() == 0) {
            Context context = getApplicationContext();
            CharSequence text = "Please fill all blanks";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            String myAdjStr = myAdj.getText().toString();
            String myNounStr = myNoun.getText().toString();
            String myVerbStr = myVerb.getText().toString();
            String myNumStr = myNum.getText().toString();


            Intent intent = new Intent(this, CompleteActivity.class);

            intent.putExtra(CompleteActivity.MY_ADJ, myAdjStr);
            intent.putExtra(CompleteActivity.MY_NOUN, myNounStr);
            intent.putExtra(CompleteActivity.MY_VERB, myVerbStr);
            intent.putExtra(CompleteActivity.MY_NUM, myNumStr);

            startActivity(intent);
        }
    }
}
