package com.example.user.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean login = false;
    public static final int RC_LOGIN = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!login){
            Intent intent = new Intent(this, resultActivity.class);
            startActivityForResult(intent,RC_LOGIN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_LOGIN){
            if (resultCode == RESULT_OK){
                TextView result = findViewById(R.id.finaltext);
                result.setText("BOX3 \n Dimention: 23/14/13 cm \n Price:65");
            }else {
                TextView result = findViewById(R.id.finaltext);
                result.setText("BOX5 \n Dimention: 39.5 / 27.5 / 23 cm \n Price:90");
            }
        }
    }
}
