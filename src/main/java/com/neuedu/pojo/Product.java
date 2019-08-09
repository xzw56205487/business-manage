package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product {

    private Category category;
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    private List<String> subImagesNames;
    public List<String> getSubImagesNames() { return subImagesNames; }
    public void setSubImagesNames(List<String> subImagesNames) {
        this.subImagesNames = subImagesNames;
    }
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.category_id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.subtitle
     *
     * @mbggenerated
     */
    private String subtitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.main_image
     *
     * @mbggenerated
     */
    private String mainImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.stock
     *
     * @mbggenerated
     */
    private Integer stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.sub_images
     *
     * @mbggenerated
     */
    private String subImages;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.detail
     *
     * @mbggenerated
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.id
     *
     * @return the value of neuedu_product.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.id
     *
     * @param id the value for neuedu_product.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.category_id
     *
     * @return the value of neuedu_product.category_id
     *
     * @mbggenerated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.category_id
     *
     * @param categoryId the value for neuedu_product.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.name
     *
     * @return the value of neuedu_product.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.name
     *
     * @param name the value for neuedu_product.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.subtitle
     *
     * @return the value of neuedu_product.subtitle
     *
     * @mbggenerated
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.subtitle
     *
     * @param subtitle the value for neuedu_product.subtitle
     *
     * @mbggenerated
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.main_image
     *
     * @return the value of neuedu_product.main_image
     *
     * @mbggenerated
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.main_image
     *
     * @param mainImage the value for neuedu_product.main_image
     *
     * @mbggenerated
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.price
     *
     * @return the value of neuedu_product.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.price
     *
     * @param price the value for neuedu_product.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.stock
     *
     * @return the value of neuedu_product.stock
     *
     * @mbggenerated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.stock
     *
     * @param stock the value for neuedu_product.stock
     *
     * @mbggenerated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.status
     *
     * @return the value of neuedu_product.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.status
     *
     * @param status the value for neuedu_product.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.create_time
     *
     * @return the value of neuedu_product.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.create_time
     *
     * @param createTime the value for neuedu_product.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.update_time
     *
     * @return the value of neuedu_product.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.update_time
     *
     * @param updateTime the value for neuedu_product.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.sub_images
     *
     * @return the value of neuedu_product.sub_images
     *
     * @mbggenerated
     */
    public String getSubImages() {
        return subImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.sub_images
     *
     * @param subImages the value for neuedu_product.sub_images
     *
     * @mbggenerated
     */
    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.detail
     *
     * @return the value of neuedu_product.detail
     *
     * @mbggenerated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.detail
     *
     * @param detail the value for neuedu_product.detail
     *
     * @mbggenerated
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}