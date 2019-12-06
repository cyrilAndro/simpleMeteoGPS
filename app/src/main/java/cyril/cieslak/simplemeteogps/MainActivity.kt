package cyril.cieslak.simplemeteogps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.location.*
import cyril.cieslak.Utils.CompareDates
import cyril.cieslak.simplemeteogps.Downloader.JSONDownloader
import cyril.cieslak.simplemeteogps.Parsers.parseWeatherDatas
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONArray



class MainActivity : AppCompatActivity() {


    lateinit var viewModel: MainActivityViewModel


    lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    lateinit var locationRequest: LocationRequest
    lateinit var locationCallback: LocationCallback

    val REQUEST_CODE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        // Check Permission for GPS point
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )
        )
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE
            )
        else {

            buildLocationRequest()
            buildLocationCallBack()

            CoroutineScope(Dispatchers.Main).launch {
                sendJsonResultToTheViewModel()
            }






            // Create FusedProviderClient
            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

            fusedLocationProviderClient.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.myLooper()
            )



        }


    }


    private suspend fun sendJsonResultToTheViewModel() {

        viewModel.getStateLatitude().observe(this, Observer {

            var lattitude = it

            viewModel.getStateLongitude().observe(this, Observer { itt: String? ->

                var longgitude = itt

                Log.i(
                    "dingo",
                    "MainActivity : Value of lattituide= $lattitude , Value of $longgitude"
                )

                var jsonWeather =
                    "http://api.openweathermap.org/data/2.5/forecast?lat=$lattitude&lon=$longgitude&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"
//               // "http://api.openweathermap.org/data/2.5/forecast?lat=44.7914748&lon=20.4775094&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"
                Log.i("dingo", "jsonWeather dasn CityFragment = $jsonWeather")


                var jsonResultText = JSONDownloader(this, jsonWeather).execute().get()
                // getTheNewLocation(jsonWeather)
                Log.i("dingo", "Value of JSONRESULTTEXT in MainActivity= $jsonWeather")

                var datas  = parseWeatherDatas(jsonResultText).parseDatasFromApi(jsonResultText)
                Log.i("bongo", " datas values dans fragment city : $datas")
                Log.i("pluto", "datas CityFragment = $datas")


                viewModel.entryDatasAfterParsing(datas)


            })
        })


    }


    private fun buildLocationCallBack() {
        locationCallback = object : LocationCallback() {


            override fun onLocationResult(p0: LocationResult?) {
                var location = p0!!.locations.get(p0!!.locations.size - 1)
                yourCurrentLatitude.text = location.latitude.toString()
                yourCurrentLongitude.text = location.longitude.toString()

                var latt = location.latitude.toString()
                var longi = location.longitude.toString()

                viewModel.entryLatitude(latt)
                viewModel.entryLongitude((longi))


            }

        }


    }

    private fun buildLocationRequest() {
        locationRequest = LocationRequest()
        locationRequest.priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        locationRequest.interval = 5000
        locationRequest.fastestInterval = 3000
        locationRequest.smallestDisplacement = 10f

    }

    override fun onResume() {
        /// On fait entrer viewModel dans le scope de l'activité
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        //On s'abonne aux changements d'état et quand l'état change, on lance la fonction UpdateUI avec en valeur par défaut it
        viewModel.getStateLatitude().observe(this, Observer {
            yourCurrentLatitude.text = it

            viewModel.getStateLongitude().observe(this, Observer { itt: String? ->
                yourCurrentLongitude.text = itt
            })
        })
        super.onResume()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}
