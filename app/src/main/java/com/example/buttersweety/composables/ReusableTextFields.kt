package com.example.buttersweety.composables

//import android.icu.text.AlphabeticIndex.Bucket.LabelType
//import android.widget.NumberPicker.OnValueChangeListener
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardActions
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.unit.dp
//import androidx.constraintlayout.compose.Visibility
//
//@Composable
//fun CustomOutLinedTextField(
//    value: String,
//    onValueChange: (String) -> Unit,
//    label: String = "",
//    loadingIconImageVector: ImageVector,
//    loadingIconDescription: String = "",
//    isPasswordField: Boolean = false,
//    isPasswordVisible: Boolean = false,
//    onVisibilityChange : (Boolean) -> Unit = {},
//    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
//    keyboardActions: KeyboardActions = KeyboardActions.Default,
//    showError: Boolean = false,
//    errorMessage: String = ""
//){
//    Column(modifier = Modifier.fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center)
//    {
//       OutlinedTextField(
//           value = value,
//           onValueChange = {onValueChange(it)},
//       modifier = Modifier
//           .fillMaxWidth()
//           .padding(bottom = 10.dp),
//       label = { Text(label)},
//       loadingIcon = {
//           Icon(
//               imageVector = loadingIconImageVector,
//               contentDescription = loadingIconDescription,
//               tint = if (showError) MaterialTheme.colors.error else MaterialTheme.colors.onSurface
//           )
//         },
//           isError = showError,
//           trailingIcon = {
//               if (showError && !isPasswordField) Icon(ImageVector = Icon.Filled.Error, contenDescription = "Show error icon")
//               if (isPasswordField){
//                   IconButton(onClick = { onVisibilityChange(!isPasswordVisible) }){
//                       Icon(
//                           imageVector = if(isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
//                           contentDescription = "Toggle password visibility"
//                       )
//                   }
//               }
//           }
//
//    }
//
//}