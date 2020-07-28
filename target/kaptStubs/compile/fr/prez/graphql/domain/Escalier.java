package fr.prez.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lfr/prez/graphql/domain/Escalier;", "", "()V", "batiment", "Lfr/prez/graphql/domain/Batiment;", "getBatiment", "()Lfr/prez/graphql/domain/Batiment;", "setBatiment", "(Lfr/prez/graphql/domain/Batiment;)V", "etages", "", "Lfr/prez/graphql/domain/Etage;", "getEtages", "()Ljava/util/List;", "setEtages", "(Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "ref", "", "getRef", "()Ljava/lang/String;", "setRef", "(Ljava/lang/String;)V", "graphql"})
@javax.persistence.Table(name = "t_escalier_esc")
@javax.persistence.Entity()
public final class Escalier {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "ref", nullable = false)
    private java.lang.String ref;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "bat_id", referencedColumnName = "id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private fr.prez.graphql.domain.Batiment batiment;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(mappedBy = "escalier")
    private java.util.List<fr.prez.graphql.domain.Etage> etages;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRef() {
        return null;
    }
    
    public final void setRef(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final fr.prez.graphql.domain.Batiment getBatiment() {
        return null;
    }
    
    public final void setBatiment(@org.jetbrains.annotations.Nullable()
    fr.prez.graphql.domain.Batiment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<fr.prez.graphql.domain.Etage> getEtages() {
        return null;
    }
    
    public final void setEtages(@org.jetbrains.annotations.Nullable()
    java.util.List<fr.prez.graphql.domain.Etage> p0) {
    }
    
    public Escalier() {
        super();
    }
}