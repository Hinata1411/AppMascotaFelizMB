package com.example.appmascotafelizmb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmascotafelizmb.ui.theme.AppMascotaFelizMBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMascotaFelizMBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos(){
    Column {
        Column(
            //Centrar los textos vertical y horizontal, para que utilice
            //el espacio disponible
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(painter = painterResource(id = R.drawable.perrito),
                contentDescription = "perrito")
            Text(text = "Mascota Feliz",
                color = Color.Magenta,
                fontSize = 48.sp)
            Text(text = "Bienvenido, usuario")
            Row{
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text("Tu Mascota",
                        color = Color(0xFFBF71EE))
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text("Contenidos",
                        color = Color(0xFFBF71EE))
                }

            }
        }
    }
}



