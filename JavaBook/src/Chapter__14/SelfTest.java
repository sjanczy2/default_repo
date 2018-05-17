interface MyTest{
	boolean testing(int n);
}

MyTest i = (n) -> (n>=10 && n<=20)

interface NumericFunc{
	int func(int n);
}

NumericFunc fun = (n) -> {
	int total = 1;
	int curr = n;
	while(curr > 1){
		total *= curr;
		curr--;
	}
	return total;
}

interface MyFunc<T>{
	T func(T o);
}

MyFunc<Integer> fun = (n) -> {
	int total = 1;
	int curr = n;
	while(curr > 1){
		total *= curr;
		curr--;
	}
	return total;
}
