package coder.bekhzod.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FilterTypeView() {
    val radioButtonAState = remember { mutableStateOf(false) }
    val radioButtonZState = remember { mutableStateOf(false) }
    val radioButtonAscendingState = remember{ mutableStateOf(false) }
    val radioButtonDescendingState = remember{ mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black)
            .border(width = 1.dp, color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.50f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxHeight(0.50f),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                RadioButton(
                    modifier = Modifier
                        .padding(end = 5.dp),
                    selected = radioButtonAState.value,
                    onClick = {
                        radioButtonAState.value = !radioButtonAState.value
                        if (radioButtonAState.value){
                            radioButtonZState.value = false
                        }
                    },
                    colors = RadioButtonDefaults.colors(
                        Color.Magenta
                    )
                )
                RadioButton(
                    modifier = Modifier
                        .padding(start = 5.dp),
                    selected = radioButtonZState.value,
                    onClick = {
                        radioButtonZState.value = !radioButtonZState.value
                        if (radioButtonZState.value){
                            radioButtonAState.value = false
                        }
                    },
                    colors = RadioButtonDefaults.colors(
                        Color.Magenta
                    )
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    modifier = Modifier
                        .padding(start = 35.dp),
                    text = "A",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600)
                )
                Text(
                    modifier = Modifier
                        .padding(end = 35.dp),
                    text = "Z",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxHeight(0.50f)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                RadioButton(
                    selected = radioButtonAscendingState.value,
                    colors = RadioButtonDefaults.colors(
                        Color.Magenta
                    ),
                    onClick = {
                        radioButtonAscendingState.value = !radioButtonAscendingState.value
                        if (radioButtonAscendingState.value){
                            radioButtonDescendingState.value = false
                        }
                    }
                )
                RadioButton(
                    selected = radioButtonDescendingState.value,
                    colors = RadioButtonDefaults.colors(
                        Color.Magenta
                    ),
                    onClick = {
                        radioButtonDescendingState.value = !radioButtonDescendingState.value
                        if (radioButtonDescendingState.value){
                            radioButtonAscendingState.value = false
                        }
                    }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = "Ascending",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight(600)
                )
                Text(
                    text = "Descending",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight(600)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewFilterTypeView() {
    FilterTypeView()
}