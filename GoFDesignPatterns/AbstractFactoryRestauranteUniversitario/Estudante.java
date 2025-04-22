import factories.RUFactory;
import refeicoes.*;

public class Estudante {
    private String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void realizarRefeicao(RUFactory ru, TipoRefeicao tipo) {
        System.out.println("\n[" + nome + "] vai fazer " + tipo.name().replace("_", " ").toLowerCase() + " no RU:");

        switch (tipo) {
            case CAFE_DA_MANHA:
                CafeDaManha cafe = ru.servirCafeDaManha();
                System.out.print("- Café da manhã: ");
                cafe.servir();
                break;
            case ALMOCO:
                Almoco almoco = ru.servirAlmoco();
                System.out.print("- Almoço: ");
                almoco.servir();
                break;
            case JANTAR:
                Jantar jantar = ru.servirJantar();
                System.out.print("- Jantar: ");
                jantar.servir();
                break;
        }
    }
}