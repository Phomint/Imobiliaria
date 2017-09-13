package model.dao;

import model.Imovel;
import model.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que gerencia dados na base
 * @author Patrick Amaral
 * @since Classe gerada em 12/09/2017
 */
public class ImovelDAO {
     /**
       * Metodo para salvar um objeto imovel no banco
       * @param imovel
       */
      public void createImovel(Imovel imovel){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = session.beginTransaction();
        session.save(imovel);
        transaction.commit();
        session.close();
      }//fim do metodo createImovel
}//fim da classe ImovelDAO
