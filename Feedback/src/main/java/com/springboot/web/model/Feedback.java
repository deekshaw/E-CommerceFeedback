package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	private int id;
	private String uname;
	private String uemail;
	private String productPurchased;
	private String feedback;
	private String recommend;
	
	
	
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", uname=" + uname + ", uemail=" + uemail + ", productPurchased="
				+ productPurchased + ", feedback=" + feedback + ", recommend=" + recommend + "]";
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int id, String uname, String uemail, String productPurchased, String feedback, String recommend) {
		super();
		this.id = id;
		this.uname = uname;
		this.uemail = uemail;
		this.productPurchased = productPurchased;
		this.feedback = feedback;
		this.recommend = recommend;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getProductPurchased() {
		return productPurchased;
	}

	public void setProductPurchased(String productPurchased) {
		this.productPurchased = productPurchased;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Feedback other = (Feedback) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

	
	
	
}
