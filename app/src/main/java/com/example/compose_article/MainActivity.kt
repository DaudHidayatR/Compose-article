package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.ComposearticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposearticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun GreetingImage(headerArticle: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Box {
        Column {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
                modifier = modifier
            )
            GreetingText(
                headerArticle = headerArticle,
                paragraph1 = paragraph1,
                paragraph2 = paragraph2,
                modifier = modifier
            )
        }
    }
}



@Composable
fun GreetingText(headerArticle: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center,
        modifier = modifier){
        Text(
            text = headerArticle,
            fontSize = 24.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)

        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposearticleTheme {
        GreetingImage(stringResource(R.string.article_title), stringResource(R.string.article_body1), stringResource(R.string.article_body2))
    }
}