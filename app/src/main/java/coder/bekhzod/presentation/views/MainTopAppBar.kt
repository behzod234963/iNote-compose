package coder.bekhzod.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.bekhzod.R
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar() {
    TopAppBar(
        modifier = Modifier
            .background(Color.Black)
            .border(color = Color.White, width = 1.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black
        ),
        title = {
            Text(
                text = "iNote",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight(700),
                fontFamily = FontFamily(fontAmidoneGrotesk)
            )
        },
        actions = {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_filter),
                    contentDescription = "button filter",
                    tint = Color.White
                )
            }
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_more),
                    contentDescription = "button more",
                    tint = Color.White
                )
            }
        }
    )
}

@Preview
@Composable
fun PreviewNoteAppBar() {
    MainTopAppBar()
}