package app.com.kotlinatc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import app.com.kotlinatc.model.Place
import app.com.kotlinatc.model.PlaceListAdapter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter: PlaceListAdapter?= null
    private var countryList:ArrayList<Place>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryList = ArrayList<Place>()
        layoutManager = LinearLayoutManager(this)
        adapter = PlaceListAdapter(countryList!!, this)

        myRecyclerView.layoutManager=layoutManager
        myRecyclerView.adapter = adapter

        var CountryNameList:Array<String> = arrayOf("Canada", "Usa,", "Canada", "Usa,", "Canada", "Usa,")

        var citiesNameList:Array<String> = arrayOf("Canada", "Usa,", "Canada", "Usa,", "Canada", "Usa,")

        for (i in 0..5){
            var place = Place()
            place.countryName = CountryNameList[i]
            place.cityName = citiesNameList[i]
            countryList?.add(place)
        }
        adapter!!.notifyDataSetChanged()

    }






























 


}
