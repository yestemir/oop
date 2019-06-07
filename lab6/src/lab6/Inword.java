package lab6;

public class Inword {

    public String helper(int n){
        String res = "";
        switch(n)
        {
            case 1:
                res = "one";
                break;
            case 2:
                res = "two";
                break;
            case 3:
                res = "three";
                break;
            case 4:
                res = "four";
                break;
            case 5:
                res = "five";
                break;
            case 6:
                res = "six";
                break;
            case 7:
                res = "seven";
                break;
            case 8:
                res = "eight";
                break;
            case 9:
                res = "nine";
                break;
            default:
                break;
        }
        return res;
    }

    public String inWords(int number){
        String res = "";
        if (number % 100 < 20 && number % 100 >= 10)
        {
            switch (number % 100)
            {
                case 10:
                    res = "ten";
                    break;
                case 11:
                    res = "eleven";
                    break;
                case 12:
                    res = "twelve";
                    break;
                case 13:
                    res = "thirteen";
                    break;
                case 14:
                    res = "fourteen";
                    break;
                case 15:
                    res = "fifteen";
                    break;
                case 16:
                    res = "sixteen";
                    break;
                case 17:
                    res = "seventeen";
                    break;
                case 18:
                    res = "eighteen";
                    break;
                case 19:
                    res = "nineteen";
                    break;
                default:
                    break;
            }
            number /= 100;
        }
        else
        {
            res = helper(number % 10);
            number /= 10;

            switch (number % 10)
            {
                case 2:
                    res = "twenty " + res;
                    break;
                case 3:
                    res = "thirty " + res;
                    break;
                case 4:
                    res = "fourty " + res;
                    break;
                case 5:
                    res = "fifty " + res;
                    break;
                case 6:
                    res = "sixty " + res;
                    break;
                case 7:
                    res = "seventy " + res;
                    break;
                case 8:
                    res = "eighty " + res;
                    break;
                case 9:
                    res = "ninety " + res;
                    break;
                default:
                    break;
            }
            number /= 10;
        }
        if (number != 0) {
            if (number % 10 != 0) res = " hundred " + res;
            res = helper(number % 10) + res;
            number /= 10;
        }

        if (number != 0)
            res = " thousand " + res;

        if (number % 100 < 20 && number % 100 >= 10)
        {
            switch (number % 100)
            {
                case 10:
                    res = "ten" + res;
                    break;
                case 11:
                    res = "eleven" + res;
                    break;
                case 12:
                    res = "twelve" + res;
                    break;
                case 13:
                    res = "thirteen" + res;
                    break;
                case 14:
                    res = "fourteen" + res;
                    break;
                case 15:
                    res = "fifteen" + res;
                    break;
                case 16:
                    res = "sixteen" + res;
                    break;
                case 17:
                    res = "seventeen" + res;
                    break;
                case 18:
                    res = "eighteen" + res;
                    break;
                case 19:
                    res = "nineteen" + res;
                    break;
                default:
                    break;
            }
            number /= 100;
        }
        else
        {
            res = helper(number % 10) + res;
            number /= 10;

            switch (number % 10)
            {
                case 2:
                    res = "twenty " + res;
                    break;
                case 3:
                    res = "thirty " + res;
                    break;
                case 4:
                    res = "fourty " + res;
                    break;
                case 5:
                    res = "fifty " + res;
                    break;
                case 6:
                    res = "sixty " + res;
                    break;
                case 7:
                    res = "seventy " + res;
                    break;
                case 8:
                    res = "eighty " + res;
                    break;
                case 9:
                    res = "ninety " + res;
                    break;
                default:
                    break;
            }
            number /= 10;
        }
        return res;
    }
}