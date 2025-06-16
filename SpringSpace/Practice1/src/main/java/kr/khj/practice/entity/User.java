package kr.khj.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="practice_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seq_num;
	
	@Column(nullable = false,length=100)
	String id;
	
	@Column(nullable = false,length=200)
	String pw;
	
	@Column(nullable = false,length=200)
	String name;
}
