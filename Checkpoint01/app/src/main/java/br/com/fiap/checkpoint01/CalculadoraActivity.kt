package br.com.fiap.checkpoint01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        fun exibirMensagem(titulo : String, mensagem : String ) {
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
            builder.create().show()
        }

        btnCalcular.setOnClickListener {
            var txtValor1 = in1.text.toString().toDouble()
            var txtValor2 = in2.text.toString().toDouble()

            if(radioSoma.isChecked()) {
                var resultado = txtValor1 + txtValor2
                exibirMensagem("O resultado do radioButton é: ", resultado.toString())
            }
            else if (radioSubtracao.isChecked()) {
                var resultado = txtValor1 - txtValor2
                exibirMensagem("O resultado do radioButton é: ", resultado.toString())

            }
            else if (radioMultiplica.isChecked()) {
                var resultado = txtValor1 * txtValor2
                exibirMensagem("O resultado do radioButton é: ", resultado.toString())

            }
            else if(radioDivisao.isChecked()) {
                var resultado = txtValor1 / txtValor2
                exibirMensagem("O resultado do radioButton é: ", resultado.toString())
            }
        }
    }

}