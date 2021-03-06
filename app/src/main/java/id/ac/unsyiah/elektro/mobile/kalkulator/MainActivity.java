package id.ac.unsyiah.elektro.mobile.kalkulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onRadioButtonClicked(View view) {
        EditText txtAngka1 = (EditText) findViewById(R.id.txtAngka1);
        String angka1Str = String.valueOf(txtAngka1.getText());
        int angka1 = Integer.valueOf(angka1Str);

        EditText txtAngka2 = (EditText) findViewById(R.id.txtAngka2);
        String angka2Str = String.valueOf(txtAngka2.getText());
        int angka2 = Integer.valueOf(angka2Str);



        boolean checked = ((RadioButton) view).isChecked();


        int hasil = 0;

        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    hasil = angka1 + angka2;
                    break;
            case R.id.radioButton2:
                if (checked)
                    hasil = angka1 - angka2;
                    break;
            case R.id.radioButton3:
                if (checked)
                    hasil = angka1 * angka2;
                    break;
            case R.id.radioButton4:
                if (checked)
                    hasil = angka1 / angka2;
                    break;
        }

        String hasilStr = String.valueOf(hasil);

       TextView lblHasil = (TextView) findViewById(R.id.lblHasil);
       lblHasil.setText(hasilStr);

    }


}
