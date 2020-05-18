public class Test{
	public static void main(String[] args){
		int x = 0;
		int y = 0;
		while(x < 5){
			//y = x - y;	Output: 00 11 21 32 42 
			//y = x + y;	Output: 00 11 23 3 410

			// y = y + 2;
			// if(y > 4){
			// 	y = y - 1;	//Output: 02 14 25 36 47
			// }

			// x = x + 1;
			// y = y + x;		//Output: 11 34 59

			// if(y < 5){
			// 	x = x + 1;
			// 	if(y < 3){
			// 		x = x - 1;
			// 	}
			// }
			// y = y + 2;		//Output: 02 14 3 48

			System.out.println(x + "" + y + " ");
			x = x + 1;
		}
	}
}