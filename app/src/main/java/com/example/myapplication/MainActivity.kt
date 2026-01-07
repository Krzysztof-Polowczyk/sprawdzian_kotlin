package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.support.v4.os.IResultReceiver2
import android.widget.Button
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                    ExamA(LocalContext.current)
                }
            }
        }
    }







@Composable
fun ExamA(context: Context) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {

            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier.size(40.dp)
            )
            Text(text = "Task Manager", color = Color.Green)
        }
        Spacer(modifier = Modifier.size(10.dp))

        Column(modifier = Modifier.clip(RoundedCornerShape(30.dp)).background(color = Color.Gray).padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
    //
            TextField(
                value = text,
                onValueChange = { text = it },
                label = {
                    Row(){
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                        Spacer(Modifier.size(10.dp))
                        Text("Enter your text")
                    }

                        },
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(30.dp))
            )

            Spacer(Modifier.size(20.dp))


            TextField(
                value = text,
                onValueChange = { text = it },
                label = {
                    Row(){
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                        Spacer(Modifier.size(10.dp))
                        Text("Enter your text")
                    }

                },
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(30.dp))
            )
            Spacer(Modifier.size(10.dp))

            Button(onClick = {
                Toast.makeText(context, "“Task added\n" +
                        "successfully!”.", Toast.LENGTH_LONG).show()
            }, modifier = Modifier.fillMaxWidth(),  colors = ButtonDefaults.buttonColors(containerColor  = Color.Green) ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color.Green
                )
                Spacer(Modifier.size(5.dp))

                Text("Filled", color = Color.Black)
            }



        }
        Spacer(Modifier.size(30.dp))
        Image(painter = painterResource(id = R.drawable.img_empty_tasks), contentDescription = null, modifier = Modifier.size(300.dp))
    }
}
