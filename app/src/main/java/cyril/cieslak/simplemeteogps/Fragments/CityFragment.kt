package cyril.cieslak.simplemeteogps.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cyril.cieslak.simplemeteogps.Adapters.ItemCityFragmentAdapter
import cyril.cieslak.simplemeteogps.Downloader.JSONDownloader
import cyril.cieslak.simplemeteogps.MainActivityViewModel
import cyril.cieslak.simplemeteogps.Parsers.parseWeatherDatas

import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather

class CityFragment : Fragment() {

    lateinit var viewModel : MainActivityViewModel

    var datas = mutableListOf(
        mutableListOf<Weather>(
            Weather()
//            "un",
//            "deux",
//            "trois",
//            "quatre",
//            "cinq",
//            "six",
//            "sept",
//            "huit",
//            "neuf",
//            "dix",
//            "onze",
//            "douze",
//            "treize",
//            "quatorze",
//            "quinze"
        )
    )

    var adapter = ItemCityFragmentAdapter(datas)

    var jsonWeatherTest =  "http://api.openweathermap.org/data/2.5/forecast?lat=48.852968&lon=-2.3499019&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

      //  getTheNewLocation(jsonWeatherTest)

        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)

        viewModel.getStateLatitude().observe(this, Observer {

            var lattitude = it
            Log.i("bingo", "valeur Lattitude = $lattitude")


            viewModel.getStateLongitude().observe(this, Observer { itt: String? ->

                var longgitude = itt
                Log.i("bingo", "valeur Longgitude = $longgitude")

                var testLat = 44.7926
                var testLongi = 20.4749

                var jsonWeather =
                  "http://api.openweathermap.org/data/2.5/forecast?lat=$lattitude&lon=$longgitude&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"
               // "http://api.openweathermap.org/data/2.5/forecast?lat=44.7914748&lon=20.4775094&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"
                Log.i("pluto", "jsonWeather dasn CityFragment = $jsonWeather")
                // getTheNewLocation(jsonWeather)

                getTheNewLocation(jsonWeather)
            })
        })




    }

    private fun getTheNewLocation(jsonWeather: String) {
        var jsonDataPreview = JSONDownloader(context!!, jsonWeather).execute().get()
        Log.i("bongo", " bingo dans fragment city : $jsonDataPreview")
        Log.i("pluto", "jsonDataPreview dasn CityFragment = $jsonDataPreview")

       var datas = parseWeatherDatas(jsonDataPreview).parseDatasFromApi(jsonDataPreview)
        Log.i("bongo", " datas values dans fragment city : $datas")
        Log.i("pluto", "datas CityFragment = $datas")
        adapter = ItemCityFragmentAdapter(datas)

        val recyclerView = view?.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView_fragmentCity)
        recyclerView?.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
        recyclerView?.adapter = this.adapter
        Log.i("pluto", "RecycylerView dasn CityFragment = $recyclerView")
    }


}
