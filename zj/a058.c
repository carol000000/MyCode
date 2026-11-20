#include <stdio.h>
#include <stdlib.h>

int main(void){
    int a;
    scanf("%d",&a);
    int k=0,k1=0,k2=0;
    for(int i=0;i<a;i++){
        int b;
        scanf("%d",&b);
        if(b%3==1){
            k1++;
        }else if(b%3==2){
            k2++;
        }else{
            k++;
        }
    }
    printf("%d %d %d",k,k1,k2);
    return 0;
}
/*
想輸出 4 3 3 → 格式寫 "%d %d %d"
想輸出 4,3,3 → 格式才寫 "%d,%d,%d"
---
scanf 需要「變數的位址」才能把值寫進去。
---
#include 是前置處理指令，不是敘述，後面不能加 ;
*/