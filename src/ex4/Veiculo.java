/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Tainah e Leo
 */
public class Veiculo {
    public static void main(String[] args) {
        Carro carroLegal = new Carro(); 
        carroLegal.setMarca("Toyota");
        carroLegal.setModelo("Camry");
        
        Caminhao caminhaoLegal = new Caminhao(); 
        caminhaoLegal.setMarca("Volvo");
        caminhaoLegal.setModelo("FH");
        caminhaoLegal.setPesoMax(8000);
        
        Trator tratorLegal = new Trator();
        tratorLegal.setMarca("Ford");
        tratorLegal.setModelo("Tratorzao");
        tratorLegal.setPesoMaximo(50000);
        
        VeiculodeCarga veiculodeCargaLegal = new VeiculodeCarga(); 
        veiculodeCargaLegal.setMarca("Volkswagen");
        veiculodeCargaLegal.setModelo("Saveiro");
        veiculodeCargaLegal.setPesoMax(1500);
        
        System.out.println("Temos um carro de marca e modelo: "+carroLegal.getMarca()+" "+carroLegal.getModelo());
        System.out.println("Temos um caminhao de marca e modelo, com peso maximo de "+caminhaoLegal.getMarca()+" "+caminhaoLegal.getModelo()+" "+caminhaoLegal.getPesoMax()+" Kg");
        System.out.println("Temos um trator de marca e modelo, com peso maximo de "+tratorLegal.getMarca()+" "+tratorLegal.getModelo()+" "+tratorLegal.getPesoMaximo()+" Kg");
        System.out.println("Temos um veic de Carga de marca e modelo, com peso maximo de "+veiculodeCargaLegal.getMarca()+" "+veiculodeCargaLegal.getModelo()+" "+veiculodeCargaLegal.getPesoMax()+" Kg");
        
    }
}
