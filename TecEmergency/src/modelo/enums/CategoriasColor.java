/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.enums;

/**
 *
 * @author raquelrojas
 */
public enum CategoriasColor {
      VERDE("V","Verde"),
     AMARILLO("A","Amarillo"),
     ROJO("R","Rojo");

    public static CategoriasColor valueOf(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     private String codigoCategoria ;
     private String palabraCategoria;

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getPalabraCategoria() {
        return palabraCategoria;
    }

    public void setPalabraCategoria(String palabraCategoria) {
        this.palabraCategoria = palabraCategoria;
    }

    private CategoriasColor(String codigoCategoria, String palabraCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.palabraCategoria = palabraCategoria;
    }

    
}
