package com.sparta.grp1.pom.util;

import java.util.Locale;

public class Products {
    private String id;
    private String productName;
    private String hyphenSeparatedName;

    public Products(String id, String productName) {
        this.id = id;
        this.productName = productName;
        this.hyphenSeparatedName = "-" + this.productName.toLowerCase().replace(" ", "-");
    }

    public static String itemIDNameGenerator(int idNumber){
        return "item_" + idNumber + "_title_link";
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getHyphenSeparatedName() {
        return hyphenSeparatedName;
    }
}
