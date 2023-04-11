// Classe abstrata para definir a interface dos componentes que serão decorados
abstract class Component {
  public abstract void operation();
  
  Strategy   strategy;
  
  public void setStrategy(Strategy st)     { strategy   = st; }
  public void execute()   { strategy.execute();     }
}