package maraligat.com.if_else_exercises;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        View.OnClickListener callbackListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText hundredEditText = findViewById(R.id.hundredEditText);
                EditText oddEditText = findViewById(R.id.oddEditText);
                EditText divEditText = findViewById(R.id.divEditText);
                EditText movieEditText = findViewById(R.id.movieEditText);
                View view = getCurrentFocus();
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }

                if (hundredEditText.getText().toString().matches("") || oddEditText.getText().toString().matches("")|| divEditText.getText().toString().matches("")|| movieEditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Please enter numbers in both fields.",
                            Toast.LENGTH_SHORT).show();

                }
            }
        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
