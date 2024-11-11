class Main {
	static int f(int n) {
		if(n==0) {
			return 1;}
	int a= n*f(n-1);
	return a;
		}

	static double e(int  n) {
		if(n==0) {
			return 1;}
		double a= n*f(n-1);
		return 1/a +e(n-1);
	}



	public static int q1(int n) {
		if(n==0) {
			return 0;}
	int a= n+q1(n-1);
	return a;
	}



	public static int q2(int n) {
		if(n==0) {
			return 1;}
	int a= n*q2(n-1);
	return a;}



	public static int q3(int n) {
		if(n%2==0) {
			n=-1;}
	int a= n*q3(n-2);
	return a;		 
		}
	
	public static int q4(int n) {
		if(n/10==0) {
			return 1;}
	return q4(n/10)+1;		 
		}

	public static int q5(int n, int m) {
		if (n>m) {
			return 0;}
		
	return (q5( m-n ,n)+1);		 
		}
	
public static int q6(int n,int m) {
		if (n<m) 
			return n;
		return q6(n-m,m);
	}
		
public static boolean q7(int x, int y) {
	
	if (x<y) 
		if (x==0)
			return true;
		else
			return false;
	return q7(x-y,y);
}
	

public static boolean q8(int n) {
			return help8 (n,2);
		}
public static boolean help8(int n,int m) {
	if (n==m) {
		return true;}
	if(n%m !=0) {
		return help8(n,m+1);
	}
	else {
		return false;
	}}
	

public static  boolean exe9(int t) {
	if(t >10) {
		if (t%2==0)
		{
			if((t/10)% 2 == 0){
			return exe9(t/10);
}}
		if (t%2==1)
		{	
			if((t/10)% 2 == 1){
			return exe9(t/10);
		}}		
}
	else {
		return true;
	}   
	return false;}
    

public static int q12(int n1, int n2, int max) {
    if (n1 >= max && n2 >= max) return 0;
    int nextMultiple = Math.min(n1 < max ? n1 : max, n2 < max ? n2 : max);
    return nextMultiple + q12(n1 + (nextMultiple == n1 ? n1 : 0), n2 + (nextMultiple == n2 ? n2 : 0), max);
}

public static double q13(double perv , double d, int i) {
	if(i==0) {
		return d;
	}
	return d + q13(d  , (Math.pow(perv,2)) + (Math.pow(d,2)),i-1 );}
	
public static int q14(int []x, int i) {
	
	if (i<0) 
		return 0;
	else {
		i-=1;
		return q14(x,  i)+x[i+1];}}

public static int q15(int []x, int i) {
	
	if (i<0) 
		return 0;
	if(x[i]>0) {
		i-=1;
		return q15(x,  i)+1;}
	 else {
		i-=1;
		return q15(x, i);}}

public static int q16(int []x,int n, int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if(x[i]==n) {
		return i;}
	 else {
		i+=1;
		return q16(x,n, i);}}

public static boolean q17(int[] n,int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if (i == n.length - 1 || i == n.length) {
		return true;}
	if(n[i]>n[i+1]) {
		return false;
	}
	else { i+=1;
		return q17(n,i);
	}}

public static boolean q18(int[] n,int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if (q8(n[i])==false) {
		return false;}
	if(i==n.length)
		return true;
	
	else { i+=1;
		return q18(n,i);
	}}


public static String exe22(String word, int i ,String wordNew){
	if( i == word.length()) {
		return wordNew;
	}
	if(i%3 == 0 && i!= 0) {
		wordNew = wordNew + "*";	
	}
	wordNew = wordNew + word.charAt(i);
	i+=1;
	return exe22(word, i, wordNew);
}

public static String q23(String str, int index) {
    if (index < 0) return "";
    return str.charAt(index) + q23(str, index - 1);
}


public static void exe24(char []abc, char obj1, char obj2, int counter) {
	if(counter == obj2) {
		 System.out.println("");
	}
	System.out.println(abc[counter]);
	 exe24(abc, obj1, obj2, counter+1);
}

public static void q25(int n, int i) {
    if (i > n) return;
    if (n % i == 0) System.out.print(i + " ");
    q25(n, i + 1);
}

public static void q26(int n) {
    if (n == 0) return;
    if ((n % 10) % 2 == 0) System.out.print(Math.abs(n % 10) + " ");
    q26(n / 10);
}

public static void q27(int i, int j) {
    if (i > 10) return;
    if (j > 10) {
        System.out.println();
        q27(i + 1, 1);
    } else {
        System.out.print((i * j) + "\t");
        q27(i, j + 1);
    }
}

public static void q28(int a1, int d, int n) {
    if (n == 0) return;
    System.out.print(a1 + " ");
    q28(a1 + d, d, n - 1);
}

public static void q29(int current, int step, int count) {
    if (count == 0) return;
    System.out.print(current + " ");
    q29(current + step, step + 1, count - 1);
}
public static void q31(int[] arr, int index) {
    if (index >= arr.length) return;
    if (index % 2 == 0) System.out.print(arr[index] + " ");
    q31(arr, index + 1);
}

public static void q32(int[] arr, int index) {
    if (index >= arr.length - 1) return;
    if (arr[index] < arr[index + 1]) System.out.print(arr[index] + " ");
    q32(arr, index + 1);
}

public static int exc42(int n) {
	if (n<10) {
		return n;
	}
	int sum = 0;
	while (n >0) {
		sum += n /10;  
		n /= 10; 
	}
return exc42(sum);
}

	public static void main(String[] arg) {
		 int []n = {17,2,7,13};
		 char [] abc = {
		            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
		            'u', 'v', 'w', 'x', 'y', 'z'
		        };
		 int i = 0;
		 int t=12;
		 String word = "avigail";
		 System.out.println(exe24( abc, 'a', 'z', i));
}
}
