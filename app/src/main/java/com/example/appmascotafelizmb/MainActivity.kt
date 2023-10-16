package com.example.appmascotafelizmb

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appmascotafelizmb.ui.theme.AppMascotaFelizMBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMascotaFelizMBTheme(true) {
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
    //Creamos una constante llamada mContext para agregar un nuevo Activity
    val mContext = LocalContext.current
    Column {
        Column(
            //Centrar los textos vertical y horizontal, para que utilice
            //el espacio disponible
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Box(modifier = Modifier
                .clip(shape = MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.secondary)
                .border(4.dp, MaterialTheme.colorScheme.primary))
            {
                Image(painter = painterResource(id = R.drawable.perrito),
                    contentDescription = "perrito",
                    modifier = Modifier
                        .padding(20.dp))

            }
            Text(text = "Mascota Feliz",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleLarge
                )
            Text(text = "Bienvenido usuario",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.bodyMedium
                )
            Spacer(modifier = Modifier.height(10.dp))
            Row{
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text("Tu Mascota",
                        color = Color(0xFFBF71EE),
                        style = MaterialTheme.typography.bodyLarge)
                }
                Spacer(modifier = Modifier.width(10.dp))
                OutlinedButton(
                    onClick = {
                       //Llamamos a la constante creada para una nueva Activity y llamarla en la app
                     mContext.startActivity(Intent(mContext, ListActivity::class.java))
                    }
                    )
                {
                    Text("Contenidos",
                        color = Color(0xFFBF71EE),
                        style = MaterialTheme.typography.bodyLarge)
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewElementos(){
    AppMascotaFelizMBTheme(false) {
        Elementos()
    }
}


