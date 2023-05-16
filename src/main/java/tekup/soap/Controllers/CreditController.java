package tekup.soap.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tekup.soap.Models.Credit;
import tekup.soap.Services.ICreditService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/credit")
public class CreditController {
    @Autowired
    private ICreditService iCreditService;
    @PostMapping ("/saveData")
    private Credit saveData() {
         return this.iCreditService.save();
    }
    @GetMapping ("/findAllData")
    private List<Credit> findAllData() {
        return this.iCreditService.findAllData();
    }
}
