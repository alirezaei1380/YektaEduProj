public abstract class BaseAdvertising {

    private int clicks;
    private int views;
    private int id;

    public BaseAdvertising(int id) {
        this.id = id;
        this.clicks = 0;
        this.views = 0;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

    public String describeMe() {
        return "Id: " + id + ", views: " + getViews() + ", clicks: " + getClicks() + ".\n";
    }
}
