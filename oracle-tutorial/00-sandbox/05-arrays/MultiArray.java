class MultiArray{
	public static void main(String[] args) {
		int[][][][] a = new int[9][9][9][9];

		a[8][4][2][6] = 8426;

		System.out.println(a[8][4][2][6]);

		for(int i = 0; i < a.length; i++) {
			System.out.println("red");
			for(int j = 0; j < a.length; j++) {
				System.out.println("wine");
				for(int k = 0; k < a.length; k++) {
					System.out.println("success");
					for(int z = 0; z < a.length; z++) {
						System.out.println("!");
						System.out.println(a[i][j][k][z]);
					}
				}
			}
		}
	}
}

