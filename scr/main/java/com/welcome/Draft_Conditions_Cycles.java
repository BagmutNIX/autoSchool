package com.welcome;

public class Draft_Conditions_Cycles {
    public static int min(int... numbers) {
        if (numbers.length == 0)
            throw new IllegalArgumentException("Нет чисел!");
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] > numbers[j])
                {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
        return numbers[0];
    }
}
