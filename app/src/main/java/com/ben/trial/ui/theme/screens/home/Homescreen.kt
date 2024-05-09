package com.ben.trial.ui.theme.screens.home

import android.Manifest
import android.app.Activity
import android.net.Uri
import android.content.Intent
import android.content.pm.PackageManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import com.ben.trial.navigation.ROUTE_CATER
import com.ben.trial.navigation.ROUTE_PA
import com.ben.trial.navigation.ROUTE_REGISTER
import com.ben.trial.navigation.ROUTE_TENT

@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current

        Text(
            text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_PA)

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "P.A Systems")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_CATER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Catering Packages")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_TENT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Tents Setup")
        }
    }
}