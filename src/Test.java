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
	
	public void destroyer(int l,int c, int p) {
		
		l=l-1;
		c=c-1;
		
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur A");
			return;
		}
		if(p==0) {
			if(grille[l][c] == '.') {
				grille[l][c] = '1';
				grille[l+1][c] = '1';
				grille[l][c+1] = '1';
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
		if(p==1) {
			if(grille[l][c] == '.') {
				grille[l][c] = '1';
				grille[l][c+1] = '1';
				grille[l][c+1] = '1';
			}
			else {
				System.out.print("Erreur, emplacement déjà pris");
			}
		}
	}
	public void sousmarin(int l,int c, int p) {
		
		l=l-1;
		c=c-1;
		p=p-1;
		
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur");
			return;
		}
		if(grille[l][c] == '.') {
			grille[l][c] = 'O';
		}
		else {
			System.out.print("Erreur, emplacement déjà pris");
		}
	}
	public void croiseur(int l,int c, int p) {
	
	l=l-1;
	c=c-1;
	p=p-1;
	
	if(l<0 || c<0 || l>ligne || c>col) {
		System.out.print("Erreur");
		return;
	}
	if(grille[l][c] == '.') {
		grille[l][c] = 'O';
		grille[l+1][c] = 'O';
	}
	else {
		System.out.print("Erreur, emplacement déjà pris");
	}
}
	public void cuirasse(int l,int c, int p) {
		
		l=l-1;
		c=c-1;
		p=p-1;
		
		if(l<0 || c<0 || l>ligne || c>col) {
			System.out.print("Erreur");
			return;
		}
		if(grille[l][c] == '.') {
			grille[l][c] = 'O';
			grille[l+1][c] = 'O';
		}
		else {
			System.out.print("Erreur, emplacement déjà pris");
		}
	}

	
}