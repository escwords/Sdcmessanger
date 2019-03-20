package com.example.sdcproject

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pager_signing.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
displayDialog()

        dialogBtn.setOnClickListener{
            displayDialog()
        }
    }

fun displayDialog(){

    val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
    val prev = supportFragmentManager.findFragmentByTag("dialog")
    if(prev != null ){
        ft.remove(prev)
    }
    ft.addToBackStack(null)
    // Create Dialog
    val tabbedDialog = TabbedDialog()
    tabbedDialog.show(ft,"dialog")
}

}
