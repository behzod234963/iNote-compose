package coder.bekhzod.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coder.bekhzod.R
import coder.bekhzod.presentation.items.MainScreenItem
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import coder.bekhzod.presentation.views.MainTopAppBar

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
            MainTopAppBar()
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                item { 
                    MainScreenItem(notesModel = NOTES_MODEL_OBJECT)
                }
            }
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