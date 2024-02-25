package dominio;
import java.math.*;
import java.util.*;
public class Mates{
    //los metodos son estaticos porque son utilidades que ofrece la clase
    //ejercicio 2 apartado 1
    public static int suma(int n){
        if(n==0){
            return 0;
        }else{
            return n+suma(n-1);
        }

        
    }
    
    
    //ejercicio 2 apartado 1 (Paloma)
    public static int sumaMemoria(int n,int i,int acumulado){
        if(i>n){
            return acumulado;
        }else{
            //recursividad directa porque se llama a si misma en su metodo
            return sumaMemoria(n,i+1,acumulado+i);
        }

    }
    //ejercicio 2 apartado 1 (Paloma)2
    public static int sumaVersion2(int n){
        return sumaMemoria(n,1,0);
    }
    //el metodo sumaVersion2 llama al metodo sumaMemoria que es el que hace la recursividad
    
    
    
    //ejercicio 2 apartado 2
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    //ejercicio 2 apartado 3
    public static int potenciaNesima(int n, int m){
        if(m==0){
            return 1;
        }else{
            return n*potenciaNesima(n, m-1);
        }
    }

    

    //ejercicio 2 apartado 4
    public static int sumaElementos(int[] arrayList, int suma, int i){
        //la suma total de los elementos sera el valor de la suma mas el valor del elemento en la posicion i
        int n = arrayList.length;
        suma += arrayList[i];
        i++;

        if(i == n){
            return suma;
        }
        
        else{
            return sumaElementos(arrayList,suma,i);
        }
    }
    public static int sumaElementos(int[] arrayList){
        return sumaElementos(arrayList, 0 ,0);
    }


    //ejercicio 2 apartado 5
    public static double media(double[] arrayList, double suma, int i){
        if(i == arrayList.length){
            return suma/arrayList.length;
        }
        else{
            return media(arrayList, suma + arrayList[i], ++i);
        }
    }

    public static double media(double[] arrayList){
        return media(arrayList,0,0);
    }



    //ejercicio 2 apartado 6
    public static double desviacionTipica(double[] arrayList, double media, double suma, int i){
        if(i == arrayList.length){
            return Math.sqrt(suma/arrayList.length);
        }
        else{
            return desviacionTipica(arrayList, media, suma + Math.pow(arrayList[i] - media, 2), ++i);
        }
    }
    public static double desviacionTipica(double[] arrayList){
        return desviacionTipica(arrayList, media(arrayList), 0, 0);
    }

    //ejercicio 2 apartado 7
    public static int sumaNumeros(int n, int suma){
        //si es impar se le suma 1 para que sea par
        if(n%2 != 0){
            return sumaNumeros(n-1,suma);
        }
        else{
            if(n<2){
                return suma;
            }
            //si n es mayor que 2 se le suma n a la suma
            else{
                return sumaNumeros(n-2, suma+n);
            }

        }
    }

    public static int sumaNumeros(int n){
        return sumaNumeros(n, 0);
    }
    
    //ejercicio 2 apartado 8
    public static int arrayPares(int[] arrayList, int suma, int i){
        if (i == 0){
            return suma;
        }
        else{
            //postdecremento
            i--;
            if(arrayList[i]%2 == 0){
            return arrayPares(arrayList, suma + arrayList[i], i);
            }
            else{
            return arrayPares(arrayList, suma, i);
            }
        }
    }

    public static int arrayPares(int[] arrayList){
        return arrayPares(arrayList, 0, arrayList.length-1);
    }

}  