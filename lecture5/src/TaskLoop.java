public class TaskLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++){
//			System.out.println(i%2 + " iter="+i);
			if(i%2 == 1){
				continue;
			}
			System.out.println(i);
		}	

	}

}
