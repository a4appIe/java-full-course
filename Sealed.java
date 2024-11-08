sealed class A permits B, C { // USED TO SET RESTRICTIONS IN YOUR CODE

}

final class B extends A {

}

non-sealed class C extends A {

}

class D {

}

public class Sealed {
    public static void main(String[] args) {

    }

}
