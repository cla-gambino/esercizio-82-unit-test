package develhope.esercizio82unittest.repositories;

import develhope.esercizio82unittest.entities.PersonalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<PersonalUser, Long> {
}
