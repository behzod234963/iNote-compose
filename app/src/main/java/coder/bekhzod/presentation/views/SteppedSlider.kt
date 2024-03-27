package coder.bekhzod.presentation.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SteppedSlider(
) {
    val state = remember { mutableFloatStateOf(0f) }
    Slider(
        value = state.floatValue,
        onValueChange = {
            state.floatValue = it
        },
        modifier = Modifier
            .padding(horizontal = 10.dp),
        valueRange = 0f..2f,
        steps = 2
    )
}

@Preview
@Composable
private fun PreviewSteppedSlider() {
    SteppedSlider()
}