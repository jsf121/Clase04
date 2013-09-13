package quebu.joping.clase04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	//Creamos las variables de nuestras cajitas de texto(Editext)
	EditText txtusu;
	EditText txtpass;
	Button btning;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Pasamos los datos del layout hacia nuestras variables creadas
		txtusu = (EditText) findViewById(R.id.txtusu1);
		txtpass = (EditText) findViewById(R.id.txtpass1);
		btning = (Button) findViewById(R.id.btnIngresar);
		
		//Creamos el evento onclick para nuestro boton ingreso
		btning.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// validamos el usuario y clave
				if(txtusu.getText().toString().equals("joping") && txtpass.getText().toString().equals("quebu"))
				{
					//Toast.makeText(MainActivity.this, "Usuario y password correcto =)",Toast.LENGTH_SHORT).show();
					Intent pasar= new Intent(MainActivity.this, Java_Bienvenida.class);
					pasar.putExtra("usuario", txtusu.getText().toString());
				    pasar.putExtra("clave", txtpass.getText().toString());
					startActivity(pasar);
				}
				else
				{
					Toast.makeText(MainActivity.this, "Verifique usuario y password",Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
