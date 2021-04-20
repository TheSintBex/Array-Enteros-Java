
package arrayenteros;

import java.util.Scanner;




public class Enteros {

    private int[] tabla;
    private int nEle;

    public Enteros(int nElementos) {
        tabla = new int[nElementos];
        nEle = 0;
    }
//    public Enteros(int[] tabla) {//aquí copiamos la referencia de la tabla.
//       this.tabla = tabla;
//       nEle =tabla.length;
//    }

    public Enteros(int[] tabla) { //aquí copiamos el contenido de la tabla
        this.tabla = new int[tabla.length];
        nEle = tabla.length;
        for (int i = 0; i < tabla.length; i++) {
            this.tabla[i] = tabla[i];
        }

    }

    public boolean insertaValor(int valor) {
        if (nEle < tabla.length) {
            tabla[nEle] = valor;
            nEle++;
            return true;
        } else //este else no es necesario
        {
            return false;
        }

    }

    //inserta valor en la posición pos
    public boolean insertaValor(int valor, int pos) {
        if (pos >= 0 && pos < tabla.length) {
            tabla[pos] = valor;
            return true;
        }
        return false;

    }

    public String toString() {
        String salida = "";

        for (int i = 0; i < tabla.length; i++) {
            salida += tabla[i] + ",";
//            salida = salida + tabla[i];

        }
        return salida;
    }
    
    
         
      public static void leerNumeros(int nElementos) {
        int contador = 0;
        int[] array = new int[nElementos];
        Scanner sc;
        sc = new Scanner(System.in);
        while (contador < nElementos) {
            array[contador] = sc.nextInt();
            contador++;
        }

      }
        public static void leerEscribirDelRevés(int num){
            System.out.println("Introduzca " + num + " elementos: ");
            int contador = 0;
            int[] array = new int [num];
            Scanner sc = new Scanner (System.in);
            while(contador < num){
                array[contador] = sc.nextInt();
                contador ++;
            }
            for (int i = array.length-1; i >= 0; i--){
                System.out.println(array[i]);
            }
           
           
        }
        
     //   4. 3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.
        public static void ordenarArray (){
        int [] array = new int [10];
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        
        for (int i=0; i<array.length; i++){
           array [i] = num;
           num = sc.nextInt();
           
        }
        int k=0;
        int control = (array.length%2==0)?0:1;
//        if (array.length%2==0)
//            control = 0;
        while (k<array.length/2+control){
            System.out.println(array[k]+", "+array[array.length-1-k]);
            k++;  
        }
                
        
        
    }
    
    public static int [] leerTabla (int nElementos){
       Scanner sc = new Scanner (System.in);
       int num = sc.nextInt();
       int [] array = new int [nElementos];
       for (int i =0; i<array.length; i++){
        array [i] = num;
        num = sc.nextInt();
    }
       return array;
    }   
        
        
        
        
    public static void mezclaTabla (){
        
    }
    
}
