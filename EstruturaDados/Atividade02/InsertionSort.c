#include <stdio.h>
#include <stdlib.h>

void insertionSort(int entrada[], int saida[]);
void printArray(int array[]);

int main(int argc, char const *argv[]){
    
    int entrada[] = {7,8,5,7,10,3,2,1,0,6};
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    int saida[len];
    
    printf("size: %d\n", (int) len);

    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }

    insertionSort(entrada,saida);
    printf("\n");
    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    return 0;
}


void insertionSort(int entrada[], int saida[]){
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    for (int j = 1; j < len  ; j++){
        int chave = entrada[j];
        //inserir A[j] na sequencia ordenada A[1..j-1]
        int i = j-1;
        while(i>0 && entrada[i]>chave){
            entrada[i+1] = entrada[i];
            i--;
        }
        entrada[i+1] = chave;
        
    }
    
}
