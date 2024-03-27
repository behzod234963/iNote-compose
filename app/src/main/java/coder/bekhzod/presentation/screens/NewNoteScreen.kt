package coder.bekhzod.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coder.behzod.domain.model.NotesModel
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import coder.bekhzod.presentation.utils.constants.THEME_COLOR
import coder.bekhzod.presentation.views.FunctionalTopAppBar
import java.text.SimpleDateFormat
import java.util.Date

@SuppressLint("SimpleDateFormat")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewNoteScreen(navController: NavController,notesModel: NotesModel?) {
    val newNote = remember { mutableStateOf("") }
    val newTitle = remember { mutableStateOf("") }
    val simpleDataFormat = SimpleDateFormat("'dd-MM-yyyy'")
    val currentData = simpleDataFormat.format(Date())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(THEME_COLOR)
    ) {
        FunctionalTopAppBar(
            onSave = {
//                this will save notes in database
            },
            onShare = {
                if(newTitle.value.isNotEmpty() && newNote.value.isNotEmpty()){

                }
            }
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp)
        ) {
            OutlinedTextField(
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(color = Color.White, width = 2.dp)
                    .background(Color.Black),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Black,
                    unfocusedContainerColor = Color.Black
                ),
                textStyle = TextStyle(
                    color = Color.White,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(fontAmidoneGrotesk)
                ),
                value = newTitle.value,
                onValueChange = {
                    newTitle.value = it
                },
                placeholder = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "Title",
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Gray,
                        fontFamily = FontFamily(fontAmidoneGrotesk)
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp)
                    .border(width = 2.dp, color = Color.White),
                value = newNote.value,
                onValueChange = {
                    newNote.value = it
                },
                textStyle = TextStyle(
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(fontAmidoneGrotesk),
                    textAlign = TextAlign.Start
                ),
                placeholder = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "Note",
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp,
                        color = Color.Gray,
                        fontFamily = FontFamily(fontAmidoneGrotesk)
                    )
                }
            )
        }
    }
}

@Preview
@Composable
private fun PreviewNewNoteScreen() {
    NewNoteScreen(navController = NavController(LocalContext.current), NOTES_MODEL_OBJECT)
}