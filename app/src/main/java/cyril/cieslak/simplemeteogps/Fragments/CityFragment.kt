package cyril.cieslak.simplemeteogps.Fragments

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

    lateinit var viewModel: MainActivityViewModel

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

    var jsonWeatherTest =
        "http://api.openweathermap.org/data/2.5/forecast?lat=48.852968&lon=-2.3499019&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)


        viewModel.getStateDatasAfterParsing()
            .observe(this, Observer { ittt: MutableList<MutableList<Weather>> ->


                var datas = ittt

                adapter = ItemCityFragmentAdapter(datas)

                val recyclerView =
                    view?.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView_fragmentCity)
                recyclerView?.layoutManager =
                    androidx.recyclerview.widget.LinearLayoutManager(context)
                recyclerView?.adapter = this.adapter
                Log.i("pluto", "RecycylerView dasn CityFragment = $recyclerView")

            })


    }


}
