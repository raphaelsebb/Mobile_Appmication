package fr.esilv.s8.tubeyou.Models;

import java.util.List;

/**
 * Created by raphael on 25/03/2017.
 */

public class SearchResult {
    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private List<Item_video> item_videos;

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

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Item_video> getItem_videos() {
        return item_videos;
    }

    public void setItem_videos(List<Item_video> item_videos) {
        this.item_videos = item_videos;
    }
}
