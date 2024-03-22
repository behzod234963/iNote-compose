package coder.bekhzod.presentation.items

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreenItem() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .border(width = 1.dp,color = Color.White)
    ){

    }
}

@Preview
@Composable
private fun PreviewMainScreenItem() {
    MainScreenItem()
}