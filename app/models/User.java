package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class User extends Model {
	public String name;
	@Required @Email
	public String email;
	
	public Boolean candrink;
	
	public Long money;
}
