public class App {
    public static void main(String[] args) throws Exception {

		int quantity = 5;
		
        System.out.println("Pyramid of "+ quantity);
		makePyramidFromInput(quantity);
    }

	public static void makePyramidFromInput(int input){

		for( int i = 1; i <= input; i++){

			for( int j = 0; j < i ; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
