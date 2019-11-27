package cyril.cieslak.simplemeteogps.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cyril.cieslak.simplemeteogps.Adapters.ItemCityFragmentAdapter
import cyril.cieslak.simplemeteogps.MainActivityViewModel

import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather


class TodayFragment : Fragment() {

    lateinit var viewModel : MainActivityViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        var tempZero = view.findViewById<TextView>(R.id.tempZero)


        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)


        viewModel.getStateDatasAfterParsing().observe(this, Observer { ittt : MutableList<MutableList<Weather>> ->


            var datas = ittt


            tempZero.text = datas[0][0].temperature

//                    var datas = parseWeatherDatas(jsonResultTextFromViewModel).parseDatasFromApi(jsonResultTextFromViewModel)
//                    Log.i("bongo", " datas values dans fragment city : $datas")
//                    Log.i("pluto", "datas CityFragment = $datas")
//            adapter = ItemCityFragmentAdapter(datas)
//
//            val recyclerView = view?.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView_fragmentCity)
//            recyclerView?.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
//            recyclerView?.adapter = this.adapter
//            Log.i("pluto", "RecycylerView dasn CityFragment = $recyclerView")

        })

    }
}


