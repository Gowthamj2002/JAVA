public class PrimeNumber{
public static void main(String args[]){
int num=31;
int count=0;
if(num<2){
	System.out.println("it is not a prime number:"+num);
}
for(int i=2;i<=num;i++){
	if(num%i==0){
		count++;
	}
		
}
if(count<2){
	System.out.println("it is a prime number:"+num);
}
}
}