package com.mgoc.winespractica1.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.mgoc.winespractica1.databinding.ActivityDetailsBinding
import com.mgoc.winespractica1.model.WineDetail
import com.mgoc.winespractica1.model.WinesApi
import com.mgoc.winespractica1.util.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        val id = bundle?.getString("id", "0")

        CoroutineScope(Dispatchers.IO).launch {
            val call = Constants.getRetrofit().create(WinesApi::class.java).getWineDetail(id)

            call.enqueue(object: Callback<WineDetail> {
                override fun onResponse(call: Call<WineDetail>, response: Response<WineDetail>) {

                    binding.apply {

                        tvTitle.text = response.body()?.name

                        tvLongDesc.text = response.body()?.description

                        Glide.with(this@DetailsActivity)
                            .load(response.body()?.image)
                            .into(ivImage)

                        tvType.text = response.body()?.type

                        tvAge.text = response.body()?.age

                        tvColor.text = response.body()?.color

                        tvRegion.text = response.body()?.region

                        tvPairing.text = response.body()?.pairing

                        pbConexion.visibility = View.INVISIBLE
                    }


                }

                override fun onFailure(call: Call<WineDetail>, t: Throwable) {
                    Toast.makeText(this@DetailsActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
                    binding.pbConexion.visibility = View.INVISIBLE
                }

            })
        }
    }
}