package chap10.inherit;

import java.util.ArrayList;

public class InheritGenericExample {
    public static void main(String[] args) {
        ChildProduct<Tv,String, String> childProduct =
                new ChildProduct(new Tv(),"galaxy book","samsung");

        System.out.println(childProduct.getCompany());
    }
}
