package conditions;

public class H {
public static void main(String[] args) {
	x:for(int i=0;i<5;i++) {
		if(i==2) {
			break x;
		}
		System.out.println(i);
	}
}
}
