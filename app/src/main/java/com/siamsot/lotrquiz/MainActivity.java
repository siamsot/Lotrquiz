package com.siamsot.lotrquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int Score = 0;
private void displayScore (){
    RadioButton boromir1 = (RadioButton) findViewById(R.id.boromir1);
    boolean question1 = boromir1.isChecked();

    CheckBox aragorn = (CheckBox) findViewById(R.id.aragorn2);
    boolean question3a = aragorn.isChecked();

    CheckBox legolas = (CheckBox) findViewById(R.id.legolas);
    boolean question3b = legolas.isChecked();

    EditText password = (EditText) findViewById(R.id.moria_answer);
    String moria_pass = password.getText().toString();

    EditText surname = (EditText) findViewById(R.id.frodo_answer);
    String frodo_surname = surname.getText().toString();

    RadioButton nazgul = (RadioButton) findViewById(R.id.nazguls_right);
    boolean question5 = nazgul.isChecked();

    RadioButton ring = (RadioButton) findViewById(R.id.ring_true);
    boolean question6 = ring.isChecked();
}
private int calculateScore (boolean q1, String q2, boolean q3, String q4, boolean q5, boolean q6) {
    if (q1){
        Score = Score + 1;
    }
    if (q2 == "Mellon") {
        Score = Score + 1;
    }
    if (q3){
        Score = Score + 1;
    }
    if (q4 == "Baggins"){
        Score = Score + 1;
    }
    if (q5){
        Score = Score + 1;
    }
    if (q6){
        Score = Score + 1;
    }
    return Score;
}
}
