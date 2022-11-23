
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
				grille[i][j] = 'x';
			}
		}
	}
	
	public void afficher() {
		System.out.println();
		for(int i=0; i<ligne; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(" | "+ grille[i][j]);
		
			}
			System.out.println(" | ");		
		}
		System.out.println();
	}
}