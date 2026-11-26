# C的筆記
## include
#include 是前置處理指令，不是敘述，後面不能加 ;

### <string.h>
`strcpy(c[n],b);` 把b複製到c[n]

## printf
-  4 3 3 → printf("%d %d %d",a,b,c);
-  4,3,3 → printf("%d,%d,%d",a,b,c);

## scanf
- scanf 需要變數的位址(&)才能把值寫進去。

字串以字元陣列儲存
```c
#include <stdio.h>
int main(void){
    char a[128];
    scanf("%s",&a);
    char b[]="apple"
}
```