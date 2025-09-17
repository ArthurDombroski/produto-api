package br.com.bentao.produto_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bentao.produto_api.model.Produto;
import br.com.bentao.produto_api.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;
    
    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Produto Produto(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscar (@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public  Produto atualizar (@PathVariable Long id, @RequestBody Produto novoproduto) {
       return repository.findById(id)
        .map(produto -> {
            produto.setNome(novoproduto.getNome());
            produto.setPreco(novoproduto.getPreco());
            return repository.save(produto);
        }).orElse(null);
    }
        @DeleteMapping("/{id}")
        public void excluir (@PathVariable Long id) {
            repository.deleteById(id);
        }
    }

