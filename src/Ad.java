public class Ad extends BaseAdvertising {

    private String title;
    private String imgUrl;
    private String link;

    public Ad(int id, String title, String imgUrl, String link, Advertiser advertiser) {
        super(id);
        this.setTitle(title);
        this.setImgUrl(imgUrl);
        this.setLink(link);
        this.setAdvertiser(advertiser);
    }

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

    public void setAdvertiser(Advertiser advertiser) {
        advertiser.addAd(this);
    }

    public String describeMe() {
        return super.describeMe() + "Title: " + getTitle() + ", imgUrl: " + getImgUrl() + ", link: " + getLink() + ".";
    }
}
