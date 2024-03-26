package coder.bekhzod.presentation.items

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.behzod.domain.model.NotesModel
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreenItem(notesModel: NotesModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black)
            .border(width = 1.dp, color = Color.White)
    ) {
        Column{
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
//          This is notes title
                Text(
                    text = notesModel.title,
                    color = Color.White,
                    fontSize = 22.sp,
                    fontFamily = FontFamily(fontAmidoneGrotesk)
                )
//          This is notes data added
                Text(
                    text = notesModel.dataAdded,
                    color = Color.Gray,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(fontAmidoneGrotesk)
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
//          This is notes text
                Text(
                    modifier = Modifier
                        .padding(start = 10.dp),
                    text = notesModel.note,
                    color = Color.Gray,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(fontAmidoneGrotesk)
                )
                Column(
                    modifier = Modifier
                        .size(50.dp)
                ) {
                    
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewItems() {
    MainScreenItem(notesModel = NOTES_MODEL_OBJECT)
}