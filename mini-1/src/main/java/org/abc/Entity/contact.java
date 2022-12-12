package org.abc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cId;
	private String cName;
	private String cEmail;
	private Long cNo;
	
}
