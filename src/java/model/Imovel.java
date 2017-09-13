package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que gera objetos do tipo Imovel
 * @author Patrick Amaral
 * @since Classe gerada em 11/09/2017
 */
@Entity
@Table(name="imovel")
public class Imovel implements Serializable {
   @Id
   @GeneratedValue
   @Column(name = "id", unique = true)
   private int codigo;
   @Column(name = "endereco", length = 50)
   private String endereco;
   @Column(name = "bairro", length = 10)
   private String bairro;
   @Column(name = "tipo")
   private int tipo = 0;
   @Column(name = "valor")
   private float valor;
   @Column(name = "caracteristicas")
   private String caract;
   
   //CONSTRUTOR DEFAULT
    public Imovel() {
    }//fim do construtor
   //CONSTRUTOR
    public Imovel(int codigo, String endereco, String bairro, int tipo, float valor, String caract) {
        System.out.println("CONSTRUTOR IMOVEL");
        this.codigo = codigo;
        this.endereco = endereco;
        this.bairro = bairro;
        this.tipo = tipo;
        this.valor = valor;
        this.caract = caract;
    }//fim do construtor

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCaract() {
        return caract;
    }

    public void setCaract(String caract) {
        this.caract = caract;
    }
  
}//fim da classe Imovel
