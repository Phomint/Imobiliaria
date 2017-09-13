package controller;

import model.Imovel;
import model.dao.ImovelDAO;

/**
 * Classe que controla objeto imovel com a interface view
 * @author Patrick Amaral
 * @since Classe gerada em 12/09/2017
 */
public class ImovelController {
    public void salvarImovel(int codigo, String endereco, String bairro, int tipo, float valor, String caract){
        Imovel im = new Imovel(codigo, endereco, bairro, tipo, valor, caract);
        ImovelDAO iDao = new ImovelDAO();
        iDao.createImovel(im);
    }
}//fim da classe ImovelController
