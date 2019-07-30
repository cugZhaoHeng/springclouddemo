package com.cug.quantitytrainhebernate.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * @author zhaoheng
 * @date 2019/7/29 0029
 */
@Entity
@Table(name = "tb_model")
public class Model {
    @Id
    @Column(name = "model_id")
    private String id;

    @Column(name = "model_name")
    private String name;

    @Column(name = "model_location")
    private String location;

    @OneToMany(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "model_id")
    private List<Fault> faults;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    private List<Well> wells;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
