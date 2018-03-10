package com.siamsot.lotrquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int mScore;
public void submitScore (View view){
    RadioButton boromir1 = (RadioButton) findViewById(R.id.boromir1);
    boolean question1 = boromir1.isChecked();

    CheckBox aragorn = (CheckBox) findViewById(R.id.aragorn2);
    boolean question3a = aragorn.isChecked();

    CheckBox legolas = (CheckBox) findViewById(R.id.legolas);
    boolean question3b = legolas.isChecked();

    CheckBox elrond = (CheckBox) findViewById(R.id.elrond);
    boolean question3c = elrond.isChecked();

    EditText password = (EditText) findViewById(R.id.moria_answer);
    String moriaPass = password.getText().toString();
    moriaPass = moriaPass.trim();

    EditText surname = (EditText) findViewById(R.id.frodo_answer);
    String frodoSurname = surname.getText().toString();
    frodoSurname = frodoSurname.trim();

    RadioButton nazgul = (RadioButton) findViewById(R.id.nazguls_right);
    boolean question5 = nazgul.isChecked();

    RadioButton ring = (RadioButton) findViewById(R.id.ring_true);
    boolean question6 = ring.isChecked();

    mScore = calculateScore(question1, moriaPass, question3a, question3b, question3c, frodoSurname, question5, question6);
    if (mScore > 3)
    Toast.makeText(this, "Well done! Your final score is " + mScore, Toast.LENGTH_LONG).show();
    else {
        Toast.makeText(this, "It would be better to read the books again! Your final score is " + mScore, Toast.LENGTH_LONG).show();
    }
}
private int calculateScore (boolean q1, String q2, boolean q3a, boolean q3b, boolean q3c, String q4, boolean q5, boolean q6) {
    int mScore = 0;
    if (q1){
        mScore ++;
    }
    if (Objects.equals(q2, "Mellon")) {
        mScore ++;
    }
    if (q3a && q3b && !q3c){
        mScore ++;
    }
    if (Objects.equals(q4, "Baggins")){
        mScore ++;
    }
    if (q5){
        mScore ++;
    }
    if (q6){
        mScore ++;
    }
    return mScore;
}
}
