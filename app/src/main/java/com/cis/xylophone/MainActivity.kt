package com.cis.xylophone

import android.media.SoundPool
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.cis.xylophone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val soundPool = SoundPool.Builder().build()
        val do1 = soundPool.load(this, R.raw.do1,1)
        val re = soundPool.load(this, R.raw.re,1)
        val mi = soundPool.load(this, R.raw.mi,1)
        val pa = soundPool.load(this, R.raw.pa,1)
        val sol = soundPool.load(this, R.raw.sol,1)
        val ra = soundPool.load(this, R.raw.ra,1)
        val si = soundPool.load(this, R.raw.si,1)
        val do2 = soundPool.load(this, R.raw.do2,1)

        binding.do1.setOnClickListener {
            soundPool.play(do1, 1.0f, 1.0f, 0,0,1.0f)

            binding.do1.alpha = 0.5f

            binding.do1.postDelayed(Runnable {
                binding.do1.alpha = 1.0f
            }, 200)
        }

        binding.re.setOnClickListener {
            soundPool.play(re, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.re.alpha = 0.5f

            binding.re.postDelayed(Runnable {
                binding.re.alpha = 1.0f
            }, 200)
        }

        binding.mi.setOnClickListener {
            soundPool.play(mi, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.mi.alpha = 0.5f

            binding.mi.postDelayed(Runnable {
                binding.mi.alpha = 1.0f
            }, 200)
        }

        binding.pa.setOnClickListener {
            soundPool.play(pa, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.pa.alpha = 0.5f

            binding.pa.postDelayed(Runnable {
                binding.pa.alpha = 1.0f
            }, 200)
        }

        binding.sol.setOnClickListener {
            soundPool.play(sol, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.sol.alpha = 0.5f

            binding.sol.postDelayed(Runnable {
                binding.sol.alpha = 1.0f
            }, 200)
        }

        binding.ra.setOnClickListener {
            soundPool.play(ra, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.ra.alpha = 0.5f

            binding.ra.postDelayed(Runnable {
                binding.ra.alpha = 1.0f
            }, 200)
        }

        binding.si.setOnClickListener {
            soundPool.play(si, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.si.alpha = 0.5f

            binding.si.postDelayed(Runnable {
                binding.si.alpha = 1.0f
            }, 200)
        }

        binding.do2.setOnClickListener {
            soundPool.play(do2, 1.0f, 1.0f, 0, 0, 1.0f)

            binding.do2.alpha = 0.5f

            binding.do2.postDelayed(Runnable {
                binding.do2.alpha = 1.0f
            }, 200)
        }
    }
}