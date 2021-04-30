/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

/**
 *
 * @author Garces
 */
public class clsArbol {

    private int altura = 0;

    private clsNodo root;

    public clsArbol() {
        this.root = null;
    }
    private boolean afirmacion = false;

    public void buscar(clsNodo tmp, int entra) {
        if (tmp == null) {
            System.out.println("No hay ningun dato ingresado");
        } else {
            if (tmp.getDer() != null) {

                buscar(tmp.getDer(), entra);
            }
            if (tmp.getIzq() != null) {
                buscar(tmp.getIzq(), entra);
            }
            if (entra == tmp.getDato()) {
                afirmacion = true;
            }
            else{
                afirmacion = false;
            }
            
        }
    }

    private void retornarAltura(clsNodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > getAltura()) {
                setAltura(nivel);
            }
            retornarAltura(reco.getDer(), nivel + 1);
        }
    }

    public int retornarAltura() {
        setAltura(0);
        retornarAltura(root, 1);
        System.out.println("La ultura del arbol es " + getAltura());
        return getAltura();
    }

    public void insertar(clsNodo dato, clsNodo rootTmp) {
        if (this.getRoot() == null) {
            this.setRoot(dato);
        } else {
            if (dato.getDato() > rootTmp.getDato()) {
                if (rootTmp.getDer() == null) {
                    rootTmp.setDer(dato);
                } else {
                    insertar(dato, rootTmp.getDer());
                }

            } else {
                if (dato.getDato() <= rootTmp.getDato()) {
                    if (rootTmp.getIzq() == null) {
                        rootTmp.setIzq(dato);
                    } else {
                        insertar(dato, rootTmp.getIzq());
                    }

                }
            }
        }
    }

    public void InOrden(clsNodo rootTmp) {
        if (rootTmp != null) {

            if (rootTmp.getIzq() != null) {
                InOrden(rootTmp.getIzq());
            }
            System.out.println("Numero:" + rootTmp.getDato());
            if (rootTmp.getDer() != null) {
                InOrden(rootTmp.getDer());
            }

        }
    }

    public void PreOrden(clsNodo rootTmp) {
        if (rootTmp != null) {
            System.out.println("Numero:" + rootTmp.getDato());
            if (rootTmp.getIzq() != null) {
                PreOrden(rootTmp.getIzq());
            }
            if (rootTmp.getDer() != null) {
                PreOrden(rootTmp.getDer());
            }

        }
    }

    public void PostOrden(clsNodo rootTmp) {
        if (rootTmp != null) {
            if (rootTmp.getIzq() != null) {
                PostOrden(rootTmp.getIzq());
            }
            if (rootTmp.getDer() != null) {
                PostOrden(rootTmp.getDer());
            }
            System.out.println("Numero:" + rootTmp.getDato());
        }
    }

    public clsNodo getRoot() {
        return root;
    }

    public void setRoot(clsNodo root) {
        this.root = root;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the afirmacion
     */
    public boolean isAfirmacion() {
        return afirmacion;
    }

    /**
     * @param afirmacion the afirmacion to set
     */
    public void setAfirmacion(boolean afirmacion) {
        this.afirmacion = afirmacion;
    }
}
