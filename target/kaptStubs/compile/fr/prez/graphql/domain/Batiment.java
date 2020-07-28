package fr.prez.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lfr/prez/graphql/domain/Batiment;", "", "()V", "adresse", "Lfr/prez/graphql/domain/Adresse;", "getAdresse", "()Lfr/prez/graphql/domain/Adresse;", "setAdresse", "(Lfr/prez/graphql/domain/Adresse;)V", "escaliers", "", "Lfr/prez/graphql/domain/Escalier;", "getEscaliers", "()Ljava/util/List;", "setEscaliers", "(Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "ref", "", "getRef", "()Ljava/lang/String;", "setRef", "(Ljava/lang/String;)V", "graphql"})
@javax.persistence.Table(name = "t_batiment")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
@javax.persistence.Entity()
public final class Batiment {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id")
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(name = "ref", nullable = false)
    public java.lang.String ref;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "adr_id", referencedColumnName = "id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private fr.prez.graphql.domain.Adresse adresse;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(mappedBy = "batiment", fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<fr.prez.graphql.domain.Escalier> escaliers;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRef() {
        return null;
    }
    
    public final void setRef(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final fr.prez.graphql.domain.Adresse getAdresse() {
        return null;
    }
    
    public final void setAdresse(@org.jetbrains.annotations.Nullable()
    fr.prez.graphql.domain.Adresse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<fr.prez.graphql.domain.Escalier> getEscaliers() {
        return null;
    }
    
    public final void setEscaliers(@org.jetbrains.annotations.Nullable()
    java.util.List<fr.prez.graphql.domain.Escalier> p0) {
    }
    
    public Batiment() {
        super();
    }
}