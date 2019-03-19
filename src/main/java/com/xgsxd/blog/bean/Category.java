package com.xgsxd.blog.bean;

public class Category {
    private Integer categoryId;

    private Integer parentId;

    private String categoryName;

    private String categoryAlias;

    private String categoryMarks;

    private String categoryDescription;

    private String categoryStatus;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryAlias() {
        return categoryAlias;
    }

    public void setCategoryAlias(String categoryAlias) {
        this.categoryAlias = categoryAlias == null ? null : categoryAlias.trim();
    }

    public String getCategoryMarks() {
        return categoryMarks;
    }

    public void setCategoryMarks(String categoryMarks) {
        this.categoryMarks = categoryMarks == null ? null : categoryMarks.trim();
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription == null ? null : categoryDescription.trim();
    }

    public String getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(String categoryStatus) {
        this.categoryStatus = categoryStatus == null ? null : categoryStatus.trim();
    }
}