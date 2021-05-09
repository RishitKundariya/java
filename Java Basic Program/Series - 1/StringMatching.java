
/**
 *
 * @author Rishit Kundariya
 */
class StringMatching {
    
    public static void main(String args[]){
        System.out.println(repeatedSubstringPattern("abcababc")); ;
    }
    
    public static boolean repeatedSubstringPattern(String s) {
        int Strlen=1;
        boolean boo=true;
        char c[]=new char[1000];
        char str[]=s.toCharArray();
        char letter=str[0];
        c[0]=str[0];
        for(int i=1;i<str.length;i++){
            if(str[i]== letter){
                break;
            }
            c[Strlen]=str[i];
            Strlen++;
        }
        
        int i=0,count=0;
        rishit:
        while(i<str.length){
            count=0;
             for(int j=0;j<Strlen && i < str.length ;j++){
                 if(str[i]!=c[j]){
                     boo=false;
                     break rishit;
                 }
                count++;
                 i++;
             }
            if((count+1) == Strlen){
                boo=false;
            }
            
         }
        
        return boo;
    }
}
