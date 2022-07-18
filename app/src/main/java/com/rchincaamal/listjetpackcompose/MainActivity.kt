package com.rchincaamal.listjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rchincaamal.listjetpackcompose.ui.theme.ListJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListSample()
        }
    }
}

data class Fruit(val  name: String, val price: Double)

private val fruits = listOf(
    Fruit("Platano", 12.0),
    Fruit("Pera", 12.0),
    Fruit("Sandía", 12.0),
    Fruit("Uva", 12.0),
    Fruit("Melon", 12.0),
    Fruit("Piña", 12.0),
    Fruit("Aguacate", 12.0),
    Fruit("Arándanos", 12.0),
    Fruit("Manzanas", 12.0),
    Fruit("Granadas", 12.0),
    Fruit("Mango", 12.0),
    Fruit("Fresas", 12.0),
    Fruit("Toronja", 12.0),
    Fruit("Guayaba", 12.0),
    Fruit("Papaya", 12.0),
    Fruit("Platano", 12.0),
    Fruit("Pera", 12.0),
    Fruit("Sandía", 12.0),
    Fruit("Uva", 12.0),
    Fruit("Melon", 12.0),
    Fruit("Piña", 12.0),
    Fruit("Aguacate", 12.0),
    Fruit("Arándanos", 12.0),
    Fruit("Manzanas", 12.0),
    Fruit("Granadas", 12.0),
    Fruit("Mango", 12.0),
    Fruit("Fresas", 12.0),
    Fruit("Toronja", 12.0),
    Fruit("Guayaba", 12.0),
    Fruit("Papaya", 12.0),
)

@Composable
fun ListSample() {
    LazyColumn(
        // Le colocamos un padding para todos los lados de la lista
        contentPadding = PaddingValues(16.dp),
        // Le colocamos un espaciado entre los elementos de nuestra lista
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Text(
                text = "Fruit list",
                color = Color.DarkGray,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }

        /*items(fruits) {
            FruitItem(fruit = it)
        }*/
        itemsIndexed(fruits) { index, fruit ->
            FruitItem(fruit = fruit)
        }
    }
}

@Composable
fun FruitItem(fruit: Fruit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = fruit.name,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        )

        Text(
            text = "${fruit.price}.00 MXN",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
                fontStyle = FontStyle.Italic
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListSample()
}