package uz.pdp.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String shortInfo;
    private int price;
    private String detailedInfo;
    private int guarantee;
    private boolean available;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

//    @OneToMany
//    private List<Characteristic> characteristic;
}
