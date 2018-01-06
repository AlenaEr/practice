package task;

public class Revert {
    public String revert(String text) {
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char first = ch[i];
            char last = ch[ch.length - 1 - i];
            ch[i] = last;
            ch[ch.length - 1 - i] = first;

        }
        return new String(ch);
    }

    public String revert2(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb = sb.reverse();
        return sb.toString();
    }

    public String revert3(String text) {
        String res = "";
        if (text.length() < 1) {
            return text;
        }
        res = res + text.charAt(text.length() - 1) +
                revert3(text.substring(0, text.length() - 1));
        return res;
    }
}

