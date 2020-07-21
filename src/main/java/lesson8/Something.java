package lesson8;

public class Something {
    private byte bt;
    private short st;
    private int nt;
    private long lng;
    private float flt;
    private double dbl;
    private char chr;
    private boolean bln;
    private String str;

    public Something() {
    }

    public Something(byte bt) {
        this.bt = bt;
    }

    public Something(byte bt, short st) {
        this.bt = bt;
        this.st = st;
    }

    public Something(byte bt, short st, int nt) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
    }

    public Something(byte bt, short st, int nt, long lng) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
    }

    public Something(byte bt, short st, int nt, long lng, float flt) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
        this.flt = flt;
    }

    public Something(byte bt, short st, int nt, long lng, float flt, double dbl) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
        this.flt = flt;
        this.dbl = dbl;
    }

    public Something(byte bt, short st, int nt, long lng, float flt, double dbl, char chr) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
        this.flt = flt;
        this.dbl = dbl;
        this.chr = chr;
    }

    public Something(byte bt, short st, int nt, long lng, float flt, double dbl, char chr, boolean bln) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
        this.flt = flt;
        this.dbl = dbl;
        this.chr = chr;
        this.bln = bln;
    }

    public Something(byte bt, short st, int nt, long lng, float flt, double dbl, char chr, boolean bln, String str) {
        this.bt = bt;
        this.st = st;
        this.nt = nt;
        this.lng = lng;
        this.flt = flt;
        this.dbl = dbl;
        this.chr = chr;
        this.bln = bln;
        this.str = str;
    }

    public byte getBt() {
        return bt;
    }

    public void setBt(byte bt) {
        this.bt = bt;
    }

    public short getSt() {
        return st;
    }

    public void setSt(short st) {
        this.st = st;
    }

    public int getNt() {
        return nt;
    }

    public void setNt(int nt) {
        this.nt = nt;
    }

    public long getLng() {
        return lng;
    }

    public void setLng(long lng) {
        this.lng = lng;
    }

    public float getFlt() {
        return flt;
    }

    public void setFlt(float flt) {
        this.flt = flt;
    }

    public double getDbl() {
        return dbl;
    }

    public void setDbl(double dbl) {
        this.dbl = dbl;
    }

    public char getChr() {
        return chr;
    }

    public void setChr(char chr) {
        this.chr = chr;
    }

    public boolean isBln() {
        return bln;
    }

    public void setBln(boolean bln) {
        this.bln = bln;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
