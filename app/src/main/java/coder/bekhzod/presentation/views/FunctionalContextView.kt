package coder.bekhzod.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.events.PassDataEvents


@Composable
fun FunctionalContextView(
    checkedItemsEvent: PassDataEvents.CheckedItems,
    isSelectedStatus: PassDataEvents.IsSelectedStatus
    ) {
    val checkedItems = remember { mutableListOf(checkedItemsEvent.checkedItems) }
    val isExpanded = remember { mutableStateOf(false) }
    val isSelected = remember{ mutableStateOf(isSelectedStatus.isSelected) }
    val selectAll = remember{ mutableStateOf(PassDataEvents.SelectAll(selectAll = false)) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { isSelected.value = false }) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "button close")
            }
            Text(
                text = "Selected : ${checkedItems.size}",
                fontSize = 25.sp,
                color = Color.White,
                fontFamily = FontFamily(fontAmidoneGrotesk)
            )
            IconButton(onClick = { isExpanded.value = true }) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "more options")
                DropdownMenu(
                    modifier = Modifier.background(Color.Black),
                    expanded = isExpanded.value,
                    onDismissRequest = { isExpanded.value = false }) {
                    DropdownMenuItem(
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "delete",
                                tint = Color.White
                            )
                        },
                        text = {
                            Text(
                                text = "Delete",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontFamily = FontFamily(
                                    fontAmidoneGrotesk
                                )
                            )
                        },
                        onClick = { /*TODO*/ }
                    )
                    DropdownMenuItem(
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = "select all",
                                tint = Color.White
                            )
                        },
                        text = {
                            Text(
                                text = "Select all",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontFamily = FontFamily(
                                    fontAmidoneGrotesk
                                )
                            )
                        },
                        onClick = {
                            selectAll.value = PassDataEvents.SelectAll(selectAll = true)
                        }
                    )
                }
            }
        }
    }
}

//@Preview
//@Composable
//private fun PreviewFunctionalContextView() {
//    FunctionalContextView(NOTES_MODEL_OBJECT)
//}