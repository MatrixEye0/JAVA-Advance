
public class validpalindrom {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (a >= 'A' && a <= 'Z') {
                a = (char) (a + 32);
            }

            if (b >= 'A' && b <= 'Z') {
                b = (char) (b + 32);
            }

            if (!((a >= 'a' && a <= 'z') ||
                  (a >= '0' && a <= '9'))) {
                i++;
            } else if (!((b >= 'a' && b <= 'z') ||
                         (b >= '0' && b <= '9'))) {
                j--;
            } else {
                if (a != b) {
                    return false;
                }

                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        validpalindrom obj = new validpalindrom();

        String s = "A man, a plan, a canal: Panama";

        System.out.println(obj.isPalindrome(s));
    }
}
