package com.burak.ekonomihesap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstPriceIncomeXProduct, lastPriceIncomeXProduct, firstDemandSupplyYProduct, lastDemandSupplyYProduct;
    TextView results;
    Switch percentSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstPriceIncomeXProduct = findViewById(R.id.firstPriceIncomeXProduct);
        lastPriceIncomeXProduct = findViewById(R.id.lastPriceIncomeXProduct);
        firstDemandSupplyYProduct = findViewById(R.id.firstDemandSupplyYProduct);
        lastDemandSupplyYProduct = findViewById(R.id.lastDemandSupplyYProduct);

        results = findViewById(R.id.results);

        percentSwitch = findViewById(R.id.percentSwitch);

    }

    public void disableTextEdits(View view){

        if (percentSwitch.isChecked()) {
            firstPriceIncomeXProduct.setEnabled(false);
            firstPriceIncomeXProduct.setFocusable(false);
            firstDemandSupplyYProduct.setEnabled(false);
            firstDemandSupplyYProduct.setFocusable(false);
        }else{
            firstPriceIncomeXProduct.setEnabled(true);
            firstPriceIncomeXProduct.setFocusableInTouchMode(true);
            firstPriceIncomeXProduct.setFocusable(true);
            firstDemandSupplyYProduct.setEnabled(true);
            firstDemandSupplyYProduct.setFocusableInTouchMode(true);
            firstDemandSupplyYProduct.setFocusable(true);
        }
    }

    public void yayEsnekligi(View view){

        if (firstPriceIncomeXProduct.getText().toString().matches("")|| lastPriceIncomeXProduct.getText().toString().matches("") ||
                firstDemandSupplyYProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

            results.setText(R.string.nullWarning);
        }else if(firstPriceIncomeXProduct.getText().toString().matches("0")|| lastPriceIncomeXProduct.getText().toString().matches("0") ||
                firstDemandSupplyYProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

            results.setText(R.string.divideZero);

        }else{

            double number1 = Double.parseDouble(firstPriceIncomeXProduct.getText().toString());
            double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());
            double number3 = Double.parseDouble(firstDemandSupplyYProduct.getText().toString());
            double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());

            double result = (number1-number2)/(number1+number2)*(number3+number4)/(number3-number4);

            results.setText("Sonuç: "+result);
        }
    }

    public void noktaEsnekligi(View view){
        if (firstPriceIncomeXProduct.getText().toString().matches("")|| lastPriceIncomeXProduct.getText().toString().matches("") ||
                firstDemandSupplyYProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

            results.setText(R.string.nullWarning);
        }else if(firstPriceIncomeXProduct.getText().toString().matches("0")|| lastPriceIncomeXProduct.getText().toString().matches("0") ||
                firstDemandSupplyYProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

            results.setText(R.string.divideZero);

        }else{

            double number1 = Double.parseDouble(firstPriceIncomeXProduct.getText().toString());
            double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());
            double number3 = Double.parseDouble(firstDemandSupplyYProduct.getText().toString());
            double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());

            double result = (number1-number2)/(number1+number2)*(number3+number4)/(number3-number4);

            results.setText("Sonuç: "+result);
        }
    }

    public void talebinFiyatEsnekligi(View view){

        if (percentSwitch.isChecked()){

            if (lastPriceIncomeXProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

                results.setText(R.string.nullWarning);

            }else if(lastPriceIncomeXProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

                results.setText(R.string.divideZero);

            }else{


                double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());

                double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());


                results.setText("Sonuç: "+ number4/number2);
            }
        }else{

            if (firstPriceIncomeXProduct.getText().toString().matches("")|| lastPriceIncomeXProduct.getText().toString().matches("") ||
                    firstDemandSupplyYProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

                results.setText(R.string.nullWarning);

            }else if(firstPriceIncomeXProduct.getText().toString().matches("0")|| lastPriceIncomeXProduct.getText().toString().matches("0") ||
                    firstDemandSupplyYProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

                results.setText(R.string.divideZero);

            }else{

                double number1 = Double.parseDouble(firstPriceIncomeXProduct.getText().toString());
                double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());
                double number3 = Double.parseDouble(firstDemandSupplyYProduct.getText().toString());
                double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());

                double p1 = number2-number1;
                double p2 = number2+number1;
                double p3 = number4+number3;
                double p4 = number4-number3;
                double p5 = p1*p3;
                double p6 = p2*p4;
                double result = p6/p5;

                results.setText("Sonuç: "+result);
            }
        }
    }

    public void arzinFiyatEsnekligi(View view){

        if (percentSwitch.isChecked()){

            if (lastPriceIncomeXProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

                results.setText(R.string.nullWarning);

            }else if(lastPriceIncomeXProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

                results.setText(R.string.divideZero);

            }else{


                double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());

                double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());


                results.setText("Sonuç: "+ number4/number2);
            }
        }else{

            if (firstPriceIncomeXProduct.getText().toString().matches("")|| lastPriceIncomeXProduct.getText().toString().matches("") ||
                    firstDemandSupplyYProduct.getText().toString().matches("") || lastDemandSupplyYProduct.getText().toString().matches("")){

                results.setText(R.string.nullWarning);

            }else if(firstPriceIncomeXProduct.getText().toString().matches("0")|| lastPriceIncomeXProduct.getText().toString().matches("0") ||
                    firstDemandSupplyYProduct.getText().toString().matches("0") || lastDemandSupplyYProduct.getText().toString().matches("0")){

                results.setText(R.string.divideZero);

            }else{

                double number1 = Double.parseDouble(firstPriceIncomeXProduct.getText().toString());
                double number2 = Double.parseDouble(lastPriceIncomeXProduct.getText().toString());
                double number3 = Double.parseDouble(firstDemandSupplyYProduct.getText().toString());
                double number4 = Double.parseDouble(lastDemandSupplyYProduct.getText().toString());

                double p1 = number2-number1;
                double p2 = number2+number1;
                double p3 = number4+number3;
                double p4 = number4-number3;
                double p5 = p1*p3;
                double p6 = p2*p4;
                double result = (p6/p5);

                results.setText("Sonuç: "+result);
            }
        }
    }
}