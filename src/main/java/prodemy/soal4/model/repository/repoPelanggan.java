package prodemy.soal4.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prodemy.soal4.model.entity.Pelanggan;

@Repository
public interface repoPelanggan extends JpaRepository<String, Pelanggan> {
}
