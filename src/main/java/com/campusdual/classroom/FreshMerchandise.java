package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate = new Date(123, 4, 4);//modifico a fecha segun os params de date
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");//modifico o formato para que mostre dias meses e ano respectivamente

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);

    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidade: ");
        builder.append(sdf.format(this.getExpirationDate()));
        return builder.toString();
    }


    public void printSpecificData() {
        System.out.println(getSpecificData());

    }

    public String getFormattedDate(Date expirationDate) {//Este metodo toma o expirationDate e o formatea como lle dixen arriba no sdf
        return sdf.format(expirationDate);
    }


}
