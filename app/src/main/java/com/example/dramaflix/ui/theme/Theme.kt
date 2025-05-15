package com.example.dramaflix.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.dramaflix.R
import android.os.Build
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight

val Katibeh = FontFamily(Font(R.font.katibeh_regular))
val NotoSans = FontFamily(Font(R.font.notosans_regular))

val AppTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Katibeh,
        fontSize = 50.sp,
        color = Color.White
    ),
    headlineMedium = TextStyle(
        fontFamily = NotoSans,
        fontSize = 28.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    ),
    headlineSmall = TextStyle(
        fontFamily = NotoSans,
        fontSize = 22.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    ),
    bodyLarge = TextStyle(
        fontFamily = NotoSans,
        fontSize = 20.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    ),
    bodyMedium = TextStyle(
        fontFamily = NotoSans,
        fontSize = 18.sp,
        color = Color.LightGray,
        fontWeight = FontWeight.Bold
    ),


)


// Cores
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF8B0000),
    background = Color.Black,
    onPrimary = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF8B0000),
    background = Color.White,
    onPrimary = Color.Black
)

@Composable
fun DramaFlixTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}