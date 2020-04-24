#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char const *argv[]){
    int entrada[] = {2,4,5,7,1,2,3,6};
    int len = (sizeof(entrada)/sizeof(entrada[0]));
    
    printf("size: %d\n", (int) len);

    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    //sort vem aqui

    printf("\n");
    for (int i = 0; i < len; i++){
        printf("%d  ",(int) entrada[i]);
    }
    printf("\n");
    return 0;
}
