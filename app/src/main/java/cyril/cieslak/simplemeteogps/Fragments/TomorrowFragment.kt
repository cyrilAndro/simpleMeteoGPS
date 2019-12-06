package cyril.cieslak.simplemeteogps.Fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cyril.cieslak.Utils.CompareDates
import cyril.cieslak.Utils.adapterForFragmentToday
import cyril.cieslak.Utils.adapterForFragmentTomorrow
import cyril.cieslak.Utils.simpleAdapterForFragmentTomorrow
import cyril.cieslak.simplemeteogps.MainActivityViewModel

import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class TomorrowFragment : Fragment() {

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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tomorrow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



//        var temp0 = view.findViewById<TextView>(R.id.tempZero)
//        var temp1 = view.findViewById<TextView>(R.id.tempOne)
//        var temp2 = view.findViewById<TextView>(R.id.tempTwo)
//        var temp3 = view.findViewById<TextView>(R.id.tempThree)
//        var temp4 = view.findViewById<TextView>(R.id.tempFour)
//        var temp5 = view.findViewById<TextView>(R.id.tempFive)
//        var temp6 = view.findViewById<TextView>(R.id.tempSix)
//        var temp7 = view.findViewById<TextView>(R.id.tempSeven)
//
//
//        var wind0 = view.findViewById<TextView>(R.id.windZero)
//        var wind1 = view.findViewById<TextView>(R.id.windOne)
//        var wind2 = view.findViewById<TextView>(R.id.windTwo)
//        var wind3 = view.findViewById<TextView>(R.id.windThree)
//        var wind4 = view.findViewById<TextView>(R.id.windFour)
//        var wind5 = view.findViewById<TextView>(R.id.windFive)
//        var wind6 = view.findViewById<TextView>(R.id.windSix)
//        var wind7 = view.findViewById<TextView>(R.id.windSeven)
//
//        var date0 = view.findViewById<TextView>(R.id.dateZero)
//        var date1 = view.findViewById<TextView>(R.id.dateOne)
//        var date2 = view.findViewById<TextView>(R.id.dateTwo)
//        var date3 = view.findViewById<TextView>(R.id.dateThree)
//        var date4 = view.findViewById<TextView>(R.id.dateFour)
//        var date5 = view.findViewById<TextView>(R.id.dateFive)
//        var date6 = view.findViewById<TextView>(R.id.dateSix)
//        var date7 = view.findViewById<TextView>(R.id.dateSeven)
//
//        var licon0 = view.findViewById<TextView>(R.id.iconZero)
//        var licon1 = view.findViewById<TextView>(R.id.iconOne)
//        var licon2 = view.findViewById<TextView>(R.id.iconTwo)
//        var licon3 = view.findViewById<TextView>(R.id.iconThree)
//        var licon4 = view.findViewById<TextView>(R.id.iconFour)
//        var licon5 = view.findViewById<TextView>(R.id.iconFive)
//        var licon6 = view.findViewById<TextView>(R.id.iconSix)
//        var licon7 = view.findViewById<TextView>(R.id.iconSeven)
//
//        var iconTop0 = view.findViewById<ImageView>(R.id.icon_weather_zero)
//        var iconTop1 = view.findViewById<ImageView>(R.id.icon_weather_one)
//        var iconTop2 = view.findViewById<ImageView>(R.id.icon_weather_two)
//        var iconTop3 = view.findViewById<ImageView>(R.id.icon_weather_three)
//        var iconTop4 = view.findViewById<ImageView>(R.id.icon_weather_four)
//        var iconTop5 = view.findViewById<ImageView>(R.id.icon_weather_five)
//        var iconTop6 = view.findViewById<ImageView>(R.id.icon_weather_six)
//        var iconTop7 = view.findViewById<ImageView>(R.id.icon_weather_seven)

      CoroutineScope(Dispatchers.IO).launch {
            withContext(Dispatchers.Main){

                feedTomorrowFragment(view)

            }
      }

    }

    private suspend fun feedTomorrowFragment (view : View) {

        var allDatas = view.findViewById<TextView>(R.id.listAllDatasForTomorrowFragment)

        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)


        viewModel.getStateDatasAfterParsing()
            .observe(this, Observer { ittt: MutableList<MutableList<Weather>> ->


                var datas = ittt

                var leTomorrow = CompareDates().tomorrowDateFormatted()
                Log.i("today", "value of tomorrow : $leTomorrow")

//                adapterForFragmentTomorrow(view, datas, leTomorrow).establishIndex()
//
//                adapterForFragmentTomorrow(view, datas, leTomorrow).associatingDatas(
//                    view, datas,
//
//                    temp0, temp1, temp2, temp3, temp4, temp5, temp6, temp7,
//                    wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
//                    date0, date1, date2, date3, date4, date5, date6, date7,
//                    licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
//                    iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7
//
//
//                )

                var startingIndex = simpleAdapterForFragmentTomorrow().getTheDatas(datas)
                Log.i("TomorrowFragment", " What is the starting index? $startingIndex")
                Toast.makeText(activity, "The starting index is $startingIndex", Toast.LENGTH_LONG).show()

                var alldatasForTomorrow = simpleAdapterForFragmentTomorrow().feedTheBlankCases(datas, startingIndex)
                Toast.makeText(activity, "The starting index is $alldatasForTomorrow", Toast.LENGTH_LONG).show()

                allDatas.text = alldatasForTomorrow


            })
    }
}




