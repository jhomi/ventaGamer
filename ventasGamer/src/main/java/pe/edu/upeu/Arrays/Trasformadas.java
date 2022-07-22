package pe.edu.upeu.Arrays;

import java.util.Scanner;

public class Trasformadas {
    Scanner cs = new  Scanner(System.in);


    public  void Trasformadas01() {
        System.out.println("Ingrese la dimension de la  Matriz ");
        int dimension=cs.nextInt();
        System.out.println("ingrese valor inicial");
        int valor=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                if (c<dimension-f) {
                    matriz[f][c]=String.valueOf(valor+(f+c)+(f+c+1)/2 + f);
                    
                }
                
            }
            
        }
        imprimirMatriz(matriz);

    }
    public void trasfomada9() {
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = (matriz[0].length - 1) - fila; columna <= matriz[0].length - 1; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
        
    }
    public void trasfomada21() {
        String[][] matriz;
        System.out.println("ingrese la dimension de la matriz");
        int dimension=cs.nextInt();
        int valor=0;
        matriz=new String[dimension][dimension];
        for (int columna = 0; columna < matriz[0].length; columna++) {
            if (columna%2==0) {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
 
                }
                
            }else{
                for (int fila =  matriz.length-1 ;fila >=0; fila--) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
 
                }
                

            }
            
        }
        imprimirMatriz(matriz);

        
    }
    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (m[f][c]==null) {
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");
                }
                
            }
            System.out.println("");
            
        }
        
    }
    public void Trasformadas10() {
        System.out.println("Ingrese dimesion de la matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= fila; columna++) {
                matriz[fila][fila - columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void trasfomada11() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz.length - 1) - f; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void Trasformadas27JDPM() {
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

            
        }
        imprimirMatriz(matriz);
        
    } 
    public void trasformadas5jdmp() {
        System.out.println("Ingrese dimesion de Matris:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valor+(f+c)*(f+c+1)/2 + f);
                }                
            }
        }
        imprimirMatriz(matriz);
    }   
    public void trasfomada8() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = f ; c < matriz[f].length; c++) {
                matriz[f][c]=String.valueOf(valor);
                valor++;
            }
            
        }
        imprimirMatriz(matriz);
    }
    public void Trasformadas12() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c =  matriz[f].length-1; c>=f ;c--) {
                matriz[f][c]=String.valueOf(valor);
                valor++;
                
            }
            
        }
        imprimirMatriz(matriz);

        
    }
    public void Trasformadas20() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        matriz=new String[dimension][dimension];
        for (int f = (matriz[0].length-1);f>= 0; f--) {
            for (int c = matriz[f].length-1; c>= f ;c--) {
                matriz[c][f] = String.valueOf(valor);
                valor++; 
            }
        }
        imprimirMatriz(matriz);
        
    }
    public void Trasformadas30() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = cs.nextInt();
        matriz=new String[dimension][dimension];
        for (int v  = 0; v < dimension / 2; v++) {
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v]= String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension-1-v;lin> v ; lin--) {
                matriz[dimension-1 -v][lin]=String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension -1 -v; liz >v ; liz--) {
                matriz[liz][v]= String.valueOf(valor);
                valor++;
            }
            for (int ls = v ; ls < dimension-1 -v; ls++) {
                matriz[v][ls]=String.valueOf(valor);
                valor++;
                
            }
        }
        if (dimension % 2!=0) {
            matriz[dimension / 2][dimension / 2]=String.valueOf(valor);
            
        }
        imprimirMatriz(matriz);


    }
    public void trasfomada14() {
        System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            int valor = 0;
            String[][] matriz = new String[dimension][dimension];
            for (int columnas = 0; columnas < matriz.length; columnas++) {
                for (int filas = 0; filas <= columnas; filas++) {
                    matriz[filas][columnas] = String.valueOf(valor);
                    valor=valor+1;
                }
            }
            imprimirMatriz(matriz);  
    }
    public void trasfomada18() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        int valor=0;            
        String[][] matriz=new String[dimension][dimension];
        for (int columna = matriz[0].length-1; columna >=0 ; columna++) {
            for (int f =0 ; f < matriz.length-((dimension-1)-columna); f--) {               
                matriz[f][columna]= String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
        
    }
    public void trasfomada26() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];
        for ( int fila = 0; fila < matriz.length; fila++) {
            if(fila%2==0){
                for (int columna = matriz.length-1; columna >=0; columna--) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
                }else{
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public void trasfomada6() {
        
    }




    public static void main(String[] args) {
    //new Trasformadas().Trasformadas01();
    //new Trasformadas().trasfomada21();
    //new Trasformadas().Trasformadas27JDPM();
    //new Trasformadas().trasformadas5jdmp();
    //new Trasformadas().trasfomada8();
    //new Trasformadas().Trasformadas12();
    //new Trasformadas().Trasformadas20();
    //new Trasformadas().Trasformadas30();
    //new Trasformadas().trasfomada14();
    //new Trasformadas().trasfomada18();
    //new Trasformadas().trasfomada9();
    //new Trasformadas().Trasformadas10();
    //new Trasformadas().trasfomada11();
    //new Trasformadas().trasfomada26();


   }
}
