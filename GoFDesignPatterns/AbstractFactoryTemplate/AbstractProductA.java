public abstract class AbstractProductA {
    String name;
    
    public String getName() {
        return name;
    }

    public void operation() {
        System.out.println("Executando método do Produto A " + name);
    }  
}