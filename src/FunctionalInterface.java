
//Before java 8 Functional Interface known
// as "Single Abstract Method" - SAM

//Functional Interface can have default methods
//Functional Interface can static methods
//Functional Interface can have methods of java.lang.Object

@java.lang.FunctionalInterface
interface FunctionalInterface {
        public void method1();
}

@java.lang.FunctionalInterface
interface MyInterface2(){
    public void method1;

    //A functional interface can't have more than 1 abstract method
    public void method2();
}
