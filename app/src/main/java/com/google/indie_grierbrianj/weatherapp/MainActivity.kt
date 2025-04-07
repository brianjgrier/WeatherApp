package com.google.indie_grierbrianj.weatherapp

import android.content.Intent
import android.graphics.Insets
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.util.Size
import android.view.DisplayCutout
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowInsetsCompat
import com.google.indie_grierbrianj.weatherapp.ui.theme.WeatherAppTheme


class MainActivity : ComponentActivity() {

    private
    val intentName: String = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        window.decorView.setOnApplyWindowInsetsListener { view, insets ->
            val displayCutout = insets.displayCutout


            Log.i(intentName, "displayCutout: $displayCutout")
            if (displayCutout != null) {
                val safeInsetTop = displayCutout.safeInsetTop
                val safeInsetBottom = displayCutout.safeInsetBottom
                val safeInsetLeft = displayCutout.safeInsetLeft
                val safeInsetRight = displayCutout.safeInsetRight

                // Log or use the cutout insets as needed
               Log.i(intentName,"Safe Insets - Top: $safeInsetTop, Bottom: $safeInsetBottom, Left: $safeInsetLeft, Right: $safeInsetRight")
            }
            insets
        }

        Log.i(intentName, "onCreate")

        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i(intentName, "onStart")

    }

    override fun onStop() {
        super.onStop()

        Log.i(intentName, "onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(intentName, "onRestart")
    }

    override fun onPause() {
        super.onPause()

        Log.i(intentName, "onPause")
        //
        // Make sure the keyboard is hidden when the app is paused
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        //
        // Also close any open dialog boxes as they will crash the app when it is recreated
        // if (dialog != null) {
        //    dialog.dismiss();
    }

    override fun onResume() {
        super.onResume()

        Log.i(intentName, "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(intentName, "onDestroy")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        Log.i(intentName, "onNewIntent")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        Log.i(intentName, "onAttachedToWindow")

        //
        // put your code for inset and cutouts here
        //
    }
    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.i(intentName, "onDetachedFromWindow")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        Greeting("Android")
    }
}