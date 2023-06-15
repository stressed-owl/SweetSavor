package com.delusional_bear.dessertmaniac.ui.elements.other

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.delusional_bear.dessertmaniac.R

@Composable
fun UserAvatar(
    @DrawableRes avatar: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Image(
        painter = painterResource(id = avatar),
        contentDescription = stringResource(id = R.string.user_avatar),
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(30.dp))
            .clickable { onClick() },
        contentScale = ContentScale.Crop,
    )
}