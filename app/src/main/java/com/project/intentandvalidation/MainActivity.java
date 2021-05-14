package com.project.intentandvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText editUsername;
EditText editPassword;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

editUsername= findViewById(R.id.editUsername);
editPassword= findViewById(R.id.editPassword);
button= findViewById(R.id.button);

        Intent in = getIntent();
}

    public void btnFunction(View view) {

        String name= editUsername.getText().toString();
        String pass= editPassword.getText().toString();
        if (name.equals("mamitag.android") && pass.equals("12345") ){
            Intent intents= new Intent(this, MainActivity2.class);
            intents.putExtra("NAME", name);
            startActivity(intents);
        }
        else if (name.equals("valdez.android") && pass.equals("12345") ){
            Intent intents= new Intent(this, MainActivity2.class);
            intents.putExtra("NAME", name);
            startActivity(intents);
        }
        else if (name.equals("ramos.android") && pass.equals("12345") ){
            Intent intents= new Intent(this, MainActivity2.class);
            intents.putExtra("NAME", name);
            startActivity(intents);
        }
        else if (name.equals("mabanglo.android") && pass.equals("12345") ){
            Intent intents= new Intent(this, MainActivity2.class);
            intents.putExtra("NAME", name);
            startActivity(intents);
        }
        else if (name.equals("") && pass.equals("")){
            Toast.makeText(getBaseContext(),"Enter Username and Password",Toast.LENGTH_SHORT).show();
        }
        else if (name.equals("") ){
            Toast.makeText(getBaseContext(),"Enter Username ",Toast.LENGTH_SHORT).show();
        }
        else if (pass.equals("")){
            Toast.makeText(getBaseContext(),"Enter Password",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getBaseContext(),"Invalid Username and Password",Toast.LENGTH_SHORT).show();
        }




    }

    }