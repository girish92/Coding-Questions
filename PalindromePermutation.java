/*

Given a string, determine if a permutation of the string could form a palindrome.

For example,
"code" -> False, "aab" -> True, "carerac" -> True.

*/

class PalindromePermutation {

  public static void main(String[] args){
    String str = "code";
    System.out.println(formPalindrome(str));
  }

  public static boolean formPalindrome(String str){
    int[] arr = new int[256];
    Arrays.fill(arr, 0);
    for(int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      arr[(int)c]++;
    }
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 != 0){
        count += 1;
      }
    }
    return count <= 1;
  }


}
