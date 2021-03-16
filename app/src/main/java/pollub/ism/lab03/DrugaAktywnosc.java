package pollub.ism.lab03;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DrugaAktywnosc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc);

        //Dodany kod
        if(savedInstanceState == null) {

            Intent intencja = getIntent();
            String wiadomosc = intencja.getStringExtra(MainActivity.KLUCZ_WIADOMOSCI);

            EditText poleTekstowe = (EditText) findViewById(R.id.wiadomoscOdbieranie1);
            poleTekstowe.setText(wiadomosc);
            poleTekstowe.setEnabled(false);
        }
    }

    public void powrot(View view){

        EditText poleTekstowe = (EditText) findViewById(R.id.wiadomoscWyslanie1);
        String wiadomosc = poleTekstowe.getText().toString();

        Intent intencja = new Intent();
        intencja.putExtra(MainActivity.KLUCZ_WIADOMOSCI, wiadomosc);

        setResult(MainActivity.KOD_PROSBY, intencja);

        finish();

    }

}