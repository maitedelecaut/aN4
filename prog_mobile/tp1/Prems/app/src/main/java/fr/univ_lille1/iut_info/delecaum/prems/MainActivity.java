package fr.univ_lille1.iut_info.delecaum.prems;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doOk ( View view ) {
        TextView tvNom;
        TextView tvText;
        tvNom = (TextView) findViewById(R.id.nom);
        tvText = (TextView) findViewById(R.id.text);
        String msg;
        msg = tvNom.getText() + " !";
        tvText.setText(msg);
    }

    public void doReinit(View view){
        TextView tvText;
        TextView tvNom;
        tvText = (TextView) findViewById(R.id.text);
        tvNom = (TextView) findViewById(R.id.nom);
        tvText.setText("");
        tvNom.setText("");
    }
}
