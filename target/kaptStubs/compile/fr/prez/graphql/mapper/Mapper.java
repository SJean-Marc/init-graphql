package fr.prez.graphql.mapper;

import java.lang.System;

@org.mapstruct.Mapper()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lfr/prez/graphql/mapper/Mapper;", "", "toBatimentQl", "Lfr/prez/graphql/dto/BatimentQl;", "batiment", "Lfr/prez/graphql/domain/Batiment;", "graphql"})
public abstract interface Mapper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract fr.prez.graphql.dto.BatimentQl toBatimentQl(@org.jetbrains.annotations.NotNull()
    fr.prez.graphql.domain.Batiment batiment);
}