import java.util.*;
class Counter_Vowel
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String str = "";
            int vowel_A = 0, vowel_E = 0, vowel_I = 0, vowel_O = 0, vowel_U = 0;
            System.out.println("Enter The Sentance");

            while (true)
            {
                str = sc.nextLine();
                if (str.equalsIgnoreCase("quit"))

                    break;
                else
                {
                    char[] ch = str.toCharArray();
                    for (int i = 0; i < str.length(); i++)
                    {
                        if (ch[i] == 'A' || ch[i] == 'a')
                        {
                            vowel_A++;
                        }
                        else if (ch[i] == 'e' || ch[i] == 'E')
                        {
                            vowel_E++;
                        }
                        else if (ch[i] == 'i' || ch[i] == 'I')
                        {
                            vowel_I++;
                        }
                        else if (ch[i] == 'o' || ch[i] == 'O')
                        {
                            vowel_O++;
                        }
                        else if (ch[i] == 'u' || ch[i] == 'U')
                        {
                            vowel_U++;
                        }
                        else
                        { }
                    }

                }
                str = "";
            }
            System.out.println("A is " + vowel_A + " times.");
            System.out.println("E is " + vowel_E + " times.");
            System.out.println("I is " + vowel_I + " times.");
            System.out.println("O is " + vowel_O + " times.");
            System.out.println("U is " + vowel_U + " times.");
        }
    }
