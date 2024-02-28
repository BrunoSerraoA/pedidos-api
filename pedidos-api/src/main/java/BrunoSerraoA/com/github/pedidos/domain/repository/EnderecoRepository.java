package BrunoSerraoA.com.github.pedidos.domain.repository;

import BrunoSerraoA.com.github.pedidos.domain.entity.Cidade;
import BrunoSerraoA.com.github.pedidos.domain.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
