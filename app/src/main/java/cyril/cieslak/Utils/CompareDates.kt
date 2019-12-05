package cyril.cieslak.Utils

import java.time.LocalDate
import java.time.LocalDate.now
import java.time.format.DateTimeFormatter
import java.util.*

import java.text.SimpleDateFormat


class CompareDates {

    fun todayDateNotFormatted () : String {

        val calendar = Calendar.getInstance()
        val todayNotFormatted = calendar.time

        val dateFormat = SimpleDateFormat ("yyyy-MM-dd HH:mm:ss")
        val todayNotFormattedAsString = dateFormat.format(todayNotFormatted)

        return todayNotFormattedAsString
    }



    fun todayDateFormatted () : String {

        val calendar = Calendar.getInstance()
        val today = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        val todayAsString = dateFormat.format(today)

        return todayAsString

    }

    fun tomorrowDateNotFormatted () : String {

        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 1)

        val tomorrow = calendar.time


        val dateFormat = SimpleDateFormat ("yyyy-MM-dd HH:mm:ss")

        val tomorrowNotFormattedAsString = dateFormat.format(tomorrow)

        return tomorrowNotFormattedAsString
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