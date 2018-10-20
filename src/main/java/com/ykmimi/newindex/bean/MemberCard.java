package com.ykmimi.newindex.bean;

import java.util.Date;

public class MemberCard {
    private Long mcardId;

    private Long mcardNumber;

    private Integer mcardTypeid;

    private Long memberId;

    private Integer mcardState;

    private Double mcardBalance;

    private Long mcardVd;

    private Integer mcardUsecount;

    private Date regDate;

    private Date mcardCancelDate;

    private String mcardPic;

    private Boolean expand01;

    private Boolean expand02;

    private Boolean expand03;

    public Long getMcardId() {
        return mcardId;
    }

    public void setMcardId(Long mcardId) {
        this.mcardId = mcardId;
    }

    public Long getMcardNumber() {
        return mcardNumber;
    }

    public void setMcardNumber(Long mcardNumber) {
        this.mcardNumber = mcardNumber;
    }

    public Integer getMcardTypeid() {
        return mcardTypeid;
    }

    public void setMcardTypeid(Integer mcardTypeid) {
        this.mcardTypeid = mcardTypeid;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getMcardState() {
        return mcardState;
    }

    public void setMcardState(Integer mcardState) {
        this.mcardState = mcardState;
    }

    public Double getMcardBalance() {
        return mcardBalance;
    }

    public void setMcardBalance(Double mcardBalance) {
        this.mcardBalance = mcardBalance;
    }

    public Long getMcardVd() {
        return mcardVd;
    }

    public void setMcardVd(Long mcardVd) {
        this.mcardVd = mcardVd;
    }

    public Integer getMcardUsecount() {
        return mcardUsecount;
    }

    public void setMcardUsecount(Integer mcardUsecount) {
        this.mcardUsecount = mcardUsecount;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getMcardCancelDate() {
        return mcardCancelDate;
    }

    public void setMcardCancelDate(Date mcardCancelDate) {
        this.mcardCancelDate = mcardCancelDate;
    }

    public String getMcardPic() {
        return mcardPic;
    }

    public void setMcardPic(String mcardPic) {
        this.mcardPic = mcardPic == null ? null : mcardPic.trim();
    }

    public Boolean getExpand01() {
        return expand01;
    }

    public void setExpand01(Boolean expand01) {
        this.expand01 = expand01;
    }

    public Boolean getExpand02() {
        return expand02;
    }

    public void setExpand02(Boolean expand02) {
        this.expand02 = expand02;
    }

    public Boolean getExpand03() {
        return expand03;
    }

    public void setExpand03(Boolean expand03) {
        this.expand03 = expand03;
    }
}