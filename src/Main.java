import behavioralPatterns.IteratorDP.MyCollection;
import behavioralPatterns.IteratorDP.MyIterator;
import behavioralPatterns.ObserverDP.EmailSubscriber;
import behavioralPatterns.ObserverDP.NewsChannel;
import behavioralPatterns.ObserverDP.Observer;
import behavioralPatterns.ObserverDP.TelegramSubscriber;
import behavioralPatterns.StrategyDP.CreditCardPaymentStrategy;
import behavioralPatterns.StrategyDP.PaymentStrategy;
import behavioralPatterns.StrategyDP.ShoppingCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Computer computer = ComputerBuilder.builder().ram("dsfndkj").memory("fksfnkdjs").build();
//        System.out.println(computer);
//
//        EnumSingleton singletonPattern = EnumSingleton.INSTANCE;
//        EnumSingleton singletonPattern1 = EnumSingleton.INSTANCE;
//        System.out.println(singletonPattern == singletonPattern1);//true

//        for (int i = 0; i < 100; i++) {
//            Thread thread = new Thread(() -> {
//                LazySingleton instance = LazySingleton.getInstance();
//                System.out.println("Instance hash: " + instance.hashCode());
//            });
//            thread.start();
//        }


// Singleton Pattern

        //Singleton can be broken by the use of reflection
//        LazySingleton lazyInstance1 = LazySingleton.getInstance();
//        LazySingleton lazyInstance2 = LazySingleton.getInstance();
//        LazySingleton lazyInstance3 = null;
//
//        Constructor[] lazyConstructors = LazySingleton.class.getDeclaredConstructors();
//        for (Constructor constructor : lazyConstructors) {
//            constructor.setAccessible(true);
//            try {
//                lazyInstance3 = (LazySingleton) constructor.newInstance();
//            } catch (InvocationTargetException e) {
//                throw new RuntimeException(e);
//            } catch (InstantiationException e) {
//                throw new RuntimeException(e);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("LazyInstance1 hash:" + lazyInstance1.hashCode());
//        System.out.println("LazyInstance2 hash:" + lazyInstance2.hashCode());
//        System.out.println("LazyInstance3 hash:" + lazyInstance3);

        //to prevent Singleton from Reflection we have 2 solutions:
        //1.throw an exception from the private constructor,so when Reflection tries to invoke private constructor there will be error
        //2.use enum singleton

        //trying 1st solution with EagerSingleton:

//        EagerSingleton eagerInstance1 = EagerSingleton.getInstance();
//        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();
//        EagerSingleton eagerInstance3 = null;
//
//        Constructor[] eagerConstructors = EagerSingleton.class.getDeclaredConstructors();
//        for (Constructor constructor : eagerConstructors) {
//            constructor.setAccessible(true);
//            try {
//                eagerInstance3 = (EagerSingleton) constructor.newInstance();
//            } catch (InvocationTargetException e) {
//                throw new RuntimeException(e);
//            } catch (InstantiationException e) {
//                throw new RuntimeException(e);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("EagerInstance1 hash:" + eagerInstance1.hashCode());
//        System.out.println("EagerInstance2 hash:" + eagerInstance2.hashCode());
//        System.out.println("EagerInstance3 hash:" + eagerInstance3);

        //2nd solution - using Enum Singleton
//        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
//        enumSingleton.doSomething();
//
//
//        SerializedSingleton serializedSingleton1 = SerializedSingleton.instance;
//        SerializedSingleton serializedSingleton2 = null;
//
//        String file = "smth";
//
//        try (FileOutputStream fos = new FileOutputStream(file);
//             ObjectOutputStream oos = new ObjectOutputStream(fos);
//             FileInputStream fis = new FileInputStream(file);
//             ObjectInputStream ois = new ObjectInputStream(fis)) {
//
//            oos.writeObject(serializedSingleton1);
//            System.out.println("Starting deserialization...");
//            serializedSingleton2 = (SerializedSingleton) ois.readObject();
//            System.out.println("Deserialization completes...");
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(serializedSingleton1 == serializedSingleton2);
//
//        User user = new User("Aydan", "Rahimova", new Passport("123"));
//        User user1 = (User) user.shallowCopy();
//        user.setPassport(new Passport("456"));
//        System.out.println(user);
//        System.out.println(user1);
//
//        User user2 = new User("Aydan", "Rahimova", new Passport("123"));
//        User user3 = (User) user2.deepCopy();
//        user2.setPassport(new Passport("678"));
//        System.out.println(user2);
//        System.out.println(user3);
//
//        System.out.println(user == user1);//false

//        Passport sharedPassport = new Passport("123");
//        User original = new User("John", "Smith", sharedPassport);
//        User shallow = (User) original.shallowCopy();
//        User deep = (User) original.deepCopy();
//        sharedPassport.setFin("456");
//
//// Shallow copy test
//        System.out.println("Passport of shallow user copy after change: " + (shallow.getPassport()));
//        System.out.println("Is original and shallow copy of the user the same?: " + (original == shallow));// should be true
//        System.out.println("Passport origin vs shallow: " + (original.getPassport() == shallow.getPassport()));
//
//// Deep copy test
//        System.out.println("Passport of deep user copy after change: " + (deep.getPassport()));
//        System.out.println("Is original and deep copy of the user the same?: " + (original == deep)); // should be false
//        System.out.println("Passport original vs deep: " + (original.getPassport() == deep.getPassport()));
//
//        User cloneUser = original.clone();
//        System.out.println(cloneUser == original);//false
//        System.out.println(cloneUser.getPassport() == original.getPassport());//true


//Factory Design Pattern(Simple Factory Pattern):
// Creates objects without showing the creation logic to the user.
// Returns objects using a common interface (MessageFactory)
//// Easier and simpler than Factory Method.
//
//        System.out.println("-----------------Factory Design Pattern(Simple Factory Pattern)-----------------");
//        System.out.println("Please enter the type of message(for factory DP):");
//        String notificationType = scanner.nextLine();
//        Message message = MessageFactory.createNotificationByType(notificationType);
//        if (message != null) {
//            message.sendMessage();
//        } else {
//            System.out.println("Message is null");
//        }
//
//
////Factory Method Design Pattern
//// Defines an interface for creating an object, but lets subclasses decide which class to return.(We create factory class for each concrete product)
//// Helps in creating objects with more flexibility and supports open/closed principle.
//
//        System.out.println("-----------------Factory Method Design Pattern-----------------");
//
//        System.out.println("Please enter the type of notification(for factory method DP):");
//        String type = scanner.nextLine();
//        NotificationFactory notificationFactory = switch (type) {
//            case "SMS" -> new SMSNotificationFactory();
//            case "Email" -> new EmailNotificationFactory();
//            default -> null;
//        };
//        if (notificationFactory != null) {
//            Notification notification = notificationFactory.createNotification();
//            notification.notifyUser();
//        } else {
//            System.out.println("Message Factory is null");
//        }


////Abstract Factory Design Pattern
//        System.out.println("-----------------Abstract Factory Design Pattern-----------------");
//        System.out.println("Please enter the type of team that you want to create:");
//        String teamType = scanner.nextLine();
//        TeamFactory teamFactory = switch (teamType) {
//            case "Bank App" -> new BankAppTeamFactory();
//            case "ChatBot" -> new ChatBotTeamFactory();
//            default -> null;
//        };
//
//        if (teamFactory != null) {
//            Developer developer = teamFactory.createDeveloper();
//            developer.writeCode();
//            ProductOwner po = teamFactory.createProductOwner();
//            po.manageProject();
//        } else {
//            System.out.println("Team factory is null");
//        }
//
//
////AdapterDP Design Pattern
//        //Class AdapterDP
////        System.out.println("-----------------AdapterDP Design Pattern-Class AdapterDP-----------------");
//        UserInfoProvider user = new MyGovClassAdapter("Aydan Rahimova", "123FIN", "01.01.2001");
//        System.out.println("User's name: " + user.getName());
//        System.out.println("User's surname: " + user.getSurname());
//        System.out.println("User's fin: " + user.getFin());
//        System.out.println("User's DOB: " + user.getDOB());
////
////        //Object AdapterDP
////        System.out.println("-----------------AdapterDP Design Pattern-Object AdapterDP-----------------");
//        MyGov myGov = new MyGov("Aydan Rahimova", "123FIN", "01.01.2001");
//        UserInfoProvider user1 = new MyGovObjectAdapter(myGov);
//        System.out.println("User's name: " + user.getName());
//        System.out.println("User's surname: " + user.getSurname());
//        System.out.println("User's fin: " + user.getFin());
//        System.out.println("User's DOB: " + user.getDOB());
//
////Proxy Design Pattern
//        //this logic represents use of proxy pattern for lazy initialization
//        System.out.println("-----------------Proxy Design Pattern-----------------");
//        Image image = new ProxyImage("photo.jpg");
//        System.out.println("First attempt to display the image:");
//        image.display();//loading+display
//        System.out.println("Second attempt to display the image:");
//        image.display();//only display
//
////Bridge Design Pattern
//        //without Bridge Design Pattern every combination of Shape and Color will require its own class like RedTriangle,RedRectangular etc.
//        System.out.println("-----------------Bridge Design Pattern-----------------");
//        Shape triangle = new Triangle(new RedColor());
//        triangle.applyColor();
//        Shape rectangular = new Rectangular(new GreenColor());
//        rectangular.applyColor();
//
////Facade Design Pattern
//        System.out.println("-----------------Facade Design Pattern-----------------");
//        UserRegistrationFacade registrationFacade = new UserRegistrationFacade(new UserValidator(), new UserRepository(), new EmailService());
//        System.out.println("Registration of 1st user started...");
//        registrationFacade.registerUser("aydan@gmail.com", "123456");
//        System.out.println("Registration of 2nd user started...");
//        registrationFacade.registerUser("aydan_gmail.com", "123456");
//
////Decorator Design Pattern
//        System.out.println("-----------------Decorator Design Pattern-----------------");
//        Coffee plainCoffee = new PlainCoffee();
//        System.out.println(plainCoffee.getDescription());
//        System.out.println(plainCoffee.getPrice());
//
//        Coffee coffeeWithMilk = new MilkCoffeeDecorator(plainCoffee);
//        System.out.println(coffeeWithMilk.getDescription());
//        System.out.println(coffeeWithMilk.getPrice());
//
//        Coffee coffeeWithMilkAndSugar = new SugarCoffeeDecorator(new MilkCoffeeDecorator(plainCoffee));
//        System.out.println(coffeeWithMilkAndSugar.getDescription());
//        System.out.println(coffeeWithMilkAndSugar.getPrice());

//Iterator Design Pattern
//        System.out.println("-----------------Iterator Design Pattern-----------------");
//        MyCollection<String> collection = new MyCollection<>(5);
//        collection.add("A");
//        collection.add("B");
//        collection.add("C");
//        MyIterator<String> collectionIterator = collection.iterator();
//        while (collectionIterator.hasNext()) {
//            System.out.println(collectionIterator.next());
//        }
//
////Strategy Design Pattern
//        ShoppingCard shoppingCard = new ShoppingCard();
//        shoppingCard.setPaymentStrategy(new CreditCardPaymentStrategy());
//        shoppingCard.checkout(123.4);

//Observer Design Pattern
        NewsChannel channel = new NewsChannel();
        channel.setNews("newss");
        Observer emailSubscriber = new EmailSubscriber();
        Observer telegramSubscriber = new TelegramSubscriber();
        channel.addObserver(emailSubscriber);
        channel.addObserver(telegramSubscriber);
        channel.notifyObservers();

    }



}
