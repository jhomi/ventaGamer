package pe.edu.upeu.ventasGamer;

import pe.edu.upeu.dao.CategoriDao;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();

    public void MenuPrincial() {
        String msOpciones = "1=crear Categoria\n2=Listar Categoria\n" + "3=Editar  Categoria\n4=Eliminar  Categoria ";

        int opcion = 0;
        do {
            switch (opcion) {
                case 1:
                    new CategoriDao().crearCategoria();break;
                case 2:
                    new CategoriDao().listarCategoria();break;
                case 3:
                    new CategoriDao().modificarCategoria();break;
                case 4:
                    new CategoriDao().eliminarCategoria();break;
                default:
                    break;
            }
            opcion = leerT.leer(0, msOpciones);
        } while (opcion != 0);
    }
}
