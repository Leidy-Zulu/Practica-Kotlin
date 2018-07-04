package app.com.kotlinatc

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var progressBarStatus = 0
    var rate = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttonSave.setOnClickListener{
            Thread(Runnable {
                while (progressBarStatus < 100){
                    try {
                    rate += 10
                        Thread.sleep(500)

                    }catch (e: InterruptedException){
                        e.printStackTrace()
                    }
                    progressBarStatus = rate
                    progressBar.progress = progressBarStatus
                }
                runOnUiThread(Runnable { progressBar.visibility =ProgressBar.GONE })



            }).start()
        }
    }



    fun save(view: View){
        //showAlertDialog()

    }

    fun showAlertDialog(){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("save")
        alert.setMessage("Desea guardar los cambios?")
        alert.setPositiveButton("si", {dialogInterface, i -> Toast.makeText(this, "Si", Toast.LENGTH_LONG).show() } )
        alert.show()
    }
}
