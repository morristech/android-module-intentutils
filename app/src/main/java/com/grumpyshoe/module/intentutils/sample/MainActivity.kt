package com.grumpyshoe.module.intentutils.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.grumpyshoe.module.intentutils.model.NoAppAvailable
import com.grumpyshoe.module.intentutils.open
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.type = "message/rfc822"
            i.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@example.com"))
            i.putExtra(Intent.EXTRA_SUBJECT, "subject of email")
            i.putExtra(Intent.EXTRA_TEXT, "body of email")

            // by using default values (if strings not overwritten)
            i.open(this)

//          // customized message
//          i.open(this, NoAppAvailable(message ="Custom Message Text"))

        }

    }

}
