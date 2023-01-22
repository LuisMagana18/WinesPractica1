package com.mgoc.winespractica1.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.mgoc.winespractica1.databinding.ActivityMainBinding
import com.mgoc.winespractica1.model.Wine
import com.mgoc.winespractica1.model.WinesApi
import com.mgoc.winespractica1.util.Constants
import com.mgoc.winespractica1.view.adapters.WinesAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {

            val call = Constants.getRetrofit().create(WinesApi::class.java)
                .getWines("wines/wines_list")


            call.enqueue(object : Callback<ArrayList<Wine>> {
                override fun onResponse(
                    call: Call<ArrayList<Wine>>,
                    response: Response<ArrayList<Wine>>
                ) {
                    Log.d(Constants.LOGTAG, "Respuesta del servidor ${response.toString()}")
                    Log.d(Constants.LOGTAG, "Datos: ${response.body().toString()}")

                    binding.pbConexion.visibility = View.GONE

                    binding.rvMenu.layoutManager = LinearLayoutManager(this@MainActivity)
                    binding.rvMenu.adapter = WinesAdapter(this@MainActivity, response.body()!!)
                }

                override fun onFailure(call: Call<ArrayList<Wine>>, t: Throwable) {
                    Toast.makeText(
                        this@MainActivity,
                        "No hay conexión. Error: ${t.message}",
                        Toast.LENGTH_LONG
                    ).show()
                    binding.pbConexion.visibility = View.GONE
                }


            })
        }
    }

    fun selectedWine(wine: Wine){
        val parametros = Bundle().apply {
            putString("id", wine.id)
        }

        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtras(parametros)
        }


        startActivity(intent)
    }
}