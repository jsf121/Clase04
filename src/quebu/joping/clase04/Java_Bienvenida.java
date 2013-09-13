package quebu.joping.clase04;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Java_Bienvenida extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bienvenida);
		 
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Bundle extras = getIntent().getExtras();
	       String u = extras.getString("usuario");
	       String c = extras.getString("clave");
	       TextView usu, pass;
	       usu = (TextView) findViewById(R.id.lblusu);
	       pass = (TextView) findViewById(R.id.lblpass);
	       usu.setText("Su usuario es: " + u);
	       pass.setText("Su clave es: " + c);
	}
}
