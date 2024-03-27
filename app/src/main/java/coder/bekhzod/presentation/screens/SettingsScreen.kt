package coder.bekhzod.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coder.bekhzod.R
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.FONT_AND_BORDER_COLOR
import coder.bekhzod.presentation.utils.constants.IS_DARK
import coder.bekhzod.presentation.utils.constants.THEME_COLOR
import coder.bekhzod.presentation.views.SettingsTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavController) {
    val isExpanded = remember { mutableStateOf(false) }
    val selectedItem = remember { mutableStateOf("") }
    if (IS_DARK){
        selectedItem.value = "Dark"
    }else{
        selectedItem.value = "Light"
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(THEME_COLOR)
    ) {
        SettingsTopAppBar(navController = navController)
        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Theme",
                color = FONT_AND_BORDER_COLOR,
                fontSize = 18.sp,
                fontFamily = FontFamily(fontAmidoneGrotesk)
            )
            ExposedDropdownMenuBox(
                expanded = isExpanded.value,
                onExpandedChange = { isExpanded.value = !isExpanded.value }
            ) {
                OutlinedTextField(
                    enabled = false,
                    modifier = Modifier
                        .width(150.dp)
                        .menuAnchor()
                        .background(THEME_COLOR)
                        .border(width = 1.dp, color = FONT_AND_BORDER_COLOR),
                    textStyle = TextStyle(
                        fontFamily = FontFamily(fontAmidoneGrotesk),
                        fontSize = 18.sp,
                        color = FONT_AND_BORDER_COLOR
                    ),
                    leadingIcon = {
                        Icon(
                            painter = if (selectedItem.value.contains("Dark"))
                                painterResource(id = R.drawable.ic_dark)
                            else painterResource(id = R.drawable.ic_light),
                            contentDescription = "content leading icon",
                            tint = FONT_AND_BORDER_COLOR
                        )
                    },
                    value = selectedItem.value,
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
//                        focusedContainerColor = THEME_COLOR,
//                        unfocusedContainerColor = THEME_COLOR
                    ),
                    readOnly = true,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = isExpanded.value
                        )
                    }
                )
                DropdownMenu(
                    modifier = Modifier
                        .background(THEME_COLOR),
                    expanded = isExpanded.value,
                    onDismissRequest = {
                        isExpanded.value = false
                    }
                ) {
                    DropdownMenuItem(
                        colors = MenuDefaults.itemColors(
                            textColor = FONT_AND_BORDER_COLOR,
                            leadingIconColor = FONT_AND_BORDER_COLOR,
                            trailingIconColor = FONT_AND_BORDER_COLOR,

                        ),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_dark),
                                contentDescription = "dark mode icon",
                                tint = FONT_AND_BORDER_COLOR
                            )
                        },
                        text = {
                            Text(
                                text = "Dark",
                                fontFamily = FontFamily(fontAmidoneGrotesk),
                                fontSize = 18.sp,
                                color = FONT_AND_BORDER_COLOR
                            )
                        },
                        onClick = {
                            selectedItem.value = "Dark"
                            THEME_COLOR = Color.Black
                            FONT_AND_BORDER_COLOR = Color.White
                            IS_DARK = true
                            isExpanded.value = false
                        }
                    )
                    DropdownMenuItem(
                        colors = MenuDefaults.itemColors(
                            textColor = FONT_AND_BORDER_COLOR,
                            leadingIconColor = FONT_AND_BORDER_COLOR,
                            trailingIconColor = FONT_AND_BORDER_COLOR,

                            ),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_light),
                                contentDescription = "light mode icon",
                                tint = FONT_AND_BORDER_COLOR
                            )
                        },
                        text = {
                            Text(
                                text = "Light",
                                fontSize = 18.sp,
                                color = FONT_AND_BORDER_COLOR,
                                fontFamily = FontFamily(fontAmidoneGrotesk)
                            )
                        },
                        onClick = {
                            selectedItem.value = "Light"
                            THEME_COLOR = Color.White
                            FONT_AND_BORDER_COLOR = Color.Black
                            IS_DARK = false
                            isExpanded.value = false
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewSettingsScreen() {
    SettingsScreen(navController = NavController(LocalContext.current))
}