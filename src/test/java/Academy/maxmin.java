package Academy;
public class maxmin {
	
public static void main(String[] args) {
int [] arr = {1, 45, 67, 98, 455, 678,-6};
int min = Integer.MAX_VALUE;

for ( int element : arr){
	
if(element<min){
	
min=element;
}

}
		System.out.println("Min element is " +min);
}
}