
public class Draw {
	 private int hight;
	 private  int width;
	 private int start ; 
	 
	 public void setS(int s) {this.start = s ;}
	 public int getS() {return this.start;}
	 
	 public void setH(int h) {this.hight=h;}
	 public int getH() {return this.hight;}
	
	 public void setW(int w) {this.width=w;}
	 public int getW() {return this.width;}
	
	 public  void Drawing() {
         
		 for (int s = 0 ; s < start ; s++)
		 {
			 
				for(int i =0; i<this.hight;i++) {
					System.out.print("\t");
					for(int j=0 ;j<this.width;j++) {
						System.out.print("*");
								
					}
					System.out.println("");
					
				}
			 
		 }	
			
		}
}
