package cyril.cieslak.simplemeteogps.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cyril.cieslak.simplemeteogps.MainActivityViewModel

import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather
import java.util.*


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
        var tempOne = view.findViewById<TextView>(R.id.tempOne)
        var tempTwo = view.findViewById<TextView>(R.id.tempTwo)
        var tempThree = view.findViewById<TextView>(R.id.tempThree)
        var tempFour = view.findViewById<TextView>(R.id.tempFour)
        var tempFive = view.findViewById<TextView>(R.id.tempFive)
        var tempSix = view.findViewById<TextView>(R.id.tempSix)
        var tempSeven = view.findViewById<TextView>(R.id.tempSeven)


        var windZero = view.findViewById<TextView>(R.id.windZero)
        var windOne = view.findViewById<TextView>(R.id.windOne)
        var windTwo = view.findViewById<TextView>(R.id.windTwo)
        var windThree = view.findViewById<TextView>(R.id.windThree)
        var windFour = view.findViewById<TextView>(R.id.windFour)
        var windFive = view.findViewById<TextView>(R.id.windFive)
        var windSix = view.findViewById<TextView>(R.id.windSix)
        var windSeven = view.findViewById<TextView>(R.id.windSeven)

        var dateZero = view.findViewById<TextView>(R.id.dateZero)
        var dateOne = view.findViewById<TextView>(R.id.dateOne)
        var dateTwo = view.findViewById<TextView>(R.id.dateTwo)
        var dateThree = view.findViewById<TextView>(R.id.dateThree)
        var dateFour = view.findViewById<TextView>(R.id.dateFour)
        var dateFive = view.findViewById<TextView>(R.id.dateFive)
        var dateSix = view.findViewById<TextView>(R.id.dateSix)
        var dateSeven = view.findViewById<TextView>(R.id.dateSeven)

        var liconZero = view.findViewById<TextView>(R.id.iconZero)
        var liconOne = view.findViewById<TextView>(R.id.iconOne)
        var liconTwo = view.findViewById<TextView>(R.id.iconTwo)
        var liconThree = view.findViewById<TextView>(R.id.iconThree)
        var liconFour = view.findViewById<TextView>(R.id.iconFour)
        var liconFive = view.findViewById<TextView>(R.id.iconFive)
        var liconSix = view.findViewById<TextView>(R.id.iconSix)
        var liconSeven = view.findViewById<TextView>(R.id.iconSeven)

        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)


        viewModel.getStateDatasAfterParsing().observe(this, Observer { ittt : MutableList<MutableList<Weather>> ->


            var datas = ittt


            tempZero.text = datas[0][0].temperature
            tempOne.text = datas[1][0].temperature
            tempTwo.text = datas[2][0].temperature
            tempThree.text = datas[3][0].temperature
            tempFour.text = datas[4][0].temperature
            tempFive.text = datas[5][0].temperature
            tempSix.text = datas[6][0].temperature
            tempSeven.text = datas[7][0].temperature

            windZero.text = datas[0][0].speed
            windOne.text = datas[1][0].speed
            windTwo.text = datas[2][0].speed
            windThree.text = datas[3][0].speed
            windFour.text = datas[4][0].speed
            windFive.text = datas[5][0].speed
            windSix.text = datas[6][0].speed
            windSeven.text = datas[7][0].speed

            dateZero.text = datas[0][0].timestamp
            dateOne.text = datas[1][0].timestamp
            dateTwo.text = datas[2][0].timestamp
            dateThree.text = datas[3][0].timestamp
            dateFour.text = datas[4][0].timestamp
            dateFive.text = datas[5][0].timestamp
            dateSix.text = datas[6][0].timestamp
            dateSeven.text = datas[7][0].timestamp


            liconZero.text = (datas[0][0].iconWeather)
            liconOne.text = datas[1][0].iconWeather
            liconTwo.text = datas[2][0].iconWeather
            liconThree.text = datas[3][0].iconWeather
            liconFour.text = datas[4][0].iconWeather
            liconFive.text = datas[5][0].iconWeather
            liconSix.text = datas[6][0].iconWeather
            liconSeven.text = datas[7][0].iconWeather








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


