/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reznov
 */
@Entity
@Table(name="Teams")
@XmlRootElement
public class Team implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String name;
    
    @OneToOne
    private User coach;
    
    @OneToMany
    private List<Player> players;
    
    @Enumerated(EnumType.STRING)
    private Category cateory;
    
}
