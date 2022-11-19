package com.example.mathtrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mathtrainer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final problem problem = new problem();
    private final multiplication multiplication = new multiplication();
    private final div div = new div();
    int action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        generateProblem();
        MyClickListener listener = new MyClickListener();
        // binding.button.setOnClickListener(listener);
        binding.solution1.setOnClickListener(listener);
        binding.solution2.setOnClickListener(listener);
        binding.solution3.setOnClickListener(listener);
        binding.button1.setOnClickListener(listener);
        binding.button2.setOnClickListener(listener);
        binding.button3.setOnClickListener(listener);
    }


    private void generateProblem(){
        binding.problem.setText(problem.getProblem());
        binding.solution1.setText(String.valueOf(problem.getResult()));
        binding.solution2.setText(String.valueOf(problem.getWrongResult()));
        binding.solution3.setText(String.valueOf(problem.getWrongResult()));
    }
    private void generateProblemMult(){
        binding.problem.setText(multiplication.getProblem());
        binding.solution1.setText(String.valueOf(multiplication.getResult()));
        binding.solution2.setText(String.valueOf(multiplication.getWrongResult()));
        binding.solution3.setText(String.valueOf(multiplication.getWrongResult()));
    }
    private void generateProblemDiv(){
        binding.problem.setText(div.getProblem());
        binding.solution1.setText(String.format("%.2f", div.getResult()));
        binding.solution2.setText(String.format("%.2f",div.getWrongResult()));
        binding.solution3.setText(String.format("%.2f",div.getWrongResult()));
    }

    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick (View view){
            switch (view.getId()){
               /* case R.id.button:
                    generateProblem();
                    binding.solution1.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution2.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution3.setBackgroundColor(getColor(R.color.neutral));
                    break;

                */
                case R.id.solution1:
                case R.id.solution2:
                case R.id.solution3:
                    String text = ((TextView) view).getText().toString();
                    if (text.equals(String.valueOf(problem.getResult()))){
                        view.setBackgroundColor(getColor(R.color.correct));
                        break;
                    }
                    else {
                        view.setBackgroundColor(getColor(R.color.incorrect));
                    }
                    if (text.equals(String.valueOf(multiplication.getResult()))){
                        view.setBackgroundColor(getColor(R.color.correct));
                        break;
                    }
                    else {
                        view.setBackgroundColor(getColor(R.color.incorrect));
                    }
                    if (text.equals(String.format("%.2f",div.getResult()))){
                        view.setBackgroundColor(getColor(R.color.correct));
                        break;
                    }
                    else {
                        view.setBackgroundColor(getColor(R.color.incorrect));
                    }

                    break;
                case R.id.button1:
                    generateProblemMult();
                    action=1;
                    binding.solution1.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution2.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution3.setBackgroundColor(getColor(R.color.neutral));
                    break;
                case R.id.button2:
                    generateProblemDiv();
                    action=2;
                    binding.solution1.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution2.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution3.setBackgroundColor(getColor(R.color.neutral));
                    break;
                case R.id.button3:
                    action=3;
                    generateProblem();
                    binding.solution1.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution2.setBackgroundColor(getColor(R.color.neutral));
                    binding.solution3.setBackgroundColor(getColor(R.color.neutral));

            }
        }
    }


}