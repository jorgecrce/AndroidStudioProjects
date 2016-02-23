package ie.itsligo.jorge.numbervalidator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ImputNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imput_number);

        Button buttonValidate = (Button) findViewById(R.id.buttonValidate);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button button1 = (Button) this.findViewById(R.id.button1);
        Button button2 = (Button) this.findViewById(R.id.button2);
        Button button3 = (Button) this.findViewById(R.id.button3);
        Button button4 = (Button) this.findViewById(R.id.button4);
        Button button5 = (Button) this.findViewById(R.id.button5);
        Button button6 = (Button) this.findViewById(R.id.button6);
        Button button7 = (Button) this.findViewById(R.id.button7);
        Button button8 = (Button) this.findViewById(R.id.button8);
        Button button9 = (Button) this.findViewById(R.id.button9);
        Button button0 = (Button) this.findViewById(R.id.button0);
        Button buttonAsterisk = (Button) this.findViewById(R.id.buttonAsterisk);
        Button buttonSharp = (Button) this.findViewById(R.id.buttonSharp);
        final TextView e2;
        e2 = (TextView) this.findViewById(R.id.textView);

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2Intent = new Intent(v.getContext(), Result.class);
                // pass the entered phone number to the next activity
                A2Intent.putExtra("phoneNumber", e2.getText());
                // start the next activity/page
                startActivity(A2Intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"0");
            }
        });
        buttonAsterisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"*");
            }
        });
        buttonSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText(e2.getText().toString()+"#");
            }
        });
        buttonSharp.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e2.setText(e2.getText().toString() + "+");
                return true;
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText("");
            }
        });
    }
}
