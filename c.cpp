#include <iostream>
using namespace std;

class A{
    void print(){
        cout << "print";
    }
};
class B{
    void print(){
        cout << "printing";
    }
};
class C: public A,public B {
    
}

int main(){
    C cl = new C();
    cl.print();
}