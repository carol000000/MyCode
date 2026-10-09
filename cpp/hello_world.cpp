#include <iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"next a,b\n";
    cin>>a>>b;
    int c = a+b;
    cout<<"a+b="<<c<<endl;
    for(int i=0;i<c;i++){
        cout<<"hello_world,";
    }
    return 0;
}
/* 
#include <iostream>
int main(){
    std::cout<<"hello_world\nhello\nworld";
    std::cout<<"\n";
    std::cout<<"hello"<<std::endl;
    std::cout<<"world";
    return 0;
}
*/