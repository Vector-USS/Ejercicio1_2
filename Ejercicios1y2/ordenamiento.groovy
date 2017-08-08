class Ordenamiento{
 	
 	Ordenamiento(){

 	}

 	// de manera descendente //
  	def burbuja( Integer []arreglo ) {

      for(int i = 0 ; i < (arreglo.size()-1)  ; i++){
      	for(int j = 0; j < (arreglo.size()-1); j++){
            if (arreglo[j] < arreglo[j + 1]){
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
            }
        }
      }
       
    }

    def print_array(Integer [] vector ){
    	for(int k=0 ; k<vector.size() ; k++ ) {
    		println vector[k]
    	}

    }

}


def obj = new Ordenamiento()

def vector = new Integer[10]

Random rand = new Random() 

for( i in 0..9 ){
   vector[i] = (int)rand.nextInt(100)
}

println "VECTOR NO ORDENADO"
obj.print_array(vector)

println "\n"
println "VECTOR ORDENADO"
obj.burbuja( vector )
obj.print_array(vector)



