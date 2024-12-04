package dom;
import java.util.Arrays;


    public class Zadachi {
    public static void main(String[] args) {
        // 16. Найти все пары элементов, сумма которых равна заданному числу.
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + " target");
                }
            }
        }
    }
//    public static void main(String[] args) {
//        // 17. Проверить, есть ли в массиве дубликаты.
//        int[] array = {1, 2, 3, 4, 2};
//        boolean hasDuplicates = false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)) {
//                    hasDuplicates = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(hasDuplicates);
//    }
//    public static void main(String[] args) {
//        // 18. Удалить все нули из массива и сдвинуть элементы влево.
//        int[] array = {0, 1, 0, 3, 0};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                count++;
//            }
//        }
//        int[] newarray = new int[array.length - count];
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {
//                newarray[a++] = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(newarray));
//    }
//    public static void main(String[] args) {
//        // 20. Найти количество чисел, делящихся на заданное число без остатка.
//        int[] array = {10, 15, 20, 24, 30};
//        int divisor = 5;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]% 5 == 0) {
//                count ++;
//                 System.out.println(count);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        // 21. Упорядочить массив по возрастанию.
//        int[] array = {4, 2, 7, 1, 3};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static void main(String[] args) {
//        // 22. Найти индекс первого отрицательного элемента.
//        int[] array = {1, 2, -3, 4, -5};
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
//    }
//    public static void main(String[] args) {
//        // 23. Подсчитать сумму чисел на четных индексах.
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < array.length; i += 2) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        // 24. Найти произведение всех элементов массива.
//        int[] array = {1, 2, 3, 4};
//        int multiply = array[0];
//        for (int i = 1; i < array.length; i++) {
//            multiply = multiply * array[i];
//        }
//        System.out.println(multiply);
//    }
//    public static void main(String[] args) {
//        // 25. Переместить все отрицательные числа в конец массива.
//        int[] array = {1, -2, 3, -4, 5};
//        int temp = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] < 0 && array[j + 1] > 0) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static void main(String[] args) {
//        // 26. Найти количество уникальных элементов в массиве.
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)) {
//                    break;
//                    }
//                if (j == array.length -1) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//    public static void main(String[] args) {
//        // 27. Переставить минимальный элемент массива в начало.
//        int[] array = {4, 2, 1, 3, 5};
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//           if (array[i] < array[min]) {
//               min = i;
//           }
//        }
//        if ( min != 0) {
//            int temp = array[min];
//            array[min] = array[0];
//            array[0] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static void main(String[] args) {
//        // 28. Найти длину самой длинной последовательности одинаковых элементов.
//        int[] array = {1, 1, 2, 2, 2, 2, 3, 3};
//        int maxLength = 1;
//        int currentLength = 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                currentLength++;
//            }else {
//            maxLength = Math.max(maxLength, currentLength);
//            currentLength = 1;
//            }
//        }
//        maxLength = Math.max(maxLength, currentLength);
//        System.out.println(maxLength);
//    }
//    public static void main(String[] args) {
//        // 28. Найти длину самой длинной последовательности одинаковых элементов.
//        int[] array = {1, 1, 2, 2, 2, 2, 3, 3};
//        int maxLength = 1;
//        int currentLength = 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//               currentLength++;
//            }else {
//                if (currentLength > maxLength) {
//                    maxLength = currentLength;
//                    currentLength = 1;
//                }
//            }
//        }
//        System.out.println(maxLength);
//    }
//    public static void main(String[] args) {
//        // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
//        int[] array = {1, -2, 3, 4, -5};
//        int sum = 0;
//        boolean negativeFound = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0 && !negativeFound ) {
//                negativeFound = true;
//            }else if (negativeFound && array[i] > 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        // 30. Удалить все дубликаты из массива.
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        array = Arrays.stream(array).distinct().toArray();
//
//        System.out.println(Arrays.toString(array));
//
//    }
}