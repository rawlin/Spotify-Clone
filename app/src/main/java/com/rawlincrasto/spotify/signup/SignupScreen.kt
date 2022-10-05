package com.rawlincrasto.spotify.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.rawlincrasto.spotify.R
import com.rawlincrasto.spotify.ui.theme.SpotifyTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            alignment = Alignment.Center
        )
        Text(
            text = stringResource(id = R.string.signup_string),
            textAlign = TextAlign.Center
        )
//        Button(onClick = { /*TODO*/ }) {
//            Text(
//                text = stringResource(id = R.string.signup_for_free),
//                textAlign = TextAlign.Center
//            )
//        }
    }

}


@Preview
@Composable
fun SignupPreview() {
    SpotifyTheme {
        SignupScreen()
    }
}