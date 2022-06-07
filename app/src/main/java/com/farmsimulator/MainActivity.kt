package com.farmsimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farmsimulator.models.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
 fun main() {
     var chicken1 = Chicken("female")
     var chicken2 = Chicken("female")
     var meineKleineFarm = Farm()

     meineKleineFarm.putInFarm(chicken1)
     meineKleineFarm.putInFarm(chicken2)

     var cow1 = Cow("female")
     meineKleineFarm.putInFarm(cow1)

     meineKleineFarm.bericht()
 }