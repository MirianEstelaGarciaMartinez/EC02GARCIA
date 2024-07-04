package pe.edu.idat.ec02garcia

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun RegistroEstudio() {
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var programaSeleccionado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            label = { Text("Apellidos") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = dni,
            onValueChange = { dni = it },
            label = { Text("DNI") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = celular,
            onValueChange = { celular = it },
            label = { Text("Celular") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )

        Text("Seleccione programa que domina:")
        RadioButtonGroup(
            options = listOf("Chabeook", "MS SQL Server", "Visual Studio Code", "Android Studio", "Otro"),
            onSelectionChange = { programaSeleccionado = it }
        )

        Button(
            onClick = {
                // Aquí puedes manejar la lógica para guardar los datos ingresados
                // por ejemplo, enviar a una base de datos o realizar alguna acción
                // dependiendo de los datos ingresados.
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Acceder")
        }
    }
}

@Composable
fun RadioButtonGroup(options: List<String>, onSelectionChange: (String) -> Unit) {
    var selectedOption by remember { mutableStateOf("") }

    options.forEach { option ->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        ) {
            RadioButton(
                selected = option == selectedOption,
                onClick = {
                    selectedOption = option
                    onSelectionChange(option)
                }
            )
            Text(
                text = option,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}
