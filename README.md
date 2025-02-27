Ejecutar con el controlador de SQLite

```bash
javac -cp .:sqlite-jdbc-3.49.1.0.jar ./src/Model/Conexion.java ./src/Model/ClassAlumno.java  ./src/View/Alumno.java
```

Ejecutar con el controlador de SQLite

```bash
java -cp .:sqlite-jdbc-3.49.1.0.jar:. src.View.Alumno

```

Para correr en WSL instalamos vcxsrv
iniciamos vcxsrv en windows

y ejecutamos el comando

```bash
export DISPLAY=IPV4deWindows:0.0
```

para ver que tiene la variable de entorno DISPLAY

```bash
echo $DISPLAY
```
