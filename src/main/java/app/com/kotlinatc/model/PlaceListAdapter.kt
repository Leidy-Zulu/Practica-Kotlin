package app.com.kotlinatc.model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import app.com.kotlinatc.R
import org.w3c.dom.Text
import java.security.AccessControlContext

class PlaceListAdapter(private val list: ArrayList<Place>, private val context: Context) :RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindItem(list[position])
    }

   inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(place: Place){
            var conuntry:TextView = itemView.findViewById(R.id.country_ID) as TextView
            var city:TextView = itemView.findViewById(R.id.city_ID) as TextView
            conuntry.text = place.countryName
            city.text = place.cityName
            itemView.setOnClickListener { Toast.makeText(context,conuntry.text, Toast.LENGTH_LONG).show() }
        }

    }

}



















