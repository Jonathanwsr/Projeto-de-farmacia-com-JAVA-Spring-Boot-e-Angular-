package zonetech.farmacia.service;


import org.springframework.beans.factory.annotation.Autowired;
import zonetech.farmacia.enity.Produto;
import java.util.List;
import org.springframework.stereotype.Service;
import zonetech.farmacia.exception.ResourceNotFoundException;
import zonetech.farmacia.repository.ProdutoRepository;
import java.util.Optional;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto update(Long id, Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));
        produto.setName(produtoAtualizado.getName());
        produto.setDescription(produtoAtualizado.getDescription());
        produto.setFabricante(produtoAtualizado.getFabricante());
        produto.setCategory(produtoAtualizado.getCategory());
        return produtoRepository.save(produto);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }
}
