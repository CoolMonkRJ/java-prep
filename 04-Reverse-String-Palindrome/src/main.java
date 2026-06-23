public class main {
    public static void main(String[] args){
        StringProcessor processor = new StringProcessor();
        String word ="madam";
        System.out.println("Original : " + word);
        System.out.println("Reversed : "+ processor.reverse(word));
        if(processor.isPalindrome(word)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
