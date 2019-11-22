package cyril.cieslak.simplemeteogps

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.location.*
import com.google.android.material.snackbar.Snackbar
import cyril.cieslak.simplemeteogps.Downloader.JSONDownloader
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_city.*

class MainActivity : AppCompatActivity() {

    // Creation du lateInit viewModel de type LoginViewModel
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


            // Create FusedProviderClient
            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

            fusedLocationProviderClient.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.myLooper()
            )

//            // Set Event Click on Update Button
//            button_update_coordinates.setOnClickListener(View.OnClickListener {
//
//                if (ActivityCompat.checkSelfPermission(
//                        this@MainActivity,
//                        android.Manifest.permission.ACCESS_FINE_LOCATION
//                    ) != PackageManager.PERMISSION_GRANTED &&
//                    ActivityCompat.checkSelfPermission(
//                        this@MainActivity,
//                        android.Manifest.permission.ACCESS_COARSE_LOCATION
//                    ) != PackageManager.PERMISSION_GRANTED
//                ) {
//                    ActivityCompat.requestPermissions(
//                        this@MainActivity,
//                        arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
//                        REQUEST_CODE
//                    )
//                    return@OnClickListener
//                }
//                fusedLocationProviderClient.requestLocationUpdates(
//                    locationRequest,
//                    locationCallback,
//                    Looper.myLooper()
//                )
//
//                Snackbar.make(it, "Mise à jour des données", Snackbar.LENGTH_SHORT).show()
//
//
//            })

        }


//        viewModel.getStateLatitude().observe(this, Observer {
//
//            var lattitude = it
//            Log.i("bingo", "valeur Lattitude = $lattitude")
//
//            viewModel.getStateLongitude().observe(this, Observer { itt: String? ->
//
//                var longgitude = itt
//                Log.i("bingo", "valeur Longgitude = $longgitude")
//
//                var jsonWeather =
//                    "http://api.openweathermap.org/data/2.5/forecast?lat=$lattitude&lon=$longgitude&units=metric&cnt=24&appid=467005a2981f9965ac02fa6dabd5fc2e"
//                Log.i("bingo", "la String = $jsonWeather")
//                // getTheNewLocation(jsonWeather)
//
//                getTheNewLocation(jsonWeather)
//            })
//        })

    }


    private fun getTheNewLocation(jsonWeather: String) {
        var jsonResultText = JSONDownloader(this, jsonWeather).execute().get()
        Log.i("bingo", " datas parsed : $jsonResultText")
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
