package com.company.Task1_03_11_2017;

/**
 * класс предназначеный для печати массивов
 * делает задание 5
 */
public class ArrayPrinter {
    /**
     * Дана квадратная матрица A порядка M (M — нечетное число).МЕТОД Начи-
     * ная с элемента A1,1 и перемещаясь по часовой стрелке, выводит все ее эле-
     * менты по спирали: первая строка, последний столбец, последняя строка в
     * обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  элементы
     * второй строки и т. д.; последним выводится центральный элемент матрицы.
     */
    public static void printSpiral(int[][] array){
        int line = array.length; //сторона даного квадрата, в условии обозначено М
        FullPrinter:
        for(int i=0;i<(line-1)/2;i++){
            LeftRight:
            for(int j=i;j<line-i;j++){
                System.out.print(array[i][j]+" ");
            }
            UpDown:
            for(int j=i+1;j<line-i;j++){
                System.out.print(array[j][line-i-1]+" ");
            }
            RightLeft:
            for(int j=line-i-2;j>=i;j--){
                System.out.print(array[line-i-1][j]+" ");
            }
            DownUp:
            for(int j=line-2-i;j>i;j--){
                System.out.print(array[j][i]+" ");
            }
        }
        System.out.print(array[(line-1)/2][(line-1)/2]);
    }
}
