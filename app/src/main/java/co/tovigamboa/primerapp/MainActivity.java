package co.tovigamboa.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		TextView miTexto = new TextView(getApplicationContext());
		miTexto.setText("Mensaje cambiado en el TextView desde codigo java");
		setContentView(miTexto);
	}
}