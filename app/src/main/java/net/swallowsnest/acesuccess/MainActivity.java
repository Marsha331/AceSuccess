package net.swallowsnest.acesuccess;


//
//        login_button = (Button) findViewById(R.id.login_button);
//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.password);
//        counter_view = (TextView) findViewById(R.id.counter_view);
//
//
//        login_button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                if(username.getText().toString().equals("AceCat") &&
//                        password.getText().toString().equals("pass")) {
//                    Toast.makeText(getApplicationContext(),
//                            "Redirecting...",Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(getApplicationContext(), "Wrong Credentials ",Toast.LENGTH_SHORT).show();
//
//                    counter_view.setVisibility(View.VISIBLE);
//                    counter_view.setBackgroundColor(Color.RED);
//                    counter--;
//                    counter_view.setText(Integer.toString(counter));
//
//                    if (counter == 0) {
//                        login_button.setEnabled(false);
//                    }
//                }
//            }
//        });
//    }
//}


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button login,cancel;
    EditText username,password;

    TextView counter_view;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.login);
        cancel = (Button)findViewById(R.id.cancel);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        counter_view = (TextView)findViewById(R.id.number);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("acecat") &&
                        password.getText().toString().equals("abc123")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                    counter--;
                    counter_view.setText(Integer.toString(counter));

                    if (counter == 0) {
                        login.setEnabled(false);
                    }
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
