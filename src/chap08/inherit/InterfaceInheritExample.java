package chap08.inherit;

public class InterfaceInheritExample {
    public static void main(String[] args) {
        ImplementsC impleC = new ImplementsC();
        impleC.methodA();
        impleC.methodB();
        impleC.methodC();

        InterfaceA interfaceA = impleC;
//        InterfaceA interfaceA = new ImplementsC();
//        두개가 동일함
        interfaceA.methodA();

        InterfaceB interfaceB = impleC;
        interfaceB.methodB();

        InterfaceC interfaceC = impleC;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
