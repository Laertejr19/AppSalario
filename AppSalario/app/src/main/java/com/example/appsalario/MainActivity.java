package com.example.appsalario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputSalario;
    private RadioGroup grupoPercentual;
    private RadioButton opc40, opc45, opc50;
    private Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configurarTela();
    }

    private void configurarTela() {
        setContentView(R.layout.activity_main);

        inputSalario = findViewById(R.id.edtSalario);
        grupoPercentual = findViewById(R.id.rdGroup);
        opc40 = findViewById(R.id.rb40);
        opc45 = findViewById(R.id.rb45);
        opc50 = findViewById(R.id.rb50);
        botaoCalcular = findViewById(R.id.btnCalcular);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processarCalculo();
            }
        });
    }

    private void processarCalculo() {
        String textoSalario = inputSalario.getText().toString().trim();

        if (textoSalario.isEmpty()) {
            exibirMensagem("Digite o salário!");
            return;
        }

        double salarioAtual = Double.parseDouble(textoSalario);
        double aumento = obterAumento();
        if (aumento == -1) return;

        double salarioNovo = salarioAtual + (salarioAtual * aumento);
        mostrarResultado(salarioNovo);
    }

    private double obterAumento() {
        int selecionado = grupoPercentual.getCheckedRadioButtonId();

        if (selecionado == -1) {
            exibirMensagem("Selecione uma opção de aumento!");
            return -1;
        }

        if (selecionado == R.id.rb40) return 0.40;
        if (selecionado == R.id.rb45) return 0.45;
        return 0.50;
    }

    private void mostrarResultado(double valor) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Novo Salário");
        dialog.setMessage("Seu novo salário é: R$ " + String.format("%.2f", valor));
        dialog.setNeutralButton("OK", null);
        dialog.show();
    }

    private void exibirMensagem(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}