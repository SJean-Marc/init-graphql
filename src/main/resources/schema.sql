create table if not exists t_adresse
(
	id INT auto_increment,
	libelle VARCHAR,
	constraint t_adresse_pkey
		primary key (id)
);

create table if not exists t_batiment
(
	id INT auto_increment,
	adr_id INT,
	ref VARCHAR,
	constraint t_batiment_pkey
		primary key (id)
);

 ALTER TABLE t_batiment
    ADD FOREIGN KEY (adr_id)
    REFERENCES t_adresse(id);

CREATE TABLE t_escalier
(
  id bigint NOT NULL,
  bat_id bigint NOT NULL,
  ref character varying(255) NOT NULL,
  CONSTRAINT t_escalier_pkey PRIMARY KEY (id)
);

 ALTER TABLE t_escalier
    ADD FOREIGN KEY (bat_id)
    REFERENCES t_batiment(id);

CREATE TABLE t_etage
(
  id bigint NOT NULL,
  esc_id bigint NOT NULL,
  ref character varying(255) NOT NULL,
  CONSTRAINT t_etage_pkey PRIMARY KEY (id)
);

 ALTER TABLE t_etage
    ADD FOREIGN KEY (esc_id)
    REFERENCES t_escalier(id);
