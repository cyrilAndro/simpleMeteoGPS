package cyril.cieslak.Utils

import android.util.Log
import cyril.cieslak.simplemeteogps.Weather



class simpleAdapterForFragmentTomorrow () {


    val MIDNIGHT = "00:00:00" as CharSequence
    val THREEAM = "03:00:00"
    val SIXAM = "06:00:00"
    val NINEAM = "09:00:00"
    val NOON = "12:00:00"
    val THREEPM = "15:00:00"
    val SIXPM = "18:00:00"
    val NINEPM = "21:00:00"

    var numberIndex0 = 0
    var numberIndex1 = 1
    var numberIndex2 = 2
    var numberIndex3 = 3
    var numberIndex4 = 4
    var numberIndex5 = 5
    var numberIndex6 = 6
    var numberIndex7 = 7
    var numberIndex8 = 8
    var numberIndex9 = 9
    var numberIndex10 = 10

    var numberIndex11 = 11
    var numberIndex12 = 12
    var numberIndex13 = 13
    var numberIndex14 = 14
    var numberIndex15 = 15
    var numberIndex16 = 16
    var numberIndex17 = 17
    var numberIndex18 = 18
    var numberIndex19 = 19
    var numberIndex20 = 20
    var numberIndex21 = 21
    var numberIndex22 = 22
    var numberIndex23 = 23
    var numberIndex24 = 24


    fun getTheDatas(datas: MutableList<MutableList<Weather>>): Int {

        var numberIndex : Int? = null

        var tomorrowAsString = CompareDates().tomorrowDateFormatted()
        Log.i("typeTest", " What is todayAsString index? $tomorrowAsString")

        var lindexAtZero = "$tomorrowAsString $MIDNIGHT"
        var lindexAtOne = "$tomorrowAsString $THREEAM"
        var lindexAtTwo = "$tomorrowAsString $SIXAM"
        var lindexAtThree = "$tomorrowAsString $NINEAM"
        var lindexAtFour = "$tomorrowAsString $NOON"
        var lindexAtFive = "$tomorrowAsString $THREEPM"
        var lindexAtSix = "$tomorrowAsString $SIXPM"
        var lindexAtSeven = "$tomorrowAsString $NINEPM"

        var firstIndexGoFromAPI0 = datas[numberIndex0][0].timestamp
        var firstIndexGoFromAPI1 = datas[numberIndex1][0].timestamp
        var firstIndexGoFromAPI2 = datas[numberIndex2][0].timestamp
        var firstIndexGoFromAPI3 = datas[numberIndex3][0].timestamp
        var firstIndexGoFromAPI4 = datas[numberIndex4][0].timestamp
        var firstIndexGoFromAPI5 = datas[numberIndex5][0].timestamp
        var firstIndexGoFromAPI6 = datas[numberIndex6][0].timestamp
        var firstIndexGoFromAPI7 = datas[numberIndex7][0].timestamp
        var firstIndexGoFromAPI8 = datas[numberIndex8][0].timestamp
        var firstIndexGoFromAPI9 = datas[numberIndex9][0].timestamp
        var firstIndexGoFromAPI10 = datas[numberIndex10][0].timestamp
        var firstIndexGoFromAPI11 = datas[numberIndex11][0].timestamp
        var firstIndexGoFromAPI12 = datas[numberIndex12][0].timestamp
        var firstIndexGoFromAPI13 = datas[numberIndex13][0].timestamp
        var firstIndexGoFromAPI14 = datas[numberIndex14][0].timestamp
        var firstIndexGoFromAPI15 = datas[numberIndex15][0].timestamp
        var firstIndexGoFromAPI16 = datas[numberIndex16][0].timestamp
        var firstIndexGoFromAPI17 = datas[numberIndex17][0].timestamp
        var firstIndexGoFromAPI18 = datas[numberIndex18][0].timestamp
        var firstIndexGoFromAPI19 = datas[numberIndex19][0].timestamp
        var firstIndexGoFromAPI20 = datas[numberIndex20][0].timestamp
        var firstIndexGoFromAPI21 = datas[numberIndex21][0].timestamp
        var firstIndexGoFromAPI22 = datas[numberIndex22][0].timestamp
        var firstIndexGoFromAPI23 = datas[numberIndex23][0].timestamp

        Log.i("typeTest", " What is todayAsString index? $firstIndexGoFromAPI0")


        when (lindexAtZero) {




            firstIndexGoFromAPI0 -> numberIndex = 0
            firstIndexGoFromAPI1 -> numberIndex = 1
            firstIndexGoFromAPI2 -> numberIndex = 2
            firstIndexGoFromAPI3 -> numberIndex = 3
            firstIndexGoFromAPI4 -> numberIndex = 4
            firstIndexGoFromAPI5 -> numberIndex = 5
            firstIndexGoFromAPI6 -> numberIndex = 6
            firstIndexGoFromAPI7 -> numberIndex = 7
            firstIndexGoFromAPI8 -> numberIndex = 8
            firstIndexGoFromAPI9 -> numberIndex = 9
            firstIndexGoFromAPI10 -> numberIndex = 10
            firstIndexGoFromAPI11 -> numberIndex = 11
            firstIndexGoFromAPI12 -> numberIndex = 12
            firstIndexGoFromAPI13 -> numberIndex = 13
            firstIndexGoFromAPI14 -> numberIndex = 14
            firstIndexGoFromAPI15 -> numberIndex = 15
            firstIndexGoFromAPI16 -> numberIndex = 16
            firstIndexGoFromAPI17 -> numberIndex = 17
            firstIndexGoFromAPI18 -> numberIndex = 18
            firstIndexGoFromAPI19 -> numberIndex = 19
            firstIndexGoFromAPI20 -> numberIndex = 20
            firstIndexGoFromAPI21 -> numberIndex = 21
            firstIndexGoFromAPI22 -> numberIndex = 22
            firstIndexGoFromAPI23 -> numberIndex = 23


            else -> {
                numberIndex = 230
            }
        }
        return numberIndex

    }

    fun feedTheBlankCases (datas : MutableList<MutableList<Weather>>,startingIndex : Int) : String {

        var indexZero = startingIndex
        var indexOne = startingIndex.plus(1)
        var indexTwo = startingIndex.plus(2)
        var indexThree = startingIndex.plus(3)
        var indexFour = startingIndex.plus(4)
        var indexFive = startingIndex.plus(5)
        var indexSix = startingIndex.plus(6)
        var indexSeven = startingIndex.plus(7)


        var temp0 =  datas[indexZero][0].temperature
        var wind0 = datas[indexZero][0].speed
        var date0 = datas[indexZero][0].timestamp
        var licon0 = datas[indexZero][0].iconWeather
       // var iconTop0 =

        var temp1 =  datas[indexOne][0].temperature
        var wind1 = datas[indexOne][0].speed
        var date1 = datas[indexOne][0].timestamp
        var licon1 = datas[indexOne][0].iconWeather

        var temp2 =  datas[indexTwo][0].temperature
        var wind2 = datas[indexTwo][0].speed
        var date2 = datas[indexTwo][0].timestamp
        var licon2 = datas[indexTwo][0].iconWeather

        var temp3 =  datas[indexThree][0].temperature
        var wind3 = datas[indexThree][0].speed
        var date3 = datas[indexThree][0].timestamp
        var licon3 = datas[indexThree][0].iconWeather

        var temp4 =  datas[indexFour][0].temperature
        var wind4 = datas[indexFour][0].speed
        var date4 = datas[indexFour][0].timestamp
        var licon4 = datas[indexFour][0].iconWeather

        var temp5 =  datas[indexFive][0].temperature
        var wind5 = datas[indexFive][0].speed
        var date5 = datas[indexFive][0].timestamp
        var licon5 = datas[indexFive][0].iconWeather

        var temp6 =  datas[indexSix][0].temperature
        var wind6 = datas[indexSix][0].speed
        var date6 = datas[indexSix][0].timestamp
        var licon6 = datas[indexSix][0].iconWeather

        var temp7 =  datas[indexSeven][0].temperature
        var wind7 = datas[indexSeven][0].speed
        var date7 = datas[indexSeven][0].timestamp
        var licon7 = datas[indexSeven][0].iconWeather

        var tomorrowString = " Index Zero : $temp0, $wind0, $date0, $licon0, Index One : $temp1, $wind1, $date1, $licon1, Index Two : $temp2, $wind2, $date2, $licon2, Index Three : $temp3, $wind3, $date3, $licon3, Index Four : $temp4, $wind4, $date4, $licon4, Index Five : $temp5, $wind5, $date5, $licon5, Index Six : $temp6, $wind6, $date6, $licon6, Index Seven : $temp7, $wind7, $date7, $licon7"



        return tomorrowString
    }
}

