package leiva.metrotransmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button conectar;
    private EditText usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conectar = (Button)findViewById(R.id.button_conectar);
        usuario = (EditText)findViewById(R.id.editText_nombre);
        contraseña = (EditText)findViewById(R.id.editText_contraseña);

        conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textUsuario = usuario.getText().toString();
                String textContraseña = contraseña.getText().toString();

                Toast.makeText(MainActivity.this, "Usuario Correcto", Toast.LENGTH_LONG).show();
            }
        });
    }
}
