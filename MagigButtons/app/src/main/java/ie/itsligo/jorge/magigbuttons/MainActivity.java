package ie.itsligo.jorge.magigbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int sum= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button Bt1000 = (Button) findViewById(R.id.button1000);
        Button Bt100 = (Button) findViewById(R.id.button100);
        Button Bt10 = (Button) findViewById(R.id.button10);
        Button Bt1 = (Button) findViewById(R.id.button1);
        Button BtGo = (Button) findViewById(R.id.buttonGo);
        Button BtClear = (Button) findViewById(R.id.buttonClear);
        final TextView result= (TextView) findViewById(R.id.textViewResult);




        Bt1000.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) {
                  sum = sum + 1000;
              }
          });
        Bt100.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                sum = sum + 100;
            }
        });
        Bt10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                sum = sum + 10;
            }
        });
        Bt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                sum = sum + 1;
            }
        });
        BtClear.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   sum = 0;
                   result.setText(Integer.toString(sum));
               }
           });
        BtGo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (sum>999999999) {
                    result.setText("Number is too large");
                }else {
                    result.setText(Integer.toString(sum));
                }

            }
        });


    }


}
