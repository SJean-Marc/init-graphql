package fr.prez.graphql.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lfr/prez/graphql/service/BatimentQlService;", "", "batimentRepository", "Lfr/prez/graphql/repository/BatimentRepository;", "(Lfr/prez/graphql/repository/BatimentRepository;)V", "getBatimentRepository", "()Lfr/prez/graphql/repository/BatimentRepository;", "findByRef", "", "Lfr/prez/graphql/dto/BatimentQl;", "ref", "", "graphql"})
@org.springframework.stereotype.Service()
public class BatimentQlService {
    @org.jetbrains.annotations.NotNull()
    private final fr.prez.graphql.repository.BatimentRepository batimentRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<fr.prez.graphql.dto.BatimentQl> findByRef(@org.jetbrains.annotations.Nullable()
    java.lang.String ref) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public fr.prez.graphql.repository.BatimentRepository getBatimentRepository() {
        return null;
    }
    
    public BatimentQlService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    fr.prez.graphql.repository.BatimentRepository batimentRepository) {
        super();
    }
}