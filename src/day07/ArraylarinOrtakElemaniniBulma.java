package day07;

import java.util.ArrayList;

public class ArraylarinOrtakElemaniniBulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily}
     * Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */

    public static void main(String[] args) {

        String[] array1={"John","Brad","Ange","Sofia","Emily"};
        String[] array2={"sofia","brad","grace","emily","hazel"};

        arraylerinOrtakElemanlariListesi(array1,array2);
    }

    private static void arraylerinOrtakElemanlariListesi(String[] array1, String[] array2) {

        ArrayList<String> arrList = new ArrayList<>();

        for (String each:array1) {

            for (String hic:array2 ) {

                if(each.equalsIgnoreCase(hic)){
                    arrList.add(each);
                }
            }

        }

        System.out.println(arrList);

    }
}
