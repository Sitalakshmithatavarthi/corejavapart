package accessspecifiers;

public class PrivateDemo {
		private int a=11;
		String name="Sita lakshmi";
		private int num;
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num=num;

	}
		void displayA() {
			System.out.println("A: "+a);
		}

}
   public class privateEx{
    	 public static void main(String[] args) {
    		 PrivateDemo  demo=new PrivateDemo();
    		 System.out.println(demo.name);
    		 demo.displayA();
    		 demo.getNum();
    		 System.out.println("get number"+demo.getNum());
    	 }
}
