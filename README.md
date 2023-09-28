{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fmodern\fprq1\fcharset0 Courier New;}{\f1\fnil\fcharset0 Courier New;}}
{\colortbl ;\red0\green0\blue255;}
{\*\generator Riched20 10.0.22621}\viewkind4\uc1 
\pard\widctlpar\f0\fs22\lang9226 ![]({{\field{\*\fldinst{HYPERLINK https://cdn.iconscout.com/icon/free/png-512/free-java-2038875-1720088.png?f=avif&w=256 }}{\fldrslt{https://cdn.iconscout.com/icon/free/png-512/free-java-2038875-1720088.png?f=avif&w=256\ul0\cf0}}}}\f0\fs22 )\par
\par
# Proyecto hotel alura\par
\par
### Descripci\'f3n\par
Este es un proyecto de una aplicaci\'f3n de un hotel hecho en Java usando interfaz gr\'e1fica swing e implementando la API JDBC con una base de datos tipo MySQL, a continuaci\'f3n les comparto la informaci\'f3n de la base de datos que se us\'f3 para el proyecto:\par
\par
\tab\lang1033 create database hotel;\par
\tab use hotel;\par
\par
\tab create table reserva(\par
\tab\tab id int primary key auto_increment,\par
\tab\tab\lang9226 nombre varchar(30) not null,\par
\tab\tab apellido varchar(30) not null,\par
\tab\tab\lang1033 edad int not null,\par
\tab\tab telefono bigint not null,\par
\tab\tab pais varchar(50) not null,\par
\tab\tab fecha_entrada datetime not null,\par
\tab\tab\lang9226 fecha_salida datetime not null,\par
\tab\tab valor varchar(10) not null,\par
\tab\tab forma_pago varchar(20) not null\par
\tab )engine=InnoDB;\par
\par
En este proyecto puede:\par
+ Crear reservas con los y registrarlas en la base de datos.\par
+ Visualizar los registros registrados con el bot\'f3n cargar y ocultarlos con el bot\'f3n limpiar.\par
+ Modificar los registros existentes en caso de un error en la digitaci\'f3n.\par
+ Eliminar los registros existentes en caso de ser requerido.\par
+ Buscar un usuario en espec\'edfico por medio de su identificador (Id).\par
\par
### Herramientas\par
- IDE: Eclipse\par
- Java: versi\'f3n 17\par
- Java swing: Interfaz gr\'e1fica\par
- JDBC: API para la interacci\'f3n de Java con la base de datos\par
- MySQL: Base de datos para alojar los daros\par
\par
### Uso del proyecto\par
+ Use el siguiente comando para clonarlo `git clone {{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel.git` }}{\fldrslt{https://github.com/OscarMartin01/hotel.git`\ul0\cf0}}}}\f0\fs22  o descargarlo como archivo .zip y extraer el archivo.\par
+ Importar el proyecto en el programa Eclipse.\par
+ El proyecto tendr\'e1 un mensaje de error que indica que la ruta de las librer\'edas externas no existe en tu computadora para ello realice lo siguiente:\par
     + Haz click con el bot\'f3n derecho encima del proyecto ubicado en el Package Explorer, elijas la opci\'f3n Build Path y Configure Build Path.\par
\tab + . Haz click en Libraries, luego en Classpath seleccione todas las librer\'edas y elije la opci\'f3n Remove.\par
\tab + Para importar las nuevas librerias desde tu computadora, pulsa en ClassPath y luego en Add External JARS agrega uno por uno o selecciona todos de una vez y haz click en Apply and Close.\par
+ Y con eso, ya puedes usar el proyecto.\par
\par
### Im\'e1genes\par
\par
#### Login\par
\par
![]({{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel/blob/main/src/img/login.png }}{\fldrslt{https://github.com/OscarMartin01/hotel/blob/main/src/img/login.png\ul0\cf0}}}}\f0\fs22 )\par
\par
#### Pantalla registro\par
\par
![]({{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel/blob/main/src/img/pantalla.png }}{\fldrslt{https://github.com/OscarMartin01/hotel/blob/main/src/img/pantalla.png\ul0\cf0}}}}\f0\fs22 )\par
\par
#### Registro\par
\par
![]({{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel/blob/main/src/img/registroGuaardado.png }}{\fldrslt{https://github.com/OscarMartin01/hotel/blob/main/src/img/registroGuaardado.png\ul0\cf0}}}}\f0\fs22 )\par
\par
#### Eliminar registro\par
\par
![]({{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel/blob/main/src/img/registroEliminado.png }}{\fldrslt{https://github.com/OscarMartin01/hotel/blob/main/src/img/registroEliminado.png\ul0\cf0}}}}\f0\fs22 )\par
\par
#### Cerrando sesi\'f3n\par
\par
![]({{\field{\*\fldinst{HYPERLINK https://github.com/OscarMartin01/hotel/blob/main/src/img/cerrarSesion.png }}{\fldrslt{https://github.com/OscarMartin01/hotel/blob/main/src/img/cerrarSesion.png\ul0\cf0}}}}\f0\fs22 )\par

\pard\f1\par
}
 