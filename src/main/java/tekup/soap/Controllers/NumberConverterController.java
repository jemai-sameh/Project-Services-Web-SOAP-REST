package tekup.soap.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tekup.soap.Models.NumberConverter;
import tekup.soap.Models.NumberConverterDto;
import tekup.soap.Services.NumberNumberConverterServiceImpl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/v1/NumberConverter")
public class NumberConverterController {
    @Autowired
    private NumberNumberConverterServiceImpl converterService;

    @PostMapping("/save")
    public NumberConverter save(@RequestBody NumberConverterDto converter) {
        return converterService.save(converter);
    }

    @DeleteMapping("/delete/{idConverter}")
    public void delete(@PathVariable Long idConverter) {
        converterService.delete(idConverter);
    }

    @GetMapping("/findAll")
    public List<NumberConverter> findAll() {
        return converterService.findAll();
    }

    @GetMapping("/findById/{idConverter}")
    public NumberConverter findById(@PathVariable Long idConverter) {
        return converterService.findById(idConverter);
    }

    @GetMapping("/convert2word/{inputConverter}")
    public String convert2word(@PathVariable BigInteger inputConverter) {
        return converterService.convert2word(inputConverter);
    }

    @GetMapping("/convert2dollars/{inputConverter}")
    public String convert2dollars(@PathVariable BigDecimal inputConverter) {
        return converterService.convert2dollars(inputConverter);
    }
}
