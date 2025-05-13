package unidad06.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coleccion { 
	 
private List<Producto> lista = new ArrayList< Producto >(); 
 
    public int tamanio(){ 
      return lista.size();
    } 
    public void aniadir(Producto e){ 
 
	lista.add(e); 
    } 
    public void eliminar(int pos){ 
        
    	lista.remove(pos);
    } 
    public Producto obtener(int pos){
    	if (pos >= 0 && pos < lista.size()) {
            return lista.get(pos);
    	}
		return null;
 
    } 
    public void mostrarTodo() {
        for (Producto producto : lista) {
            System.out.println(producto);
        }
    }
    
    public void aumentoPrecio(double porcentaje) {
        for (Producto producto : lista) {
            producto.setPrecio(producto.getPrecio() * (1 + porcentaje / 100));
        }
    }
}