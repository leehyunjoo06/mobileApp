package com.example.taewonyapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// TaewonyTheme 대신 ComposeLabTheme를 사용합니다.
import com.example.composelab.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLabTheme {
                HomeScreen()
            }
        }
    }
}

data class Message(val name: String, val msg: String)
data class Profile(val name: String, val intro: String)

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // 이제 MessageCard와 ProfileCard가 정의되었으므로 주석을 해제합니다.
            MessageCard(Message("Android", "Jetpack Compose"))
            ProfileCard(Profile("김태원", "안드로이드 앱 개발자"))
        }
    }
}

// 메시지를 보여주는 간단한 컴포넌트
@Composable
fun MessageCard(msg: Message) {
    Column {
        Text(text = "이름: ${msg.name}")
        Text(text = "메시지: ${msg.msg}")
    }
}

// 프로필을 보여주는 간단한 컴포넌트
@Composable
fun ProfileCard(profile: Profile) {
    Column {
        Text(text = "이름: ${profile.name}")
        Text(text = "자기소개: ${profile.intro}")
    }
}

@Preview(
    name = "Message Card Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun PreviewMessageCard() {
    ComposeLabTheme {
        MessageCard(Message(name = "Android", msg = "Jetpack Compose"))
    }
}

@Preview(
    name = "Profile Card Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun PreviewProfileCard() {
    ComposeLabTheme {
        ProfileCard(Profile(name = "김태원", intro = "앱 만들어 대박 난다."))
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    ComposeLabTheme {
        HomeScreen()
    }
}