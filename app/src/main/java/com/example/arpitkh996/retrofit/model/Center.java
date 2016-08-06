package com.example.arpitkh996.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public class Center {

    @SerializedName("center_id")
    @Expose
    private String centerId;
    @SerializedName("center_name")
    @Expose
    private String centerName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("center_logo")
    @Expose
    private String centerLogo;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("lat")
    @Expose
    private float lat;
    @SerializedName("lng")
    @Expose
    private float lng;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("fav")
    @Expose
    private Boolean fav;
    @SerializedName("distance_between")
    @Expose
    private Float distanceBetween;

    /**
     * No args constructor for use in serialization
     *
     */
    public Center() {
    }

    /**
     *
     * @param fav
     * @param address
     * @param centerLogo
     * @param centerName
     * @param locality
     * @param image
     * @param lng
     * @param distanceBetween
     * @param rating
     * @param centerId
     * @param lat
     */
    public Center(String centerId, String centerName, String image, String centerLogo, String rating, String address, Integer lat, Integer lng, String locality, Boolean fav, Float distanceBetween) {
        this.centerId = centerId;
        this.centerName = centerName;
        this.image = image;
        this.centerLogo = centerLogo;
        this.rating = rating;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.locality = locality;
        this.fav = fav;
        this.distanceBetween = distanceBetween;
    }

    /**
     *
     * @return
     * The centerId
     */
    public String getCenterId() {
        return centerId;
    }

    /**
     *
     * @param centerId
     * The center_id
     */
    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    /**
     *
     * @return
     * The centerName
     */
    public String getCenterName() {
        return centerName;
    }

    /**
     *
     * @param centerName
     * The center_name
     */
    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The centerLogo
     */
    public String getCenterLogo() {
        return centerLogo;
    }

    /**
     *
     * @param centerLogo
     * The center_logo
     */
    public void setCenterLogo(String centerLogo) {
        this.centerLogo = centerLogo;
    }

    /**
     *
     * @return
     * The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     * The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The lat
     */
    public float getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     * The lat
     */
    public void setLat(float lat) {
        this.lat = lat;
    }

    /**
     *
     * @return
     * The lng
     */
    public float getLng() {
        return lng;
    }

    /**
     *
     * @param lng
     * The lng
     */
    public void setLng(float lng) {
        this.lng = lng;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The fav
     */
    public Boolean getFav() {
        return fav;
    }

    /**
     *
     * @param fav
     * The fav
     */
    public void setFav(Boolean fav) {
        this.fav = fav;
    }

    /**
     *
     * @return
     * The distanceBetween
     */
    public Float getDistanceBetween() {
        return distanceBetween;
    }

    /**
     *
     * @param distanceBetween
     * The distance_between
     */
    public void setDistanceBetween(Float distanceBetween) {
        this.distanceBetween = distanceBetween;
    }

}
