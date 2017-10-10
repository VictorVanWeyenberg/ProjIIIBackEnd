/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author Reznov
 */
@Entity
@Table(name="Matches")
@XmlRootElement
public class Match implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    
    @OneToOne
    @Column(name="home")
    private Team home;
    
    @OneToOne
    @Column(name="out")
    private Team out;
    
    @Enumerated(EnumType.STRING)
    private Category category;
    
    @Temporal(TemporalType.TIME)
    private DateTime date;
    
    @OneToMany
    private List<Goal> goals;
    
    public Match() {
        
    }
    
}
