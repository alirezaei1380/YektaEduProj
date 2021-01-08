import java.util.ArrayList;

public class Advertiser extends BaseAdvertising {

    private String id;
    private String name;
    private ArrayList<Ad> ads;
    private static ArrayList<Advertiser> allAdvertisers = new ArrayList<>();

    public Advertiser(int id, String name) {
        super();
        this.id = Integer.toString(id);
        this.setName(name);
        ads = new ArrayList<>();
        allAdvertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClicks() {
        int total = super.getClicks();
        for (Ad ad : ads) {
            total += ad.getClicks();
        }
        return total;
    }

    public int getViews() {
        int total = super.getViews();
        for (Ad ad : ads) {
            total += ad.getViews();
        }
        return total;
    }

    public static int getTotalClicks() {
        int total = 0;
        for (Advertiser advertiser : allAdvertisers) {
            total += advertiser.getClicks();
        }
        return total;
    }

    public static String help() {
        return "Id is a unique code for each object,\n" +
                "Name is obviously the name of the advertiser,\n" +
                "Clicks shows how many clicks the advertisers has had,\n" +
                "And views shows how many views the advertiser has had.";
    }

    public String describeMe() {
        return "This class stores some data and communicates(sets and gets) them and also" +
                "calculates the totalClicks of all advertisers.";
    }

    public void addAd(Ad ad) {
        ads.add(ad);
    }
}
