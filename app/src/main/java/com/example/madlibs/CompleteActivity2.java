package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompleteActivity2 extends AppCompatActivity {


    public static final String MY_NAME = "name";
    public static final String MY_ADJ = "adjective";
    public static final String MY_NOUN= "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_NUM = "number";
    public static final String MY_PLACE = "place";
    public static final String MY_ANIMAL= "animal";
    public static final String MY_VERB2 = "verb2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_complete);



        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myNum = intent.getStringExtra(MY_NUM);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myVerb2 = intent.getStringExtra(MY_VERB2);



        String strToDisplay = "A " + myNoun + " named " + myName + " had to go to school. It was their " +
                myNum + " year of school at " + myPlace + " and "  + myName + " was so " + myAdj + " for their first day. As " +
                myName + " entered the school, they saw the craziest thing. Their math teacher was " + myVerb2  + "ing on top of a giant " +
                myAnimal + ". " + myName + " " + myVerb + " and asked their classmate what was happening. The classmate said that the principal had turned " +
                "into a " + myAnimal + ". " + myName + " was so shocked and SO jealous because it was a lifelong dream for " + myName + " to become a " + myAnimal +
                ". Suddenly, the alarm clock went off and " + myName + " woke up, disappointed";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);

    }

    public void shareInfo(View v) {

        Intent intent = new Intent();
        String myName = intent.getStringExtra(MY_NAME);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myNum = intent.getStringExtra(MY_NUM);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myVerb2 = intent.getStringExtra(MY_VERB2);



        String myMessage = "A " + myNoun + " named " + myName + " had to go to school. It was their " +
                myNum + " year of school at " + myPlace + " and "  + myName + " was so " + myAdj + " for their first day. As " +
                myName + " entered the school, they saw the craziest thing. Their math teacher was " + myVerb2  + "ing on top of a giant " +
                myAnimal + ". " + myName + " " + myVerb + " and asked their classmate what was happening. The classmate said that the principal had turned " +
                "into a " + myAnimal + ". " + myName + " was so shocked and SO jealous because it was a lifelong dream for " + myName + " to become a " + myAnimal +
                ". Suddenly, the alarm clock went off and " + myName + " woke up, disappointed";


        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);

        String chooserTitle = getString(R.string.chooser);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

    }


}
