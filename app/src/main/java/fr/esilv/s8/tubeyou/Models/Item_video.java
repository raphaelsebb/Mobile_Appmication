package fr.esilv.s8.tubeyou.Models;

/**
 * Created by raphael on 25/03/2017.
 */

public class Item_video {
    private String kind;
    private String etag;
    private Id id;
    private Snippet snippet;
    private String channelTitile;
    private String liveBroadcastContent;

    public String getChannelTitile() {
        return channelTitile;
    }

    public void setChannelTitile(String channelTitile) {
        this.channelTitile = channelTitile;
    }

    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }
}
