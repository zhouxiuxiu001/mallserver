package cn.enjoy.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SpecGoodsImage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_image.id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_image.spec_goods_id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    private Integer specGoodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_image.src
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    private String src;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_image.create_time
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_image.id
     *
     * @return the value of tp_spec_goods_image.id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_image.id
     *
     * @param id the value for tp_spec_goods_image.id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_image.spec_goods_id
     *
     * @return the value of tp_spec_goods_image.spec_goods_id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public Integer getSpecGoodsId() {
        return specGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_image.spec_goods_id
     *
     * @param specGoodsId the value for tp_spec_goods_image.spec_goods_id
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public void setSpecGoodsId(Integer specGoodsId) {
        this.specGoodsId = specGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_image.src
     *
     * @return the value of tp_spec_goods_image.src
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_image.src
     *
     * @param src the value for tp_spec_goods_image.src
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_image.create_time
     *
     * @return the value of tp_spec_goods_image.create_time
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_image.create_time
     *
     * @param createTime the value for tp_spec_goods_image.create_time
     *
     * @mbggenerated Thu Feb 08 11:12:37 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}