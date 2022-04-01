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
public class ProcsPrivPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Host")
    private String host;
    @Basic(optional = false)
    @Column(name = "Db")
    private String db;
    @Basic(optional = false)
    @Column(name = "User")
    private String user;
    @Basic(optional = false)
    @Column(name = "Routine_name")
    private String routinename;
    @Basic(optional = false)
    @Column(name = "Routine_type")
    private String routinetype;

    public ProcsPrivPK() {
    }

    public ProcsPrivPK(String host, String db, String user, String routinename, String routinetype) {
        this.host = host;
        this.db = db;
        this.user = user;
        this.routinename = routinename;
        this.routinetype = routinetype;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRoutinename() {
        return routinename;
    }

    public void setRoutinename(String routinename) {
        this.routinename = routinename;
    }

    public String getRoutinetype() {
        return routinetype;
    }

    public void setRoutinetype(String routinetype) {
        this.routinetype = routinetype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (host != null ? host.hashCode() : 0);
        hash += (db != null ? db.hashCode() : 0);
        hash += (user != null ? user.hashCode() : 0);
        hash += (routinename != null ? routinename.hashCode() : 0);
        hash += (routinetype != null ? routinetype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcsPrivPK)) {
            return false;
        }
        ProcsPrivPK other = (ProcsPrivPK) object;
        if ((this.host == null && other.host != null) || (this.host != null && !this.host.equals(other.host))) {
            return false;
        }
        if ((this.db == null && other.db != null) || (this.db != null && !this.db.equals(other.db))) {
            return false;
        }
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        if ((this.routinename == null && other.routinename != null) || (this.routinename != null && !this.routinename.equals(other.routinename))) {
            return false;
        }
        if ((this.routinetype == null && other.routinetype != null) || (this.routinetype != null && !this.routinetype.equals(other.routinetype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project.ProcsPrivPK[ host=" + host + ", db=" + db + ", user=" + user + ", routinename=" + routinename + ", routinetype=" + routinetype + " ]";
    }
    
}
