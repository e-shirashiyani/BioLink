package com.example.biolink.view.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biolink.R;

public class StartActivity extends AppCompatActivity {
    private Button mSignUp,mLogin;
    private TextView mTitle,mName,mFamily;
    private ImageView mHuman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        findViews();
        setListener();
    }
    private void findViews(){
        mLogin=findViewById(R.id.login);
        mSignUp=findViewById(R.id.signUp);
        mTitle=findViewById(R.id.titleStart);
        mName=findViewById(R.id.name);
        mFamily=findViewById(R.id.desscription);
        mHuman=findViewById(R.id.imageHuman);


    }
    private void setListener(){
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        mLogin.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StartActivity.this, MainPageActivity.class);
                Pair[] pairs= new Pair[4];
                pairs[0] = new Pair<View , String>(mTitle,"titleTransition");
                pairs[1]= new Pair<View,String>(mHuman,"imageTransition");
                pairs[2]= new Pair<View,String>(mName,"nameTransition");
                pairs[3]= new Pair<View,String>(mFamily,"descTransition");


                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(StartActivity.this, pairs);
                startActivity(intent,options.toBundle());
            }
        });
    }
}