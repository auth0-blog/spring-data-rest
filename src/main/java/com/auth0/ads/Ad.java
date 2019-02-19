package com.auth0.ads;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Getter
@EqualsAndHashCode
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull(message = "Who is the owner of this ad?")
    public String owner;

    @NotNull(message = "Please, inform a title for your ad.")
    @Size(min = 5, max = 140, message = "Titles must have between {min} and {max} characters.")
    public String title;

    @NotNull(message = "Please, inform a description for your ad.")
    @Size(min = 5, max = 500, message = "Titles must have between {min} and {max} characters.")
    public String description;

    @Min(message = "Price cannot be negative", value = 0)
    public BigDecimal price;

    protected Ad() {}

    public Ad(String owner, String title, String description, BigDecimal price) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}