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
public class TimeZoneTransitionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Time_zone_id")
    private int timezoneid;
    @Basic(optional = false)
    @Column(name = "Transition_time")
    private long transitiontime;

    public TimeZoneTransitionPK() {
    }

    public TimeZoneTransitionPK(int timezoneid, long transitiontime) {
        this.timezoneid = timezoneid;
        this.transitiontime = transitiontime;
    }

    public int getTimezoneid() {
        return timezoneid;
    }

    public void setTimezoneid(int timezoneid) {
        this.timezoneid = timezoneid;
    }

    public long getTransitiontime() {
        return transitiontime;
    }

    public void setTransitiontime(long transitiontime) {
        this.transitiontime = transitiontime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) timezoneid;
        hash += (int) transitiontime;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeZoneTransitionPK)) {
            return false;
        }
        TimeZoneTransitionPK other = (TimeZoneTransitionPK) object;
        if (this.timezoneid != other.timezoneid) {
            return false;
        }
        if (this.transitiontime != other.transitiontime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project.TimeZoneTransitionPK[ timezoneid=" + timezoneid + ", transitiontime=" + transitiontime + " ]";
    }
    
}
