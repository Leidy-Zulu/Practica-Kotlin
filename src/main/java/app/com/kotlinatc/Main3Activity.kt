package app.com.kotlinatc

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        myWebView.setBackgroundColor(Color.TRANSPARENT)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.loadsImagesAutomatically = true
        myWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        myWebView.loadUrl("https://github.com/Leidy-Zulu/Practica-Kotlin/commits/master")
    }
}
