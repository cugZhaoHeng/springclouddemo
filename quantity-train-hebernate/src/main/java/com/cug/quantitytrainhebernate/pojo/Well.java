package com.cug.quantitytrainhebernate.pojo;

import javax.persistence.*;

/**
 * @author zhaoheng
 * @date 2019/7/29 0029
 */
@Entity
@Table(name = "tb_well")
public class Well {

    @Id
    @Column(name = "well_id")
    private String id;

    @Column(name = "well_name")
    private String name;

    @Column(name = "well_deep")
    private String deep;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

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

    public String getDeep() {
        return deep;
    }

    public void setDeep(String deep) {
        this.deep = deep;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Well{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", deep='" + deep + '\'' +
                ", model=" + model +
                '}';
    }
}
