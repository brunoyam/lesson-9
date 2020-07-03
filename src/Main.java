import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int minSquare(int n, int m, int a) {
        int res;
        int res1;
        int result;

        if (m%a!=0){
            res = m / a + 1;
        } else {
            res = m / a;
        }
        if (n%a!=0){
            res1 = n / a + 1;
        } else {
            res1 = n / a;
        }
        result = res * res1;
        System.out.println(result);
        return result;
    }

    static boolean isHello(String s) {

        char[] mas = {'h', 'e', 'l', 'l', 'o',};
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (mas[i] == s.charAt(j)) {
                i += 1;
                if (i == 5) {
                    return true;
                }
            }
        }
        if (i == 5) {
            return true;
        } else {
            return false;
        }
    }

    static int countInTable(int n, int a) {
        int res=0;
        for (int i= 1; i<=n;i++) {
            for (int j=1; j<=n; j++) {
                if (i*j==a) {
                    res++;
                }
            }
        }
        return res;
    }

    static int minDistance(int oneTwo, int oneThree, int twoThree) {
        int a = oneTwo + oneThree + oneThree + oneTwo;
        int b = oneTwo + oneThree + twoThree;
        int c = oneTwo + twoThree + twoThree + oneTwo;
        int d = oneThree + twoThree + twoThree + oneThree;
        return Math.min(Math.min(a, b), Math.min(c, d));

    }


    static boolean abandBa(String s) {

        int indexOfAB = s.indexOf("AB");

        String left = s.substring(0, indexOfAB);

        String right = s.substring(indexOfAB + 2);

        if (left.contains("BA") || right.indexOf("BA") != -1) {
            return true;
       } else {
            return false;
        }
    }

    static int rotateCount(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char alphabetLetter = 'a'; alphabetLetter <= 'z'; ++alphabetLetter) {
            map.put(alphabetLetter, alphabetLetter - 'a' + 1);
        }

        char previousSymbol = 'a';
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            char currentSymbolFromString = s.charAt(i);
            int left = Math.abs(map.get(previousSymbol) - map.get(currentSymbolFromString));
            int right = 26 - left;
            result += Math.min(left, right);
        }

        return result;
    }

    static int closestInterestNumber(int a) {
        while(true){
            int q = a;
            int result = 0;
            while(q>0){
                result += q%10;
                q= q/10;
            }
            if (result%4==0){
                return a;
            }else {
                a++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String s = scanner.nextLine();

        int a = scanner.nextInt();

        System.out.println(closestInterestNumber(a));


        // System.out.println(isHello(s) ? "Удалось поздороваться" : "Не удалось поздороваться");


    }
}
