package cn.test;

public class ArrayTest {

	public static void main(String[] args) {
		int size =4;
		double[] myArray = new double[size];
		myArray[0] = 1.0;
		myArray[1] = 3.02;
		myArray[2] = 2.332;
		myArray[3] =3.001;
		for (double d : myArray) {
			System.out.println(d);
		}
		System.out.println("----------------");
		double [] myArray2 = {1.9,2.02,3.2,1.2,3.1,20.11,0.2,63.3};
		for(int  i=0 ; i<myArray2.length;i++) {
			System.out.println(myArray2[i]);
		}
		
	}

}
