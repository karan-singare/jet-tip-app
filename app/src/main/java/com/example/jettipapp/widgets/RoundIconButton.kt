package com.example.jettipapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val IconButtonSizeModifier = Modifier.size(20.dp)

@Composable
fun RoundIconButton(
  modifier: Modifier = Modifier,
  imageVector: ImageVector,
  onClick: () -> Unit,
  tint: Color = Color.Black.copy(alpha = 0.8f),
) {
  Card(modifier = modifier
    .padding(all = 4.dp)
    .clickable { onClick.invoke() }
    .then(IconButtonSizeModifier),
    shape = CircleShape,

  ) {
    Icon(imageVector = imageVector, contentDescription = "Plus or minus icon", tint = tint, modifier = IconButtonSizeModifier)
  }
}