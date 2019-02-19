package exercise_5;

import inf.v3d.obj.MatrixPlotGroup;
import inf.v3d.view.Viewer;

public class MatrixTesting {
	public static void main(String[] args) {
		double [] data = new double[]{1,2,3,4,5,6};
		Matrix MyMatrix = new Matrix(2,3, data);
		Viewer view =new Viewer();
		MatrixPlotGroup mpg = new MatrixPlotGroup();
		MyMatrix.plot(" MyMatrix ", mpg);
		
		view.addObject3D(mpg);
		view.setVisible(true);
		
}}
