package coder.bekhzod.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coder.bekhzod.R
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.PassDataEvents

@Composable
fun MainTopAppBar() {
    val isOpened = remember{
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(if (isOpened.value) 120.dp else 60.dp)
            .background(Color.Black)
            .border(color = Color.White, width = 1.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(top = 10.dp, start = 5.dp, end = 5.dp),
            contentAlignment = Alignment.TopStart
        ) {
            AnimatedDropDownMenu {event->
                when(event){
                    is PassDataEvents.PassStatus->{
                        isOpened.value = event.status
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        FilterTypeView()
                    }
                }
            }
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            contentAlignment = Alignment.TopCenter
        ){
            Text(
                text = "iNote",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight(600),
                fontFamily = FontFamily(fontAmidoneGrotesk)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.TopEnd
        ){
            IconButton(
                onClick = {

                }
            ) {
               Icon(
                   painter = painterResource(
                   id = R.drawable.ic_more),
                   tint = Color.White,
                   contentDescription = "icon more settings"
               )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewMainTopAppBar() {
    MainTopAppBar()
}