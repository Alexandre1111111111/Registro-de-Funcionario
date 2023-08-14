package com.example.registrodefuncionrio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        TextView txt_reg = findViewById(R.id.txt_reg);
        TextView txt_nm = findViewById(R.id.txt_nm);
        TextView txt_c = findViewById(R.id.txt_c);
        TextView txt_mail = findViewById(R.id.txt_mail);
        TextView txt_sen = findViewById(R.id.txt_sen);

        EditText edt_nome = findViewById(R.id.edt_nome);
        EditText edt_cpf = findViewById(R.id.edt_cpf);
        EditText edt_eml = findViewById(R.id.edt_eml);
        EditText edt_senha = findViewById(R.id.edt_senha);

        Button btn_cadas = findViewById(R.id.btn_cadas);
        Button btn_vol = findViewById(R.id.btn_vol);

        ImageView img_raio = findViewById(R.id.img_raio);

        btn_cadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_nome.getText().toString().isEmpty() || edt_cpf.getText().toString().isEmpty() || edt_eml.getText().toString().isEmpty() || edt_senha.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha os campos restantes", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent();
                    startActivity(intent);
                }
            }
        });
        btn_vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                startActivity(intent);
            }
        });
    }
}