import java.util.ArrayList;

public class Advertiser {

    private String id;
    private String name;
    private int clicks;
    private int views;
    private ArrayList<Ad> ads;
    private static ArrayList<Advertiser> allAdvertisers = new ArrayList<>();

    public Advertiser() {
        allAdvertisers.add(this);
        ads = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClicks() {
        int total = clicks;
        for (Ad ad : ads) {
            total += ad.getClicks();
        }
        return total;
    }

    public int getViews() {
        int total = views;
        for (Ad ad : ads) {
            total += ad.getViews();
        }
        return total;
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

    public static int getTotalClicks() {
        int total = 0;
        for (Advertiser advertiser : allAdvertisers) {
            total += advertiser.getClicks();
        }
        return total;
    }

    public String help() {
        return "id is a unique code for each object\n" +
                "name is obviously the name of the advertiser\n" +
                "clicks shows how many clicks the advertisers has had\n" +
                "and views shows how many views the advertiser has had";
    }

    public String describeMe() {
        return "this class stores the data we need and also communicates (sets and gets) them" +
                " and also calculates the number of total clicks";
    }

    public void addAd(Ad ad) {
        ads.add(ad);
    }
}
