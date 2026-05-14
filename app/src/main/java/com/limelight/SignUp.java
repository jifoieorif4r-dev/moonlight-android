package com.limelight;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.limelight.utils.Dialog;

public class SignUp extends AppCompatActivity {

    private EditText editTextUser, editTextEmail, editTextSenha, editTextNickname;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextUser     = (EditText) findViewById(R.id.editTextUser);
        editTextEmail    = (EditText) findViewById(R.id.editTextEmail);
        editTextSenha    = (EditText) findViewById(R.id.editTextSenha);
        editTextNickname = (EditText) findViewById(R.id.editTextNickname);
        buttonSignUp     = (Button) findViewById(R.id.buttonSignUp);


        buttonSignUp.setOnClickListener(view -> {

            Boolean empty = false;

            if(editTextUser.getText().toString().trim().isEmpty()) empty = true;
            if(editTextNickname.getText().toString().trim().isEmpty()) empty = true;
            if(editTextEmail.getText().toString().trim().isEmpty()) empty = true;
            if(editTextSenha.getText().toString().trim().isEmpty()) empty = true;


            if(empty){
                Toast.makeText(this, "Voce deixo alguma campo vazio", Toast.LENGTH_SHORT).show();
            }else {

            }
        });


    }




}


