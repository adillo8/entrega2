package aplicacion;
import dominio.Mates;
public class Principal{
    public static void main(String[] args){
        //ejercicio 2 apartado 1
        System.out.println("la suma de los 10 primeros numeros naturales es : "+Mates.suma(5));
        //ejercicio 2 apartado 1 (Paloma2)
        System.out.println("la suma de los 10 primeros numeros naturales es : "+Mates.sumaVersion2(5));
        //ejercicio 2 apartado 2
        System.out.println("el factorial de 5 es : "+Mates.factorial(5));
        //ejercicio 2 apartado 3
        System.out.println("la potencia de 2 elevado a 3 es : "+Mates.potenciaNesima(2, 3));
        int lista[] = {1,2,3,4,5};
        double lista2[] = {1,2,3,4,5,6,7,8,9,10};
        //ejercicio 2 apartado 4
        System.out.println("la suma de los elementos de una lista es "+Mates.sumaElementos(lista));
        //ejercicio 2 apartado 5
        System.out.println("la media de los numeros de la lista es "+Mates.media(lista2));
        //ejercicio 4 apartado 6
        System.out.println("la desviacion tipica de los numeros de la lista es ");
        //ejercicio 4 apartado 7
        System.out.println("La suma de los primeros números pares hasta n es "+Mates.sumaNumeros(8, 0));
        //ejercicio 4 apartado 8
        System.out.println("La suma de los elementos pares de una lista de enteros es "+Mates.arrayPares(lista));
       
        
       
        
       
    }
}