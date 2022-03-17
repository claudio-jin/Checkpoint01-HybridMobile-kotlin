package br.com.fiap.checkpoint01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun exibirMensagem(titulo : String, mensagem : String ) {
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
            builder.create().show()
        }

        val botaoIntegrantes : Button = findViewById(R.id.btnIntegrantes)
        botaoIntegrantes.setOnClickListener {
            val msg = "Integrantes : Cláudio Jin, Ícaro Fernandes"
            exibirMensagem("Desenvolvido por: ", msg)
        }

        val botaoCalculadoraTran : Button = findViewById(R.id.btnCalculadora)
        botaoCalculadoraTran.setOnClickListener {
            var intentCalculadoraActivity = Intent(this, CalculadoraActivity::class.java)
            startActivity(intentCalculadoraActivity)
        }

        val botaoTelefone : Button = findViewById(R.id.btnTelefone)
        botaoTelefone.setOnClickListener {
            var intentAbaTelefone = Intent(this, ContaTelefonica::class.java)
            startActivity(intentAbaTelefone)
        }


    }
}