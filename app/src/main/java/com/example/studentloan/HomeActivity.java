package com.example.studentloan;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private TextInputLayout textInputemail;
    private TextInputLayout textInputpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        textInputemail=findViewById(R.id.user_email_address);
        textInputpassword=findViewById(R.id.user_password);

    }
    private boolean validateEmail()
    {
    String emailInput = textInputemail.getEditText().getText().toString().trim();
    if(emailInput.isEmpty())
    {
        textInputemail.setError("Field Can't be empty");
      return false;
    }else{
        textInputemail.setError(null);
        return true;
    }

    }
    private boolean validatePassword()
    {
        String PasswordInput = textInputpassword.getEditText().getText().toString().trim();
        if(PasswordInput.isEmpty())
        {
            textInputemail.setError("Field Can't be empty");
            return false;
        }else{
            textInputemail.setError(null);
            return true;
        }

    }

    public void confirmInput(View view)
    {
        if (!validateEmail()|!validatePassword()){
            return;
        }

    }
}
