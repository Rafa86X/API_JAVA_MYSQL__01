package aprendizagem.Api_BD_MySQL_1.domain.seller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Page<Seller> findAllByActiveTrue(Pageable page);
}
