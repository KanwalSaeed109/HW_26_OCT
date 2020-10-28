package com.codewitkanwal.convertex;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    ArrayList<String> arr = new ArrayList<String>();
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        button= findViewById(R.id.btn);
        editText= findViewById(R.id.txtInput);
        listView=findViewById(R.id.listView);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String getInput = editText.getText().toString();
                if(arr.contains(getInput)){
                    Toast.makeText(getBaseContext(),"Item already added to the array",Toast.LENGTH_LONG).show();
            }
                else if(getInput== null||getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Input field is empty",Toast.LENGTH_LONG).show();
                }
                else {
                    arr.add(getInput);
                    ArrayAdapter<String> adp = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arr);
                    listView.setAdapter(adp);
                    ((EditText)findViewById(R.id.txtInput)).setText("  ");
                }
                }
        });
        }
    }
