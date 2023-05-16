package tekup.soap.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tekup.soap.Models.Credit;
import tekup.soap.Repository.CreditRepository;

import java.util.List;

@Service
public class CreditServiceImp implements ICreditService{
    @Autowired
    private CreditRepository creditRepository;
    @Override
    public Credit save() {
        RestTemplate rest = new RestTemplate();
        Credit result= rest.getForObject("https://random-data-api.com/api/v2/credit_cards", Credit.class);
        return this.creditRepository.save(result);
    }

    @Override
    public List<Credit> findAllData() {
        return this.creditRepository.findAll();
    }
}
