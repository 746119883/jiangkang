package com.jk.work.java.framework.swagger.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: kang.jiang
 * @Description:
 * @Date: create in 2021/11/12 上午10:58
 */
@ApiModel(value = "请求参数")
public class SwaggerTestQo {

    @ApiModelProperty(value = "第一")
    private String frist;

    private String second;

    private String third;

    private String fourth;

    private String fifth;

    private String sixth;

    public String getFrist() {
        return frist;
    }

    public void setFrist(String frist) {
        this.frist = frist;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }
}
