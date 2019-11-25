package cyril.cieslak.simplemeteogps.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather
import kotlinx.android.synthetic.main.item_fragment_city.view.*

    class ItemCityFragmentAdapter (val datas : MutableList<MutableList<Weather>>) : androidx.recyclerview.widget.RecyclerView.Adapter<ItemCityFragmentAdapter.ViewHolder> () {

        var ONE = 1


        class ViewHolder (itemView : View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        val cityName = itemView.findViewById<TextView>(R.id.cityLocation)
        val countryName = itemView.findViewById<TextView>(R.id.countryLocation)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.item_fragment_city, parent, false)

        return ViewHolder(viewItem)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder?.cityName?.text = datas[position][0].cityName
        holder?.countryName?.text = datas[position][0].country
    }

    override fun getItemCount(): Int {
    return ONE
    }


}