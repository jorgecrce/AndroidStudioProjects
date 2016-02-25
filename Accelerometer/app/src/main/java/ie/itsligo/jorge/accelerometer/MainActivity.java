package ie.itsligo.jorge.accelerometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener  {
    TextView tvx, tvy, tvz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvx = (TextView) findViewById(R.id.textView);
        tvy = (TextView) findViewById(R.id.textView2);
        tvz = (TextView) findViewById(R.id.textView3);

        SensorManager mgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor GSensor = mgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mgr.registerListener(this, GSensor, SensorManager.SENSOR_DELAY_UI);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // called byt the system every 10 ms
        float x, y, z;

        x = event.values[0];
        y = event.values[1];
        z = event.values[2];

        tvx.setText(String.valueOf(event.values[0]));
        tvy.setText(String.valueOf(event.values[1]));
        tvz.setText(String.valueOf(event.values[2]));


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
