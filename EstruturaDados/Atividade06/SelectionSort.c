#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void selectionSort(int A[], int lenA);

int main(int argc, char const *argv[]){
    int entrada[] = {2,4,5,7,1,2,3,6};
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    
    printf("size: %d\n", (int) len);

    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    //sort vem aqui
    selectionSort(entrada,len);
    printf("\n");
    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    return 0;
}


void selectionSort(int A[], int lenA){
    int menor,menorIndice, aux;

    for (int i = 0; i < lenA-1; i++){
        menor = A[i];
        for (int j = i+1; j < lenA; j++){
            if(A[j]<menor){
                menor = A[j];
                menorIndice = j;
            }
        }
        if(A[i]!=menor){
        aux = A[i];
        A[i] = menor;
        A[menorIndice] = aux;
        }
    }
    
}