import groovy.json.JsonOutput

class Convertir{
	
	Convertir(){

	}

	def convertir_json( map, ruta, nombre_archivo  ){
	  
	   def output = JsonOutput.toJson(map)

	   new File(ruta+nombre_archivo).write( output )
       
	}

}

def obj = new Convertir()
def mapa=["Nombre" :'Miguel Angel Romero', "Edad" : 27] 

//ruta solo de ejemplo
String ruta      = "C:/Users/MiguelAngelVector/Desktop/Ejercicios1y2/"
String nomb_json = "person.json"  

obj.convertir_json(mapa,ruta,nomb_json)