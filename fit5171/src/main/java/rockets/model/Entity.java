package rockets.model;

public abstract class Entity {
    private Long identity;

    private String wikilink;

    public String getWikilink() {
        return wikilink;
    }

    public void setWikilink(String wikilink) {
        this.wikilink = wikilink;
    }

    public Long getIdentity() {
        return identity;
    }

    public void setId(Long identity) {
        this.identity = identity;
    }
}
