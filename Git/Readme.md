# CLASE 01 MIÉRCOLES 12 DE AGOSTO DEL 2026 - Portafolio 1
## USO DE GITHUB


### ❓ ¿Qué es GitHub?
 GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

 Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

> 📌 **IMPORTANTE:** Un repositorio puede tener una versión local en nuestra computadora y una versión remota en GitHub. Ambas pueden sincronizarse utilizando comandos de Git.

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

```sh
cd documents
mkdir Proyectos
cd Proyectos
git clone git@github.com:CodeFire2026/Code-and-Coffee.git
cd Code-and-Coffee
git pull origin main
git fetch
git branch #Veran que está la rama main por defecto
touch README.md #Creamos el readme.md
git status
git push origin main
```
| 📚 **¿QUÉ HACE CADA COMANDO?** |
|---|
| `cd` → permite cambiar de carpeta. |
| `mkdir` → crea una nueva carpeta. |
| `git clone` → descarga un repositorio desde GitHub. |
| `git pull` → trae los cambios del repositorio remoto al repositorio local. |
| `git fetch` → obtiene información actualizada del repositorio remoto. |
| `git branch` → muestra o permite administrar las ramas. |
| `touch` → crea un archivo nuevo. |
| `git status` → muestra el estado actual del repositorio. |
| `git push` → envía los cambios del repositorio local a GitHub. |


| 🔄 **FLUJO BÁSICO DE TRABAJO** |
|---|
| **GitHub → `git clone` → Repositorio local → hacemos cambios → `git status` → `git push` → GitHub** |


# CLASE 02 MIÉRCOLES 19 DE AGOSTO DEL 2026 - Portafolio 2

## Vamos a cargar la llave SSH publica en GitHub -> SI YA HAZ HECHO ESTE TRABAJO, NO SE DEBE REPETIR EL SSH

Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.

Copiar la llave publica #Ir a GitHub, vamos a setting, vamos a SSH and GPG keys

Crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.

| 🔐 **¿PARA QUÉ SIRVE LA LLAVE SSH?** |
|---|
| La llave SSH permite que nuestra computadora se identifique de forma segura ante GitHub. |
| Una vez configurada, podemos conectarnos con GitHub sin tener que ingresar nuestro usuario y contraseña cada vez que hacemos operaciones con el repositorio. |
| **Importante:** cada computadora o dispositivo nuevo que queramos utilizar debe tener su propia llave SSH configurada. |

> Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.

```sh
git branch #Vemos en que rama estamos

git checkout master #Ponernos en la rama master

git branch -M main #Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo

git remote -v #Vemos si ya esta conectado

git merge segunda #Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy

git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```

| 📚 **¿QUÉ HACE CADA COMANDO?** |
|---|
| `git branch` → muestra las ramas disponibles y señala en cuál estamos trabajando. |
| `git checkout master` → cambia a la rama `master`. |
| `git branch -M main` → cambia el nombre de la rama actual a `main`. |
| `git remote add origin URL` → conecta nuestro repositorio local con un repositorio remoto. |
| `git remote -v` → muestra los repositorios remotos que tenemos conectados. |
| `git merge segunda` → incorpora los cambios de la rama `segunda` en la rama en la que estamos trabajando. |
| `git commit -am "mensaje"` → crea un commit con los cambios realizados en archivos que Git ya está siguiendo. |
| `git push origin main` → envía los cambios de la rama `main` al repositorio remoto. |

Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.

| 💡 **MASTER Y MAIN** |
|---|
| `master` y `main` son nombres que pueden utilizarse para la rama principal. Actualmente es muy común utilizar `main`. |
| Cambiar el nombre de `master` a `main` **no crea un proyecto nuevo**, solamente cambia el nombre de la rama. |


# CLASE 03 MIÉRCOLES 26 DE AGOSTO DEL 2026 - Portafolio 3
## Cambios en GitHub: de master a main

El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.

Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

### ¿Cuando es que sigue siendo master y cuando sigue siendo main?
Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando:

> git branch -M main

| 💡 **¿QUÉ HACE `git branch -M main`?** |
|---|
| Cambia el nombre de la rama actual de `master` a `main`. |
| La opción `-M` permite realizar el cambio de nombre incluso si ya existe una rama llamada `main`. |
| Este comando **no elimina los archivos ni los commits**, solamente cambia el nombre de la rama. |

O cambiando la asignación por default con este otro comando:

> git config --global init.defaultBranch main

| ⚙️ **CONFIGURAR `main` COMO RAMA PREDETERMINADA** |
|---|
| `git config --global init.defaultBranch main` configura Git para que, cuando creemos un repositorio nuevo utilizando `git init`, la rama inicial sea `main` en lugar de `master`. |
| Al utilizar `--global`, esta configuración se aplica a los nuevos repositorios que creemos en nuestra computadora. |

A partir de este comando siempre que ingreses git init será la rama main.

Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.

### Otro comando que deben saber es:

> gitk

Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.

Para instalar gitk debemos ejecutar los siguientes comandos:

* sudo apt-get update

* sudo apt-get install gitk

| 📚 **¿QUÉ HACE CADA COMANDO?** |
|---|
| `sudo apt-get update` → actualiza la información de los paquetes disponibles. |
| `sudo apt-get install gitk` → instala la herramienta `gitk`. |
| `gitk` → abre la interfaz gráfica para visualizar el historial del repositorio. |

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

| 🧠 **PARA RECORDAR** |
|---|
| `master` y `main` pueden ser nombres de la rama principal, pero actualmente `main` es el nombre más utilizado. |
| `git branch -M main` → cambia `master` a `main`. |
| `git config --global init.defaultBranch main` → hace que los nuevos `git init` comiencen directamente en `main`. |
| `gitk` → permite visualizar gráficamente el historial de Git. |

# CLASE 04 MIÉRCOLES 2 DE SEPTIEMBRE DEL 2026 - Portafolio 4

## Tu primer push
### La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.

Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

| 💡 **IMPORTANTE SOBRE LA LLAVE SSH** |
|---|
| La llave que debemos agregar a GitHub es la **llave pública**, normalmente la que termina en `.pub`. |
| **Nunca debemos compartir nuestra llave privada**, ya que es la que permite autenticarnos desde nuestra computadora. |

## ssh
```sh

git remote set-url origin url-ssh-del-repositorio-en-github

Comandos para copiar la llave SSH:

ESTAS SON LAS RUTAS DEL SSH PUBLICO
-Mac:
pbcopy < ~/.ssh/id_rsa.pub

Windows (Git Bash):

clip < ~/.ssh/id_rsa.pub

Linux (Ubuntu):

cat ~/.ssh/id_rsa.pub
```

| ⚠️ **IMPORTANTE ANTES DE HACER UN PUSH** |
|---|
| Las buenas costumbres nos enseñan que antes de hacer un `push`, siempre debemos hacer un `pull` o un `fetch`, para comprobar si alguien ya realizó algún cambio y evitar posibles conflictos. |
|
| `git fetch` → obtiene información nueva del repositorio remoto, pero no modifica nuestros archivos de trabajo. |
| `git pull` → obtiene los cambios del repositorio remoto y los integra en nuestra rama local. |
| `git push` → envía nuestros commits desde el repositorio local hacia GitHub. |

Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

>Invitar a un colaborador

Para invitar a un colaborador debemos ir a GitHub y seleccionar:
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.

Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

# CLASE 05 MIÉRCOLES 9 DE SEPTIEMBRE DEL 2026 - Portafolio 4
## Git tag y versiones en GitHub

> En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.<br>

| 🏷️ **¿QUÉ ES UN GIT TAG?** |
|---|
| Un **tag** o etiqueta es un nombre que podemos asignar a un **commit específico** para identificarlo fácilmente. |
| Se utiliza principalmente para marcar **versiones importantes** de un proyecto, por ejemplo `v1.0`, `v1.1` o `v2.0`. |
| De esta forma podemos reconocer rápidamente qué commit corresponde a una determinada versión del proyecto. |

Creación de etiquetas en Git

```sh
git tag

```
| 🚀 **COMPARTIR UNA ETIQUETA** |
|---|
| Para enviar una etiqueta específica a GitHub debemos indicar su nombre: |
| `git push origin v1.0` |
| |
| Para enviar todas las etiquetas locales que todavía no estén en el repositorio remoto podemos utilizar: |
| `git push origin --tags` |

| 🗑️ **ELIMINAR UNA ETIQUETA** |
|---|
| Para eliminar una etiqueta de nuestro repositorio local debemos indicar su nombre: |
| `git tag -d v1.0` |
| |
| Esto elimina la etiqueta **localmente**, pero no necesariamente la elimina de GitHub. |

> Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.
Listado de etiquetas
Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:<br>
Para crear una etiqueta, ejecuta el siguiente comando:<br>

>Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.

```sh
git tag

Esto mostrará una lista de las etiquetas existentes, como:

v1.0

v1.1

v1.2

Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.

Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:

git push origin

Para enviar varias etiquetas a la vez, usa:

git push origin --tags

Eliminación de etiquetas
Para eliminar una etiqueta, usa el siguiente comando:

git tag -d
```

>Esto eliminará la etiqueta identificada por en el repositorio local.

>En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

| 🧠 **COMANDOS IMPORTANTES** |
|---|
| `git tag` → muestra las etiquetas existentes. |
| `git tag v1.0` → crea una etiqueta ligera. |
| `git tag -a v1.0 -m "Versión 1.0"` → crea una etiqueta anotada. |
| `git push origin v1.0` → envía una etiqueta específica a GitHub. |
| `git push origin --tags` → envía todas las etiquetas. |
| `git tag -d v1.0` → elimina una etiqueta local. |
| `git push origin --delete v1.0` → elimina una etiqueta del repositorio remoto. |

# CLASE 06 MIÉRCOLES 16 DE SEPTIEMBRE DEL 2026 - Portafolio 5
## Error con los tags

> Error con los tags
Investigación: ¿Qué pasa si por error cargamos un tag con el mismo nombre dos veces?
¿Cómo solucionarías este problema o error?

Si por error cargamos un tag con el mismo nombre dos veces, Git nos mostrará un error porque no puede existir otro tag con exactamente el mismo nombre.
Para solucionar este problema, primero podemos verificar los tags existentes con:
```sh
git tag
```
>Si queremos reemplazar el tag existente por otro, podemos eliminar el tag anterior con:
```sh
git tag -d NombreDelTag
Y luego crear nuevamente el tag con el mismo nombre:
git tag NombreDelTag
```
| ⚠️ **IMPORTANTE** |
|---|
| El comando `git tag -d NombreDelTag` elimina el tag **del repositorio local**. |
| Si ese tag también fue enviado anteriormente a GitHub, eliminarlo localmente no lo elimina automáticamente del repositorio remoto. |

# CLASE 07 MIÉRCOLES 23 DE SEPTIEMBRE DEL 2026 - Portafolio 6
## Comandos de Git y archivo README.md

> **Actividad**

En GitHub tenemos una gran cantidad de comandos. Hasta ahora hemos visto muchos de ellos en clase.

Se solicitó agregar los comandos que hemos visto en vivo en el archivo **README.md**, dentro del directorio `class-git` o dentro de un directorio con el nombre que elijamos.

Esta actividad se realiza **de manera grupal**.

> **Importante:** Hoy, durante la clase en vivo, se solicitará nuevamente este archivo **README.md** con todas las clases cargadas y organizadas en **formato Markdown**.

# CLASE 08 MIÉRCOLES 30 DE SEPTIEMBRE DEL 2026
## Manejo de ramas en GitHub**

**Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.**

**Para instalar gitk debemos ejecutar los siguientes comandos:**

**```sh**
**sudo apt-get update**
**sudo apt-get install gitk**
**```**

**Repasa: ¿Qué es Git?**

**Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.**

| 🌿 **¿QUÉ ES UNA RAMA?** |
|---|
| Una **rama (branch)** es una línea de trabajo independiente dentro de un repositorio. |
| Permite realizar cambios sin modificar directamente la rama principal `main`. |
| Cuando terminamos nuestro trabajo, los cambios de una rama pueden integrarse con otra mediante un `merge`. |

**Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.**

| 💡 **IMPORTANTE** |
|---|
| Los commits que realizamos mientras estamos en una rama pertenecen a esa rama. |
| Si cambiamos a otra rama, podremos ver el estado de los archivos correspondiente a esa otra rama. |

**Comandos para manejo de ramas en GitHub**

**Crear una rama:**

**```sh**
**git branch branchName #Crear una rama**

**git checkout -b branchName #También crea una rama**

**git checkout branchName # Movernos a otra rama**

**git push origin branchName # Publicar una rama local al repositorio remoto**
**```**

| 📚 **¿QUÉ HACE CADA COMANDO?** |
|---|
| `git branch branchName` → crea una nueva rama. |
| `git checkout -b branchName` → crea una rama y se cambia automáticamente a ella. |
| `git checkout branchName` → cambia a una rama existente. |
| `git push origin branchName` → publica la rama local en GitHub. |

**Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.**

| 🔄 **FLUJO BÁSICO DE RAMAS** |
|---|
| **`main` → crear rama → trabajar → hacer commits → publicar rama → `merge` → `main`** |