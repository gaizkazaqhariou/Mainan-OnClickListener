package id.ac.polinema.cobaactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bProses = findViewById(R.id.button1);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nama = findViewById(R.id.etNama);
                RadioGroup grb = findViewById(R.id.groupBtn);
                TextView hasil = findViewById(R.id.hasilProses);
                if (grb.getCheckedRadioButtonId() == R.id.jkLaki) {

                    hasil.setText("Mas " + nama.getText() + ", Kamu Ganteng");
                } else if (grb.getCheckedRadioButtonId() == R.id.jkWanita) {

                    hasil.setText("Mbak " + nama.getText() + ", Kamu Cantik");
                }
            }
        });
    }

//        klik.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                doUbah();
//            }
//
//            private void doUbah() {
//                if (uhuy.getText().equals("Hiyahiyahiya")){
//                    uhuy.setText("Okay day");
//                } else {
//                    uhuy.setText("Hiyahiyahiya");
//                }
//            }
//        });

//    public void doUbah(View view){
//        Button klik = (Button) findViewById(R.id.button1);
//        final TextView uhuy = findViewById(R.id.cobatextView);
//        if (uhuy.getText().equals("Hiyahiyahiya")){
//            uhuy.setText("Okay day");
//        } else {
//            uhuy.setText("Hiyahiyahiya");
//        }
//    }
}
