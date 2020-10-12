package polimorfismo_14.classe;

public class ArquivoDAOImp implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos.");
    }
    
}
