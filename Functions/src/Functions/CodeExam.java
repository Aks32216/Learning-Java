package Functions;

public class CodeExam {
	
	static String convertString( String s )  
    {  
        int ctr = 0 ;  
        int n = s.length( ) ; 
        char ch[ ] = s.toCharArray( ) ;  
        for(int i=0;i<n;++i) 
        {  
            if(i==0) {
            	ch[i]=Character.toUpperCase(ch[i]);
            } else if (ch[i-1]==' ') {
            	ch[i]=Character.toUpperCase(ch[i]);
            } else {
            	ch[i]=Character.toLowerCase(ch[i]);
            }
        }  
        return String.valueOf( ch, 0,n) ; 
    }  

	public static void main(String[] args) {
		String code="10665771011153266797868";
        int i=0;
        String result="";
        while(i<code.length())
        {
            String temp1=""+code.charAt(i)+code.charAt(i+1);
            int num1=Integer.parseInt(temp1);
            if(num1>=65 && num1<=90){
                result+=(char)num1;
                i+=2;
            } else if(num1==32) {
                result+=(char)num1;
                i+=2;
            } else {
                String temp2=""+code.charAt(i)+code.charAt(i+1)+code.charAt(i+2);
                int num2=Integer.parseInt(temp2);
                result+=(char)num2;
                i+=3;
            }
        }
        String ans=convertString(result);
        System.out.println(ans);

	}

}
