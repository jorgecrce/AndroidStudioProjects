package ie.itsligo.jorge.numbervalidator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button buttonReturn = (Button) this.findViewById(R.id.buttonReturn);
        final TextView e2;
        e2 = (TextView) this.findViewById(R.id.textResult);
        Button buttonResult = (Button) this.findViewById(R.id.buttonResult);


        // read the passed phonenumber and display it in e2
        String phoneno = getIntent().getStringExtra("phoneNumber");
        e2.setText(phoneno);

        //Check if the number is correct
        int valid = 0;

        if ((e2.getText().length() ==10)) {//08 and 10 digits
            if ((e2.getText().charAt(0) == '0')) {
                if ((e2.getText().charAt(1) == '8')) {
                    valid = 1;
                }
            }
        }

        if ((e2.getText().length() ==13)) {//+3538 and 13 digits
            if ((e2.getText().charAt(0) == '+')) {
                if ((e2.getText().charAt(1) == '3')) {
                    if ((e2.getText().charAt(2) == '5')) {
                        if ((e2.getText().charAt(3) == '3')) {
                            if ((e2.getText().charAt(4) == '8')) {
                                valid = 1;
                            }
                        }
                    }
                }
            }
        }

        if ((e2.getText().length() ==14)) {//003538 and 14 digits
            if ((e2.getText().charAt(0) == '0')) {
                if ((e2.getText().charAt(1) == '0')) {
                    if ((e2.getText().charAt(2) == '3')) {
                        if ((e2.getText().charAt(3) == '5')) {
                            if ((e2.getText().charAt(4) == '3')) {
                                if ((e2.getText().charAt(4) == '3')) {
                                    valid = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        if ((e2.getText().length() ==12)) {//+34 and 12 digits (Spanish international numbers)
            if ((e2.getText().charAt(0) == '+')) {
                if ((e2.getText().charAt(1) == '3')) {
                    if ((e2.getText().charAt(2) == '4')) {
                                valid = 1;
                    }
                }
            }
        }
        if ((e2.getText().length() ==13)) {//0034 and 13 digits (Spanish international numbers)
            if ((e2.getText().charAt(0) == '0')) {
                if ((e2.getText().charAt(1) == '0')) {
                    if ((e2.getText().charAt(2) == '3')) {
                        if ((e2.getText().charAt(3) == '4')) {
                            valid = 1;
                        }
                    }
                }
            }
        }

        if (valid != 0) {
            buttonResult.setText("Valid number");
            buttonResult.setBackgroundColor(Color.GREEN);
        } else {
            buttonResult.setText("Invalid number");
            buttonResult.setBackgroundColor(Color.RED);
        }

        // exit to page 1 if this is clicked
        buttonReturn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
