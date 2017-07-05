import java.io.*;
import java.util.*;


/*

Hacker Rank

Encryption

An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let L be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

FLOOR(sqrt(L)) <= row <= column <= CEIL(sqrt(L)), where FLOOR is floor function and CEIL is ceil function
For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots

Ensure that rows x columns >= L


If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows x columns

The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be  characters. Print the encoded message.

Here are some more examples:

Sample Input:

haveaniceday

Sample Output:

hae and via ecy

Sample Input:

feedthedog    

Sample Output:

fto ehg ee dd

Sample Input:

chillout

Sample Output:

clu hlt io

*/




public class Encryption {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int length = input.length();
        int row = (int)Math.sqrt(length);
        int col = (int)Math.ceil(Math.sqrt(length));
        
        if(row * col < length){
            row++;
        }
        
        String[][] arr = new String[row][col];
        int index = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(index >= input.length()){
                    break;
                }
                arr[i][j] = Character.toString(input.charAt(index));
                index++;
            }
        }
        String encode = new String("");
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(arr[j][i] != null){
                    encode += arr[j][i];
                }
            }
            encode += " ";
        }
        encode = encode.trim();
        System.out.println(encode);
    }
}