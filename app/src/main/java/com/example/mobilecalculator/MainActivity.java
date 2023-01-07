package com.example.mobilecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView SolvingView, AnswerView;
    MaterialButton btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    MaterialButton btn_C,btn_opnBrac,btn_closeBrac,btn_Multiply,btn_Divide,btn_Add,btn_Minus,btn_Dot,btn_Equals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        AnswerView = findViewById(R.id.AnswerView);
        SolvingView = findViewById(R.id.SolvingView);

        giveID(btn_C, R.id.btn_C);
        giveID(btn_opnBrac, R.id.btn_opnBrac);
        giveID(btn_closeBrac, R.id.btn_closeBrc);
        giveID(btn_Divide, R.id.btn_Divide);
        giveID(btn_Multiply, R.id.btn_Multiply);
        giveID(btn_Minus, R.id.btn_Minus);
        giveID(btn_Add, R.id.btn_Add);
        giveID(btn_Equals, R.id.btn_Equals);
        giveID(btn_Dot, R.id.btn_Dot);
        giveID(btn_0, R.id.btn_0);
        giveID(btn_1, R.id.btn_1);
        giveID(btn_2, R.id.btn_2);
        giveID(btn_3, R.id.btn_3);
        giveID(btn_4, R.id.btn_4);
        giveID(btn_5, R.id.btn_5);
        giveID(btn_6, R.id.btn_6);
        giveID(btn_7, R.id.btn_7);
        giveID(btn_8, R.id.btn_8);
        giveID(btn_9, R.id.btn_9);





    }

    void giveID(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String inputText = button.getText().toString();
        SolvingView.setText(inputText);
        String inputToSolve = SolvingView.getText().toString();

        if (inputText.equals("C")) {
            SolvingView.setText("");
            AnswerView.setText("");
            return;
        }
        if (inputText.equals("=")) {
            SolvingView.setText(AnswerView.getText());
            return;
        } else {
            inputToSolve = inputToSolve + inputText;
        }
        SolvingView.setText(inputToSolve);

    }

        String fetchAnswer(String ans){
            return "Calculated";
        }




        inputToSolve = inputToSolve+inputText;
        SolvingView.setText(inputToSolve);

    }
}