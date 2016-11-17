
public class HashCodeString {

	char[] charArr;
	
	public HashCodeString(char[] c) {
		this.charArr=c;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	};

	@Override
	public int hashCode() {
		int i=1;
		 for(char ch:charArr)
		 {
			 if(ch=='a')
			 {
				 i=i*2;
			 }
			 else if(ch=='b')
			 {
				 i=i*3;
			 }
			 else  if(ch=='c')
			 {
				 i=i*5;
			 }
			 else  if(ch=='d')
			 {
				 i=i*7;
			 }
			 else  if(ch=='e')
			 {
				 i=i*11;
			 }
			 else  if(ch=='f')
			 {
				 i=i*13;
			 }
			 else  if(ch=='g')
			 {
				 i=i*17;
			 }
			 else  if(ch=='h')
			 {
				 i=i*19;
			 }
			 else  if(ch=='i')
			 {
				 i=i*23;
			 }
			 else  if(ch=='j')
			 {
				 i=i*29;
			 }
			 else 	 if(ch=='k')
			 {
				 i=i*31;
			 }
			 else  if(ch=='l')
			 {
				 i=i*37;
			 }
			 else  if(ch=='m')
			 {
				 i=i*41;
			 }
			 else  if(ch=='n')
			 {
				 i=i*43;
			 }
			 else  if(ch=='o')
			 {
				 i=i*47;
			 }
			 else  if(ch=='p')
			 {
				 i=i*53;
			 }
			 else  if(ch=='q')
			 {
				 i=i*59;
			 }
			 else  if(ch=='r')
			 {
				 i=i*61;
			 }
			 else  if(ch=='s')
			 {
				 i=i*67;
			 }
			 else  if(ch=='t')
			 {
				 i=i*71;
			 }
			 else  if(ch=='u')
			 {
				 i=i*73;
			 }
			 else  if(ch=='v')
			 {
				 i=i*79;
			 }
			 else  if(ch=='w')
			 {
				 i=i*83;
			 }
			 else  if(ch=='x')
			 {
				 i=i*89;
			 }
			 else  if(ch=='y')
			 {
				 i=i*97;
			 }
			 else  if(ch=='z')
			 {
				 i=i*101;
			 }
			 else
			 {
				 return 0;
			 }
				 
		 }
		 
		 return i;
		 
		
	}
	
	public static void main(String[] args) {
		String aa="aabc";
		String aad="acab";
		HashCodeString codeString1=new HashCodeString(aa.toCharArray());
		HashCodeString codeString2=new HashCodeString(aad.toCharArray());
		System.out.println(codeString1.equals(codeString2)); 
	}
	

}
