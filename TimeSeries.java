package exercise_5;

public class TimeSeries {
private double t0;
private double dt;
private double[] data;
 public TimeSeries(double t0, double dt, double[] data) {
	 this.t0 =t0; this.dt = dt; this.data = data;
 }
 public double getDuration() {
//	 duration = tn-t0; tn= dt*data.length +t0;duration = dt*data.length;
	 
	 return dt*(data.length-1) ;
 }
 public double getTime(int i) {
	 
	 return t0+dt* i;
 }
 public int count(double lowerBorderX, double upperBorderX) {
	 int count = 0;
	 for(int idx = 1; idx<= data.length; idx++) {
		 if(this.data[idx-1] <= upperBorderX && this.data[idx-1] <= lowerBorderX) {
     System.out.println(idx);
			 count++;
		 }
	 }
	 return count;
 }
 public double valueAt(double t) {
	int idxLowerT =0;
	for(int idx =0; idx < this.data.length-1; idx++) {
	if(this.t0+idx *this.dt < t) {
		idxLowerT = idx;
	}
	}
//	ti, t(i+1)
	double ti = this.getTime(idxLowerT);
	double ti1 = this.getTime(idxLowerT-1);
//	x0+(x1-x0)/(t1-t0)*(t-t0)
	double result = this.data[idxLowerT]+(this.data[idxLowerT-1]-this.data[idxLowerT +1])/(ti1-ti);
	 return result;
 }
 public boolean isMonotonous() {
	 boolean isRising = false;
	 boolean isFalling = false;
	 for(int idx =0; idx < data.length-1; idx++) {
//		 monotonous rising
		 if(data[idx] < data[idx+1]) 
		 {
			 isRising = true;
			 isFalling = false;
		 }else if(data[idx] > data[idx+1]) {
			 isRising =false;
			 isFalling = true;
		 }
//		 data[idx] == data[idx+1]
		 else {
//			 nothing 
		 }
	 }
	 boolean result = isFalling && !isRising || !isFalling && isRising;
	 return result;
 }
}
