package app.com.kotlinatc

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun save(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("save")
        alert.setMessage("Desea guardar los cambios?")
        alert.setPositiveButton("si", {dialogInterface, i -> Toast.makeText(this, "Si", Toast.LENGTH_LONG).show() } )
        alert.show()
    }
}
