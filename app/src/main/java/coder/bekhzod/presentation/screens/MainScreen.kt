package coder.bekhzod.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.bekhzod.R

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .border(width = 1.dp, color = Color.White)
        ) {

        }
        FloatingActionButton(
            modifier = Modifier
                .align(alignment = Alignment.BottomEnd)
                .padding(end = 30.dp, bottom = 30.dp),
            containerColor = Color.Magenta,
            shape = CircleShape,
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = "mainScreen_buttonAdd",
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}