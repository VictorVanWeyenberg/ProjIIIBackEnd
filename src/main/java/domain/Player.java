/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reznov
 */
@Entity
@Table(name="Players")
@XmlRootElement
public class Player {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String firstname;
    private String lastname;
    private Integer number;
    
    @OneToMany
    private List<Goal> goals;
    
    @OneToMany
    private List<Suspension> suspensions;
    
}
