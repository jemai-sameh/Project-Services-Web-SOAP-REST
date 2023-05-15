package tekup.soap.Services;

import tekup.soap.Models.NumberConverter;
import tekup.soap.Models.NumberConverterDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface INumberConverterService {
    public NumberConverter save (NumberConverterDto numberConverterDto);
    public void delete(Long idConverter);
    public List<NumberConverter> findAll();
    public NumberConverter findById(Long idConverter);
    public String convert2word(BigInteger inputConverter);
    public String convert2dollars(BigDecimal inputConverter);
}
