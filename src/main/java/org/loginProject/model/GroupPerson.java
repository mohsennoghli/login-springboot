package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ali
 * Create on 4/18/2018 10:51 PM
 */

@Entity
@SequenceGenerator(sequenceName = "Group_Person_Seq", name = "groupPersonSeq", allocationSize = 1)
public class GroupPerson extends BaseEntity implements Serializable {

    @Column
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
