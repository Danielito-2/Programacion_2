# Programacion_2
# GIT: Preguntas y respuestas

## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto "normal"?

Un **repositorio en Git** es un proyecto con una carpeta oculta `.git`
donde se guarda todo el historial de cambios, commits, ramas y
configuración.\
Un proyecto "normal" no tiene `.git`, por lo que no puede gestionar
versiones.

------------------------------------------------------------------------

## 2. ¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?

-   **Working Directory**: Archivos en tu sistema de archivos, donde
    trabajas.\
-   **Staging Area (Index)**: Zona donde se preparan cambios con
    `git add` antes de confirmarlos.\
-   **Repository (Local)**: Base de datos de Git (dentro de `.git`)
    donde están los commits confirmados.

------------------------------------------------------------------------

## 3. ¿Cómo representa Git los cambios internamente?

-   **blob**: Guarda el contenido de un archivo.\
-   **tree**: Representa un directorio, apunta a blobs y otros trees.\
-   **commit**: Apunta a un tree, contiene metadatos (autor, fecha,
    mensaje) y referencia al commit padre.\
-   **tag**: Marca un commit específico, normalmente para versiones.

------------------------------------------------------------------------

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

``` bash
git add archivo.txt
git commit -m "mensaje"
```

Un commit almacena: - Cambios confirmados.\
- Autor y fecha.\
- Mensaje del commit.\
- Referencia al commit padre.\
- Hash del tree con el estado del proyecto.

------------------------------------------------------------------------

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

-   **git fetch**: Descarga cambios del remoto pero no los integra.\
-   **git pull**: Descarga e integra cambios (fetch + merge o fetch +
    rebase).

------------------------------------------------------------------------

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Un **branch** es un puntero a un commit.\
Cuando haces nuevos commits, la rama avanza automáticamente al último
commit.\
`HEAD` indica en qué rama estás.

------------------------------------------------------------------------

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

``` bash
git checkout main
git merge feature
```

-   Los conflictos surgen si dos ramas modifican la misma línea de un
    archivo o cambios incompatibles.\
-   Se resuelven editando los archivos conflictivos y luego:

``` bash
git add archivo_resuelto
git commit
```

------------------------------------------------------------------------

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

El **staging area** selecciona qué cambios se incluirán en el próximo
commit.\
Si lo omites, `git commit` no incluirá los cambios nuevos (a menos que
uses `git commit -a` para archivos rastreados).

------------------------------------------------------------------------

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

Archivo que lista patrones de archivos y carpetas que Git debe ignorar.\
Ejemplo:

    node_modules/
    *.log
    .env

No afecta a archivos ya rastreados, solo evita que nuevos entren al
control de versiones.

------------------------------------------------------------------------

## 10. ¿Cuál es la diferencia entre un "commit amend" (--amend) y un nuevo commit?

-   **Nuevo commit**: Crea un registro adicional en el historial.\
-   **git commit --amend**: Modifica el último commit (mensaje o
    contenido). Cambia el hash, por lo que no debe usarse en commits ya
    publicados.

------------------------------------------------------------------------

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

Guarda temporalmente cambios sin confirmar:

``` bash
git stash       # guarda
git stash list  # lista
git stash pop   # recupera
```

Escenarios:\
- Cambiar de rama sin perder cambios.\
- Guardar trabajo en curso sin hacer commit.

------------------------------------------------------------------------

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

-   **git reset**: Mueve HEAD y rama.
    -   `--soft`: conserva staging.\
    -   `--mixed`: conserva working directory, limpia staging.\
    -   `--hard`: borra todo.\
-   **git revert**: Crea un commit que revierte otro.\
-   **git restore**:
    -   `git restore archivo`: restaura archivo desde último commit.\
    -   `git restore --staged archivo`: lo saca del staging.

------------------------------------------------------------------------

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

-   **origin**: Remoto por defecto del repo clonado.\
-   **upstream**: Repo original, útil en forks.

Comandos:

``` bash
git remote -v
git remote add upstream <url>
git fetch upstream
git merge upstream/main
```

------------------------------------------------------------------------

## 14. ¿Cómo puedo inspeccionar el historial de commits?

-   `git log`: historial detallado.\
-   `git log --oneline --graph --decorate`: historial resumido.\
-   `git diff`: diferencias entre commits o archivos.\
-   `git show <commit>`: detalles de un commit específico.
