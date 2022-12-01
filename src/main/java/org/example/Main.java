package org.example;

public class Main {

    static String TableCase(long number, int len) {
        String k = Long.toString(number);
        int length = (len - k.length())/2;
        String TableCase = "";
        for (int i = 0; i < length; i++)
            TableCase += " ";
        for (int i = 0; i < k.length(); i++)
            TableCase += Character.toString(k.charAt(i));
        for (int i = length + k.length(); i < len; i++)
            TableCase += " ";
        return TableCase;
    }

    public static void main(String[] args) {

        int N = 10000;

        LinkedListTest Linked = new LinkedListTest(N);
        LinkedListTest Array = new LinkedListTest(N);



        String Table = "\n****************************************************" +
                "\n| Метод  | Колличество запусков | Время выполнения |" +
                "\n****************************************************" +
                "\n|  add   |" + TableCase(N, 22) + "|" + TableCase(Linked.add(), 18) + "|" +
                "\n****************************************************" +
                "\n| remove |" + TableCase(N, 22) + "|" + TableCase(Linked.remove(), 18) + "|" +
                "\n****************************************************" +
                "\n|  get   |" + TableCase(N, 22) + "|" + TableCase(Linked.get(), 18) + "|" +
                "\n****************************************************" ;

        System.out.println("\nТаблица для LinkedList\n" + Table);

        Table = "\n****************************************************" +
                "\n| Метод  | Колличество запусков | Время выполнения |" +
                "\n****************************************************" +
                "\n|  add   |" + TableCase(N, 22) + "|" + TableCase(Array.add(), 18) + "|" +
                "\n****************************************************" +
                "\n| remove |" + TableCase(N, 22) + "|" + TableCase(Array.remove(), 18) + "|" +
                "\n****************************************************" +
                "\n|  get   |" + TableCase(N, 22) + "|" + TableCase(Array.get(), 18) + "|" +
                "\n****************************************************" ;

        System.out.println("\nТаблица для ArrayList\n" + Table);
    }
}