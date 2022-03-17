package br.com.fiap.checkpoint01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conta_telefonica.*

class ContaTelefonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_telefonica)

        fun calcular(numero : Double, valor : Double): Double {
            var calculo = numero * valor
            return calculo;
        }

        btnCalcularTelefone.setOnClickListener {
            var precoLocal = 0.04
            var precoCelular = 0.20

            var assinaturaPreco = numTel1.text.toString().toDouble()
            var minutosLocal = numTel2.text.toString().toDouble()
            var minutosCelular = numTel2.text.toString().toDouble()

            var valorChamadaLocal = calcular(minutosLocal, precoLocal)
            var valorChamadaCelular = calcular(minutosCelular, precoCelular)

            var total = assinaturaPreco + valorChamadaLocal +valorChamadaCelular

            var mensagem = "Assinatura: R$ ${assinaturaPreco}\n" +
                    "Chamada Local: R$ ${valorChamadaLocal}\n" +
                    "Chamada Celular: ${valorChamadaCelular}\n" +
                    "\n" +
                    "Valor Total : ${total}"


            var intentResultadoActivity = Intent(this, ResultadoActivity::class.java)
            intentResultadoActivity.putExtra("msg", mensagem)
            startActivity(intentResultadoActivity)
        }
    }
}