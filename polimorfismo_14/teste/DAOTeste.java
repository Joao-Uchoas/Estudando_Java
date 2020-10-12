package polimorfismo_14.teste;

import polimorfismo_14.classe.ArquivoDAOImp;
//import polimorfismo_14.classe.DataBateDAOImp;
import polimorfismo_14.classe.GenericDAO;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAOImp = new ArquivoDAOImp();
        arquivoDAOImp.save();   
    }
}
