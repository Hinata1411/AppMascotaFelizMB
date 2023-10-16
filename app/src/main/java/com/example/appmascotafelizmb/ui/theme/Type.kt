package com.example.appmascotafelizmb.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.appmascotafelizmb.R

// Set of Material typography styles to start with
//Creamos una variable que contendrá todas las fuentes tipo FontFamily
private val spacegrotesk = FontFamily(
    Font(R.font.spacegroteskbold, FontWeight.Bold),
    Font(R.font.spacegroteskregular, FontWeight.Normal),
    Font(R.font.spacegroteskmedium, FontWeight.Medium),
    Font(R.font.spacegrotesklight, FontWeight.ExtraLight),
    Font(R.font.spacegrotesksemibold, FontWeight.SemiBold)
)
val Typography = Typography(
//Agregamos un tipo para títulos, otro para el cuerpo y uno opcional
    titleLarge= TextStyle(
        fontFamily = spacegrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spacegrotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)