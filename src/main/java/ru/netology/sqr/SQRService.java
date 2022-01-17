package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int countSqrCalc(int lowLim, int highLim) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLim && i * i <= highLim) {
                count = count + 1;
            }
        }
        return count;
    }
}