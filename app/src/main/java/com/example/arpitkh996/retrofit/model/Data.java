package com.example.arpitkh996.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public class Data {

    @SerializedName("image_url_small")
    @Expose
    private String imageUrlSmall;
    @SerializedName("image_url_large")
    @Expose
    private String imageUrlLarge;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("centers")
    @Expose
    private List<Center> centers = new ArrayList<Center>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param categoryName
     * @param imageUrlLarge
     * @param imageUrlSmall
     * @param centers
     */
    public Data(String imageUrlSmall, String imageUrlLarge, String categoryName, List<Center> centers) {
        this.imageUrlSmall = imageUrlSmall;
        this.imageUrlLarge = imageUrlLarge;
        this.categoryName = categoryName;
        this.centers = centers;
    }

    /**
     *
     * @return
     * The imageUrlSmall
     */
    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    /**
     *
     * @param imageUrlSmall
     * The image_url_small
     */
    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }

    /**
     *
     * @return
     * The imageUrlLarge
     */
    public String getImageUrlLarge() {
        return imageUrlLarge;
    }

    /**
     *
     * @param imageUrlLarge
     * The image_url_large
     */
    public void setImageUrlLarge(String imageUrlLarge) {
        this.imageUrlLarge = imageUrlLarge;
    }

    /**
     *
     * @return
     * The categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     *
     * @param categoryName
     * The category_name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     *
     * @return
     * The centers
     */
    public List<Center> getCenters() {
        return centers;
    }

    /**
     *
     * @param centers
     * The centers
     */
    public void setCenters(List<Center> centers) {
        this.centers = centers;
    }

}
