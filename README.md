# J.A.R.V.I.S. — prototipo Android

## Qué incluye
- Interfaz sencilla con estilo oscuro.
- Respuestas locales sin internet para `hola`, `hora`, `fecha`, `ayuda` y estado de conexión.
- Proyecto Android nativo en Kotlin.

## Qué NO incluye todavía
- Activación por voz con la palabra “Jarvis”.
- Escucha continua con pantalla apagada.
- Reconocimiento de voz.
- Respuestas habladas.
- Consultas web o control de funciones privadas.

## Cómo abrirlo
1. Descarga y descomprime el ZIP.
2. Abre la carpeta `JARVIS_Android` desde un entorno Android que admita proyectos Gradle (por ejemplo, AndroidIDE compatible).
3. Espera a que Gradle sincronice y luego compila/ejecuta la aplicación.
4. Si el entorno pide instalar componentes de SDK, instala los requeridos.

Configuración: Android Gradle Plugin 8.7.3, Kotlin 2.0.21, compile SDK 35, mínimo Android 8.0 (API 26).

Si la compilación falla, comparte una captura o copia el mensaje de error exacto; la compatibilidad de AndroidIDE depende de su versión y de los componentes disponibles.

## Compilar el APK sin computador (con GitHub Actions)
1. Crea una cuenta gratuita en GitHub si no tienes una.
2. En GitHub, crea un repositorio nuevo y sube todos los archivos y carpetas de este proyecto, incluida `.github/workflows/android.yml`.
3. Abre la pestaña **Actions** del repositorio y habilita los workflows si GitHub lo solicita.
4. En el workflow **Build JARVIS APK**, pulsa **Run workflow**.
5. Cuando termine correctamente, abre la ejecución y descarga el artefacto **JARVIS-debug-APK**.
6. Descomprime el artefacto descargado en el teléfono y abre `app-debug.apk` para instalarlo.

Este flujo de compilación usa GitHub Actions; requiere internet y una cuenta de GitHub. El APK resultante es una versión de depuración sin firma de publicación.
