class NestedClasses {
	public static String success = "success!";
	public String successWhite = "success!";

		static class StaticNestedClass {
			String wine = " wine, ";

			public String getSuccess() {
				return success;
			}

			void RedWine(String red) {
				System.out.println(red + this.wine + getSuccess());
			}
		} 

		class InnerClass {
			String white = " wine, ";

			void WhiteWine(String white) {
				System.out.println(white + this.white + NestedClasses.this.successWhite);
			}
		}
		
	public static void main(String[] args) {
		NestedClasses.StaticNestedClass snc = new NestedClasses.StaticNestedClass();
		snc.RedWine("red");

		NestedClasses nc = new NestedClasses();
		NestedClasses.InnerClass ic = nc.new InnerClass();
		ic.WhiteWine("white");
	}
}