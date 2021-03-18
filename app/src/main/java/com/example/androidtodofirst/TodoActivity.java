package com.example.androidtodofirst;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TodoActivity extends AppCompatActivity {

    private static final String TODO_INDEX = "todoIndex";
    private String[] mTodos;
    private int mTodoIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      /* call the super class onCreate to complete the creation
         of activity with state changes */
        super.onCreate(savedInstanceState);

        // set the user interface layout for this Activity
        setContentView(R.layout.activity_todo);



    }

    /* In case of state change, such as rotating the phone,
   store the mTodoIndex */

    /* override to write the value of mTodoIndex into
       the Bundle with TODO_INDEX as its key */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(TODO_INDEX, mTodoIndex);
    }
}