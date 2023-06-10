package com.example.a10120781utsguruh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.a10120781utsguruh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlide(
                "Sunlight",
                "Sunlight is the light and energy that comes from the sun",
                R.drawable.maleelement
            ),
            IntroSlide(
                "Pay Online",
                "Electronic bill payment is a feature of online, mobile and telephone banking",
                R.drawable.payment
            ),
            IntroSlide(
                "Video Streaming",
                "Streaming media is multimedia that is constantly received by and presented to an end-user",
                R.drawable.videostream
            )
        )
    )

    private lateinit var introSliderAdapterPager : ViewPager2
    //    private lateinit var introSliderViewPager : ViewPager2
    private lateinit var binding: ActivityMainBinding
    private lateinit var indicatorsContainer : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        introSliderAdapterPager = binding.introSliderViewPager
        introSliderAdapterPager.adapter = introSliderAdapter

        indicatorsContainer = binding.indicatorsContainer
        setupIndicators()
        setCurrentIndicator(0)
//        introSliderViewPager.registerOnPageChangeCallback(object :
//            ViewPager2.OnPageChangeCallback(){
//
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//                setCurrentIndicator(position)
//            }
//        })

        var buttonnext = findViewById<Button>(R.id.buttonNext)
        buttonnext.setOnClickListener {
            val intent1 = Intent (this, HomeActivity::class.java)
            startActivity(intent1)
        }
    }

    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicatorsContainer.addView(indicators[i])
        }
    }

    private fun setCurrentIndicator(index: Int) {
        val childCount = indicatorsContainer.childCount
        for (i in 0 until childCount) {
            val imageView = indicatorsContainer.getChildAt(i) as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
            }
        }
    }
}

//Nama : Guruh Fillah Alfariza
//NIM  : 10120781
//KELAS : IF-9
//Tanggal Pengerjaan : 14 MEI 2023