package exercise_5a;

	public class Matrix {
			private double[][] elements;
		public Matrix(int m, int n) {
		this.elements = new double[m][n];
		}
		public Matrix(int m, int n, double...vs ) {
			this.elements = new double[m][n];
			
		}
		public int getM() {
			return 0;
		}
		public int getN() {
			return 0;
		}
		public void set(int i, int j, double wert) {
			
		}
		public void setRow(int i, double...vs) {
			
		}
		public double get(int i, int j) {
			return 0.0;
		}
		public void print(String I) {
			
		}
//		public Matrix transpose() {
//			return ;
//		}
		public double maxNorm() {
			return 0.0;
		}
//		public Matrix add(double alpha, Matrix b) {
//			return;
//		}
		public Vector multiply(double alpha, Vector x) {
			Vector r = new Vector(getM());
			for(int i=0; i<getM(); i++) {
				double s=0;
				for(int j=0; j<getN(); j++) {
					s += get(i,j)*x.get(j);
				}
				r.set(i,  alpha*s);
				
			}return r;
		}
		public Matrix multiply(double alpha, Matrix b) {
			Matrix r = new Matrix(getM(), b.getN());
			for(int i=0; i<getM();i++) {
				for(int j=0; j<b.getN(); j++) {
					double s=0;
					for(int k=0; k<getN();k++){
						s += get(i,k)*b.get(k, j);
					}r.set(i, j, alpha*s);
				}
			}return r;	
		}
	}
