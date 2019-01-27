package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите дату и время");
        System.out.println("в формате dd.MM.yyyy hh:mm:ss");
        Scanner in = new Scanner(System.in);
        String inputDate = in.nextLine();

        String formattedDate = dateConverter(inputDate);
        System.out.println(formattedDate);
    }

    private static String dateConverter(String inputDate) {

        String tmp[] = inputDate.split("\\D+");
        int[] digits = new int[tmp.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(tmp[i]);
        }
        boolean correctDate = (digits.length == 6) && (digits[0] <= 31) &&
                (digits[1] <= 12) && (digits[3] < 24) && (digits[4] < 60) &&
                (digits[5] < 60);
        if (correctDate) {
            String monthName;
            switch (digits[1]) {
                case 1:
                    monthName = "Jan";
                    break;
                case 2:
                    monthName = "Feb";
                    break;
                case 3:
                    monthName = "Mar";
                    break;
                case 4:
                    monthName = "Apr";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "Jun";
                    break;
                case 7:
                    monthName = "Jul";
                    break;
                case 8:
                    monthName = "Aug";
                    break;
                case 9:
                    monthName = "Sep";
                    break;
                case 10:
                    monthName = "Oct";
                    break;
                case 11:
                    monthName = "Nov";
                    break;
                case 12:
                    monthName = "Dec";
                    break;
                default:
                    monthName = "Incorrect Date";
                    break;
            }
            String timeName;
            if (digits[3] > 12) {
                digits[3] -= 12;
                timeName = "PM";
            }
            else {
                timeName = "AM";
            }
            return "" + digits[0] + " " + monthName + ", " + digits[3] + ":"
                    + digits[4] + " " + timeName;
        }
        else {
            return "Неправильная дата!";
        }
    }
}
