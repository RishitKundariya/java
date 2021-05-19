
public class SameNumberParentheses{
    public static void main(String args[]){
         SameNumberParentheses p=new SameNumberParentheses();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string");
         String str=sc.nextLine();
         p.CHECK(str);
         
    }

   public  void  CHECK(String s){
      char str[]=s.toCharArray();
      for(char i : str ){
        if(!( i=='(' || i==')' || i=='{' || i=='}')){
            System.out.println("Enter string in valid format");
            break ;
        } 
      }
      isInProperFormate(str);
    }   
   
   public void isInProperFormate(char str[]){
       int j=0;
       char array[]=new char[50];
       array[0]=str[0];
      
       for(int i=1;i<str.length;i++){
           if((array[j]=='(' && str[i]==')') || (array[j]=='{' && str[i]=='}' ) ){
               if(j!=0){
                   j--; 
                }
            }
            else{
                j++;
                array[j]=str[i];
            }
            
        }
       if(j==0){
           System.out.println("String is in Proper formate");
       }
       else{
            System.out.println("String is not in Proper formate");
           
       }
      
    }
}
