package tekup.soap.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NumberConverter {
    @Id
    @GeneratedValue
    private Long id;

    private String ConvertNumber;

    @Enumerated(EnumType.STRING)
    private TypeConverter ConvertTo;
    private String ConvertResult;


}
