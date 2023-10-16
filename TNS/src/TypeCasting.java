
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit /widening casting
		byte b=10; // byte= 8 bits
		int i=b; //int i=10; //4 bytes;
		System.out.println(i);
		
		float f=22.14f;// 4 bytes
		double d=f; // 8 bytes
		System.out.println(d);
		
		char ch='A';// 2 bytes
		int j=ch; //4 bytes
		System.out.println(j);
		
		//Explicit type casting /Narrowing
		double d1=10.52d; //8 bytes
		float f1=(float)d1; //4 bytes
		
		float f2=34.56f; //4 bytes - decimal var
		int i2=(int)f2; //4 bytes - non decimal var

		byte b1=90;
		char ch1=(char)b1;
		
		
		
		
		
	}

}
