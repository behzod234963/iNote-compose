package coder.bekhzod.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coder.behzod.domain.model.NotesModel
import coder.bekhzod.R
import coder.bekhzod.presentation.items.MainScreenItem
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import coder.bekhzod.presentation.utils.events.PassDataEvents
import coder.bekhzod.presentation.views.FunctionalContextView
import coder.bekhzod.presentation.views.MainTopAppBar
import coder.bekhzod.presentation.views.SwipeToDeleteContainer

@Composable
fun MainScreen(
    navController: NavController,
    notesModel: NotesModel,
) {
    val isSelected = remember { mutableStateOf(false) }
    val notesList = remember{
        mutableListOf(
            NOTES_MODEL_OBJECT,
            NOTES_MODEL_OBJECT,
            NOTES_MODEL_OBJECT,
            NOTES_MODEL_OBJECT,
            NOTES_MODEL_OBJECT,
        )
    }
    val objects = remember { mutableStateOf(notesModel.isChecked) }
    val checkedItems = remember { mutableListOf(notesModel.isChecked) }
    if (objects.value) {
        checkedItems.add(objects.value)
    }
    val checkedItemsStatus = PassDataEvents.CheckedItems(checkedItems)
    val isSelectedStatus = PassDataEvents.IsSelectedStatus(isSelected.value)
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
            if (!isSelected.value) {
                MainTopAppBar(navController)
            } else {
                FunctionalContextView(checkedItemsStatus, isSelectedStatus)
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(items = notesList) {index,item->
                    SwipeToDeleteContainer(item = item, onDelete = {
                        notesList.remove(it)
                        notesList.addAll(notesList)
                    }) {
                        MainScreenItem(notesModel = it)
                    }
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