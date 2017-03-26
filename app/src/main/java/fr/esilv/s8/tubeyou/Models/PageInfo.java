package fr.esilv.s8.tubeyou.Models;

/**
 * Created by raphael on 25/03/2017.
 */

public class PageInfo {
    private int totalResults;
    private int resultPerPage;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getResultPerPage() {
        return resultPerPage;
    }

    public void setResultPerPage(int resultPerPage) {
        resultPerPage = resultPerPage;
    }
}
