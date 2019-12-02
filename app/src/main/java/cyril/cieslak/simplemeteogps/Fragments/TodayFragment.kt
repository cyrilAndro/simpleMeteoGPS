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
import cyril.cieslak.Utils.CompareDates
import cyril.cieslak.simplemeteogps.MainActivityViewModel

import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather


class TodayFragment : Fragment() {

    lateinit var viewModel: MainActivityViewModel

    val MIDNIGHT = "00:00:00" as CharSequence
    val THREEAM = "03:00:00"
    val SIXAM = "06:00:00"
    val NINEAM = "09:00:00"
    val NOON = "12:00:00"
    val THREEPM = "15:00:00"
    val SIXPM = "18:00:00"
    val NINEPM = "21:00:00"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var lindexZero = view.findViewById<TextView>(R.id.indexForZero)
        var lindexOne = view.findViewById<TextView>(R.id.indexForOne)
        var lindexTwo = view.findViewById<TextView>(R.id.indexForTwo)
        var lindexThree = view.findViewById<TextView>(R.id.indexForThree)
        var lindexFour = view.findViewById<TextView>(R.id.indexForFour)
        var lindexFive = view.findViewById<TextView>(R.id.indexForFive)
        var lindexSix = view.findViewById<TextView>(R.id.indexForSix)
        var lindexSeven = view.findViewById<TextView>(R.id.indexForSeven)


        var temp0 = view.findViewById<TextView>(R.id.tempZero)
        var temp1 = view.findViewById<TextView>(R.id.tempOne)
        var temp2 = view.findViewById<TextView>(R.id.tempTwo)
        var temp3 = view.findViewById<TextView>(R.id.tempThree)
        var temp4 = view.findViewById<TextView>(R.id.tempFour)
        var temp5 = view.findViewById<TextView>(R.id.tempFive)
        var temp6 = view.findViewById<TextView>(R.id.tempSix)
        var temp7 = view.findViewById<TextView>(R.id.tempSeven)


        var wind0 = view.findViewById<TextView>(R.id.windZero)
        var wind1 = view.findViewById<TextView>(R.id.windOne)
        var wind2 = view.findViewById<TextView>(R.id.windTwo)
        var wind3 = view.findViewById<TextView>(R.id.windThree)
        var wind4 = view.findViewById<TextView>(R.id.windFour)
        var wind5 = view.findViewById<TextView>(R.id.windFive)
        var wind6 = view.findViewById<TextView>(R.id.windSix)
        var wind7 = view.findViewById<TextView>(R.id.windSeven)

        var date0 = view.findViewById<TextView>(R.id.dateZero)
        var date1 = view.findViewById<TextView>(R.id.dateOne)
        var date2 = view.findViewById<TextView>(R.id.dateTwo)
        var date3 = view.findViewById<TextView>(R.id.dateThree)
        var date4 = view.findViewById<TextView>(R.id.dateFour)
        var date5 = view.findViewById<TextView>(R.id.dateFive)
        var date6 = view.findViewById<TextView>(R.id.dateSix)
        var date7 = view.findViewById<TextView>(R.id.dateSeven)

        var licon0 = view.findViewById<TextView>(R.id.iconZero)
        var licon1 = view.findViewById<TextView>(R.id.iconOne)
        var licon2 = view.findViewById<TextView>(R.id.iconTwo)
        var licon3 = view.findViewById<TextView>(R.id.iconThree)
        var licon4 = view.findViewById<TextView>(R.id.iconFour)
        var licon5 = view.findViewById<TextView>(R.id.iconFive)
        var licon6 = view.findViewById<TextView>(R.id.iconSix)
        var licon7 = view.findViewById<TextView>(R.id.iconSeven)

        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)


        viewModel.getStateDatasAfterParsing()
            .observe(this, Observer { ittt: MutableList<MutableList<Weather>> ->


                var datas = ittt

                var leToday = CompareDates().todayDateFormatted()
                Log.i("today", "value of today : $leToday")

                var zeroDate = datas[0][0].timestamp
                var firstDate = datas[1][0].timestamp
                var secondDate = datas[2][0].timestamp
                var thirdDate = datas[3][0].timestamp
                var fourthDate = datas[4][0].timestamp
                var fifthDate = datas[5][0].timestamp
                var sixthDate = datas[6][0].timestamp
                var seventhDate = datas[7][0].timestamp


                var indexMIDNIGHT = "$leToday $MIDNIGHT"
                var indexTHREEAM = "$leToday $THREEAM"
                var indexSIXAM = "$leToday $SIXAM"
                var indexNINEAM = "$leToday $NINEAM"
                var indexNOON = "$leToday $NOON"
                var indexTHREEPM = "$leToday $THREEPM"
                var indexSIXPM = "$leToday $SIXPM"
                var indexNINEPM = "$leToday $NINEPM"


                var lindexAtZero = indexMIDNIGHT
                var lindexAtOne = indexTHREEAM
                var lindexAtTwo = indexSIXAM
                var lindexAtThree = indexNINEAM
                var lindexAtFour = indexNOON
                var lindexAtFive = indexTHREEPM
                var lindexAtSix = indexSIXPM
                var lindexAtSeven = indexNINEPM


                Log.i(
                    "today",
                    "value of Index zero : $indexMIDNIGHT , value of Index one : $indexTHREEAM"
                )


                lindexZero.text = lindexAtZero
                lindexOne.text = lindexAtOne
                lindexTwo.text = lindexAtTwo
                lindexThree.text = lindexAtThree
                lindexFour.text = lindexAtFour
                lindexFive.text = lindexAtFive
                lindexSix.text = lindexAtSix
                lindexSeven.text = lindexAtSeven




                fun setToPrint(indexNumber: Int, varAtZero: Int) {

                    var nextTemp: TextView
                    var nextWind: TextView
                    var nextDate: TextView
                    var nextIcon: TextView

                    when (indexNumber) {

                        0 -> {
                            nextTemp = temp0
                            nextWind = wind0
                            nextDate = date0
                            nextIcon = licon0
                        }

                        1 -> {
                            nextTemp = temp1
                            nextWind = wind1
                            nextDate = date1
                            nextIcon = licon1

                        }

                        2 -> {
                            nextTemp = temp2
                            nextWind = wind2
                            nextDate = date2
                            nextIcon = licon2

                        }

                        3 -> {
                            nextTemp = temp3
                            nextWind = wind3
                            nextDate = date3
                            nextIcon = licon3

                        }
                        4 -> {

                            nextTemp = temp4
                            nextWind = wind4
                            nextDate = date4
                            nextIcon = licon4

                        }
                        5 -> {
                            nextTemp = temp5
                            nextWind = wind5
                            nextDate = date5
                            nextIcon = licon5
                        }
                        6 -> {
                            nextTemp = temp6
                            nextWind = wind6
                            nextDate = date6
                            nextIcon = licon6

                        }
                        7 -> {
                            nextTemp = temp7
                            nextWind = wind7
                            nextDate = date7
                            nextIcon = licon7

                        }

                        else -> {

                            nextTemp = temp1
                            nextWind = wind1
                            nextDate = date1
                            nextIcon = licon1

                        }
                    }

                    nextTemp.text = datas[varAtZero][0].temperature
                    nextWind.text = datas[varAtZero][0].speed
                    nextDate.text = datas[varAtZero][0].timestamp
                    nextIcon.text = datas[varAtZero][0].iconWeather


                }

                fun setToPrintError(indexNumber: Int) {

                    var nextTemp: TextView
                    var nextWind: TextView
                    var nextDate: TextView
                    var nextIcon: TextView

                    when (indexNumber) {

                        0 -> {
                            nextTemp = temp0
                            nextWind = wind0
                            nextDate = date0
                            nextIcon = licon0
                        }

                        1 -> {
                            nextTemp = temp1
                            nextWind = wind1
                            nextDate = date1
                            nextIcon = licon1

                        }

                        2 -> {
                            nextTemp = temp2
                            nextWind = wind2
                            nextDate = date2
                            nextIcon = licon2

                        }

                        3 -> {
                            nextTemp = temp3
                            nextWind = wind3
                            nextDate = date3
                            nextIcon = licon3

                        }
                        4 -> {

                            nextTemp = temp4
                            nextWind = wind4
                            nextDate = date4
                            nextIcon = licon4

                        }
                        5 -> {
                            nextTemp = temp5
                            nextWind = wind5
                            nextDate = date5
                            nextIcon = licon5
                        }
                        6 -> {
                            nextTemp = temp6
                            nextWind = wind6
                            nextDate = date6
                            nextIcon = licon6

                        }
                        7 -> {
                            nextTemp = temp7
                            nextWind = wind7
                            nextDate = date7
                            nextIcon = licon7

                        }

                        else -> {

                            nextTemp = temp1
                            nextWind = wind1
                            nextDate = date1
                            nextIcon = licon1

                        }
                    }



                    nextTemp.text = "No Temp"
                    nextWind.text = "No Wind"
                    nextDate.text = "No time"
                    nextIcon.text = "No Icon"
                }


                when (lindexAtZero) {

                    zeroDate -> setToPrint(0, 0)
                    firstDate -> setToPrint(0, 1)
                    secondDate -> setToPrint(0, 2)
                    thirdDate -> setToPrint(0, 3)
                    fourthDate -> setToPrint(0, 4)
                    fifthDate -> setToPrint(0, 5)
                    sixthDate -> setToPrint(0, 6)
                    seventhDate -> setToPrint(0, 7)

                    else -> setToPrintError(0)
                }



                when (lindexAtOne) {

                    zeroDate -> setToPrint(1, 0)
                    firstDate -> setToPrint(1, 1)
                    secondDate -> setToPrint(1, 2)
                    thirdDate -> setToPrint(1, 3)
                    fourthDate -> setToPrint(1, 4)
                    fifthDate -> setToPrint(1, 5)
                    sixthDate -> setToPrint(1, 6)
                    seventhDate -> setToPrint(1, 7)

                    else -> setToPrintError(1)
                }

                when (lindexAtTwo) {

                    zeroDate -> setToPrint(2, 0)
                    firstDate -> setToPrint(2, 1)
                    secondDate -> setToPrint(2, 2)
                    thirdDate -> setToPrint(2, 3)
                    fourthDate -> setToPrint(2, 4)
                    fifthDate -> setToPrint(2, 5)
                    sixthDate -> setToPrint(2, 6)
                    seventhDate -> setToPrint(2, 7)

                    else -> setToPrintError(2)
                }
                when (lindexAtThree) {

                    zeroDate -> setToPrint(3, 0)
                    firstDate -> setToPrint(3, 1)
                    secondDate -> setToPrint(3, 2)
                    thirdDate -> setToPrint(3, 3)
                    fourthDate -> setToPrint(3, 4)
                    fifthDate -> setToPrint(3, 5)
                    sixthDate -> setToPrint(3, 6)
                    seventhDate -> setToPrint(3, 7)

                    else -> setToPrintError(3)
                }

                when (lindexAtFour) {

                    zeroDate -> setToPrint(4, 0)
                    firstDate -> setToPrint(4, 1)
                    secondDate -> setToPrint(4, 2)
                    thirdDate -> setToPrint(4, 3)
                    fourthDate -> setToPrint(4, 4)
                    fifthDate -> setToPrint(4, 5)
                    sixthDate -> setToPrint(4, 6)
                    seventhDate -> setToPrint(4, 7)

                    else -> setToPrintError(4)
                }

                when (lindexAtFive) {

                    zeroDate -> setToPrint(5, 0)
                    firstDate -> setToPrint(5, 1)
                    secondDate -> setToPrint(5, 2)
                    thirdDate -> setToPrint(5, 3)
                    fourthDate -> setToPrint(5, 4)
                    fifthDate -> setToPrint(5, 5)
                    sixthDate -> setToPrint(5, 6)
                    seventhDate -> setToPrint(5, 7)

                    else -> setToPrintError(5)
                }

                when (lindexAtSix) {

                    zeroDate -> setToPrint(6, 0)
                    firstDate -> setToPrint(6, 1)
                    secondDate -> setToPrint(6, 2)
                    thirdDate -> setToPrint(6, 3)
                    fourthDate -> setToPrint(6, 4)
                    fifthDate -> setToPrint(6, 5)
                    sixthDate -> setToPrint(6, 6)
                    seventhDate -> setToPrint(6, 7)

                    else -> setToPrintError(6)
                }

                when (lindexAtSeven) {

                    zeroDate -> setToPrint(7, 0)
                    firstDate -> setToPrint(7, 1)
                    secondDate -> setToPrint(7, 2)
                    thirdDate -> setToPrint(7, 3)
                    fourthDate -> setToPrint(7, 4)
                    fifthDate -> setToPrint(7, 5)
                    sixthDate -> setToPrint(7, 6)
                    seventhDate -> setToPrint(7, 7)

                    else -> setToPrintError(7)
                }

            })

    }
}


