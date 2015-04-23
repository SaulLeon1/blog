package com.publicartareas.blog

class Materia {
	String materia
	Date fecha_tarea
	

    static constraints = {
		materia inList:["Matematicas","Matematicas2","Matematicas2","Matematicas3"]
		fecha_tarea nullable:false,black:false
    }
}
