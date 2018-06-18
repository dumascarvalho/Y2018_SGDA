package sgda.dao;

import java.util.List;
import sgda.model.AlunoDisciplinaModel;
import sgda.model.LoginModel;

public interface InterfaceAlunoDisciplinaDAO {

    public void insert(AlunoDisciplinaModel ad);
    
    public void delete(AlunoDisciplinaModel ad);
    
    public void update(AlunoDisciplinaModel ad);    
    
    public List selectForComboComCurso(String coluna, LoginModel lo);
   
}
