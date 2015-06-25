
public class Matrix {
	public static double[][] matrix(double[][] a,double[][] b){
		
		int N = a.length;
		double[][] c = new double[N][N];
		if(a.length!=b.length) return c;
		for(int i = 0;i < N;i++){
			for(int j = 0;j < N;j++){
				for(int k = 0;k < N;k++){
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}	
		return c;
	}
}
