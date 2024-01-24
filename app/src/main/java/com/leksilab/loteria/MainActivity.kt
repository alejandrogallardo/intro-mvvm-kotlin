package com.leksilab.loteria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.leksilab.loteria.ui.theme.LoteriaTheme
import com.leksilab.loteria.viewModels.ContadorViewModel
import com.leksilab.loteria.viewModels.LoteriaViewModel
import com.leksilab.loteria.views.Contador
import com.leksilab.loteria.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val viewModel: ContadorViewModel by viewModels()
        val viewModel: LoteriaViewModel by viewModels()
        setContent {
            LoteriaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Contador(viewModel = viewModel)
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}