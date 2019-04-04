package br.com.fiap.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

class CustomToast {

    fun showToast(context: Context, mensagem: String){
        
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastroot =  inflater.inflate(R.layout.custom_toast, null)

        val customToast = Toast(context)

        customToast.view = customToastroot
        customToastroot.tvToast.text = mensagem
        customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customToast.duration = Toast.LENGTH_LONG
        customToast.show()

    }
}