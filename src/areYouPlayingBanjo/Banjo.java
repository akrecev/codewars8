package areYouPlayingBanjo;

public class Banjo {

    public static String areYouPlayingBanjoOther(String name) {
        return name.substring(0,1).toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    public static String areYouPlayingBanjoOther2(String name) {
        return name.toLowerCase().charAt(0) == 'r' ? name + " plays banjo" : name + " does not play banjo";
    }

    public static String areYouPlayingBanjoOther3(String name) {
        return name.toLowerCase().startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    public static String areYouPlayingBanjo(String name) {
        return name.matches("[Rr].*") ? name + " plays banjo" : name + " does not play banjo";
    }

}
