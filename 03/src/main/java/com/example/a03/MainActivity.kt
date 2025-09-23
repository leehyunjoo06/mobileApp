package com.example.a03


import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a03.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLabTheme {
                Scaffold(
                    containerColor = Color.LightGray
                ) { innerPadding ->
                    HomeScreen(Modifier.padding(innerPadding))
                }
                HomeScreen()
                }
            }
        }
    }

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = "빽다방",
            style = MaterialTheme.typography.headlineLarge)
        Image(
            painter = painterResource(id = R.drawable.paikdabang),
            contentDescription = "Jetpack paikdabang 로고",
            modifier = Modifier
                .size(size = 300.dp)
                .padding(all = 16.dp)
        )
        Text(text = "위치 : 우송대 동문 앞",
        style = MaterialTheme.typography.headlineMedium)

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ComposeLabTheme {
    }
    }