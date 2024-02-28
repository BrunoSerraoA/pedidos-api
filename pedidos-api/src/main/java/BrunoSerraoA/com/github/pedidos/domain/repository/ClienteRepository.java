package BrunoSerraoA.com.github.pedidos.domain.repository;

import BrunoSerraoA.com.github.pedidos.domain.entity.Cidade;
import BrunoSerraoA.com.github.pedidos.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
