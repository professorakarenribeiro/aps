package factories;

import refeicoes.*;

public interface RUFactory {
    CafeDaManha servirCafeDaManha();
    Almoco servirAlmoco();
    Jantar servirJantar();
}