
package cl.duoc.restspring.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallerRepository extends JpaRepository<TallerEntity, Integer> {

    
    
}
