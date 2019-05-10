package br.pucrs.ages.mase.user_service.repository;

import br.pucrs.ages.mase.user_service.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
    public Mono<User> findAllByName(String name);
}
