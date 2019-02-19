package exercise_5a;

import java.util.Arrays;

public class Vector {
			private double elements [];
		public Vector(int n) {
			this.elements = new double[n];
		}
		public Vector(double... x) {
			this.elements =x;
		}
		public int getN() {
			return this.getN();
		}
		public void fill(double v) {
//			for(int i =0; i<getN(); i++) {
//				this.elements[i] = v;
//			}
			Arrays.fill(this.elements, v);
		}
		public void set(int idx, double v) {
			this.elements[idx]=v;
		}
		public double get(int idx) {
			return this.elements[idx];
		}
		public void print(String l) {
			System.out.println(l+"elements[]");
		}
//		public Vector multiply(double alpha) {
//			return new Vector (this.elements*alpha.scalarProduct(?)); 
//		}
//		public Vector add(double alpha, Vector y) {
//			return new Vector (y + alpha.scalarProduct());
//		}
		public double scalarProduct(Vector y) {
			double s =0;
			for(int i =0; i<this.getN(); i++) {
				s += this.get(i)*y.get(i);
			}
			return s;
		}
		public double twoNorm() {
			return  Math.sqrt(this.scalarProduct(this));
		}
		public double oneNorm() {
			double a =Math.sqrt(getN());
			return a ;
		}
//		public double maxNorm() {
//			return ;
//		}
		public Vector multiply(double d) {
			
			return new Vector ();
		}
		public Vector add(double d, Vector y) {
			// TODO Auto-generated method stub
			return new Vector();
		}
	}
