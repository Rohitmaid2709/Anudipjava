
public class CountingVowelAndConsonant
{

 static void main(String[] args)
	{    
         int vCount = 0, cCount = 0;    
         String str = "Best Of Luck";     
         str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++)
        {    
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
        {     
           vCount++;    
         }    
              
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
}   
