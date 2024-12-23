package com.samad_talukder.androidcommonutils

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.samad_talukder.androidcommonutils.ui.theme.AndroidCommonUtilsTheme
import com.samad_talukder.androidcommonutils.utils.DialogUtils
import com.samad_talukder.androidcommonutils.utils.VersionUtil

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCommonUtilsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowUtils()
                }
            }
        }
    }

}

@Composable
fun ShowUtils() {
    val context = LocalContext.current
    val activity = LocalContext.current as Activity

    Column {
        Text(text = "appVersionCode: ${VersionUtil.appVersionName(context)}")
        Text(text = "appVersionCode: ${VersionUtil.appVersionCode(context)}")
        Button(onClick = {
            DialogUtils.showAlertDialog(
                activity,
                title = "Test Title",
                message = "Test Message"
            )
        }) {
            Text(text = "Click")
        }
    }
}



