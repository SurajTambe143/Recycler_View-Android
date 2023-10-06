package com.example.recyclerviewdemo

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list=ArrayList<ScrollContent>()

        list.add(ScrollContent(R.drawable.man__1_,"Suraj","Hello I'm Suraj"))
        list.add(ScrollContent(R.drawable.man__2_,"Saiyam","Hello I'm Saiyam"))
        list.add(ScrollContent(R.drawable.man__3_,"Anush","Hello I'm Anush"))
        list.add(ScrollContent(R.drawable.man__4_,"Deepak","Hello I'm Deepak"))
        list.add(ScrollContent(R.drawable.woman__1_,"Women 1","Hello I'm women 1"))
        list.add(ScrollContent(R.drawable.woman__2_,"Women 2","Hello I'm women 2"))
        list.add(ScrollContent(R.drawable.woman__3_,"Women 3","Hello I'm women 3"))
        list.add(ScrollContent(R.drawable.woman__4_,"Women 4","Hello I'm women 4"))

        val rv=findViewById<RecyclerView>(R.id.rv_container)
        rv.layoutManager=LinearLayoutManager(parent)
        rv.adapter=ScrollListAdapter(list)
    }
}