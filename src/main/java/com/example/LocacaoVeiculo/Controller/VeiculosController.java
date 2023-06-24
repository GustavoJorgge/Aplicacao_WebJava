package com.example.LocacaoVeiculo.Controller;

import com.example.LocacaoVeiculo.domain.veiculo.DadosCadastroVeiculos;
import com.example.LocacaoVeiculo.domain.veiculo.Veiculo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller //Anotacoes para declarar a classe como controlador
@RequestMapping("/veiculos") // Mapeando a requisição, quando chamar o endereco /veiculos, ira chamar este controlador.
public class VeiculosController {

    private List<Veiculo> veiculos = new ArrayList<>();

    //Quando acontecer a requisição, irá carregar este metodo (abrir o formulario apenas)
    @GetMapping
    public String apresentaPaginaCadastro(){
        return "veiculos/cadastro";
    }

    @PostMapping
    public String cadastraVeiculo(DadosCadastroVeiculos dados){
        var veiculo = new Veiculo(dados);
       veiculos.add(veiculo);
       System.out.println(veiculos);
        return "veiculos/cadastro";
    }

}
