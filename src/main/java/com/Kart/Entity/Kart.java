package com.Kart.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="Kart")
@Entity
@Data

public class Kart {

	private int id;                                
	private String prodname;
	private int price;
	private int quantity;


}
