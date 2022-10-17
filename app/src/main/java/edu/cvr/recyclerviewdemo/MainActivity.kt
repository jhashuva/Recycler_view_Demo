package edu.cvr.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vkohili = Person("Virat Kohili","Indian Cricket Player",R.drawable.virat)
        var rsharma = Person("Rohith Sharma","Indian Cricket Team Captian",R.drawable.rohit)
        var smandanna = Person("Smriti Mandana", "Indian Womens Cricket Team ",R.drawable.smriti)
        var lPaes = Person("Leander Paes","Indian Tennis Player",R.drawable.lpaes)
        var msd = Person("MS Dhoni","Indian Cricket Player",R.drawable.msd)
        var sindhu = Person("PV Sindhu","Indian Badminton Player",R.drawable.sindhu)
        var vijay = Person("Smriti Mandana", "Indian Womens Cricket Team ",R.drawable.smriti)
        var aa = Person("Leander Paes","Indian Tennis Player",R.drawable.lpaes)

        var l:ArrayList<Person>?= null
        l!!.add(vkohili)
        l.add(rsharma)
        l.add(smandanna)
        l.add(lPaes)
        l.add(msd)
        l.add(sindhu)
        l.add(vijay)
        l.add(aa)

        var rv = findViewById<RecyclerView>(R.id.rv)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter(l)



    }
}