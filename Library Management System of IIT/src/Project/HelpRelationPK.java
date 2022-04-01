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
public class HelpRelationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "help_topic_id")
    private int helpTopicId;
    @Basic(optional = false)
    @Column(name = "help_keyword_id")
    private int helpKeywordId;

    public HelpRelationPK() {
    }

    public HelpRelationPK(int helpTopicId, int helpKeywordId) {
        this.helpTopicId = helpTopicId;
        this.helpKeywordId = helpKeywordId;
    }

    public int getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public int getHelpKeywordId() {
        return helpKeywordId;
    }

    public void setHelpKeywordId(int helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) helpTopicId;
        hash += (int) helpKeywordId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HelpRelationPK)) {
            return false;
        }
        HelpRelationPK other = (HelpRelationPK) object;
        if (this.helpTopicId != other.helpTopicId) {
            return false;
        }
        if (this.helpKeywordId != other.helpKeywordId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project.HelpRelationPK[ helpTopicId=" + helpTopicId + ", helpKeywordId=" + helpKeywordId + " ]";
    }
    
}
