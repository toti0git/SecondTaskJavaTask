package SecondTask;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String enteredText = scan.nextLine();
       // getEvenOddNumbers(Integer.parseInt(e));
        String strArray[] = enteredText.split(" ");

      // getEvenOddNumbers(strArray);
      //  getAmountOfDigits(strArray);
       // deleteSameValue(strArray);
        getFrequenceOfChar(strArray);

    }

    static String getEvenOddNumbers(String [] strArray){
        String result;

        int numberList[]=new int[strArray.length];
       for(int i=0; i<strArray.length; i++){
            numberList[i]=Integer.parseInt(strArray[i]);
        }

        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        for(int i=0; i<numberList.length; i++){
            if(numberList[i]%2==0) {
                even.add(numberList[i]);}
                else{
                    odd.add(numberList[i]);
            }
        }
        result="List of even numbers "+String.valueOf(even)+"\n"+"List of odd numbers "+String.valueOf(odd);
        System.out.println(result);
        return result;
    }

     static void getAmountOfDigits(String [] str){
        int amount=0;
        int intValue;
        for (String string:str){
            try {
                intValue = Integer.parseInt(string);
                amount++;
            } catch (NumberFormatException e) {
                //System.out.println("Input String cannot be parsed to Integer.");
            }
        }
         System.out.println("Amount of digits: "+amount);

     }
    static void getListOfDigits(String [] str){
        int intValue;
        List<Integer> listOfDigits = new ArrayList<>();
        for (String string:str){
            try {
                intValue = Integer.parseInt(string);
                listOfDigits.add(intValue);
            } catch (NumberFormatException e) {
                //System.out.println("Input String is not integer.");
            }
        }
        for (Integer integer:listOfDigits) {
            System.out.println(" "+integer);
        }


    }

    static  void deleteSameValue(String str[]){
        List<String> listOfValues = new ArrayList<>(Arrays.asList(str.clone()));
        List<String> deDupStringList3 = listOfValues.stream().distinct().collect(Collectors.toList());
        for (int i =0; i<deDupStringList3.size(); i++){
            if (!deDupStringList3.get(i).equals(null)) {
                System.out.println(deDupStringList3.get(i));
               }
        }
    }


    static  void getFrequenceOfChar(String str[]){
        Scanner scan = new Scanner(System.in);
        int frequensy=0;
        String enteredChar = scan.nextLine();
        char ch =enteredChar.charAt(0);
        char[] chars = Arrays.toString(str).toCharArray();
        for (Character c:chars) {
            if (c.equals(ch)){
                frequensy++;
            }
        }
        System.out.println("Частота встречаемости символа "+ String.valueOf(ch) +" "+frequensy);
    }

}
