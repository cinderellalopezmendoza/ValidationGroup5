package com.example.logingroup5validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button loginBtn;
    private TextView invalid;

    //Cinderella Mendoza
     private String username1 ="derell03";
     private String password1 ="chimonac";

    //Dianne Valdez
    private String username2 ="valdezdianne";
    private String password2 ="dianne98";

    //John Mykyl Digo
    private String username3 ="pikapika";
    private String password3 ="psalms4711";

    //Earl John Ordanza
    private String username4 ="Earljohn15";
    private String password4 ="mnbvcxz666";

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        loginBtn=(Button)findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = username.getText().toString();
                String inputPassword = password.getText().toString();

                //validate input
                if(inputName.isEmpty() && inputPassword.isEmpty()){
                    Toast.makeText(MainActivity.this,"Kindly Enter Your Credential!",Toast.LENGTH_SHORT).show();
                }
                else {

                    isValid = validate(inputName,inputPassword);
                    isValid = validate1(inputName,inputPassword);
                    isValid = validate2(inputName,inputPassword);
                    isValid = validate3(inputName,inputPassword);

                    if(inputName.equals(username1) && inputPassword.equals(password1)){

                        //dashboard activity 1
                        Intent intent = new Intent(MainActivity.this,Dashboard.class);
                        startActivity(intent);
                        finish();
                    }else if(inputName.equals(username2) && inputPassword.equals(password2)){

                        //dashboard activity 2
                        Intent intent = new Intent(MainActivity.this,Dashboard2.class);
                        startActivity(intent);
                        finish();
                    }else if(inputName.equals(username3) && inputPassword.equals(password3)){

                        //dashboard activity 3
                        Intent intent = new Intent(MainActivity.this,Dashboard3.class);
                        startActivity(intent);
                        finish();
                    }else if(inputName.equals(username4) && inputPassword.equals(password4)){

                        //dashboard activity 4
                        Intent intent = new Intent(MainActivity.this,Dashboard4.class);
                        startActivity(intent);
                        finish();
                    }else if(!isValid){
                        Toast.makeText(MainActivity.this,"Wrong Credential, Try again!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
}
  //function to validate the input
  private boolean validate(String name,String password){
    if(name.equals(username1) && password.equals(password1)){
        return true;
    }
    return false;
  }

    private boolean validate1(String name,String password){
        if(name.equals(username2) && password.equals(password2)){
            return true;
        }
        return false;
    }

    private boolean validate2(String name,String password){
        if(name.equals(username3) && password.equals(password3)){
            return true;
        }
        return false;
    }

    private boolean validate3(String name,String password){
        if(name.equals(username4) && password.equals(password4)){
            return true;
        }
        return false;
    }

}