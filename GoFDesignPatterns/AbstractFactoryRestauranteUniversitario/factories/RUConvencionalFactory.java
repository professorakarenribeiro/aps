package factories;

import refeicoes.*;

public class RUConvencionalFactory implements RUFactory {

    public CafeDaManha servirCafeDaManha() {
        return new CafeConvencional();
    }

    public Almoco servirAlmoco() {
        return new AlmocoConvencional();
    }

    public Jantar servirJantar() {
        return new JantarConvencional();
    }

    class CafeConvencional implements CafeDaManha {
        public void servir() {
            System.out.println("Servindo café com leite e pão francês com presunto e queijo.");
        }
    }

    class AlmocoConvencional implements Almoco {
        public void servir() {
            System.out.println("Servindo arroz, feijão, carne e salada.");
        }
    }

    class JantarConvencional implements Jantar {
        public void servir() {
            System.out.println("Servindo sopa de frango com legumes e pão.");
        }
    }
}