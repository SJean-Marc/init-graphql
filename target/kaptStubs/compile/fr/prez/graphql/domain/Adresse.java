package fr.prez.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J8\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001R&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lfr/prez/graphql/domain/Adresse;", "", "()V", "id", "", "libelle", "", "batiments", "", "Lfr/prez/graphql/domain/Batiment;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;)V", "getBatiments", "()Ljava/util/Set;", "setBatiments", "(Ljava/util/Set;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLibelle", "()Ljava/lang/String;", "setLibelle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;)Lfr/prez/graphql/domain/Adresse;", "equals", "", "other", "hashCode", "", "toString", "graphql"})
@javax.persistence.Table(name = "t_adresse")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
@javax.persistence.Entity()
public final class Adresse {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "libelle", nullable = true)
    private java.lang.String libelle;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(mappedBy = "adresse", fetch = javax.persistence.FetchType.LAZY)
    private java.util.Set<fr.prez.graphql.domain.Batiment> batiments;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLibelle() {
        return null;
    }
    
    public final void setLibelle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<fr.prez.graphql.domain.Batiment> getBatiments() {
        return null;
    }
    
    public final void setBatiments(@org.jetbrains.annotations.Nullable()
    java.util.Set<fr.prez.graphql.domain.Batiment> p0) {
    }
    
    public Adresse(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String libelle, @org.jetbrains.annotations.Nullable()
    java.util.Set<fr.prez.graphql.domain.Batiment> batiments) {
        super();
    }
    
    public Adresse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<fr.prez.graphql.domain.Batiment> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.prez.graphql.domain.Adresse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String libelle, @org.jetbrains.annotations.Nullable()
    java.util.Set<fr.prez.graphql.domain.Batiment> batiments) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}