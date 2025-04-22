package factories;

import refeicoes.*;

public class RUVegetarianoFactory implements RUFactory {

    public CafeDaManha servirCafeDaManha() {
        return new CafeVegetariano();
    }

    public Almoco servirAlmoco() {
        return new AlmocoVegetariano();
    }

    public Jantar servirJantar() {
        return new JantarVegetariano();
    }

    class CafeVegetariano implements CafeDaManha {
        public void servir() {
            System.out.println("Servindo café com pão integral e frutas.");
        }
    }

    class AlmocoVegetariano implements Almoco {
        public void servir() {
            System.out.println("Servindo arroz integral, feijão, legumes grelhados e salada.");
        }
    }

    class JantarVegetariano implements Jantar {
        public void servir() {
            System.out.println("Servindo sopa de lentilhas com torradas integrais.");
        }
    }
}