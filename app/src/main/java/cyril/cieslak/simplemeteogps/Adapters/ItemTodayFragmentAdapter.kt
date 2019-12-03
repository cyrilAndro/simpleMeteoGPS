package cyril.cieslak.simplemeteogps.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather

 // class ItemTodayFragmentAdapter (val datas : MutableList<MutableList<Weather>>) : androidx.recyclerview.widget.RecyclerView.Adapter<ItemTodayFragmentAdapter.ViewHolder>() {

//
//    class ViewHolder (itemView : View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
//
//    //    val icon_weather = itemView.findViewById<ImageView>(R.id.icon_weather)
//
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val viewItem = inflater.inflate(R.layout.item_fragment_today, parent, false)
//
//        return ViewHolder(viewItem)
//    }
//
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//
//        val iconCode = datas[position][0].iconWeather
//
//        when (iconCode) {
//            //Sunny
//            "01d" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_summer)
//            // Sun Night
//            "01n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_night)
//            // Partially cloudy
//            "02n", "02d", "03n", "03d" -> holder.icon_weather.setImageResource(R.drawable.partly_cloudly)
//            // Mostly Cloudly
//            "04d", "04n" -> holder.icon_weather.setImageResource(R.drawable.mostly_cloudy)
//            // Fog
//            "50d", "50n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_fog)
//            //Snow
//            "13d", "13n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_winter)
//            // Moderate Rain
//            "10d", "10n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_moderate_rain)
//            // Rain
//            "09d", "09n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_rainy_weather)
//            // Storm
//            "11d", "11n" -> holder.icon_weather.setImageResource(R.drawable.ic_icons8_storm)
//
//            else -> holder.icon_weather.setImageResource(R.drawable.launcher_weather_adobe)
//            //downLoadPicassoIcon(pictureToDownload)
//        }
//    }
//    override fun getItemCount(): Int {
//       return datas.size
//    }
//
//
//
//}