/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name="Goals")
@XmlRootElement
public class Goal implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Temporal(TemporalType.TIME)
    private DateTime time;
    
    public Goal() {
        
    }
    
}
