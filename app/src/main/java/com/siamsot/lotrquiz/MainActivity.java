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
    public int Score = 0;
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
    String moria_pass = password.getText().toString();
    moria_pass = moria_pass.trim();

    EditText surname = (EditText) findViewById(R.id.frodo_answer);
    String frodo_surname = surname.getText().toString();
    frodo_surname = frodo_surname.trim();

    RadioButton nazgul = (RadioButton) findViewById(R.id.nazguls_right);
    boolean question5 = nazgul.isChecked();

    RadioButton ring = (RadioButton) findViewById(R.id.ring_true);
    boolean question6 = ring.isChecked();

    Score = calculateScore(question1, moria_pass, question3a, question3b, question3c, frodo_surname, question5, question6);
    if (Score > 3)
    Toast.makeText(this, "Well done! Your final score is " + Score, Toast.LENGTH_LONG).show();
    else {
        Toast.makeText(this, "It would be better to read the books again! Your final score is " + Score, Toast.LENGTH_LONG).show();
    }
}
private int calculateScore (boolean q1, String q2, boolean q3a, boolean q3b, boolean q3c, String q4, boolean q5, boolean q6) {
    int Score2 = 0;
    if (q1){
        Score2 = Score2 + 1;
    }
    if (Objects.equals(q2, "Mellon")) {
        Score2 = Score2 + 1;
    }
    if (q3a && q3b && !q3c){
        Score2 = Score2 + 1;
    }
    if (Objects.equals(q4, "Baggins")){
        Score2 = Score2 + 1;
    }
    if (q5){
        Score2 = Score2 + 1;
    }
    if (q6){
        Score2 = Score2 + 1;
    }
    return Score2;
}
}
