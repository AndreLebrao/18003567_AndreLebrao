#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define inf INFINITY;

void merge(int A[],int P, int q, int r);
void mergeSort(int A[],int p, int r);
int main(int argc, char const *argv[])
{
    int entrada[] = {2,4,5,7,1,2,3,6};
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    
    printf("size: %d\n", (int) len);

    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    //sort vem aqui
    merge(entrada,1,3,8);

    printf("\n");
    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    return 0;
}

void merge(int A[],int p, int q, int r){
    int i,j,k;
    int n1 = q-p+1;
    int n2 = r-q;
    int L[n1+1], R[n2+1];

    for (int i = 0; i < n1; i++){
        L[i] = A[p+i-1];
    }
    for (int j = 0; j < n2; j++){
        R[j] = A[q+j];
    }
    L[n1+1] = inf;
    R[n2+1] = inf;
    i=0;
    j=0;
   for(k=p; k <= r; k++){
       if (L[i]<R[j]){
           A[k] = L[i];
           i++;
       }
       else{
           A[k] = R[j];
           j++;
       }
       
   }
}
void mergeSort(int A[],int p, int r){
    if(p<r){
        
    }
}


    //print das matrizes
    // for (i = 0; i < n1+1; i++)
    // {
    //     printf("%d  ",(int) L[i]);
    // }
    // for (j = 0; j < n2+1; j++)
    // {
    //     printf("%d  ",(int) R[j]);
    // }
    
 

    