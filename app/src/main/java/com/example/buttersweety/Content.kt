package com.example.buttersweety

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import androidx.compose.runtime.getValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavController
import com.example.buttersweety.ui.theme.Purple200
import com.example.buttersweety.ui.theme.ButterSweetyTheme
import com.example.buttersweety.ui.theme.Purple200
import okhttp3.internal.http2.Header
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import com.example.buttersweety.Image as Image


@Composable
fun topAppBar(){var text by remember {
    mutableStateOf(TextFieldValue(""))
}
    TopAppBar (
//        title={ Text(text = "Aplikasi saya")},
//        backgroundColor = Purple200,
//        contentColor = Color.White
        title = {

                TextField(
                    value = text, onValueChange = { newText -> text = newText },
                    label = { Text("Cari Apaan tuh") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "emailIcon"
                        )
                    },
                )
                    IconButton(onClick = { /* doSomething() */ }) {
//                    Icon(
//                        Icons.Filled.AccountCircle,
//                        modifier = Modifier.size(30.dp),
//                        contentDescription = "profil",
//                    )




//                Text(text = "Search"))
            }

        }, backgroundColor = Color(0XffFFE2E2),


        actions = {

            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
            }
        },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    Icons.Filled.AccountCircle,
                    modifier = Modifier.size(60.dp),
                    contentDescription = "profil"
                )
            }
        }



    )
}


@Composable
fun Homepage() {




    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .wrapContentSize(Alignment.Center)) {




    }


}



@Composable
fun MyList()
{
    Column {
        val gamelist = listOf(
            "Terbaru",
            "Terlaris",
            "Promo",
            "Special"
        )



        LazyRow(contentPadding = PaddingValues(20.dp)) {
            items(gamelist){ item ->
                MyCard(gameName = item)

            }

        }
    }
}

@Composable
fun MyCard(gameName : String)
{
    Box(modifier = Modifier
        .padding(top = 130.dp)
        .padding(all = 10.dp)
        .clip(RoundedCornerShape(12.dp))
        .width(100.dp)
        .border(5.dp, color = Color.Black)
        .background(Color(0XffFFE2E2))
        .height(100.dp),){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center)
           {
            Text(text = gameName, fontSize = 22.sp)


        }
    }
}

@Composable
fun Salam()
{
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 80.dp)
            .padding(start = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(300.dp)
            .height(50.dp)
            .background(Color(0XffFFE2E2))


    )
        {
            Text(text = "Hello Sweeties", textAlign = TextAlign.Center, fontSize = 30.sp
                )

        }

}

@Composable
fun Special()
{
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 500.dp)
            .padding(start = 100.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(200.dp)
            .height(30.dp)
            .background(Color(0XffFFE2E2))


    )
    {
        Text(text = "Special Menu", textAlign = TextAlign.Center, fontSize = 20.sp
        )

    }
}

@Composable
fun SpecialMenu()
{
        Box(
            modifier = Modifier
                .padding(top = 400.dp)
                .padding(start = 50.dp)
                .clip(RoundedCornerShape(12.dp))
                .width(300.dp)
                .height(200.dp)
                .background(Color.Green),




        ){
            Image(painter = painterResource(id = R.drawable.ic_a), contentDescription ="baner"
                ,modifier = Modifier.fillMaxSize())


        }




}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Homepage()
    topAppBar()
    MyList()
    Salam()
    SpecialMenu()
    Special()



}


@Composable
fun Notifpage() {
//    bagian menu keranjang
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 50.dp)
            .padding(start = 40.dp)
            .padding(end = 40.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(350.dp)
            .height(350.dp)
            .background(Color(0XffFFE2E2))


    )
    {
        Text(
            text = "Menu Keranjang", textAlign = TextAlign.Center, fontSize = 20.sp
        )
    }

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 120.dp)
            .padding(start = 50.dp)
            .padding(end = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(300.dp)
            .height(100.dp)
            .background(Color(0xFFF8ECEC))

    )
    {
//        Text(text = "Martabak Kentang", textAlign = TextAlign.Center, fontSize = 15.sp,
//        )
    }

//  gambar menu
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 120.dp)
            .padding(start = 75.dp)
            .padding(end = 150.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(100.dp)
            .height(100.dp)
            .background(Color(0xFFF8ECEC))

    )
    {
        Image(
            painter = painterResource(id = R.drawable.ic_a),
            contentDescription = "baner",
            modifier = Modifier.fillMaxSize()
        )

    }

//    deskripsi menu dan harga
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 125.dp)
            .padding(start = 180.dp)
            .padding(end = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(150.dp)
            .height(100.dp)
            .background(Color(0xFFF8ECEC))

    )
    {
        Text(
            text = "Martabak Kentang" +
                    "Martabak isi kulit dan daging         " +
                    "Rp.30.000",
            textAlign = TextAlign.Left, fontSize = 13.sp,
        )
    }

//    bagian plus
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 190.dp)
            .padding(start = 255.dp)
            .padding(end = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(30.dp)
            .height(30.dp)
            .background(Color(0xFFF73D3D))

    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = "Localized description")
        }
    }


//    bagian minus
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 190.dp)
            .padding(start = 295.dp)
            .padding(end = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(30.dp)
            .height(30.dp)
            .background(Color(0xFFF73D3D))

    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = "Localized description")
        }
    }

//    bagian quantity
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 190.dp)
            .padding(start = 200.dp)
            .padding(end = 45.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(30.dp)
            .height(30.dp)
            .background(Color(0XffFFE2E2))


    )
    {
        Text(
            text = "2", textAlign = TextAlign.Center, fontSize = 20.sp
        )
    }

// bagian total
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 255.dp)
            .padding(start = 50.dp)
            .padding(end = 45.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(290.dp)
            .height(40.dp)
            .background(Color(0xFFF7EBEB))


    )
    {
        Text(
            text = "Total : Rp.60.000", textAlign = TextAlign.Center, fontSize = 20.sp
        )
    }

//    tombol pesan
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 350.dp)
            .padding(start = 120.dp)
            .padding(end = 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .width(150.dp)
            .height(30.dp)
            .background(Color(0xFFFA6060))


    )
    {
        Text(
            text = "pesan", textAlign = TextAlign.Center, fontSize = 20.sp
        )
    }
}



//@Composable
//fun Notifpage() {
//    Card(
//        Modifier
//            .height(100.dp)
//            .padding(horizontal = 15.dp)
//    ) {
//        Row(
//            Modifier.fillMaxSize(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Image()
//        }
//    }
//}
//
//@Composable
//fun Image(){
//
//}

private fun RowScope.Image() {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Notifpage()
}


@Composable
fun Settingpage() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .wrapContentSize(Alignment.Center)) {

    }
}

@Composable
fun ProfileScreen(){

    val notification = rememberSaveable{ mutableStateOf("") }
    if(notification.value.isNotEmpty()){
        Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
        notification.value = ""
    }

    var name by rememberSaveable{ mutableStateOf("default name") }
    var username by rememberSaveable { mutableStateOf("default username") }
    var bio by rememberSaveable { mutableStateOf("default bio") }

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .padding(0.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Cancel", modifier = Modifier.clickable { notification.value = "Cancelled" })
            Text(text = "Save", modifier = Modifier.clickable { notification.value = "Profile updated" })
        }
        ProfileImage()
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp, end = 4.dp),
        verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Name", modifier = Modifier.width(100.dp))
            TextField(
                value = name,
                onValueChange = {name = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    textColor = Color.Black
                ))
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp, end = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Username", modifier = Modifier.width(100.dp))
            TextField(
                value = username,
                onValueChange = { username = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    textColor = Color.Black
                ))
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        verticalAlignment = Alignment.Top
        ){
            Text(text = "Bio", modifier = Modifier
                .width(100.dp)
                .padding(top = 8.dp))
            TextField(value = bio, onValueChange = { bio = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    textColor = Color.Black
                ),
                singleLine = false,
                modifier = Modifier.height(150.dp)
            )
        }
    }
}

@Composable
fun ProfileImage(){
    val imageUri = rememberSaveable{ mutableStateOf("") }
    val painter = rememberImagePainter(
        if (imageUri.value.isEmpty())
            R.drawable.ic_user
    else
        imageUri.value
    )
    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()
    ){
        uri: Uri? ->
        uri?.let { imageUri.value = it.toString() }
    }

    Column(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(shape = CircleShape,
        modifier = Modifier
            .padding(8.dp)
            .size(100.dp)
        ){
            Image(painter = painter, contentDescription = null, modifier = Modifier
                .wrapContentSize()
                .clickable { launcher.launch("image/*") },
            contentScale = ContentScale.Crop)
        }
        Text(text = "Change profile picture")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    Settingpage()
    ProfileScreen()
}






//Image(painter = painterResource(id = R.mipmap.ic_terbaru_round), contentDescription ="Menu" )

