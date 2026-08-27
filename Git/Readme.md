# CLASE 01 MIÉRCOLES 12 DE AGOSTO DEL 2026 - Portafolio 1

## USO DE GITHUB

 GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

 Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

## COMANDOS

```sh
Import repository, New repository, New organization: significa que es como tu empresa 

New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa 

New gist: es un pedacito de código que puedes compartir

New repository #Ponemos el nombre: Prueba-Inicio.Repo, descripción: Así armamos un repositorio. Hay muchas licencias para publicar el código: NO lo hacemos ahora.

Create repository #Lo ponemos en privado o en Publico.
```

El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.

Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando ssh) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub.

### ATENCIÓN: 
>¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña. Igual esto ya no funciona de una manera fácil.

Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.


## Cómo conectar un repositorio de GitHub a nuestro documento local
### Si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes instrucciones: