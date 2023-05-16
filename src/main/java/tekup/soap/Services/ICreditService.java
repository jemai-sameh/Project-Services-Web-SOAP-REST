package tekup.soap.Services;

import tekup.soap.Models.Credit;

import java.util.List;

public interface ICreditService {
    public Credit save ();
    public List<Credit> findAllData();
}
