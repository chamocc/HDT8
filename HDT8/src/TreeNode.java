/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class TreeNode {
    private TreeNode padre, derecho, izquierdo;
    private boolean color;
    private Word dato;
    
    public TreeNode (TreeNode _padre, TreeNode _izquierdo, TreeNode _derecho, 
            boolean _color, Word _dato){
        padre=_padre;
        izquierdo=_izquierdo;
        derecho=_derecho;
        color=_color;
        dato=_dato;
    }
    
    public Word getDato(){
        return dato;
    }
    
    public void setDato(Word _dato){
        dato=_dato;
    }
    
    public TreeNode getRelacion(int relacion){
        if(relacion==0){
            return padre;
        }
        if(relacion==1){
            return derecho;
        }
        if(relacion==2){
            return izquierdo;
        }
        return null;
    }
    
    public void setRelacion(TreeNode nodo, int relacion){
        if(relacion==0){
            padre=nodo;
        }
        if(relacion==1){
            derecho=nodo;
        }
        if(relacion==2){
            izquierdo=nodo;
        }
    }
}
