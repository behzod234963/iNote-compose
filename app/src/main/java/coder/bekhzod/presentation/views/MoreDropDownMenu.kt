package coder.bekhzod.presentation.views

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreDropDownMenu(
    onEditClick:() -> Unit ,
    onClick: () -> Unit,
    onDeleteClick: () -> Unit,
) {

    onClick.invoke()
    onEditClick.invoke()
    onDeleteClick.invoke()
}

@Preview
@Composable
private fun PreviewMoreDDM() {
    MoreDropDownMenu(onEditClick = { /*TODO*/ }, onClick = { /*TODO*/ }, onDeleteClick = { TODO() })
}