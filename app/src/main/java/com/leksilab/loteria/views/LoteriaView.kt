package com.leksilab.loteria.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leksilab.loteria.viewModels.LoteriaViewModel

@Composable
fun LoteriaView(viewModel: LoteriaViewModel) {
    val lottoNumbers = viewModel.lottoNumbers.value
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (lottoNumbers.isEmpty()) {
            Text(text = "Loteria", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        } else {
            LotteryNumbers(numbers = lottoNumbers)
        }
        Button(onClick = { viewModel.generateLottoNumbers() }) {
            Text(text = "Generar", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}
@Composable
fun LotteryNumbers(numbers: List<Int>) {
    LazyRow(contentPadding = PaddingValues(
        horizontal = 16.dp,
        vertical = 8.dp
    )) {
        items(numbers) { number ->
            Box(
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(48.dp)
                    .background(Color.Red, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(text = number.toString(), color = Color.White, fontSize = 24.sp)
            }
        }
    }
}