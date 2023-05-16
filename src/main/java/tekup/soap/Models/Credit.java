package tekup.soap.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Credit {

    @Id
    @GeneratedValue
    private Long id;
    private String uid;
    private String credit_card_number;
    private String credit_card_expiry_date;
    private String credit_card_type;

}
