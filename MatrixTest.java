import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixTest {
	double[][] a = {{1.0,2.0,1.0},
				{2.0,1.0,0.0},
				{1.0,1.0,2.0}};
	double[][] b = {{-0.4,0.6,0.2},
			{0.8,-0.2,-0.4},
			{-0.2,-0.2,0.6}};
	double[][] ans = {{1,0,0},
			{0,1,0},
			{0,0,1}};
	double delta = 0.01;
	double[][] actual = Matrix.matrix(a,b);
	@Test
	public void test() {
		for(int i = 0;i < ans.length;i++){
			for(int j = 0;j < ans[0].length;j++){
				assertEquals(ans[i][j],actual[i][j],delta);
			}
		}
	}
}
