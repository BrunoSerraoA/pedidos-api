package BrunoSerraoA.com.github.pedidos.domain.repository;

import BrunoSerraoA.com.github.pedidos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
