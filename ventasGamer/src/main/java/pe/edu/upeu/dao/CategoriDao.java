package pe.edu.upeu.dao; 

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.categoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX; 

public class CategoriDao extends AppCrud {
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    LeerArchivo leerA; 
    categoriaTO catTO;

    final static String TABLA_CATEGORIA="Categoria.txt";


    /**
     * 
     */
    public void crearCategoria() {
       leerA=new LeerArchivo(TABLA_CATEGORIA);
       catTO=new categoriaTO();
       String idC=generarId(leerA, 0, "c", 1);
       catTO.setIdCat(idC);
       catTO.setIdCat(leerT.leer("", "ingrese nombre categoria"));
       leerA=new LeerArchivo(TABLA_CATEGORIA);
       agregarContenido(leerA, catTO);
   }

    public void listarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object [][] dataC=listarContenido(leerA);
        System.out.println("IdCat\tnombre Categoria");
        for (int i = 0; i < dataC.length; i++) {
            System.out.println(dataC[1][0]+"\t"+dataC[i][1]);   
        }
  
    }

    public void modificarCategoria() {
        listarCategoria();
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        categoriaTO ca=new categoriaTO();
        String idC=leerT.leer("", "ingrese Id Categoria a Modifica");
        ca.setIdCat(leerT.leer("", "ingrese nuevo nombre  Categoria"));
        
        editarRegistro(leerA, 0, idC, ca);
    }

    public void eliminarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        String idC=leerT.leer("", "ingrese Id Categoria a Eliminar");
        eliminarRegistros(leerA, 0, idC);
        
      
    }
}