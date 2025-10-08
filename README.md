🧾 Proyecto: Lectura de JSON y Escritura de CSV con Configuración de Delimitador

Este proyecto en **Java** demuestra cómo:
1. Leer datos desde un archivo **JSON**.
2. Convertirlos a objetos Java.
3. Exportarlos a un archivo **CSV** utilizando la librería **OpenCSV**.
4. Configurar dinámicamente el **delimitador** del CSV mediante un archivo de configuración externo (`config.properties`).

---

📂 Estructura del Proyecto

src/

└── main/

├── java/

│ └── org/example/

│ ├── Main.java

│ ├── People.java

│ ├── JsonReader.java

│ ├── CsvWriter.java

│ └── ConfigReader.java

│ └── config.properties

| └── person.json


---

⚙️ Dependencias

El proyecto utiliza las siguientes librerías:

```xml
#<dependency>
#    <groupId>org.json</groupId>
#    <artifactId>json</artifactId>
#    <version>20250517</version>
#</dependency>

#<dependency>
#    <groupId>com.opencsv</groupId>
#    <artifactId>opencsv</artifactId>
#    <version>5.9</version>
#</dependency>


+ Agrega estas dependencias en el archivo pom.xml si usas Maven.

---
🧠 Descripción de las Clases

Main.java -	Punto de entrada. Controla el flujo del programa: lectura de JSON y escritura de CSV.
People.java -	Modelo de datos que representa a una persona con nombre, edad, país e ID.
JsonReader.java -	Lee el archivo JSON y lo convierte en una lista de objetos People.
CsvWriter.java -Escribe los datos en un archivo CSV usando OpenCSV. Recibe el delimitador desde la configuración.
ConfigReader.java -	Lee el archivo config.properties para determinar qué delimitador se usará en el CSV.

---

📄 Archivos de Datos
person.json
Ejemplo de entrada JSON:
[
  {"name": "Juan", "age": 30, "country": "Mexico", "id": 1},
  {"name": "Karla", "age": 26, "country": "Canada", "id": 2}
]

config.properties

Define el delimitador del CSV:
csv.delimiter=;


Puedes usar otros delimitadores:
, → coma
; → punto y coma
| → barra vertical
\t → tabulador

---

🚀 Ejecución del Proyecto

1. Clona o descarga el repositorio.
2. Asegúrate de tener configuradas las dependencias en tu pom.xml.
3. Ejecuta la clase principal:
4. El programa leerá el archivo person.json y generará el archivo output.csv con el delimitador configurado.


