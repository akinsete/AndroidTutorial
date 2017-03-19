package appsng.com.tutorialclassone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText editTextLastname;
    EditText editTextFirstname;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        bindViews();

    }


    private void bindViews(){
        myButton = (Button)findViewById(R.id.mybutton);
        editTextFirstname = (EditText)findViewById(R.id.firstname);
        editTextLastname = (EditText)findViewById(R.id.lastname);
        display = (TextView)findViewById(R.id.display);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = editTextFirstname.getText().toString() + " " + editTextLastname.getText().toString();

                display.setText(fullname);
            }
        });
    }



}
