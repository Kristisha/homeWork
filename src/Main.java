

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int [] array = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Введите значение для "
            + i
            + " элемента массива");
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*int array[] = new int [10];
        int array2[] = {3, 4, 6};
        System.out.print(array2[0]);
        for (int i = 0; i < 35; i ++ )
        {
            System.out.println(i);
        }

        int i = 0;
        while (i < 35)
        for (i = 0; i < 35; i ++)
        {
            System.out.println(i);
            i ++;
        }*/
        /*InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Введите радиус круга:");
        String sRadius = bufferedReader.readLine(); //читаем строку с клавиатуры
        double nRadius  = Double.parseDouble(sRadius); //преобразовываем строку в число.
        System.out.print(2*3.14*nRadius);*/
        // write your code here
    }
}