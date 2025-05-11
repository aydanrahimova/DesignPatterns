import creationalPatterns.BuilderDP.Computer;
import creationalPatterns.BuilderDP.ComputerBuilder;
import creationalPatterns.SingletonDP.DoubleCheckedSingleton;
import creationalPatterns.SingletonDP.EagerSingletonPattern;
import creationalPatterns.SingletonDP.EnumSingletonPattern;
import creationalPatterns.SingletonDP.LazySingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

//        Computer computer = ComputerBuilder.builder().ram("dsfndkj").memory("fksfnkdjs").build();
//        System.out.println(computer);
//
//        EnumSingletonPattern singletonPattern = EnumSingletonPattern.INSTANCE;
//        EnumSingletonPattern singletonPattern1 = EnumSingletonPattern.INSTANCE;
//        System.out.println(singletonPattern == singletonPattern1);//true

//        for (int i = 0; i < 100; i++) {
//            Thread thread = new Thread(() -> {
//                LazySingletonPattern instance = LazySingletonPattern.getInstance();
//                System.out.println("Instance hash: " + instance.hashCode());
//            });
//            thread.start();
//        }


// Singleton Pattern

        //Singleton can be broken by the use of reflection
        LazySingletonPattern lazyInstance1 = LazySingletonPattern.getInstance();
        LazySingletonPattern lazyInstance2 = LazySingletonPattern.getInstance();
        LazySingletonPattern lazyInstance3 = null;

        Constructor[] lazyConstructors = LazySingletonPattern.class.getDeclaredConstructors();
        for (Constructor constructor : lazyConstructors) {
            constructor.setAccessible(true);
            try {
                lazyInstance3 = (LazySingletonPattern) constructor.newInstance();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("LazyInstance1 hash:" + lazyInstance1.hashCode());
        System.out.println("LazyInstance2 hash:" + lazyInstance2.hashCode());
        System.out.println("LazyInstance3 hash:" + lazyInstance3);

        //to prevent Singleton from Reflection we have 2 solutions:
        //1.throw an exception from the private constructor,so when Reflection tries to invoke private constructor there will be error
        //2.use enum singleton

        //trying 1st solution with EagerSingleton:

        EagerSingletonPattern eagerInstance1 = EagerSingletonPattern.getInstance();
        EagerSingletonPattern eagerInstance2 = EagerSingletonPattern.getInstance();
        EagerSingletonPattern eagerInstance3 = null;

        Constructor[] eagerConstructors = EagerSingletonPattern.class.getDeclaredConstructors();
        for (Constructor constructor : eagerConstructors) {
            constructor.setAccessible(true);
            try {
                eagerInstance3 = (EagerSingletonPattern) constructor.newInstance();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("EagerInstance1 hash:" + eagerInstance1.hashCode());
        System.out.println("EagerInstance2 hash:" + eagerInstance2.hashCode());
        System.out.println("EagerInstance3 hash:" + eagerInstance3);

        //2nd solution - using Enum Singleton
        EnumSingletonPattern enumSingletonPattern = EnumSingletonPattern.INSTANCE;
        enumSingletonPattern.doSomething();
    }
}
