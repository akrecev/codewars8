package loveOrNotLove;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        return ((flower1 + flower2) & 1) == 1;
    }

}