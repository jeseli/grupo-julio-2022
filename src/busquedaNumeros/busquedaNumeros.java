package busquedaNumeros;

import java.util.Arrays;

public class busquedaNumeros {
	
	 public static void main(String[] args) {
	        String[ ] nombre = {"Maria", "Gerson","juan"};
	        String[ ] numeros = {"123456", "33333","123456"};
	        String p = "12";
	        String regreso = "";
	        regreso = Solution(nombre, numeros, p);
	        System.out.println(regreso);
	    }
	    
	    public static String Solution (String[] a, String[] b, String p) {
	    	 long[] array;
	         String[] arrayFinal;
	         int contador = 0;
	         int contador2 = 0;
	         String regreso = "";
	         
	         // longitud del arreglo que guarda las posiciones de las palabras encontradas iteramos b
	         for(int i = 0; i < b.length; i++)  {
	             boolean resultado = b[i].contains(p);//verificar si String contiene otra subcadena o no
	             if(resultado){
	                 contador = contador + 1;
	             }
	         }
	         // se asigna al arreglo las posiciones donde se encontro la palabra
	         array = new long[contador];
	         for(int i = 0; i < b.length; i++)  {
	             boolean resultado = b[i].contains(p);
	             if(resultado){
	                 array[contador2] = i;
	                 contador2 = contador2 + 1;
	             }
	         }
	         //iteramos array guardamos el valor guardamos lo que hay en array en su posicion
	         arrayFinal = new String[array.length];
	         int valor = 0;
	         for(int i = 0; i < array.length; i++)  {
	             valor = (int) array[i];
	             arrayFinal[i] = a[valor];
	         }
	         //si ArrayFinal no tiene nada
	         if(arrayFinal.length == 0){
	             regreso = "No Contact";
	         }else{
	             Arrays.sort(arrayFinal, String.CASE_INSENSITIVE_ORDER);//Comparador que puede ser utilizado para ordenaciones.
	             regreso = arrayFinal[0];
	         }//regresamos a posicion 0
	         
	         
	         return regreso;
	     }
	 }
