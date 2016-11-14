package com.example.roi00.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubstraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private TextView txtResult;
    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubstraction = (Button) findViewById(R.id.btnSubstraction);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        btnMultiplication = (Button)findViewById(R.id.btnMultiplication);
        txtResult = (TextView)findViewById(R.id.txtResult);
        btnClear = (Button)findViewById(R.id.btnClear);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = op1 + op2;

                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Enter Two Operands", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = op1 - op2;

                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Enter Two Operands", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = op1 / op2;

                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Enter Two Operands", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = op1 * op2;

                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Enter Two Operands", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
            }
        });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
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

    public String returnMyName(){
        return "My Name Is Roi";
    }


}
