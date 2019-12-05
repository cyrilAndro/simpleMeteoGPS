package cyril.cieslak.Utils

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import cyril.cieslak.simplemeteogps.R
import cyril.cieslak.simplemeteogps.Weather

class adapterForFragmentToday (

    view : View,
    datas : MutableList<MutableList<Weather>>,
    leToday : String


    ) {



    val MIDNIGHT = "00:00:00" as CharSequence
    val THREEAM = "03:00:00"
    val SIXAM = "06:00:00"
    val NINEAM = "09:00:00"
    val NOON = "12:00:00"
    val THREEPM = "15:00:00"
    val SIXPM = "18:00:00"
    val NINEPM = "21:00:00"

    var zeroDate = datas[0][0].timestamp
    var firstDate = datas[1][0].timestamp
    var secondDate = datas[2][0].timestamp
    var thirdDate = datas[3][0].timestamp
    var fourthDate = datas[4][0].timestamp
    var fifthDate = datas[5][0].timestamp
    var sixthDate = datas[6][0].timestamp
    var seventhDate = datas[7][0].timestamp



    var lindexAtZero = "$leToday $MIDNIGHT"
    var lindexAtOne = "$leToday $THREEAM"
    var lindexAtTwo = "$leToday $SIXAM"
    var lindexAtThree = "$leToday $NINEAM"
    var lindexAtFour = "$leToday $NOON"
    var lindexAtFive = "$leToday $THREEPM"
    var lindexAtSix = "$leToday $SIXPM"
    var lindexAtSeven = "$leToday $NINEPM"


//    Log.i(
//    "today",
//    "value of Index zero : $indexMIDNIGHT , value of Index one : $indexTHREEAM"
//    )

    var lindexZero = view.findViewById<TextView>(R.id.indexForZero)
    var lindexOne = view.findViewById<TextView>(R.id.indexForOne)
    var lindexTwo = view.findViewById<TextView>(R.id.indexForTwo)
    var lindexThree = view.findViewById<TextView>(R.id.indexForThree)
    var lindexFour = view.findViewById<TextView>(R.id.indexForFour)
    var lindexFive = view.findViewById<TextView>(R.id.indexForFive)
    var lindexSix = view.findViewById<TextView>(R.id.indexForSix)
    var lindexSeven = view.findViewById<TextView>(R.id.indexForSeven)




    fun establishIndex () {

        lindexZero.text = lindexAtZero
        lindexOne.text = lindexAtOne
        lindexTwo.text = lindexAtTwo
        lindexThree.text = lindexAtThree
        lindexFour.text = lindexAtFour
        lindexFive.text = lindexAtFive
        lindexSix.text = lindexAtSix
        lindexSeven.text = lindexAtSeven


    }




   fun associatingDatas (view : View, datas : MutableList<MutableList<Weather>>,

                         temp0 : TextView,
                         temp1 : TextView,
                         temp2 : TextView,
                         temp3 : TextView,
                         temp4 : TextView,
                         temp5 : TextView,
                         temp6 : TextView,
                         temp7 : TextView,

                         wind0 : TextView,
                         wind1 : TextView,
                         wind2 : TextView,
                         wind3 : TextView,
                         wind4 : TextView,
                         wind5 : TextView,
                         wind6 : TextView,
                         wind7 : TextView,

                         date0 : TextView,
                         date1 : TextView,
                         date2 : TextView,
                         date3 : TextView,
                         date4 : TextView,
                         date5 : TextView,
                         date6 : TextView,
                         date7 : TextView,

                         licon0 : TextView,
                         licon1 : TextView,
                         licon2 : TextView,
                         licon3 : TextView,
                         licon4 : TextView,
                         licon5 : TextView,
                         licon6 : TextView,
                         licon7 : TextView,

                         iconTop0 : ImageView,
                         iconTop1 : ImageView,
                         iconTop2 : ImageView,
                         iconTop3 : ImageView,
                         iconTop4 : ImageView,
                         iconTop5 : ImageView,
                         iconTop6 : ImageView,
                         iconTop7 : ImageView







   ){

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

       var iconTop0 = view.findViewById<ImageView>(R.id.icon_weather_zero)
       var iconTop1 = view.findViewById<ImageView>(R.id.icon_weather_one)
       var iconTop2 = view.findViewById<ImageView>(R.id.icon_weather_two)
       var iconTop3 = view.findViewById<ImageView>(R.id.icon_weather_three)
       var iconTop4 = view.findViewById<ImageView>(R.id.icon_weather_four)
       var iconTop5 = view.findViewById<ImageView>(R.id.icon_weather_five)
       var iconTop6 = view.findViewById<ImageView>(R.id.icon_weather_six)
       var iconTop7 = view.findViewById<ImageView>(R.id.icon_weather_seven)


       var dataas = datas



       when (lindexAtZero) {

        zeroDate -> setToPrint(0, 0, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(0, 2, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
           wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
           date0, date1, date2, date3, date4, date5, date6, date7,
           licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
           iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(0, 3, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(0, 4, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(0, 5, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(0, 6, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(0, 7, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(0, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }



    when (lindexAtOne) {

        zeroDate -> setToPrint(1, 0,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(1, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(1, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(1, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(1, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(1, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(1, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(1, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(1, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

    when (lindexAtTwo) {

        zeroDate -> setToPrint(2, 0,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(2, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(2, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(2, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(2, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(2, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(2, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(2, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }
    when (lindexAtThree) {

        zeroDate -> setToPrint(3, 0,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(3, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(3, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(3, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(3, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(3, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(3, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(3, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(3, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

    when (lindexAtFour) {

        zeroDate -> setToPrint(4, 0, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(4, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(4, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
        wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
        date0, date1, date2, date3, date4, date5, date6, date7,
        licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
        iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(4, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(4, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(4, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(4, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(4, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(4, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

    when (lindexAtFive) {

        zeroDate -> setToPrint(5, 0,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(5, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(5, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(5, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(5, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(5, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(5, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(5, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(5, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

    when (lindexAtSix) {

        zeroDate -> setToPrint(6, 0,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(6, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(6, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(6, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(6, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(6, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(6, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(6, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(6, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

    when (lindexAtSeven) {

        zeroDate -> setToPrint(7, 0, dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        firstDate -> setToPrint(7, 1,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        secondDate -> setToPrint(7, 2,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        thirdDate -> setToPrint(7, 3,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fourthDate -> setToPrint(7, 4,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        fifthDate -> setToPrint(7, 5,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        sixthDate -> setToPrint(7, 6,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)
        seventhDate -> setToPrint(7, 7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7,
            iconTop0, iconTop1, iconTop2, iconTop3, iconTop4, iconTop5, iconTop6, iconTop7)

        else -> setToPrintError(7,  dataas, temp0, temp1, temp2, temp3, temp4,temp5, temp6, temp7,
            wind0, wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            date0, date1, date2, date3, date4, date5, date6, date7,
            licon0, licon1, licon2, licon3, licon4, licon5, licon6, licon7)
    }

   }

    fun setToPrint(indexNumber: Int, varAtZero: Int, dataas : MutableList<MutableList<Weather>>,

                   temp0 : TextView,
                   temp1 : TextView,
                   temp2 : TextView,
                   temp3 : TextView,
                   temp4 : TextView,
                   temp5 : TextView,
                   temp6 : TextView,
                   temp7 : TextView,

                   wind0 : TextView,
                   wind1 : TextView,
                   wind2 : TextView,
                   wind3 : TextView,
                   wind4 : TextView,
                   wind5 : TextView,
                   wind6 : TextView,
                   wind7 : TextView,

                   date0 : TextView,
                   date1 : TextView,
                   date2 : TextView,
                   date3 : TextView,
                   date4 : TextView,
                   date5 : TextView,
                   date6 : TextView,
                   date7 : TextView,

                   licon0 : TextView,
                   licon1 : TextView,
                   licon2 : TextView,
                   licon3 : TextView,
                   licon4 : TextView,
                   licon5 : TextView,
                   licon6 : TextView,
                   licon7 : TextView,

                   iconTop0 : ImageView,
                   iconTop1 : ImageView,
                   iconTop2 : ImageView,
                   iconTop3 : ImageView,
                   iconTop4 : ImageView,
                   iconTop5 : ImageView,
                   iconTop6 : ImageView,
                   iconTop7 : ImageView



                   ) {

        var nextTemp: TextView
        var nextWind: TextView
        var nextDate: TextView
        var nextIcon: TextView
        var nextIconTop : ImageView

        when (indexNumber) {

            0 -> {
                nextTemp = temp0
                nextWind = wind0
                nextDate = date0
                nextIcon = licon0
                nextIconTop = iconTop0
            }

            1 -> {
                nextTemp = temp1
                nextWind = wind1
                nextDate = date1
                nextIcon = licon1
                nextIconTop = iconTop1
            }

            2 -> {
                nextTemp = temp2
                nextWind = wind2
                nextDate = date2
                nextIcon = licon2
                nextIconTop = iconTop2
            }

            3 -> {
                nextTemp = temp3
                nextWind = wind3
                nextDate = date3
                nextIcon = licon3
                nextIconTop = iconTop3

            }
            4 -> {

                nextTemp = temp4
                nextWind = wind4
                nextDate = date4
                nextIcon = licon4
                nextIconTop = iconTop4
            }
            5 -> {
                nextTemp = temp5
                nextWind = wind5
                nextDate = date5
                nextIcon = licon5
                nextIconTop = iconTop5
            }
            6 -> {
                nextTemp = temp6
                nextWind = wind6
                nextDate = date6
                nextIcon = licon6
                nextIconTop = iconTop6
            }
            7 -> {
                nextTemp = temp7
                nextWind = wind7
                nextDate = date7
                nextIcon = licon7
                nextIconTop = iconTop7
            }

            else -> {

                nextTemp = temp1
                nextWind = wind1
                nextDate = date1
                nextIcon = licon1
                nextIconTop = iconTop1
            }
        }

        nextTemp.text = dataas[varAtZero][0].temperature
        nextWind.text = dataas[varAtZero][0].speed
        nextDate.text = dataas[varAtZero][0].timestamp
        nextIcon.text = dataas[varAtZero][0].iconWeather

        var whichIcon = dataas[varAtZero][0].iconWeather




        when (whichIcon) {
            //Sunny
            "01d" -> nextIconTop.setImageResource(R.drawable.ic_icons8_summer)
            // Sun Night
            "01n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_night)
            // Partially cloudy
            "02n", "02d", "03n", "03d" -> nextIconTop.setImageResource(R.drawable.partly_cloudly)
            // Mostly Cloudly
            "04d", "04n" -> nextIconTop.setImageResource(R.drawable.mostly_cloudy)
            // Fog
            "50d", "50n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_fog)
            //Snow
            "13d", "13n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_winter)
            // Moderate Rain
            "10d", "10n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_moderate_rain)
            // Rain
            "09d", "09n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_rainy_weather)
            // Storm
            "11d", "11n" -> nextIconTop.setImageResource(R.drawable.ic_icons8_storm)

            else -> nextIconTop.setImageResource(R.drawable.launcher_weather_adobe)
            //downLoadPicassoIcon(pictureToDownload)
        }

    }

    fun setToPrintError(indexNumber: Int, datas : MutableList<MutableList<Weather>>,

                        temp0 : TextView,
                        temp1 : TextView,
                        temp2 : TextView,
                        temp3 : TextView,
                        temp4 : TextView,
                        temp5 : TextView,
                        temp6 : TextView,
                        temp7 : TextView,

                        wind0 : TextView,
                        wind1 : TextView,
                        wind2 : TextView,
                        wind3 : TextView,
                        wind4 : TextView,
                        wind5 : TextView,
                        wind6 : TextView,
                        wind7 : TextView,

                        date0 : TextView,
                        date1 : TextView,
                        date2 : TextView,
                        date3 : TextView,
                        date4 : TextView,
                        date5 : TextView,
                        date6 : TextView,
                        date7 : TextView,

                        licon0 : TextView,
                        licon1 : TextView,
                        licon2 : TextView,
                        licon3 : TextView,
                        licon4 : TextView,
                        licon5 : TextView,
                        licon6 : TextView,
                        licon7 : TextView

//                        iconTop0 : ImageView,
//                        iconTop1 : ImageView,
//                        iconTop2 : ImageView,
//                        iconTop3 : ImageView,
//                        iconTop4 : ImageView,
//                        iconTop5 : ImageView,
//                        iconTop6 : ImageView,
//                        iconTop7 : ImageView


    ) {

        var nextTemp: TextView
        var nextWind: TextView
        var nextDate: TextView
        var nextIcon: TextView

        var dataas = datas

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

}