package coder.bekhzod.presentation.views

import android.app.LocaleConfig
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreDropDownMenu(
    onEditClick: () -> Unit,
    onSettingsClick:  () -> Unit,
    onDeleteClick:  () -> Unit,
) {
    val functionsList = mutableListOf("Edit", "Delete", "Settings")
    val isExpanded = remember { mutableStateOf(false) }
    val isSelected = remember { false }
    var selectedItem = remember { functionsList[0] }
    ExposedDropdownMenuBox(
        modifier = Modifier
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
        expanded = isExpanded.value,
        onExpandedChange = { isExpanded.value = !isExpanded.value }
    ) {
        OutlinedTextField(
            enabled = true,
            readOnly = true,
            textStyle = TextStyle(fontSize = 20.sp, color = Color.Black),
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded.value) },
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
            value = selectedItem,
            onValueChange = {}
        )
        ExposedDropdownMenu(
            expanded = isExpanded.value,
            onDismissRequest = { isExpanded.value = false }
        ) {
            for (i in functionsList.indices){
                DropdownMenuItem(
                    text = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.weight(1f),
                                text = functionsList[i]
                            )
                        }
                    },
                    onClick = {
                        if (functionsList[i].contains("Edit")){
                            onEditClick()
                        }else if (functionsList[i].contains("Delete")){
                            onDeleteClick()
                        }else if (functionsList[i].contains("Settings")){
                            onSettingsClick.invoke()
                        }
                        isExpanded.value = false
                        selectedItem = i.toString()
                    }
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewMoreDDM() {
    val ctx = LocalContext.current.applicationContext
    MoreDropDownMenu(
        onEditClick = { Toast.makeText(ctx, "Edit is Clicked", Toast.LENGTH_SHORT).show() },
        onSettingsClick = { Toast.makeText(ctx, "Settings is Clicked", Toast.LENGTH_SHORT).show() },
        onDeleteClick = { Toast.makeText(ctx, "Delete is Clicked", Toast.LENGTH_SHORT).show() }
    )
}