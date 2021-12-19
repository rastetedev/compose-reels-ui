package com.rastete.reelsui.reel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.VerticalPager
import com.rastete.reelsui.VideoPlayer
import com.rastete.reelsui.data.DummyData
import com.rastete.reelsui.R

val verticalPadding = 12.dp
val horizontalPadding = 10.dp

@Composable
fun ReelsView() {
    Box(Modifier.background(color = Color.Black)) {
        ReelsList()
        ReelsHeader()
    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun ReelsList() {
    val reels = DummyData.reels

    VerticalPager(count = reels.size) { page ->
        Box(Modifier.fillMaxSize()) {
            VideoPlayer(uri = reels[page].getVideoUrl())
            Column(Modifier.align(Alignment.BottomStart)) {
                ReelFooter(reels[page])
                Divider()
            }
        }
    }
}

@Composable
fun ReelsHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = horizontalPadding,
                vertical = verticalPadding
            ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Reels", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 21.sp)
        Icon(
            bitmap = ImageBitmap.imageResource(id = R.drawable.ic_outlined_camera),
            tint = Color.White,
            modifier = Modifier.size(24.dp),
            contentDescription = null
        )
    }
}







