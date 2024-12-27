# Notas a tener en cuenta:
🚀 Cómo Usar el Proyecto
  Requisitos Previos:
  Java Development Kit (JDK) instalado.
  IDE recomendado: Eclipse o cualquier otro compatible con Java.
  Pasos:
  Clona este repositorio.
  Importa el proyecto en tu IDE.
  Ejecuta la clase Main para iniciar el programa.
  💡 Notas Finales
  Este proyecto es una excelente demostración de los principios de Programación Orientada a Objetos (POO), utilizando conceptos como:

Herencia.
  Composición.
  Interfaces.
  Arreglos y especialización.
  Si tienes sugerencias o encuentras algún problema, no dudes en crear un issue o enviar un pull request. ¡Gracias por tu interés en el proyecto!

## 🎯 Objetivos del Proyecto

El proyecto busca modelar la lógica del juego utilizando conceptos clave de la **POO** en Java. Las principales características del proyecto son:

1. Uso de **interfaces**, **arreglos** y **composición**.
2. Aplicación de **herencia** para modelar diferentes tipos de vehículos y soldados.
3. Implementación de un sistema para comparar y enfrentar dos ejércitos en un tablero.
4. Utilización de métodos para simular habilidades de los soldados y capacidades de los vehículos.

## 🔧 Características y Funcionalidades

### 1️⃣ Uso de Interfaces, Arreglos y Composición
- La clase `Tablero` es el centro de la batalla entre dos ejércitos. Cada ejército:
  - Se identifica por un color (por ejemplo, Azul o Rojo).
  - Dispone de 3 medios de combate (vehículos o soldados), que tienen un poder de combate representado como un número entero (`int`).
  - El poder total del ejército se calcula con el método `getPoderTotal()`.

2️⃣ Uso de Herencia
Vehículos de combate: Los vehículos consumen combustible y tienen un poder de combate calculado según el tipo de vehículo:

    Tanques: poder = 4 * cantidad de combustible.
    Helicópteros: poder = 8 * cantidad de combustible + 50.
    Aviones: poder = 10 * cantidad de combustible + 100.
  
Soldados: Los soldados tienen habilidades y poderes específicos según su experiencia militar:
    Soldado: Poder = 1. Habilidad: dispara un fusil.
    Paracaidista: Poder = 2. Habilidades: dispara un fusil, salta de un avión.
    Comando: Poder = 3. Habilidades: dispara un fusil, salta de un avión, hace una emboscada.

3️⃣ Clase Tablero
 - La clase Tablero enfrenta a dos ejércitos y determina el resultado de la batalla. El método enfrentar():
  - Compara el poder total de los ejércitos.
  - Imprime el resultado:
  - Si un ejército tiene mayor poder: "El ejército X ganó la batalla con un poder de combate de XXXX".
  - En caso de empate: "Se produjo un empate".

# -POO---Juego---T.E.G.-
Proyecto: Programa de un juego (Táctica y Estrategia de Guerra) en Java con el IDE Eclipce. Usando las mecanicas de la Programacion Orientada a Objetos.

🛡️ T.E.G (Táctica y Estrategia de Guerra) es un popular juego de mesa que busca
simular enfrentamientos militares.

1. Uso de Interfaz, arreglos y composición
  - Se tiene que implementar la clase Tablero, la cual tiene dos ejércitos que se
  diferencian por su color (Azul y Rojo) pero podría ser cualquier otro color y estos
  disponen de medios (vehículos y soldados) los cuales tienen un determinado poder
  de combate representado a través de un valor int que se obtiene por medio del
  método getPoderCombate().
  El poder de un ejército se obtiene a través del método getPoderTotal() que
  devuelve la suma del poder de combate de todos sus medios. Cada ejército tiene solo
  3 medios, los cuales se le asignan cuando se llama al constructor junto con su color.
  Notas:
  - Crear la Interfaz Medio e implementar sus métodos en la Clase
  MedioCombate, declarar un arreglo de esta Clase en la Clase Ejército.
  - Crear el constructor de la Clase Ejercito como se muestra a continuación y
  dentro del mismo asignarle los medios:
  public Ejercito (String color, MedioCombate a, MedioCombate b,
  MedioCombate c);

2. Uso de Herencia
  - Los vehículos pueden ser de distinto tipo pero todos consumen combustible, su
  cantidad se inicializa en el constructor y se puede saber cuánto le queda a través del
  método getCombustible(). El poder de combate de cada vehículo es el siguiente:
    - Tanques: poder de combate= 4*cantidad de combustible
    - Helicópteros: poder de combate= 8 *cantidad de combustible + 50
    - Aviones: poder de combate= 10 *cantidad de combustible + 100
  
  - Los soldados también son diferentes, pero todos empiezan su vida militar como
    soldados (poder de combate 1), continúan como paracaidistas (poder de combate
    2) y los más expertos son comandos (poder de combate 3).
  
  - El soldado tiene la habilidad de disparar con fusil, la cual se modela a través de la
    implementación del método dispararFusil() que imprime “Dispara fusil”, el
    paracaidista tiene esta habilidad y la de saltar (implementar saltar() que imprime
    “Salta de un avión”) y el comando tiene todas las habilidades más la de emboscar
    (implementar la función emboscar() que imprime “Hace una emboscada”). Ninguna
    función devuelve valores.
    Crear la clase Tablero con un constructor que reciba como parámetro los dos
    ejércitos.
    Esta clase debe tener un método enfrentar(), el que imprime por pantalla que
    ejercito ganó la batalla con la siguiente leyenda:
    “El ejército X gano la batalla con un poder de combate de XXXX”
    En caso que ambos ejércitos tengan el mismo poder de combate se debe imprimir
    por pantalla la frase “Se produjo un empate”.
    
En base a lo anterior se pide:
### Implementar el Main

A continuación, se muestra el código del método `main`, que ejecuta las funcionalidades del proyecto (En el resultado final del Proyecto, el main sigue la misma funcionalidad, solo se cambio ciertos aspectos para que sea mas legible y dinamico desde la consola, pero se toamn en cuenta las mismas propiedades y parametros.):

```java
  public static void main(String[] args) {
      // Crear los ejércitos con sus respectivos medios de combate
      Ejercito azul = new Ejercito("Azul", new Avion(10.50), new Comando(), new Tanque(12.00));
      Ejercito rojo = new Ejercito("Rojo", new Helicoptero(13.45), new Soldado(), new Paracaidista());
  
      // Crear el tablero y enfrentar a los ejércitos
      Tablero tablero = new Tablero(azul, rojo);
      tablero.enfrentar();
  
      // Ejemplo de habilidades del Comando
      Comando comando = new Comando();
      comando.dispararFusil();
      comando.saltar();
      comando.emboscar();
  
      // Mostrar información adicional de los medios de combate
      Avion avion = new Avion(10.50);
      System.out.println(avion.getCantidadCombustible());
  
      Tanque tanque = new Tanque(12.00);
      System.out.println(tanque.getCantidadCombustible());
  }



Por ultimo se pide los Diagramas correspondientes:
Diseña las clases y objetos creados para el ejercicio utilizando PlantUML.
Relaciona las clases generadas anteriormente creando el Diagrama de Clases del ejercicio completo (exceptuando la clase Main.java).
Exporta el resultado en una imagen PNG para entregar con el ejercicio.
