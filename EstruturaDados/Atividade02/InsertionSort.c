#include <stdio.h>
#include <stdlib.h>
#define MAX 100

// void Isort(int entrada[], int saida[]);

int main(int argc, char const *argv[]){
    
    int entrada[] = {7,8,5,7,10,3,2,1,0,6};
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    printf("size: %d\n", (int) len);

    
    return 0;
}


// void Isort(int entrada[], int saida[]){

//     for (int j = 2; j < MAX ; j++)
//     {
//         do
//         {
//             int chave = entrada[j]; 
//         } while (i>0 && A[i]>chave);
        
//     }
    
// }