
package examen1p1_halmarordonez;
import java.util.Scanner;
import java.util.Random; //int random = new Random().nextInt(10(max) - 1(min)) + 1) + 1(min);

public class Examen1P1_HalmarOrdonez {
static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        char syn = 's';
        while(syn=='s' || syn=='S'){
            System.out.println("----------Menu----------");
            System.out.println("1. Fight of flight");
            System.out.println("2. Tri Fuerza");
            System.out.println("3. Salir del programa");
            System.out.print("Ingrese su opcion: ");
            int opcion = read.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1->{
                    int balas=25,zombhp=25;
                    int indstnc = new Random().nextInt((30 - 15) + 1)+15;
                    int rd=1;
                    int dstnc=indstnc;
                    System.out.println("----------Fight or flight----------");
                    System.out.println("Ingrese maestria");
                    System.out.println("1. Principiante (0% de hit extra");
                    System.out.println("2. Intermedio (5% de hit extra");
                    System.out.println("3. Experto (15% de hit extra");
                    System.out.print("Ingrese su opcion: ");
                    int maestria = read.nextInt();
                    int hit=65;
                    switch(maestria){
                        case 1->{
                            hit=hit+0;
                        }
                        case 2->{
                            hit=hit+5;
                        }
                        case 3->{
                            hit=hit+15;
                        }
                    }//PROBABLIDAD DE GOLPE
                    System.out.println();
                    System.out.println("El zombie se encuentra a: "+indstnc+" metros");
                    char continuar = 's';
                    while(balas>0 && zombhp>0 && dstnc>0 && (continuar=='s' || continuar=='S')){
                        int dmg = new Random().nextInt((7 - 1) + 1)+1;
                        int zombrge = new Random().nextInt((5 - 3) + 1)+3;
                        int prob = new Random().nextInt((100 - 1) +1)+1;
                        System.out.println("----------Round"+rd+"----------");
                        System.out.println();
                        System.out.println("El jugador tiene: " + balas + " balas"); 
                        System.out.println();
                        if(prob<=hit){
                            System.out.println("Hit! El tiro a reducido el HP del zombie por un total de: " + dmg+"!");
                            balas--;
                            zombhp=zombhp-dmg;
                            if (zombhp<0){
                                balas=0;
                            }
                            System.out.println("Vida restante del zombie: "+zombhp);
                            System.out.println();
                            System.out.println("El zombie se encuentra a: " + dstnc + " metros");  
                        }
                        else{
                            dstnc=dstnc-zombrge;
                            if(dstnc<0){
                                dstnc=0;
                            }
                            System.out.println("Ha fallado! El zombie se encuentra a:"+dstnc+" metros");
                        }    
                        if(balas>0 && zombhp>0 && dstnc>0){
                            System.out.println();
                            System.out.print("Listo para la siguiente ronda(s/n)?: ");
                            continuar=read.next().charAt(0);
                        
                            rd++;
                        }
                        else if(balas<=0){
                            System.out.println("----------Game over----------");
                            System.out.println("El jugador se ha quedado sin balas");
                        }
                        else if(dstnc<=0){
                            System.out.println("----------Game over----------");
                            System.out.println("El zombie ha matado al jugador");
                        }
                        else{
                            System.out.println("----------Felicidades!!!----------");
                            System.out.println("El jugador ha matado al zombie");
                        }
                    }
                }//FIN CASE1
                case 2->{
                    trifuerza();
                }
                case 3->{
                    System.out.println("Saliendo del programa...");
                }
                default->{
                    System.out.println("Opcion invalida");
                }
            }//FIN SWITCH
            if (opcion!=3){
                System.out.println();
                System.out.print("Desea regresar al menu inicial(s/n)?: ");
                syn = read.next().charAt(0);
            }else{
                syn='n';
            }
        }//FIN WHILE MENU
    }//FIN MAIN
    public static void trifuerza(){
        System.out.println("----------TriFuerza----------");
        System.out.print("Ingrese un numero par y mayor a 20: ");
        int num = read.nextInt();
        int num2 = num/2;
        int numr = num;
        int numg =num/2;
        if(num>20 && num2%2!=0){
            for(int i=0;i<=num2;i++){
                for(int j=0;j<=numr;j++){
                    System.out.print(" ");  
                }//FIN FOR INTERNO
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<=numr;j++){
                    System.out.print(" ");
                }
                System.out.println();
                numr--;
            }//FIN FOR EXTERNO
            for(int i=0;i<=num2;i++){
                for(int j=0;j<=numg;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<=numg;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=numg;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<=numg;j++){
                    System.out.print(" ");
                }
                //for(int)
                System.out.println();
                numg--;
            }    
        }//FIN IF   
        else{
            System.out.println("Numero invalido");
        }
    }//FIN TRIFUERZA
}//FIN11
