package com.sherwin.credochain.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sherwin.credochain.model.Task;

import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTask extends MongoRepository<Task, Integer>{

}
