package com.anil.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("food")
public class Food {
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + " ]";
	}
}
