package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        String answer;
        Random random = new Random();
        int number = random.nextInt(8);
        if(number == 0){
            answer = CERTAIN;
        }else  if(number == 1){
            answer = DEFINITELY;
        }else if(number == 2){
            answer = MOST_LIKELY;
        }else if(number == 3){
            answer = OUTLOOK_GOOD;
        }else if(number == 4){
            answer = ASK_AGAIN_LATER;
        }else if(number == 5){
            answer = TRY_AGAIN;
        }else if(number == 6){
            answer = NO;
        }else if(number == 7){
            answer = VERY_DOUBTFUL;
        }else {
            return null;
        }

        return answer;
    }
}
