package com.epam.calculator.entity;

/**
 * Created by Uladzislau_Zhukouski on 9/8/2016.
 */
public class Sign {
    private String sign;

    public Sign() {
    }

    public Sign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sign sign1 = (Sign) o;

        return sign != null ? sign.equals(sign1.sign) : sign1.sign == null;

    }

    @Override
    public int hashCode() {
        return sign != null ? sign.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "sign='" + sign + '\'' +
                '}';
    }
}
