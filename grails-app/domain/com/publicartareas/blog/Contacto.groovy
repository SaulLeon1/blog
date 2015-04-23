package com.publicartareas.blog

class Contacto {
	//long id
	String correo
	String asunto
	String comentario

    static constraints = {
		correo nullable:false, email :true, black:false
		asunto nullable:false, minSize:5, maxSize:20
		comentario nullable:false, minSize:5, maxSize:100
		
		  
		
    }
}
