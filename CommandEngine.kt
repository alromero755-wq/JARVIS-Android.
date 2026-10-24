package com.example.jarvis

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CommandEngine {
    fun respond(input: String): String {
        val command = input.trim().lowercase(Locale.ROOT)
        if (command.isBlank()) return "Escribe un comando para comenzar."

        return when {
            command == "jarvis" || command.contains("hola") ->
                "Hola. Soy J.A.R.V.I.S. Estoy listo."
            command.contains("hora") -> {
                val formatter = SimpleDateFormat("HH:mm", Locale.getDefault())
                "La hora local es ${formatter.format(Date())}."
            }
            command.contains("fecha") || command.contains("día") ->
                "La fecha de hoy es ${SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())}."
            command.contains("ayuda") ->
                "Comandos disponibles: hola, hora, fecha, estado sin internet y ayuda."
            command.contains("internet") || command.contains("conexión") ->
                "Esta versión funciona con respuestas locales. Todavía no realiza consultas por internet."
            command.contains("cómo estás") || command.contains("como estas") ->
                "Estoy funcionando correctamente en modo de prueba."
            else ->
                "Todavía no conozco ese comando. Escribe «ayuda» para ver las opciones."
        }
    }
}
