package com.example.nick.csc300app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void calcButtonClicked(View sender)
    {
        EditText userInput = (EditText)this.findViewById(R.id.editText);
        String input = userInput.getText().toString();
        System.out.println("Calc button pressed");
        TextView label = (TextView)this.findViewById(R.id.label);
        label.setText(postFix(input));
    }




    public String postFix(String input)
    {
        //creates new stack for items to be put into
        Stack s = new Stack();
        StringTokenizer st = new StringTokenizer(input);
        System.out.println(st.toString());

        s.push(st);
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == '+')
            {
                //pop last two items and add them together, then push onto stack
            }
            else if(input.charAt(i) == '-')
            {
                //pop last two items and subtract, then push onto stack
            }
            else if(input.charAt(i) == '*')
            {
                //pop last two items and multiply, then push onto stack
            }
            else if(input.charAt(i) == '/')
            {
                //pop last two items and divide, then push onto stack
            }
            else if(input.charAt(i) == '(')
            {
                //find instance of ')' then grab whatever is inside, ultimately performing whatever operation it contains
            }
        }
    return s.toString();
    }








}
