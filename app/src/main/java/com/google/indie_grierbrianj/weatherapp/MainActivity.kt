package com.google.indie_grierbrianj.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.indie_grierbrianj.weatherapp.ui.theme.WeatherAppTheme
import android.util.Log


class MainActivity : ComponentActivity() {

    private
    val intentName: String = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
        // getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
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