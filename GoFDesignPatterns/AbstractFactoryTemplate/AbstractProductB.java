public abstract class AbstractProductB {
    String name;
    
    public String getName() {
        return name;
    }

    public void operation() {
        System.out.println("Executando método do Produto B " + name);
    }  
}