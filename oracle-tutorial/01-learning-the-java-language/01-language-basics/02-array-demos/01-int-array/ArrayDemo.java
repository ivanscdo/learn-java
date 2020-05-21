class ArrayDemo {
   public static void main(String[] args) {
      // declares an array of integers
      int[] anArray;

      // allocates memory for 10 integers
      anArray = new int[10];

      // initialize elements
      anArray[0] = 100;
      anArray[1] = 200;
      anArray[2] = 300;
      anArray[3] = 400;
      anArray[4] = 500;
      anArray[5] = 600;
      anArray[6] = 700;
      anArray[7] = 800;
      anArray[8] = 900;
      anArray[9] = 1000;

	System.out.println("Element at index 0: " + anArray[0]);
      System.out.println("Element at index 1: " + anArray[1]);
      
	//practice for loop
	for (int i=0; i< anArray.length; i++) {
		System.out.println("Element at index " + i + " :" + anArray[i]);
	}
      }
}
