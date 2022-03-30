/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author USER
 */
@Embeddable
public class TimeZoneTransitionTypePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Time_zone_id")
    private int timezoneid;
    @Basic(optional = false)
    @Column(name = "Transition_type_id")
    private int transitiontypeid;

    public TimeZoneTransitionTypePK() {
    }

    public TimeZoneTransitionTypePK(int timezoneid, int transitiontypeid) {
        this.timezoneid = timezoneid;
        this.transitiontypeid = transitiontypeid;
    }

    public int getTimezoneid() {
        return timezoneid;
    }

    public void setTimezoneid(int timezoneid) {
        this.timezoneid = timezoneid;
    }

    public int getTransitiontypeid() {
        return transitiontypeid;
    }

    public void setTransitiontypeid(int transitiontypeid) {
        this.transitiontypeid = transitiontypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) timezoneid;
        hash += (int) transitiontypeid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeZoneTransitionTypePK)) {
            return false;
        }
        TimeZoneTransitionTypePK other = (TimeZoneTransitionTypePK) object;
        if (this.timezoneid != other.timezoneid) {
            return false;
        }
        if (this.transitiontypeid != other.transitiontypeid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project.TimeZoneTransitionTypePK[ timezoneid=" + timezoneid + ", transitiontypeid=" + transitiontypeid + " ]";
    }
    
}
