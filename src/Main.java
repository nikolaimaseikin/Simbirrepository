
// Подумать про пузырьком
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void alphabet_sort(String name){
        int buff;
        String searchString1;
        String searchString2;
        String bufferString;
        String[] stringArray = name.split(" ");
        char[] alphabet  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i  = 0 ; i < alphabet.length; i++){
            for (int j = 0; j < stringArray.length; j++){
                searchString1 = stringArray[j];
                for (int k = 0; k < stringArray.length; k++){
                    searchString2 = stringArray[k];
                    if(searchString2.charAt(0) == alphabet[i] && searchString1.charAt(0) != alphabet[i] ){
                       bufferString =  stringArray[j];
                        stringArray[j] = stringArray[k];
                        stringArray[k] = bufferString;
                        break;

                    }

                }
            }
        }

        for (int j = 0; j < stringArray.length; j++){
            searchString1 = stringArray[j];
            for (int k = j+1; k < stringArray.length; k++){
                searchString2 = stringArray[k];
                if(searchString2.charAt(0) == searchString1.charAt(0)){
                    if(searchString2.length() < searchString1.length()){

                        bufferString =  stringArray[j];
                        stringArray[j] = stringArray[k];
                        stringArray[k] = bufferString;


                    }


                }

            }
        }




for (int i = 0; i< stringArray.length; i++){

    buff = stringArray[i].length();
    if (buff > 1) {
        System.out.print(stringArray[i] + " ");
    }

}

    }




    public static void main(String[] args) {
String string;

Scanner sc = new Scanner(System.in);

System.out.println("Введите строку");
string = sc.nextLine();
        sc.close();
alphabet_sort(string);

    }
}
