package com.vincoorbis.blog

class Loquesea {
	
	//Long id
	String nombre
	Date fechaDeCreacion
	String contenido
	
    static constraints = {
		nombre nullable:false, blank: false, maxSize: 100, minSize:5
		fechaDeCreacion nullable:false
		contenido nullable:false, blank: false, maxSize: 100, minSize:5
    }
}
