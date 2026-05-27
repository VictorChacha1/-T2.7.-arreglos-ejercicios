# Sistema de Gestión y Análisis de Calificaciones

## 📖 Descripción
Este repositorio contiene la resolución de la guía práctica "T2.7. arreglos ejercicios" correspondiente a la asignatura de Algoritmos y Lógica de Programación. El proyecto consiste en un sistema automatizado de escritorio diseñado para procesar y analizar las calificaciones del examen final de un grupo de estudiantes

## ⚙️ Funcionalidades del Programa
El sistema se ejecuta a través de un menú interactivo que permite realizar las siguientes acciones:

* **1. Registrar Calificaciones**: Permite el ingreso de la cantidad de alumnos a evaluar, junto con sus respectivos nombres y notas.
* **2. Mostrar Reporte Estadístico**: Procesa los datos ingresados para calcular y mostrar el promedio general del curso, el número total de alumnos aprobados (calificación mayor o igual a 7) y el número total de alumnos reprobados (calificación menor a 7).
* **3. Buscar Estudiante**: Utiliza un método de búsqueda secuencial para localizar a un estudiante específico por su nombre. 
    * Si el estudiante es encontrado, el sistema devuelve su nombre, su nota y su estado académico ("Aprobado" o "Reprobado").
    * Si no es encontrado, el sistema despliega un mensaje claro de error indicando que no está registrado.

## 🛠️ Tecnologías y Herramientas
* **C++**: Lenguaje de programación utilizado para una de las implementaciones del código fuente.
* **Java**: Lenguaje de programación utilizado para la segunda implementación del sistema.
* **PSeInt**: Herramienta utilizada en la fase de diseño para estructurar el algoritmo, el pseudocódigo y el diagrama de flujo.

## 📂 Estructura del Repositorio
El repositorio está organizado en los siguientes directorios y archivos para facilitar la revisión del código y las evidencias:
* `📁 Ejercicio en C++`: Contiene los archivos fuente de la solución desarrollada en el lenguaje C++.
* `📁 Ejercicio en Java`: Contiene los archivos fuente de la solución orientada a objetos desarrollada en Java.
* `📁 Imagenes`: Directorio destinado a almacenar los recursos visuales del proyecto, incluyendo el diagrama de flujo, casos de prueba y la infografía.
* `📄 T2.7. arreglos ejercicios.pdf`: Documento PDF con el informe completo de la guía práctica, detallando objetivos, análisis, código y capturas de los resultados.
* `📄 README.md`: Archivo de documentación principal del proyecto.

## 🧠 Conceptos de Lógica Aplicados
* **Arreglos Paralelos**: Uso de vectores unidimensionales paralelos (un arreglo `String` para nombres y un arreglo `double` para notas) para almacenar la información de los estudiantes.
* **Estructuras de Control Iterativas**: Implementación de bucles `do-while` para el menú principal y bucles `for` para el recorrido y análisis estadístico de los datos.
* **Contadores y Acumuladores**: Variables utilizadas para sumar notas totales y contar el número de alumnos aprobados/reprobados.
* **Banderas Lógicas**: Uso de variables booleanas (`true`/`false`) para confirmar coincidencias durante la búsqueda secuencial.

## 👤 Autor
* **Alumno participante**: Chacha Chango Victor Manuel
* **Nivel**: Primero - B
