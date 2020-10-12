package polimorfismo_14.classe;

public class DataBateDAOImp implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados.");
    }
    
}
