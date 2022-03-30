package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakePerfilData: Array<JSONObject> = arrayOf(
            JSONObject("{\"nom\": \"Alma Mia\", \"desc\": \"Tienda de Postres\", \"likes\": \"A 1000 personas les gusta\", \"like\": \"Me gusta\", \"prev\": \"Vista Previa\"}"),
            JSONObject("{\"nom\": \"Ex Hacienda El Troje\", \"desc\": \"Sala de eventos y espectaculos\", \"likes\": \"A 12866personas les gusta\", \"like\": \"Me gusta\", \"prev\": \"Vista Previa\"}"),
            JSONObject("{\"nom\": \"Spirotc Morelia Mich\", \"desc\": \"Servicio de Reparacion de computadoras\", \"likes\": \"A 303 personas les gusta\", \"like\": \"Me gusta\", \"prev\": \"Vista Previa\"}"),
            JSONObject("{\"nom\": \"Articulos Electricos y electronicos\", \"desc\": \"Electronica\", \"likes\": \"A 101 personas les gusta\", \"like\": \"Me gusta\", \"prev\": \"Vista Previa\"}")



            )

        binding.rwPerfilEntries.adapter = MainAdapter(fakePerfilData)
    }
}