package com.example.calcu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.calcu.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CLR.setOnClickListener {
            binding.tshow.text = ""
            binding.ans.text = ""
        }

        binding.textView1.setOnClickListener {
            binding.tshow.append("1")

        }
        binding.textView2.setOnClickListener {
            binding.tshow.append("2")
        }
        binding.three3.setOnClickListener {
            binding.tshow.append("3")
        }
        binding.textView4.setOnClickListener {
            binding.tshow.append("4")
        }
        binding.textView5.setOnClickListener {
            binding.tshow.append("5")
        }
        binding.t6.setOnClickListener {
            binding.tshow.append("6")
        }
        binding.textView7.setOnClickListener {
            binding.tshow.append("7")
        }
        binding.textView8.setOnClickListener {
            binding.tshow.append("8")

        }
        binding.three9.setOnClickListener {
            binding.tshow.append("9")
        }
        binding.plus.setOnClickListener {
            binding.tshow.append("+")
        }
        binding.minus.setOnClickListener {
            binding.tshow.append("-")
        }
        binding.mul.setOnClickListener {
            binding.tshow.append("*")
        }
        binding.DIVI.setOnClickListener {
            binding.tshow.append("/")
        }
        binding.dot.setOnClickListener {
            binding.tshow.append(".")
        }
        binding.t0.setOnClickListener {
            binding.tshow.append("0")
        }
        binding.eql.setOnClickListener {
            val expression = ExpressionBuilder(binding.tshow.text.toString()).build()
            val result = expression.evaluate()
            val resultL = result.toLong()
            if (result == resultL.toDouble()) {
                binding.ans.text = resultL.toString()
            } else {
                binding.ans.text = result.toString()
            }

        }

    }
}