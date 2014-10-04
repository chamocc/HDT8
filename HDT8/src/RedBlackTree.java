/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class RedBlackTree {
    private TreeNode raiz;
    
    public RedBlackTree(){
        raiz=new TreeNode(null, null, null, false ,null);
    }
    
    private void singleRotation(TreeNode abuelo, boolean direccion){
        TreeNode  c, padre, tio, hijo, bisabuelo;
        bisabuelo=abuelo.getRelacion(0);
        if(direccion==false){
            padre=abuelo.getRelacion(2);
            tio=abuelo.getRelacion(1);
            hijo=padre.getRelacion(2);
            c=padre.getRelacion(1);

            padre.setRelacion(hijo, 2);
            padre.setRelacion(abuelo, 1);
            abuelo.setRelacion(c, 2);
            abuelo.setRelacion(tio, 1);

            padre.setColor(false);
            abuelo.setColor(true);
            
        }else{
            padre=abuelo.getRelacion(1);
            tio=abuelo.getRelacion(2);
            hijo=padre.getRelacion(1);
            c=padre.getRelacion(2);

            padre.setRelacion(hijo, 1);
            padre.setRelacion(abuelo, 2);
            abuelo.setRelacion(c, 1);
            abuelo.setRelacion(tio, 2);

            padre.setColor(false);
            abuelo.setColor(true);
        }
        hijo.setRelacion(padre, 0);
        padre.setRelacion(bisabuelo, 0);
        abuelo.setRelacion(padre, 0);
        tio.setRelacion(abuelo, 0);
            
    }
    
    private void doubleRotation(TreeNode abuelo, boolean direccion){
        TreeNode a, b, c, padre, tio, hijo, bisabuelo;
        bisabuelo=abuelo.getRelacion(0);
        if(direccion==false){
            padre=abuelo.getRelacion(2);
            tio=abuelo.getRelacion(1);
            hijo=padre.getRelacion(1);
            a=padre.getRelacion(2);
            b=hijo.getRelacion(2);
            c=hijo.getRelacion(1);
            
            hijo.setRelacion(padre, 2);
            hijo.setRelacion(abuelo, 1);
            padre.setRelacion(c, 2);
            padre.setRelacion(tio, 1);
            abuelo.setRelacion(c, 2);
            abuelo.setRelacion(hijo, 1);
            
            abuelo.setColor(true);
            hijo.setColor(false);
        }else{
            padre=abuelo.getRelacion(1);
            tio=abuelo.getRelacion(2);
            hijo=padre.getRelacion(2);
            a=padre.getRelacion(1);
            b=hijo.getRelacion(1);
            c=hijo.getRelacion(2);
            
            hijo.setRelacion(padre, 1);
            hijo.setRelacion(abuelo, 2);
            padre.setRelacion(c, 1);
            padre.setRelacion(tio, 2);
            abuelo.setRelacion(c, 1);
            abuelo.setRelacion(hijo, 2);
            
            abuelo.setColor(true);
            hijo.setColor(false);
        }
        hijo.setRelacion(bisabuelo, 0);
        padre.setRelacion(hijo, 0);
        abuelo.setRelacion(hijo, 0);
        tio.setRelacion(abuelo,0);
    }
    
    private void cambiarColor(TreeNode padre){  
        TreeNode abuelo, tio, bisabuelo;
        abuelo=padre.getRelacion(0);
        bisabuelo=abuelo.getRelacion(0);
        if(abuelo.getRelacion(2)==padre){
            tio=abuelo.getRelacion(1);
        }else{
            tio=abuelo.getRelacion(2);
        }
        
        padre.flipColor();
        tio.flipColor();
        abuelo.flipColor();
        
        if(abuelo.getRelacion(0).getColor()==true){
            boolean single=false;
            boolean derecho=false;
            TreeNode tioBisabuelo, tioabuelo;
            if(bisabuelo.getRelacion(0).getRelacion(2)==bisabuelo){
                derecho=false;
                tioBisabuelo=bisabuelo.getRelacion(0).getRelacion(1);
            }else{
                derecho=true;
                tioBisabuelo=bisabuelo.getRelacion(0).getRelacion(2);
            }
            if(bisabuelo.getRelacion(2)==abuelo){
                single=true;
                tioabuelo=bisabuelo.getRelacion(1);
            }else{
                single=false;
                tioabuelo=bisabuelo.getRelacion(2);
            }
            
            if(tioBisabuelo.getColor()==true){
                cambiarColor(bisabuelo);
            }else{
                if(single==true){
                    singleRotation(bisabuelo.getRelacion(0), derecho);
                }else{
                    doubleRotation(bisabuelo.getRelacion(0), derecho);
                }
            }
        }
    }
    
    public void incertarNodo(Word dato, TreeNode _raiz){
        if(raiz.getDato()==null){
            raiz.setDato(dato);
        
        
    }
}
