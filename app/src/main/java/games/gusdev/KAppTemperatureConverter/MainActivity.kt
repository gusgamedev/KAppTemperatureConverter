package games.gusdev.KAppTemperatureConverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    lateinit var tempValue: EditText
    lateinit var radioC: RadioButton
    lateinit var radioF: RadioButton
    lateinit var convButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempValue = findViewById(R.id.valorTemp) as EditText
        radioC = findViewById(R.id.radioCelcius) as RadioButton
        radioF = findViewById(R.id.radioFahrenheit) as RadioButton

        convButton = findViewById(R.id.button) as Button
        convButton.setOnClickListener{ converter(it)}

    }

    fun converter(view : View) {

        var temp : Double =  tempValue.text.toString().toDouble()

        if (radioC.isChecked) {
            temp = (temp - 32) * 5/9
        } else if (radioF.isChecked) {
            temp = temp * 9/5 + 32
        }

        tempValue.setText(temp.toString())
    }
}
