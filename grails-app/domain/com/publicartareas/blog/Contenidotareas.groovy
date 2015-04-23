package com.publicartareas.blog

class Contenidotareas {
	//long id
	String tarea1
	String tarea2
	String tarea3 
    
	static constraints = {
		 tarea1 nullable:false, maxSize:50, minSize:2,black:false
		 tarea2 nullable:false, maxSize:100, minSize:2,black:false
		 tarea3 nullable:false, maxSize:150, minSize:2,black:false
		
    }
}
