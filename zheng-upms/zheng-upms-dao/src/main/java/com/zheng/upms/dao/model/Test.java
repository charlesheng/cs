package com.zheng.upms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Test implements Serializable {
    /**
     * test1
     *
     * @mbg.generated
     */
    private String test1;

    /**
     * test2
     *
     * @mbg.generated
     */
    private Integer test2;

    /**
     * test
     *
     * @mbg.generated
     */
    private BigDecimal test;

    /**
     * test3
     *
     * @mbg.generated
     */
    private Date test3;

    /**
     * test4
     *
     * @mbg.generated
     */
    private Date test4;

    private static final long serialVersionUID = 1L;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public BigDecimal getTest() {
        return test;
    }

    public void setTest(BigDecimal test) {
        this.test = test;
    }

    public Date getTest3() {
        return test3;
    }

    public void setTest3(Date test3) {
        this.test3 = test3;
    }

    public Date getTest4() {
        return test4;
    }

    public void setTest4(Date test4) {
        this.test4 = test4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", test1=").append(test1);
        sb.append(", test2=").append(test2);
        sb.append(", test=").append(test);
        sb.append(", test3=").append(test3);
        sb.append(", test4=").append(test4);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Test other = (Test) that;
        return (this.getTest1() == null ? other.getTest1() == null : this.getTest1().equals(other.getTest1()))
            && (this.getTest2() == null ? other.getTest2() == null : this.getTest2().equals(other.getTest2()))
            && (this.getTest() == null ? other.getTest() == null : this.getTest().equals(other.getTest()))
            && (this.getTest3() == null ? other.getTest3() == null : this.getTest3().equals(other.getTest3()))
            && (this.getTest4() == null ? other.getTest4() == null : this.getTest4().equals(other.getTest4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTest1() == null) ? 0 : getTest1().hashCode());
        result = prime * result + ((getTest2() == null) ? 0 : getTest2().hashCode());
        result = prime * result + ((getTest() == null) ? 0 : getTest().hashCode());
        result = prime * result + ((getTest3() == null) ? 0 : getTest3().hashCode());
        result = prime * result + ((getTest4() == null) ? 0 : getTest4().hashCode());
        return result;
    }
}