import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class main 
{
   static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        int entrer=0;
        while(true){
        if(entrer!=0){
            System.out.println("Faire Entrer pour continuer");
            try{System.in.read();}
            catch(Exception e){}

        }
        entrer=1;

        System.out.println("Bienvenue dans Bataille Navale. Sélectionnez un choix pour commencer");
        System.out.println("1. Jouer une partie");
        System.out.println("2. Charger une partie");
        System.out.println("3. Aide");
        System.out.println("4. Quitter");
        int gamemode = sc.nextInt();
        switch(gamemode){
            case 1 :
                System.out.println("Vous jouez contre l'ordinateur");
                System.out.println("Coming soon"); 
                break;
            case 2 : 
                System.out.println("En travaux...");
                break;
            case 3 :
                Aide();
                break;
            case 4 :
                System.out.println("Vous avez quitté le jeu");
                System.exit(0);
        }
        }
    }
    private static void Aide(){
        System.out.println("Vous disposez de 5 bateaux de longueurs différentes à positionner sur un plateau de 10 sur 10.");
        System.out.println("Tour à tour positionnez les bateaux qui vous sont proposés de la manière suivante:");
        System.out.println("Si vous avez choisi de positionner votre bateau verticalement, votre bateau se situera en-dessous de la case rentrée.");
        System.out.println("Si vous avez choisi de positionner votre bateau horizontalement, votre bateau se situera à droite de la case rentrée");
        System.out.println("Le jeu commence, sélectionnez une case sur laquelle tirer sur le plateau adverse, si un bateau s'y situe le message 'touché' s'affichera sinon rien");
        System.out.println("Si toutes les cases d'un même bateau sont touchées, le message 'coulé' s'affichera");
        System.out.println("A l'inverse, si l'adversaire touche un de vos bateau, le message 'vous avez été touché' s'affichera et s'il parvient à couler votre bateau le message 'votre bateau a coulé' s'affichera");
        System.out.println("Le but est de couler tous les bateaux de l'adversaire");
        
    }
}
   /* MODE GRAPHIQUE
   public static void main(String[] args) 
    {
        // Définissez le frame
        JFrame frame = new JFrame("Bataille Navale");
    
        // Définissez le panel
        //JPanel panel = new JPanel();

        // Définir les boutons
        JButton btn1 = new JButton("Jouer une partie");
        JButton btn2 = new JButton("Charger une partie");    
        JButton btn3 = new JButton("Aide");   
        JButton btn4 = new JButton("Quitter"); 
        // Ajouter les boutons au frame
        
        JPanel b1 = new JPanel();
        //On définit le layout en lui indiquant qu'il travaillera en ligne
        b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
        b1.add(btn1);

        JPanel b2 = new JPanel();
        //On définit le layout en lui indiquant qu'il travaillera en ligne
        b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
        b2.add(btn2);

        JPanel b3 = new JPanel();
        //On définit le layout en lui indiquant qu'il travaillera en ligne
        b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
        b3.add(btn3);

        JPanel b4 = new JPanel();
        //On définit le layout en lui indiquant qu'il travaillera en ligne
        b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
        b4.add(btn4);

        JPanel b5 = new JPanel();
        //On positionne maintenant ces trois lignes en colonne
        b5.setLayout(new BoxLayout(b5, BoxLayout.PAGE_AXIS));
        b5.add(b1);
        b5.add(b2);
        b5.add(b3);
        b5.add(b4);

        frame.getContentPane().add(b5);
         
        // Ajouter label et panel au frame
        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}*/

