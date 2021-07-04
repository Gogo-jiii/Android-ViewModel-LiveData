package com.example.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyViewModel viewModel;
    Button btnClick;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        textView = findViewById(R.id.textView);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        viewModel.getName().observe(this, new Observer<String>() {
            @Override public void onChanged(String name) {
                textView.setText(name);
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                viewModel.setName("IT wala...");
            }
        });
    }
}