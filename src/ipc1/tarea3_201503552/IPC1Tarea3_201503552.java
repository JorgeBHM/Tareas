/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201503552;

import java.util.Scanner;

/**
 *
 * @author Marrojor3
 */
public class IPC1Tarea3_201503552 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//permite obtener texto ingresado
        System.out.println("[IPC1}Tarea3_201503552");
        boolean validacion=true;//permite repetir el menu del ciclo while
    
        do{
            //Menu de programa
            
            System.out.println();
            System.out.println("1. Usuarios");
            System.out.println("2. Contador de dígitos");
            System.out.println("3. Tres números de mayor a menor");
            System.out.println("4. Calcular promedio");
            System.out.println("5. Salir");

            int menu=scanner.nextInt();//Se obtiene el numero ingresado
            //Opciones del menu
            switch(menu){
                case 1://Usuarios
                    String[] Usuarios=new String[5];//Creado el vector donde se almacena los usuarios
                    boolean val_usuario=true;//permite repetir el menu
                    do{
                        System.out.println();
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar Usuarios Ascendentes");
                        System.out.println("3. Mostrar Usuarios descendentes");
                        System.out.println("4. Menu principal");
                        
                        int menu_usuario=scanner.nextInt();
                        switch (menu_usuario){
                            case 1://Ingresar
                                System.out.println("Ingresar el usuario:");
                                String usuario=scanner.next();
                                boolean repetido=false;
                                for(int i=0;i<5;i++){//verifico que no exista otro usuario igual
                                    if(Usuarios[i]!=""){
                                        if(Usuarios[i]==usuario){
                                            repetido=true;
                                            break;
                                        }
                                    }
                                }
                                if(repetido){//si el usuario es repetido vuelve al menu
                                    System.out.println("El usuario ya existe, intente de nuevo");
                                }
                                else{//si no esta repetido ingresa el usuario
                                    boolean vacio=true;
                                    for(int i=0;i<5;i++){
                                        if(Usuarios[i]==""){//verifica que haya espacio para ingresar el usuario
                                            Usuarios[i]=usuario;
                                            System.out.println("Usuario Ingresado");
                                            vacio=true;
                                            break;
                                        }
                                        else{//si ya esta ocupado el espacio devuelve un valor false
                                            vacio=false;
                                        }
                                    }
                                    if(!vacio){//si se devolvio valor false muestra el mensaje y regresa al menu
                                        System.out.println("ya no hay espacio para crear un usuario");
                                    }
                                }
                                break;
                                
                            case 2://Mostrar Usuarios Ascendentes
                                break;
                                
                            case 3://Mostrar Usuarios descendentes
                                break;
                            
                            case 4://Menu principal
                                val_usuario=false;
                                break;
                                
                            default://si ingresa numero incorrecto se repite el menu
                                System.out.println("El numero que ingreso no es valido");
                        }
                    }while(val_usuario);
                    
                    
                    
                    
                    break;
                    
                case 2://Contador de digitos
                    break;
                    
                case 3://Tres numeros de mayor a menor
                    break;
                    
                case 4://calcular el promedio
                    break;
                    
                case 5://Salir
                    validacion=false;//Finaliza el ciclo while y termina el programa
                    break;
                    
                default://Si se ingresa un numero incorrecto vuelve a pedir otro numero
                    System.out.println("El numero que ingreso no es valido");
            }
        }while(validacion);//si validacion es verdadero el ciclo continua
    }
    
}
