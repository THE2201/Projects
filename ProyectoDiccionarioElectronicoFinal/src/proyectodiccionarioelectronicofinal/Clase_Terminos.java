
package proyectodiccionarioelectronicofinal;


public class Clase_Terminos {
    //ATRIBUTOS
    private String categorias;
    private String terminos;
    private String significados;
    
    // SETERS Y GETERS
    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getSignificados() {
        return significados;
    }

    public void setSignificados(String significados) {
        this.significados = significados;
    }
    
    
    //CONSTRUCTORES
    public Clase_Terminos(String categorias) {
        this.categorias = categorias;
    }

    public Clase_Terminos(String terminos, String significados) {
        this.terminos = terminos;
        this.significados = significados;
    }
    
    public Clase_Terminos(){
        
    }
    
}
