
//Before java 8 Functional Interface known
// as "Single Abstract Method" - SAM

//Functional Interface can have default methods
//Functional Interface can static methods
//Functional Interface can have methods of java.lang.Object

//Uma interface que tem apenas um único método abstrato é uma interface funcional
// ela pode ser instanciada atra´ves de uma expressão lambda

// novo pacote do java 8, java.util.function, com uma série de interfaces funcionais

@java.lang.FunctionalInterface
interface FunctionalInterface {
        public void method1();
}

public interface Consumer<T>{
    void accept(T t);
}

@java.lang.FunctionalInterface
interface MyInterface2(){
    public void method1;

    //A functional interface can't have more than 1 abstract method
    public void method2();
}

//antes do java 8
Runnable r = new Runnable(){
    public void run(){
        for(int i = 0; i<= 10;i++){
            System.out.println(i);
        }
    }
};
new Thread(r).start();

//exemplo instancia com expressão lambda
Runnable r = () ->{
    for(int i= 0; i<=10 ;i++){
        System.out.println(i);
    }
};
new Thread(r).start();

// fazendo o mesmo método com menos legibilidade
new Thread(() -> {
    for(int i = 0; i<= 10; i++){
            System.out.println(i);
    }
}).start();