import java.util.*;
public class Test {
	
	private int ligne;
	private int col;
	private char [][] grille;
	
	public Test(int n, int p){
		ligne = n;
		col = p;
		grille = new char[ligne][col];
		
		for(int i=0; i<ligne; i++) {
			for(int j=0; j<col; j++) {
				grille[i][j] = '.';
			}
		}
	}
	
	public void afficher() {
		String[] cologne = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
		System.out.println();
		System.out.println("   1  2  3  4  5  6  7  8  9 10 11 12 13 14 15");
		for(int i=0; i<ligne; i++) {
			System.out.print(cologne[i]);
			for(int j=0; j<col; j++) {
				System.out.print("  "+ grille[i][j]);
			}
			System.out.println("  ");		
		}
		System.out.println();
	}
	
public void sousmarin() {
		
		int l = (int)(Math.random() * 15);
		int c = (int)(Math.random() * 15);
		
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur A");
			return;
		}
			if(grille[l][c] == '.') {
				grille[l][c] = '0';
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
	}
	
	public void destroyer() {
		
		int l = (int)(Math.random() * 15);
        int c = (int)(Math.random() * 12);
        int p = (int)(Math.random() * 2);
        
        int l1 = (int)(Math.random() * 12);
        int c1 = (int)(Math.random() * 15);
			
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur A");
			return;
		}
		if(p==0) {
			if(grille[l][c] == '.') {
				for(int b=0;b<3;b++) {
					grille[l+b][c] = '1';
				}
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
		if(p==1) {
			if(grille[l1][c1] == '.') {
				for(int a=0;a<3;a++) {
					grille[l1][c1+a] = '1';
				}
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
	}
	
public void croiseur() {
		
		int l = (int)(Math.random() * 15);
		int c = (int)(Math.random() * 10);
		int p = (int)(Math.random() * 2);
		
		int l1 = (int)(Math.random() * 15);
		int c1 = (int)(Math.random() * 10);
		
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur A");
			return;
		}
		if(p==0) {
			if(grille[l][c] == '.') {
				for(int b=0;b<5;b++) {
					grille[l+b][c] = '2';
				}
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
		if(p==1) {
			if(grille[l][c] == '.') {
				for(int a=0;a<5;a++) {
					grille[l][c+a] = '2';
				}
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
	}
	public void cuirasse() {
	
	int l = (int)(Math.random() * 8);
	int c = (int)(Math.random() * 15);
	int p = (int)(Math.random() * 2);
	
	int l1 = (int)(Math.random() * 15);
	int c1 = (int)(Math.random() * 8);
	
	if(l<0 || c<0 || l>ligne || c>col) {
		System.out.print("Erreur en dehors de la zone");
		return;
	}
	if(p==0) {
		if(grille[l][c] == '.') {
			for(int b=0;b<7;b++) {
				grille[l+b][c] = '3';
			}
			
		}
		else {
			System.out.print("Erreur, emplacement déjà pris");
		}
	}
	if(p==1) {
		if(grille[l1][c1] == '.') {
			for(int a=0;a<7;a++) {
				grille[l1][c1+a] = '3';
			}
		}
		else {
			System.out.print("Erreur, emplacement déjà pris");
		}
	}
}

	
}