# Crud-login-registrarse-Java-mysql
Es un projecto de un crud sencillo de usuarios con login y registrarse.


Tecnologias Utilizadas:

1.Java

2.Swing and Awt

3.Mysql

Patrones de diseño utilizados:

1.Singleton:Este fue utilizado en la creacion de la clase conexion para que solamente llamara una sola instancia de la clase conexion.
Pruebas en codigo:

![image](https://user-images.githubusercontent.com/86208465/129433204-d9dd1060-3a06-426a-9e07-b3709599364b.png)

Uso de los pilares de la orientacion a objetos:

1.Abstracción:

Se utilizo la abstracción en la creacion de las siguientes clases: 

![image](https://user-images.githubusercontent.com/86208465/129433247-f4c219e1-4f1c-4bc5-a391-c00e8af64480.png)

Clase AbstractConn:

![image](https://user-images.githubusercontent.com/86208465/129433304-c0c1ea7c-557b-48e2-9e5c-4a81574242b0.png)

![image](https://user-images.githubusercontent.com/86208465/129433310-669a5b83-8d40-428b-b404-4222265ac0e1.png)

Clase AbstractSqlStatements:

![image](https://user-images.githubusercontent.com/86208465/129433348-57ad3bd9-9521-48a7-998f-f5d1aeeee78a.png)


Estas son dos clases abstractas de la que heredan los atributos y metodos las clases Conn(Se utiliza para la conexion) y la clase SqlStatements(Donde se ejecutan las operaciones de crud en los formularios)

2.Encapsulamiento:

El encapsulamiento se utilizo en la clase abstracta AbstractConn donde se utilizaron los metodos get y set para los atributos privados de esa clase:

![image](https://user-images.githubusercontent.com/86208465/129433304-c0c1ea7c-557b-48e2-9e5c-4a81574242b0.png)

![image](https://user-images.githubusercontent.com/86208465/129433310-669a5b83-8d40-428b-b404-4222265ac0e1.png)

3.Herencia:

La herencia se utilizo en las clases Conn y sqlStaments donde se heredo de las clases abstractas AbstractConn y AbstractSqlStatements

![image](https://user-images.githubusercontent.com/86208465/129433478-168c873e-b477-4dbd-9578-a4286d126915.png)

![image](https://user-images.githubusercontent.com/86208465/129433487-b153fa7b-f6f4-4def-bad8-2771d2c562b9.png)

4.Polimorfismo:
El polimorfismo se utilizo el polimorfismos de tipo parametrizado con la funcion userSignIn de la clase SqlStaments para verificar si el usuario ya existe en la base de datos y otra vez para verificar el nombre de usuario y la contraseña para el login

![image](https://user-images.githubusercontent.com/86208465/129433568-f3500242-327a-4a0a-9b2b-9687cbb0bbba.png)

![image](https://user-images.githubusercontent.com/86208465/129433590-1fcf37db-d677-470a-84f4-d93f0136b475.png)

Codigo Sql de la base de datos:

create database escuela;

use escuela;

create table Users(

id int(11) auto_increment primary key,

username varchar(50) not null,

nombre varchar(50) not null,

apellido varchar(50) not null,

tel varchar(50) not null,

mail varchar(50) not null,

password varchar(50) not null);


Formularios:

Formulario de login:

![image](https://user-images.githubusercontent.com/86208465/129433059-df692ba4-9e92-4d2f-9584-ef89aeb22931.png)

Formulario de Registrarte:

![image](https://user-images.githubusercontent.com/86208465/129433077-33a3ec59-0f1c-4452-a12e-3e1472ca5ac5.png)

Formulario del CRUD:

![image](https://user-images.githubusercontent.com/86208465/129433094-4e8e5eaa-a78f-4a9a-998c-8c3d426617f9.png)

