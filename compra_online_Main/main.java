package Sistemas_do_dia_a_dia.compra_online_Main;
import Sistemas_do_dia_a_dia.Sistema_de_compra_class.compras_class;

public class main {
    static void main() {
        compras_class comprasClass= new compras_class();


        comprasClass.addProduto();

        comprasClass.dadosCliente();

        comprasClass.CacularFrete();

        comprasClass.cartao();



    }
}
