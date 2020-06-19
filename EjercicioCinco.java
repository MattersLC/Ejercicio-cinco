package ejercicio.cinco;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Tamaño del arreglo i: ");
        int n = sc.nextInt();
        System.out.print("Tamaño del arreglo j: ");
        int m = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int mult[] = new int[n+m];
        
        /*for (int i=0; i<n; i++) {
            System.out.print(arr1[i]+i+" ");
        }
        
        System.out.println("");
        
        for (int j=1; j<m; j++) {
            System.out.print(arr2[j]+j+" ");
            for (int i=1; i<n; i++) {
                System.out.print(arr1[i]+" ");
            }
            System.out.println("");
        }*/
        
        for (int i=0; i<n; i++) {
            if ((arr1[i]+i) < 10) {
                System.out.print(arr1[i]+i+" "+" "+"  ");
            }
            else if ((arr1[i]+i) < 100) {
                System.out.print(arr1[i]+i+" "+" "+" ");
            }
            else {
                System.out.print(arr1[i]+i+" "+" ");
            }
        }
        
        System.out.println("");
        
        for (int j=1; j<m; j++) {
            System.out.print(arr2[j]+j+" "+" "+"  ");
            for (int i=1; i<n; i++) {
                mult[i] = (arr1[i]+i) * (arr2[j]+j);
                if (mult[i] < 10) {
                    System.out.print(mult[i]+" "+"   ");
                }
                else if (mult[i] < 100){
                    System.out.print(mult[i]+" "+" "+" ");   
                }
                else {
                    System.out.print(mult[i]+"  ");
                }
            }
            System.out.println("");
        }
    }
    
}
