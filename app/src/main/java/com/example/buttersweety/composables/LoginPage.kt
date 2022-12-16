package com.example.buttersweety.composables

import android.content.Intent
import android.graphics.drawable.Icon
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.buttersweety.*
import com.example.buttersweety.R
import com.example.buttersweety.ui.theme.whiteBackground
import kotlinx.coroutines.delay

@Preview(showBackground = true)
@Composable
fun DefaultPreview()
{
    ListListScopeSample()
}



@Preview(showBackground = true)
@Composable
fun LazyRow() {


}


//login
//@Composable
//fun LoginPage(){
//
//
//    val emailValue = remember { mutableStateOf("") }
//    val passwordValue = remember { mutableStateOf("") }
//
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colors.background
//    ) {
//        Column(modifier = Modifier
//            .width(300.dp)
//            .height(400.dp), horizontalAlignment = Alignment.CenterHorizontally) {
//            Image(
//                modifier = Modifier
//                    .width(300.dp)
//                    .height(400.dp),
//                painter = painterResource(id = R.drawable.logooo),
//                contentDescription = "Photo ThinkPad T480",
//            )
//
//
//            Column(
//                modifier = Modifier.padding(
//                    start = 55.dp,
//                    top = 8.dp,
//                    end = 16.dp
//                ), horizontalAlignment = Alignment.CenterHorizontally
//
//                 ){
//                    Box(Modifier
//                        .height(60.dp)
//                        .width(200.dp).background(Color.White)
//                    ){
//                        var text by remember { mutableStateOf(TextFieldValue("")) }
//                        TextField(
//                            value = text,
//                            onValueChange = {
//                                text = it
//                            },
//                            label = { Text(text = "Email") },
//                            placeholder = { Text(text = "Masukkan email") }
//                        )
//                    }
//
//
//                }
//
//            Column(
//                modifier = Modifier.padding(
//                    start = 55.dp,
//                    top = 20.dp,
//                    end = 16.dp
//                ), horizontalAlignment = Alignment.CenterHorizontally
//
//            ){
//                Box(Modifier
//                    .height(60.dp)
//                    .fillMaxWidth().background(Color.White),
//
//                ){
//                    var text by remember { mutableStateOf(TextFieldValue("")) }
//                    TextField(
//                        value = text,
//                        onValueChange = {
//                            text = it
//                        },
//                        label = { Text(text = "Password") },
//                        placeholder = { Text(text = "Masukkan password") }
//                    )
//                }
//
//
//            }
//
//            Column(
//                modifier = Modifier.padding(
//                    start = 16.dp,
//                    top = 10.dp,
//                    end = 16.dp
//                ), horizontalAlignment = Alignment.CenterHorizontally
//
//            ){
//
//
//
//
//            }
//
//
//
//
//
//
//            Column(
//                modifier = Modifier.padding(
//                    start = 16.dp,
//                    top = 10.dp,
//                    end = 16.dp
//                ), horizontalAlignment = Alignment.CenterHorizontally
//
//            ) {
//                Text(text = "Sign Up Here", color=Color.Blue)
//
//            }
//
//
//
//
//
//        }
//    }
//
//
//}


//SplashScreen

//@Composable
//fun SplashScreen() {
//
//
//   LaunchedEffect(key1 = true) {
//      delay(4000)
//      navController.navigate(Screen.LoginScreen.route) {
//         popUpTo(Screen.LoginScreen.route) {
//            inclusive = true
//         }
//      }
//   }
//
//   Column(
//      modifier = Modifier
//         .width(300.dp)
//         .height(400.dp), horizontalAlignment = Alignment.CenterHorizontally
//   ) {
//      Image(
//         modifier = Modifier
//            .width(300.dp)
//            .height(400.dp),
//         painter = painterResource(id = R.drawable.logooo),
//         contentDescription = "Photo ThinkPad T480",
//      )
//   }
//}

@Composable
fun ListListScopeSample(){
    LazyColumn(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
//        LazyRow(
//            horizontalArrangement = Arrangement.spacedBy(8.dp)
//        ) {
//            items(fruitsList) { model ->
//                ListColumn(model = model)
//            }
//        }
    }





    fruitsList.add(FruitModel("Apple", R.drawable.ic_a))
    fruitsList.add(FruitModel("Orange", R.drawable.logooo))
    fruitsList.add(FruitModel("Banana", R.drawable.logooo))
    fruitsList.add(FruitModel("Strawberry", R.drawable.logooo))
    fruitsList.add(FruitModel("Mango", R.drawable.logooo))
//
}
private val fruitsList = mutableListOf<FruitModel>()




data class FruitModel(val name:String, val image : Int)

@Composable
fun ListColumn(model: FruitModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }
}


//









