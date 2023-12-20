package com.example.myapp

import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.MyAppTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Bhima Pavan Teja","Android Developer")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String,sub: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.screenshot_20231016_162724_one_ui_home)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            //alpha = 0.8F
        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        val profile = painterResource(R.drawable.android_logo)
        Box(
            modifier = Modifier
                .padding(
                    start = 50.dp,
                    top = 50.dp,
                    end = 50.dp,
                    bottom = 50.dp
                )
                .background(Color.Black),
        ) {
            Image(
                painter = profile,
                contentDescription = null
            )
        }
        Surface(
            color = Color.Black,
            modifier = modifier
                .border(width = 5.dp, color = Color.Green, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
        ) {
            Column(modifier = Modifier.padding(15.dp)) {
                Text(
                    text = name,
                    color = Color.Green,
                    fontSize = 35.sp,
                    lineHeight = 70.sp,
                    textAlign = TextAlign.Center
                )
                Text (
                    text = sub,
                    color = Color.White,
                    fontSize = 25.sp,
                    lineHeight = 50.sp,
                    modifier = Modifier.align(alignment = Alignment.End)
                )
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppTheme {
        Greeting("Android","hello")
    }
}