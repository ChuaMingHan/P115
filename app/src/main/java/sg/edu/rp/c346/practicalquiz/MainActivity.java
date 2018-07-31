package sg.edu.rp.c346.practicalquiz;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Eano;
    Button Bsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Eano = findViewById(R.id.editTextNo);
        Bsubmit = findViewById(R.id.buttonSM);

        Bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                String theMessage = Eano.getText().toString();

                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage(theMessage);
                myBuilder.setCancelable(true);
                myBuilder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                myBuilder.setNegativeButton("CANCEL", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
});}}
