package games.gusdev.KAppTemperatureConverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var tempValue: EditText
    lateinit var radioC: RadioButton
    lateinit var radioF: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempValue = findViewById(R.id.valorTemp) as EditText
        radioC = findViewById(R.id.radioCelcius) as RadioButton
        radioF = findViewById(R.id.radioFahrenheit) as RadioButton

    }
}
