import java.util.Scanner;

public class task{
    public static void main(String[] args){
	String name;
	System.out.println("Who are you?");
	Scanner sc = new Scanner(System.in);
	System.out.printf(">");
	name = sc.next();
	System.out.println("Hello, "+name+"!");
	int c,count1=0,count2=0;
	System.out.println("Tossing a coin...");
	for(int i = 1; i <= 3; i++){
	    c = (int)Math.ceil(Math.random()*2);
	    if(c == 1){
		System.out.println("Round "+i+": Heads");
		count1++;
	    }
	    else{
		System.out.println("Round "+i+": Tails");
		count2++;
	    }
	}
	System.out.println("Heads: "+count1+", Tails: "+count2);
	if(count1>count2){
	    System.out.println(name+" won!");
	}
	else{
	    System.out.println(name+" lost!");
	    }
    }
}
