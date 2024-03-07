package com.example.lemontree

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemontree.ui.theme.LemonTreeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonTreeTheme {
                LemonTreeApp()
            }
        }
    }
}

@Preview
@Composable
fun LemonTreeApp(){
    LemonTreeProgress(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
}

@Composable
fun LemonTreeProgress(modifier : Modifier = Modifier){
    var result by remember{ mutableStateOf(1)}
    var image = when(result){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    Column(
        modifier = modifier
    ){
        Button(onClick = { result += 1 }) {
            Image(painter = painterResource(id = image), contentDescription = "Lemon" )
        }
        Spacer(Modifier.height(16.dp))

    }

}
@Composable
fun LemonTreeImageAndText(modifier : Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}