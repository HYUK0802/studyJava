package Chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class c = Class.forName("java.lang.String");

//        Constructor[] cons = c.getConstructor();
//        for(Constructor ctor : cons) {
//            System.out.println(ctor);
//
//        }
        Method[] m = c.getMethods();
        for(Method mth : m) {
            System.out.println(mth);
        }
    }
}
