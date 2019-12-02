package cyril.cieslak.Utils

import java.time.LocalDate
import java.time.LocalDate.now
import java.time.format.DateTimeFormatter
import java.util.*

import java.text.SimpleDateFormat


class CompareDates {



    fun todayDateFormatted () : String {

        val calendar = Calendar.getInstance()
        val today = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        val todayAsString = dateFormat.format(today)

        return todayAsString

    }

    fun tomorrowDateFormatted () : String {

        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 1)

        val tomorrow = calendar.time


        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        val tomorrowAsString = dateFormat.format(tomorrow)

        return tomorrowAsString
    }

    fun afterTomorrowDateFormatted () : String {

        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 2)

        val afterTomorrow = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        val afterTomorrowAsString = dateFormat.format(afterTomorrow)

        return afterTomorrowAsString
    }

    fun after72hoursDateFormatted () : String {

        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 3)

        val after72hours = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        val after72HoursAsString = dateFormat.format(after72hours)

        return after72HoursAsString
    }
}