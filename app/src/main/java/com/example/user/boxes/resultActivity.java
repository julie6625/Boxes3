package com.example.user.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class resultActivity extends AppCompatActivity {
    private EditText edlength;
    private EditText edwidth;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        findView();
    }

    private void findView() {
        edlength = findViewById(R.id.ed_length);
        edwidth = findViewById(R.id.ed_width);
        edheight = findViewById(R.id.ed_height);
    }

    public void  check(View view){
        Log.d("resultActivity","boxes");
        float length = Float.parseFloat(edlength.getText().toString());
        float width = Float.parseFloat(edwidth.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        if( length <= 23 && width <= 14 && height <= 13){
            setResult(RESULT_OK,getIntent());
            finish();
        }else{
            setResult(RESULT_CANCELED,getIntent());
            finish();
        }



    }
}
