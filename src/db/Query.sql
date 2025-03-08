Create table T_Programa(
    ID Integer Primary Key Autoincrement,
    Programa Text Not Null
);

Create table T_Docente(
    Num_ID Integer Primary Key,
    Nombre Text Not Null,
    Apellidos Text Not Null,
    Celular Text Not Null,
    Correo Text Not Null
);

Create table T_Alumno(
    Num_ID Integer Primary Key,
    Nombre Text Not Null,
    Apellidos Text Not Null,
    Celular Text Not Null,
    Correo Text Not Null,
    FK_IdPrograma Integer Not Null,
    Foreign Key (FK_IdPrograma) References T_Programa(ID)
);

Create table T_Asignatura(
    ID Integer Primary Key Autoincrement,
    Nombre Text Not Null,
    ID_Docente Integer Not Null,
    Foreign Key (ID_Docente) References T_Docente(Num_ID)
);

Create table T_Alumno_Asignatura(
    ID Integer Primary Key Autoincrement,
    ID_Alumno Integer Not Null,
    ID_Asignatura Integer Not Null,
    Foreign Key (ID_Alumno) References T_Alumno(Num_ID),
    Foreign Key (ID_Asignatura) References T_Asignatura(ID)
);

Create table T_Programa_Asignatura(
    ID Integer Primary Key Autoincrement,
    ID_Programa Integer Not Null,
    ID_Asignatura Integer Not Null,
    Foreign Key (ID_Programa) References T_Programa(ID),
    Foreign Key (ID_Asignatura) References T_Asignatura(ID)
);

insert into T_Programa(Programa) values('Ingeniería de Sistemas');
insert into T_Programa(Programa) values('Ingeniería Electrónica');
insert into T_Programa(Programa) values('Ingeniería Industrial');
insert into T_Programa(Programa) values('Ingeniería Mecánica');

insert into T_Docente(Num_ID, Nombre, Apellidos, Celular, Correo) values(1, 'Juan', 'Perez', '1234567890', 'jperez@ucentral.edu.co');
insert into T_Docente(Num_ID, Nombre, Apellidos, Celular, Correo) values(2, 'Maria', 'Gomez', '0987654321', 'mgomez@ucentral.edu.co');
insert into T_Docente(Num_ID, Nombre, Apellidos, Celular, Correo) values(3, 'Pedro', 'Ramirez', '1234567890', 'pramirez@ucentral.edu.co');
insert into T_Docente(Num_ID, Nombre, Apellidos, Celular, Correo) values(4, 'Luis', 'Gonzalez', '0987654321', 'lganzalez@ucentral.edu.co');

insert into T_Asignatura(Nombre, ID_Docente) values('Matemáticas 1', 1);
insert into T_Asignatura(Nombre, ID_Docente) values('Matemáticas 2', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Matemáticas 3', 3);
insert into T_Asignatura(Nombre, ID_Docente) values('Matemáticas 4', 4);
insert into T_Asignatura(Nombre, ID_Docente) values('Física 1', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Física 2', 3);
insert into T_Asignatura(Nombre, ID_Docente) values('Física 3', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Química', 3);
insert into T_Asignatura(Nombre, ID_Docente) values('Programación', 4);
insert into T_Asignatura(Nombre, ID_Docente) values('Base de Datos', 1);
insert into T_Asignatura(Nombre, ID_Docente) values('Redes', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Sistemas Operativos', 3);
insert into T_Asignatura(Nombre, ID_Docente) values('Ingeniería de Software', 4);
insert into T_Asignatura(Nombre, ID_Docente) values('Estadística', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Investigación de Operaciones', 3);
insert into T_Asignatura(Nombre, ID_Docente) values('Álgebra Lineal', 4);
insert into T_Asignatura(Nombre, ID_Docente) values('Geometría Analítica', 1);
insert into T_Asignatura(Nombre, ID_Docente) values('Ecuaciones Diferenciales', 2);
insert into T_Asignatura(Nombre, ID_Docente) values('Probabilidad', 3);


insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 1);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 2);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 3);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 4);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 5);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 6);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 7);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 9);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 10);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 11);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 12);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 13);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 14);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 16);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 18);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(1, 19);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 1);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 2);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 3);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 4);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 5);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 6);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 7);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 8);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 9);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 14);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 16);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(2, 17);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 1);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 2); 
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 3);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 4);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 5);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 6);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 8);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 14);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 15);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 16);
insert into T_Programa_Asignatura(ID_Programa, ID_Asignatura) values(3, 19);

insert into T_Alumno (Num_ID, Nombre, Apellidos, Celular, Correo, FK_IdPrograma) values(1015, 'Juan David', 'Vejarano', '3204504132', 'jvjearanom@ucentral.edu.co', 1);

insert into T_Alumno_Asignatura (ID_Alumno, ID_Asignatura) values(1015, 1);
insert into T_Alumno_Asignatura (ID_Alumno, ID_Asignatura) values(1015, 2);
insert into T_Alumno_Asignatura (ID_Alumno, ID_Asignatura) values(1015, 3);
insert into T_Alumno_Asignatura (ID_Alumno, ID_Asignatura) values(1015, 4);


select TAS.Nombre AS NombreAsignatura, TD.Nombre AS NombreDocente 
from T_Alumno AS TAL 
inner join T_Alumno_Asignatura AS TAA ON TAL.Num_ID = TAA.ID_Alumno 
inner join T_Asignatura AS TAS ON TAS.ID = TAA.ID_Asignatura 
inner join T_Docente AS TD on TD.Num_ID = TAS.ID_Docente where TAL.Num_ID = 1015;