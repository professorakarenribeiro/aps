public abstract class Product {
    String name;
    
    public String getName() {
        return name;
    }

    public void operation() {
        System.out.println("Executando método da instância do " + name);
    }  
}