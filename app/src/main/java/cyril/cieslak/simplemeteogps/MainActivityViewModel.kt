package cyril.cieslak.simplemeteogps

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivityViewModel : ViewModel() {

    //LATITUDE

    // Declaration de la variable qui porte le liveData
    private val stateLatitude = MutableLiveData<String>()

    // la fonction getState() permet de dissocier le Mutable du LiveData
    // et donc d'obtenir un LIveData facilement utilisable
    fun getStateLatitude() : LiveData<String> = stateLatitude

    var liveDataLatitude : LiveData<String> = stateLatitude

    //fonction pour entrer la latitude
    fun entryLatitude (latitude : String) {

        stateLatitude.value = latitude
        //  Log.i("Letest", "funEntryLatitude : $stateLatitude")
    }

    //LONGITUDE

    private val stateLongitude = MutableLiveData<String> ()

    fun getStateLongitude() : LiveData<String> = stateLongitude

    fun entryLongitude (longitude : String){
        stateLongitude.value = longitude
    }

    // JSON RESULT TEXT

    private val stateJsonResultText = MutableLiveData<String> ()

    fun getStateJsonResult() : LiveData<String> = stateJsonResultText

    fun entryJsonResult (jsonResultText : String) {
        stateJsonResultText.value = jsonResultText
    }

}