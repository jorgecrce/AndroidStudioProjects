package ie.itsligo.jorge.sensors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myText = (TextView) this.findViewById(R.id.textView1);

        SensorManager mgr = (SensorManager) getSystemService(SENSOR_SERVICE);    // nedded for all sensor use
        List<Sensor> sensors = mgr.getSensorList(Sensor.TYPE_ALL);

        StringBuilder message = new StringBuilder();
        message.append("The sensors supported by this phone are : \n");

        for (Sensor i : sensors) {        // go through the sensors list (i is the current sensor)
            message.append("Name : " + i.getName() + "\n");
        }

        myText.setText(message);

    }
}
