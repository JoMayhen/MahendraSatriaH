//Nama package yang digunakan pada saat membuat file
package id.utdi.mahendrasatriah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.utdi.mahendrasatriah.ui.theme.MahendraSatriaHTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}
//ini adalah fungsi composable untuk menampilkan UI elemen teks pada baris ke 35
@Composable
// fungsi greeting yang digunakan untuk mendapatkan dan menggunakan nama
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
// composable digunakan untuk menampilkan preview atau hasil dari coding
@Preview(showBackground = true)
@Composable
fun PreviewApplication() {
    MahendraSatriaHTheme {
        Greeting("Mahendra")
    }
}
data class Message(val author: String, val body: String)
// Composable untuk menambahkan elemen gambar dan mengatur Elemen text dengan kolom
@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
        )
    }
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}
//composable untuk menampilkan Sebuah UI elemen message
@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Mahendra", "Pekerjaan Tugas 2 PBM")
    )
}
