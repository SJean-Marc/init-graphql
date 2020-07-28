package fr.prez.graphql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lfr/prez/graphql/query/BatimentQuery;", "Lcom/expediagroup/graphql/spring/operations/Query;", "batimentQlService", "Lfr/prez/graphql/service/BatimentQlService;", "(Lfr/prez/graphql/service/BatimentQlService;)V", "getBatimentQlService", "()Lfr/prez/graphql/service/BatimentQlService;", "batiments", "", "Lfr/prez/graphql/dto/BatimentQl;", "ref", "", "environment", "Lgraphql/schema/DataFetchingEnvironment;", "graphql"})
@org.springframework.stereotype.Component()
public class BatimentQuery implements com.expediagroup.graphql.spring.operations.Query {
    @org.jetbrains.annotations.NotNull()
    private final fr.prez.graphql.service.BatimentQlService batimentQlService = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<fr.prez.graphql.dto.BatimentQl> batiments(@org.jetbrains.annotations.Nullable()
    java.lang.String ref, @org.jetbrains.annotations.NotNull()
    graphql.schema.DataFetchingEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public fr.prez.graphql.service.BatimentQlService getBatimentQlService() {
        return null;
    }
    
    public BatimentQuery(@org.jetbrains.annotations.NotNull()
    fr.prez.graphql.service.BatimentQlService batimentQlService) {
        super();
    }
}