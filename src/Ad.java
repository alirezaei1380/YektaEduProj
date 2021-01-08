public class Ad {

    private String id;
    private String title;
    private String imgUrl;
    private String link;
    private int clicks;
    private int views;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void setAdvertiser(Advertiser advertiser) {
        advertiser.addAd(this);
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

    public String describeMe() {
        return "this class stores the data we need and also communicates (sets and gets) them";
    }

}
