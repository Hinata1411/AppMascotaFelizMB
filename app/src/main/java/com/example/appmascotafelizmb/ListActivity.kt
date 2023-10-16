package com.example.appmascotafelizmb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appmascotafelizmb.ui.theme.AppMascotaFelizMBTheme


class ListActivity : ComponentActivity() {
    //Agregamos una constante que contenga una lista con los atributos que colocaremos
    //en la nueva pantalla
    val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentación",
        "Belleza",
        "Salud",
        "Noticias"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMascotaFelizMBTheme(true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla(datos)
                }
            }
        }
    }
}

@Composable
fun Pantalla(datos: List<String>){
    //Agregamos una barra de desplazamiento para poder ver todos los elementos
    LazyColumn(
        //Ajustamos los elementos y le colocamos un margen
        contentPadding = PaddingValues(all = 20.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)

    ){
        //Función items para agregar los elementos de la lista creada anteriormente
        items(datos){
        //Función para que se muestre uno por uno los elementos de la lista
            item -> ListItemRow(item)
         }
    }
}

@Composable
fun ListItemRow(item: String) {
    //Agregamos un caja o box para que contenga el valor de cada elemento de la lista
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.small)
            .background(color = MaterialTheme.colorScheme.secondary)
            .padding(horizontal = 16.dp, vertical = 10.dp)

    ){
        //Incluimos un botón con un Row
        Row{
            Text(//Modificamos para que el botón quede en la derecha
                modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
                //Agregamos los elementos que ya tenemos con el estilo que queramos
                text = item,
                //Extra para cambiar color del texto
                color = Color(0xFFA782C3),
                fontWeight = FontWeight.ExtraBold,
                //Cambiamos el estilo de la letra
                style = MaterialTheme.typography.bodyLarge
            )
            OutlinedButton(
                onClick = { /*TODO*/ },
            ) {
                Text(text = "Más...",
                    //Extra cambiamos el color del texto
                    color = Color(0xFFA782C3),
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaPreview() {
    val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentación",
        "Belleza",
        "Reproducción",
        "Salud",
        "Noticias"
    )
    AppMascotaFelizMBTheme(false) {
        Pantalla(datos)
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppMascotaFelizMBTheme(false) {

    }
}