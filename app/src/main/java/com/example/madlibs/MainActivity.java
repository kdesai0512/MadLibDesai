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
        EditText myName = (EditText) findViewById(R.id.name);
        EditText myAdj = (EditText) findViewById(R.id.adjective);
        EditText myNoun = (EditText) findViewById(R.id.noun);
        EditText myVerb = (EditText) findViewById(R.id.verb);
        EditText myNum = (EditText) findViewById(R.id.number);
        EditText myPlace = (EditText) findViewById(R.id.place);
        EditText myAnimal = (EditText) findViewById(R.id.animal);
        EditText myVerb2 = (EditText) findViewById(R.id.verb2);

        if (myName.length() == 0 || myAdj.length() == 0 || myNoun.length() == 0 || myVerb.length() == 0 || myNum.length() == 0
        || myPlace.length() == 0 || myAnimal.length() == 0 || myVerb2.length() == 0) {
            Context context = getApplicationContext();
            CharSequence text = "Please fill all blanks";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            String myNameStr = myName.getText().toString();
            String myAdjStr = myAdj.getText().toString();
            String myNounStr = myNoun.getText().toString();
            String myVerbStr = myVerb.getText().toString();
            String myNumStr = myNum.getText().toString();
            String myPlaceStr = myPlace.getText().toString();
            String myAnimalStr = myAnimal.getText().toString();
            String myVerb2Str = myVerb2.getText().toString();


            Intent intent = new Intent(this, CompleteActivity.class);

            intent.putExtra(CompleteActivity.MY_NAME, myNameStr);
            intent.putExtra(CompleteActivity.MY_ADJ, myAdjStr);
            intent.putExtra(CompleteActivity.MY_NOUN, myNounStr);
            intent.putExtra(CompleteActivity.MY_VERB, myVerbStr);
            intent.putExtra(CompleteActivity.MY_NUM, myNumStr);
            intent.putExtra(CompleteActivity.MY_PLACE, myPlaceStr);
            intent.putExtra(CompleteActivity.MY_ANIMAL, myAnimalStr);
            intent.putExtra(CompleteActivity.MY_VERB2, myVerb2Str);


            startActivity(intent);
        }
    }

}
