#include <stdio.h>
#include <string.h>
int main(void){
    char a[128];
    scanf("%s",&a);
    char b[128];
    char c[128][128];
    int n=0;
     while(scanf("%s",b)==1){
        strcpy(c[n],b);
        n++;
     }
     printf("%s ",c[0]);
    for(int i=1;i<n;i++){
        printf("%s %s ",a,c[i]);
    }
}