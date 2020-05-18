#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int buscaBinaria(int A[],int inicio,int fim,int elemento);

int main(int argc, char const *argv[]){
    int entrada[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int len = (sizeof(entrada)/sizeof(entrada[0]));

    printf("size: %d\n", (int) len);

    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    //sort vem aqui
    printf("Indice: %d",buscaBinaria(entrada,0,len,5));
    return 0;
}


int buscaBinaria(int A[],int inicio,int fim,int elemento){
    int i = (inicio+fim)/2;
    if(A[i]==elemento)
        return A[i];
    else if(inicio==fim)
        return -1;
    else if(A[i]<elemento)
        buscaBinaria(A,i+1,fim,elemento);
    else
        buscaBinaria(A,inicio,i-1,elemento);
}
