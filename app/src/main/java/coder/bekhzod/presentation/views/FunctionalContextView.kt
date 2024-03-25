package coder.bekhzod.presentation.views

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.behzod.domain.model.NotesModel
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import coder.bekhzod.presentation.utils.events.PassDataEvents


@Composable
fun FunctionalContextView(model:NotesModel,events: PassDataEvents.CheckedItems) {
    val checkedItems = remember { mutableListOf(events) }
    val isExpanded = remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row (
            modifier = Modifier.fillMaxSize()
        ){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "button close")
            }
            Text(
                text = "Selected : ${checkedItems.size}",
                fontSize = 25.sp,
                color = Color.White,
                fontFamily = FontFamily(fontAmidoneGrotesk)
            )
            IconButton(onClick = { /*TODO*/ }) {

            }
        }
    }
}

//@Preview
//@Composable
//private fun PreviewFunctionalContextView() {
//    FunctionalContextView(NOTES_MODEL_OBJECT)
//}