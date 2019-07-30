package com.cug.quantitytrainhebernate.pojo;

import javax.persistence.*;

/**
 * @author zhaoheng
 * @date 2019/7/29 0029
 */
@Entity
@Table(name = "tb_fault")
public class Fault {
    @Id
    private String id;

    @Column(name = "fault_name")
    private String name;

    @Column(name = "fault_code")
    private String code;

    private String model_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel_id() {
        return model_id;
    }

    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    @Override
    public String toString() {
        return "Fault{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", model_id='" + model_id + '\'' +
                '}';
    }
}
