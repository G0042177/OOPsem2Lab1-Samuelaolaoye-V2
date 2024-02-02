package ie.atu.productv5;

import ie.atu.productv5.tv;
import ie.atu.productv5.music;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;
        if(productCode.equalsIgnoreCase("kdl43")) {
            tv mytv = new tv();
            mytv.setCode(productCode);
            mytv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            mytv.setScreensize("screen size is 55' ");
            mytv.setManufacture("Sony");
            mytv.setPrice(819.00);
            myProduct = mytv;
        }

        if(productCode.equalsIgnoreCase("pink")){
            music mymusic = new music();
            mymusic.setCode(productCode);
            mymusic.setDescription("Wish you were here");
            mymusic.setPrice(8.00);
            mymusic.setLabel("Part of the Columbia group");
            mymusic.setArtist("Pink floyd");
            myProduct = mymusic;
        }
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
        return myProduct;
    }
}

