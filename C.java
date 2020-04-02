package polymorphism;

public class C extends B {
    public C(){
        super();
        System.out.println("Constructer an instance of C");
    }
    @Override
    public String toString(){
        return "This is C";
    }
}
