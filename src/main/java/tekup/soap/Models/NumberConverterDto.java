package tekup.soap.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NumberConverterDto {
    private Long id;

    private String ConvertNumber;

    private TypeConverter ConvertTo;

    public static NumberConverter toEntity(NumberConverterDto entity) {
        if (entity == null) {
            return null;
        }

        NumberConverter dto = new NumberConverter();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }


    public static NumberConverterDto fromEntity(NumberConverter entity) {
        if (entity == null) {
            return null;
        }

        NumberConverterDto dto = new NumberConverterDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
