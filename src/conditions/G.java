package conditions;

public class G {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		x:if(i==2) {
			break x;
		}
		System.out.println(i);
	}
}
}
