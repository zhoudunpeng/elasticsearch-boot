package com.zdp.elasticsearchboot.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author sesshomaru
 * @date 2020/6/19
 *
 * 可以看作es中的一个文档
 * 1.前面有3和字段和数据 后面再添加4个字段 添加并不会影响而且可以将 以前数据里面没有后4项没有的数据添加上
 *
 */
//索引名称 (这里使用的6.4.3版本的es如果是7以上的es版本这里无需设置type属性)
//这里可以设置分片数 和 副本数
@Document(indexName = "stu", type = "_doc")
public class Stu {

    //@Id是为了保障 es中的_id和此处的stuId一致 如果想不一致可以不要此注解
    @Id
    private Long stuId;

    //store是否存储 index是否倒排索引（默认是倒排的）
    @Field(store = true, index = true)
    private String name;

    @Field(store = true)
    private Integer age;

    /**
     * 第二次添加
     */
    @Field(store = true)
    private Float money;

    @Field(store = true, type = FieldType.Keyword)
    private String sign;

    @Field(store = true)
    private String desc;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
