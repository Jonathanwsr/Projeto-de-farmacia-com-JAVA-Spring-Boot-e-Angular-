package zonetech.farmacia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zonetech.farmacia.enity.Categoria;
import zonetech.farmacia.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service

public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }


    public Optional<Categoria> buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id);
    }


    public Categoria atualizarCategoria(Long id, Categoria categoriaAtualizada) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setAnalgesicos(categoriaAtualizada.getAnalgesicos());
            categoria.setComesticos(categoriaAtualizada.getComesticos());
            categoria.setHigienePessoal(categoriaAtualizada.getHigienePessoal());
            categoria.setMedicamentos(categoriaAtualizada.getMedicamentos());
            categoria.setPerfumaria(categoriaAtualizada.getPerfumaria());
            categoria.setMaquiagem(categoriaAtualizada.getMaquiagem());
            categoria.setProdutosparaBebes(categoriaAtualizada.getProdutosparaBebes());
            categoria.setCuidadosComAPele(categoriaAtualizada.getCuidadosComAPele());
            categoria.setSuplementosAlimentares(categoriaAtualizada.getSuplementosAlimentares());
            categoria.setAlimentosEspeciais(categoriaAtualizada.getAlimentosEspeciais());
            categoria.setAntiInflmatorios(categoriaAtualizada.getAntiInflmatorios());
            return categoriaRepository.save(categoria);
        }).orElseThrow(() -> new RuntimeException("Categoria não encontrada com o ID: " + id));
    }


    public void deletarCategoria(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Categoria não encontrada com o ID: " + id);
        }
    }
}
