package Java.AST.Expr;

import Java.AST.Node;

public class LiteralValue extends Node {
    private String numericalValue;
    private String stringValue;
    private String nullValue;
    private String blobValue;
    private String currentTime;
    private String currentDate;
    private String currentTimeStamp;

    public String getNumericalValue() {
        return numericalValue;
    }

    public void setNumericalValue(String numericalValue) {
        this.numericalValue = numericalValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public String getBlobValue() {
        return blobValue;
    }

    public void setBlobValue(String blobValue) {
        this.blobValue = blobValue;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getCurrentTimeStamp() {
        return currentTimeStamp;
    }

    public void setCurrentTimeStamp(String currentTimeStamp) {
        this.currentTimeStamp = currentTimeStamp;
    }
}
