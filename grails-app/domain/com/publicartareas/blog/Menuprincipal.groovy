package com.publicartareas.blog

class Menuprincipal {
	//long id
	String tarea
	String materia
	String contacto
	String menu
    static constraints = {
		tarea nullable: false , black: false ,maxSize:100
		materia nullable: false, black:false, maxSize:30
		menu inList:["Tare","Materia","Contacto"]
		
		
    }
}
