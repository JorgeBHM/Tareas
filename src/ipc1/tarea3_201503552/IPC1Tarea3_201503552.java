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
                                    if(Usuarios[i]!=null){
                                        if(Usuarios[i].equalsIgnoreCase(usuario)){
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
                                        if(Usuarios[i]==null){//verifica que haya espacio para ingresar el usuario
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
                                System.out.println("Usuarios en orden Ascendente:");
                                for(int i=4;i>=0;i--){
                                    if(Usuarios[i]!=null){
                                        System.out.println((5-i)+". "+Usuarios[i]);
                                    }
                                }
                                break;
                                
                            case 3://Mostrar Usuarios descendentes
                                System.out.println("Usuarios en orden Ascendente:");
                                for(int i=0;i<5;i++){
                                    if(Usuarios[i]!=null){
                                        System.out.println((i+1)+". "+Usuarios[i]);
                                    }
                                }
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
                    boolean val_contador=true;
                    int cont=0;//se crea la variable contador afuera para ser utilizado en varias partes
                    do{
                        //Menu contador de digitos
                        System.out.println("1. Ingresar un numero");
                        System.out.println("2. Mostrar un numero de digitos");
                        System.out.println("3. Menu principal");
                        
                        int menu_contador=scanner.nextInt();
                        
                        switch (menu_contador){
                            
                            case 1://Ingresar un numero
                                cont=0;//incializa el contador en 0 para evitar otros valores
                                System.out.println("Ingrese un numero entero entre 0 y 100000:");
                                int n=scanner.nextInt();
                                if(n>=0 && n<=100000){//verifica que el rango este dentro del rango
                                    if(n!=0){
                                        while(n>0){
                                            n=n/10;
                                            cont++;//se incrementa cada vez que se divide el numero
                                        }
                                    }
                                    else{//si el numero es 0 automaticamente devuelve 1
                                        cont=1;
                                    }
                                }
                                else{
                                    System.out.println("El numero no esta dentro del rango");
                                }
                                break;
                            case 2://Mostrar un numero de digitos
                                    System.out.println("el numero tiene "+cont+" digitos");
                                break;
                            
                            case 3://Menu principal
                                val_contador=false;
                                break;
                                
                            default:
                                System.out.println("El numero ingresado no es valido");     
                        }
                    }while(val_contador);
                    break;
                    
                case 3://Tres numeros de mayor a menor
                    boolean val_mayor=true;
                    int[] Numeros=new int[3];
                    do{
                        //Menu contador de digitos
                        System.out.println("1. Ingresar numeros");
                        System.out.println("2. Mostrar ordenados");
                        System.out.println("3. Menu principal");
                        
                        int menu_mayor=scanner.nextInt();
                        
                        switch(menu_mayor){
                            case 1:
                                for(int i=0;i<3;i++){//repito 3 veces la opcion de pedir un numero
                                    System.out.println("Ingrese el digito "+(i+1));
                                    Numeros[i]=scanner.nextInt();
                                }
                                int aux=0;
                                for(int i=0;i<3;i++){
                                    for(int j=i+1;j<3;j++){
                                        if(Numeros[i]<Numeros[j]){//compara un numero del arreglo con el siguiente
                                            aux=Numeros[i];
                                            Numeros[i]=Numeros[j];
                                            Numeros[j]=aux;//si el anterior es menor que el siguiente cambia posiciones
                                        }
                                    }
                                }
                                break;
                                
                            case 2://mostrar los numeros ordenados
                                System.out.println("Numeros Ordenados:");
                                for(int i=0;i<3;i++){
                                    System.out.println(Numeros[i]);
                                }
                                break;
                                
                            case 3://menu principal
                                val_mayor=false;
                                break;
                                
                            default:
                                System.out.println("El numero ingresado no es valido");
                        }
                    }while(val_mayor);
                    break;
                    
                case 4://calcular el promedio
                    boolean val_promedio=true;
                    int[][] notas=new int[6][6];
                    do{
                        System.out.println("1. Ingresar notas");
                        System.out.println("2. Mostrar notas");
                        System.out.println("3. Menu principal");
                        
                        int menu_notas=scanner.nextInt();
                        
                        switch(menu_notas){
                            case 1://Ingresar Notas
                                for(int i=0;i<6;i++){
                                    System.out.println("Ingrese notas del estudiante "+(i+1));
                                    notas[i][0]=i+1;
                                    int total=0;
                                    for(int j=1;j<5;j++){
                                        boolean val_nota=true;
                                        int nota=0;
                                        do{
                                            System.out.println("Nota "+j);    
                                            nota=scanner.nextInt();
                                            if(nota>=0 && nota<=100){//solo se puede ingresar numeros de 0 a 100 puntos
                                                val_nota=false;
                                            }
                                            else{
                                                val_nota=true;
                                                System.out.println("El valor de la nota no es valido");
                                            }
                                        }while(val_nota);
                                        notas[i][j]=nota;//ingresa la nota
                                        total=total+notas[i][j];//suma cada nota
                                    }
                                    double promedio=total/4;//realiza el promedio
                                    notas[i][5]=(int)Math.round(promedio);//redondea el promedio
                                }
                                System.out.println("Notas Ingresadas");
                                break;
                            
                            case 2://Mostrar Notas
                                
                                System.out.println("Listado de Notas:");
                                System.out.println();
                                System.out.println("Id Nota1 Nota2 Nota3 Nota4 Promedio");
                                                 // *1***100****84***100***100******100
                                                 // *2****47***100*****7****78*******75
                                for(int i=0;i<6;i++){
                                    String espacio="";
                                    System.out.print(" "+notas[i][0]);
                                    for(int j=1;j<5;j++){
                                        if(notas[i][j]>9 && notas[i][j]<100){
                                            espacio=" ";
                                        }
                                        else if(notas[i][j]<=9){
                                            espacio="  ";
                                        }
                                        else if(notas[i][j]==100){
                                            espacio="";
                                        }
                                        System.out.print(espacio+"   "+notas[i][j]);   
                                    }
                                    if(notas[i][5]>9 && notas[i][5]<100){
                                            espacio=" ";
                                        }
                                        else if(notas[i][5]<=9){
                                            espacio="  ";
                                        }
                                        else if(notas[i][5]==100){
                                            espacio="";
                                        }
                                    System.out.println(espacio+"      "+notas[i][5]);
                                }
                                break;
                            
                            case 3:
                                val_promedio=false;
                                break;
                            
                            default:
                                System.out.println("El numero ingresado no es valido");
                                
                        }
                        
                        
                        
                    }while(val_promedio);
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
