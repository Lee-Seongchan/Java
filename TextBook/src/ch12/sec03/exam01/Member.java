package ch12.sec03.exam01;

public class Member {

		public String id;
		
		public Member(String id) {
			this.id = id;
		}
	
		/*					
		public boolean equals(Object obj) {
			if(obj instanceof Member target) {
				if(id.equals(target.id)) {
					return true;
				}
			}return false;
		}
		*/
		

		@Override
		public boolean equals(Object obj) {
			
			if(obj instanceof Member) {
				Member target = (Member) obj;
				if(id.equals(target.id)) {
					return true;
				}
			}
			return false;
		}


}
