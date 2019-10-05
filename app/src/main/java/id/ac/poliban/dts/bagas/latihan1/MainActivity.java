package id.ac.poliban.dts.bagas.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAndi = findViewById(R.id.btAndi)
        Button btBagas = findViewById(R.id.btBagas)
        Button btSaddad = findViewById(R.id.btSaddad)
        Button btAli = findViewById(R.id.btAli)

        btAndi.setOnClickListener(this);
        btBagas.setOnClickListener(this);
        btSaddad.setOnClickListener(this);
        btAli.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //penanganan kejadian (event handler)
        switch (v.getId()){
            case R.id.btAndi :
                Toast.makeText(this, "Hi Andi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btBagas :
                Toast.makeText(this, "Hi Bagas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSaddad :
                Toast.makeText(this, "Hi Saddad", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btAli ;
                Toast.makeText(this, "Hi Ali", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
