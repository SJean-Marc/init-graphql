package fr.prez.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lfr/prez/graphql/domain/Etage;", "", "()V", "escalier", "Lfr/prez/graphql/domain/Escalier;", "getEscalier", "()Lfr/prez/graphql/domain/Escalier;", "setEscalier", "(Lfr/prez/graphql/domain/Escalier;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "ref", "", "getRef", "()Ljava/lang/String;", "setRef", "(Ljava/lang/String;)V", "graphql"})
@javax.persistence.Table(name = "t_etage_eta")
@javax.persistence.Entity()
public final class Etage {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "ref", nullable = false)
    private java.lang.String ref;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "esc_id", referencedColumnName = "id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private fr.prez.graphql.domain.Escalier escalier;
    
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
    public final fr.prez.graphql.domain.Escalier getEscalier() {
        return null;
    }
    
    public final void setEscalier(@org.jetbrains.annotations.Nullable()
    fr.prez.graphql.domain.Escalier p0) {
    }
    
    public Etage() {
        super();
    }
}