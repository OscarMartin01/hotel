![](https://cdn.iconscout.com/icon/free/png-512/free-java-2038875-1720088.png?f=avif&w=256)

# Proyecto hotel alura

### Descripción
Este es un proyecto de una aplicación de un hotel hecho en Java usando interfaz gráfica swing e implementando la API JDBC con una base de datos tipo MySQL, a continuación les comparto la información de la base de datos que se usó para el proyecto:

	create database hotel;
	use hotel;

	create table reserva(
		id int primary key auto_increment,
		nombre varchar(30) not null,
		apellido varchar(30) not null,
		edad int not null,
		telefono bigint not null,
		pais varchar(50) not null,
		fecha_entrada datetime not null,
		fecha_salida datetime not null,
		valor varchar(10) not null,
		forma_pago varchar(20) not null
	)engine=InnoDB;

En este proyecto puede:
+ Crear reservas con los y registrarlas en la base de datos.
+ Visualizar los registros registrados con el botón cargar y ocultarlos con el botón limpiar.
+ Modificar los registros existentes en caso de un error en la digitación.
+ Eliminar los registros existentes en caso de ser requerido.
+ Buscar un usuario en específico por medio de su identificador (Id).

### Herramientas
- IDE: Eclipse
- Java: versión 17
- Java swing: Interfaz gráfica
- JDBC: API para la interacción de Java con la base de datos
- MySQL: Base de datos para alojar los daros

### Uso del proyecto
+ Use el siguiente comando para clonarlo `git clone https://github.com/OscarMartin01/hotel.git` o descargarlo como archivo .zip y extraer el archivo.
+ Importar el proyecto en el programa Eclipse.
+ El proyecto tendrá un mensaje de error que indica que la ruta de las librerías externas no existe en tu computadora para ello realice lo siguiente:
     + Haz click con el botón derecho encima del proyecto ubicado en el Package Explorer, elijas la opción Build Path y Configure Build Path.
	+ . Haz click en Libraries, luego en Classpath seleccione todas las librerías y elije la opción Remove.
	+ Para importar las nuevas librerias desde tu computadora, pulsa en ClassPath y luego en Add External JARS agrega uno por uno o selecciona todos de una vez y haz click en Apply and Close.
+ Y con eso, ya puedes usar el proyecto.

### Imágenes

#### Login

![](https://github.com/OscarMartin01/hotel/blob/main/src/img/login.png)

#### Pantalla registro

![](https://github.com/OscarMartin01/hotel/blob/main/src/img/pantalla.png)

#### Registro

![](https://github.com/OscarMartin01/hotel/blob/main/src/img/registroGuaardado.png)

#### Eliminar registro

![](https://github.com/OscarMartin01/hotel/blob/main/src/img/registroEliminado.png)

#### Cerrando sesión

![](https://github.com/OscarMartin01/hotel/blob/main/src/img/cerrarSesion.png)
