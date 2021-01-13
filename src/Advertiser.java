import java.util.ArrayList;

public class Advertiser extends BaseAdvertising {

    private String name;
    private ArrayList<Ad> ads;
    private static ArrayList<Advertiser> allAdvertisers = new ArrayList<>();

    public Advertiser(String name) {
        super();
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
        int totalViews = super.getViews();
        for (Ad ad : ads) {
            totalViews += ad.getViews();
        }
        return totalViews;
    }

    public static int getTotalClicks() {
        int totalClicks = 0;
        for (Advertiser advertiser : allAdvertisers) {
            totalClicks += advertiser.getClicks();
        }
        return totalClicks;
    }

    public static String help() {
        return "Id is a unique code for each object,\n" +
                "Name is obviously the name of the advertiser,\n" +
                "Clicks shows how many clicks the advertisers has had,\n" +
                "And views shows how many views the advertiser has had.";
    }

    public String describeMe() {
        StringBuilder description = new StringBuilder(super.describeMe());
        description.append("Name: ");
        description.append(getName());
        description.append(", ads titles:");
        if (ads.isEmpty()) {
            description.append(" there are no ads yet.");
        } else {
            for (Ad ad : ads) {
                description.append("\n");
                description.append(ad.getTitle());
            }
            description.append(".");
        }
        return description.toString();
    }

    public void addAd(Ad ad) {
        ads.add(ad);
    }
}
