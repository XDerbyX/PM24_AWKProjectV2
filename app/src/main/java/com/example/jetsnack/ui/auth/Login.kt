package com.example.jetsnack.ui.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.jetsnack.ui.theme.JetsnackTheme
import com.example.jetsnack.ui.components.JetsnackSurface

@Composable
fun Login(onLoginSuccess: () -> Unit) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    JetsnackSurface(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            // Title
            Text(
                text = "Log In",
                style = MaterialTheme.typography.headlineLarge,
                color = JetsnackTheme.colors.textPrimary,
                modifier = Modifier.padding(bottom = 40.dp)
            )

            // Username Input Field
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Username") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = JetsnackTheme.colors.textPrimary,
                    unfocusedTextColor = JetsnackTheme.colors.textPrimary,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = JetsnackTheme.colors.brand,
                    unfocusedIndicatorColor = JetsnackTheme.colors.uiBorder,
                    focusedLabelColor = JetsnackTheme.colors.textInteractive,
                    unfocusedLabelColor = JetsnackTheme.colors.textSecondary
                ),
                shape = MaterialTheme.shapes.medium,
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Password Input Field
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = JetsnackTheme.colors.textPrimary,
                    unfocusedTextColor = JetsnackTheme.colors.textPrimary,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = JetsnackTheme.colors.brand,
                    unfocusedIndicatorColor = JetsnackTheme.colors.uiBorder,
                    focusedLabelColor = JetsnackTheme.colors.textInteractive,
                    unfocusedLabelColor = JetsnackTheme.colors.textSecondary
                ),
                shape = MaterialTheme.shapes.medium,
                singleLine = true
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Login Button
            Button(
                onClick = { onLoginSuccess() },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = JetsnackTheme.colors.brand,
                    contentColor = Color.White
                ),
                shape = MaterialTheme.shapes.medium
            ) {
                Text("Log In", style = MaterialTheme.typography.bodyLarge)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Sign Up Text (optional)
            TextButton(
                onClick = { /* Navigate to sign up screen or show dialog */ },
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Text("Don't have an account? Sign Up", color = JetsnackTheme.colors.textLink)
                }
            )
        }
    }
}
