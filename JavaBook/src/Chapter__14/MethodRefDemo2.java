interface IntPredicate{
	boolean test(int n);
}

class MyIntNum{
	private int v;

	MyIntNum(int x) { v = x;}

	int getNum(){return v;}

	boolean isFactor(int n){
		return (v % n) == 0;
	}

	//Returns true if v and n have a common factor
	boolean hasCommonFactor(int n){
		for(int i =2; i < v/i; i++ ){
			if((v % i == 0) && (n % i == 0))
				return true;
		}
		return false;
	}
}

class MethodRefDemo2{
	public static void main(String args[]){
		boolean result;

		MyIntNum num = new MyIntNum(9);

		IntPredicate ip = num::hasCommonFactor;

		result = ip.test(12);

	}
}
