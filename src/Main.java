import creationalPatterns.BuilderDP.Computer;
import creationalPatterns.BuilderDP.ComputerBuilder;
import creationalPatterns.SingletonDP.EnumSingletonPattern;

public class Main {
    public static void main(String[] args) {

        Computer computer = ComputerBuilder.builder().ram("dsfndkj").memory("fksfnkdjs").build();
        System.out.println(computer);

        EnumSingletonPattern singletonPattern = EnumSingletonPattern.INSTANCE;
        EnumSingletonPattern singletonPattern1 = EnumSingletonPattern.INSTANCE;
        System.out.println(singletonPattern == singletonPattern1);//true


    }
}
