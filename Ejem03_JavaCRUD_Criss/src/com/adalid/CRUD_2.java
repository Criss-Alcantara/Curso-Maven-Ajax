package com.adalid;
import java.util.ArrayList;

public class CRUD_2 {

    public ArrayList<Usuario> listaUsuarios;

	public CRUD_2() {
        super();
        listaUsuarios = new ArrayList<Usuario>();
    }
	
	public void Create(String nombre, String dni, String telefono, int edad, float salario, boolean estado, char genero){
		Usuario usuario = new Usuario(nombre, dni, telefono, edad, salario, estado, genero);
		listaUsuarios.add(usuario);
    }
    
    public void Read(){
        for (Usuario usuario : listaUsuarios){
            usuario.mostrarTodosDatos();
        }
    }

    public void Mostrar_Nombre(String nombre){
        for (Usuario usuario : listaUsuarios){
            if(usuario.nombre.equals(nombre)){
                usuario.mostrarTodosDatos();
                break;
            }
        }
    }

    public void Update(String DNI, String caracteristica, String newValor) {
        for(Usuario usuario : listaUsuarios){
            if(usuario.dni.equals(DNI)){
                if(caracteristica.equals("nombre")) usuario.nombre = newValor; 
                else if(caracteristica.equals("dni")) usuario.dni = newValor;
                else if(caracteristica.equals("telefono")) usuario.dni = newValor;
                else if(caracteristica.equals("edad"))  usuario.edad = Integer.parseInt(newValor);
                else if(caracteristica.equals("salario")) usuario.salario = Integer.parseInt(newValor);
                else if(caracteristica.equals("estado")) usuario.estado = Boolean.parseBoolean(newValor);
                else if(caracteristica.equals("genero")) usuario.genero = newValor.charAt(0);
            }
        }
		
    }
    
    public void Delete(String DNI){
        Usuario usuarioBorrar = null;
        for(Usuario usuario : listaUsuarios){
            if(usuario.dni.equals(DNI)){
                usuarioBorrar = usuario;
                break;
            }
        }
        if(usuarioBorrar != null){
            listaUsuarios.remove(usuarioBorrar);
        }
        else{
            System.out.println("No se ha encontrado el usuario con DNI: " + DNI);
        }
    }
}
