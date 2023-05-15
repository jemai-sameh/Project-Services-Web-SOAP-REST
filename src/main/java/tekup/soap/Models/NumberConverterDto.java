package tekup.soap.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class NumberConverterDto {
    private Long id;

    private String ConvertNumber;

    private String ConvertTo;

    public static NumberConverterDto fromEntity(NumberConverter entity) {
        if (entity == null) {
            return null;
        }

        NumberConverterDto dto = new NumberConverterDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
    public static NumberConverter toEntity(NumberConverterDto entity) {
        if (entity == null) {
            return null;
        }

        NumberConverter dto = new NumberConverter();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
