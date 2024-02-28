package BrunoSerraoA.com.github.pedidos.domain.repository;

import BrunoSerraoA.com.github.pedidos.Categoria;
import BrunoSerraoA.com.github.pedidos.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
