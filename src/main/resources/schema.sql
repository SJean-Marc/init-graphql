
create table t_adresse
(
	id INT auto_increment,
	libelle VARCHAR,
	constraint t_adresse_pkey
		primary key (id)
);

create table t_batiment
(
	id INT auto_increment,
	ref VARCHAR,
    adr_id INT,
	constraint t_batiment_pkey
		primary key (id)
);

 ALTER TABLE t_batiment
    ADD FOREIGN KEY (adr_id)
    REFERENCES t_adresse(id);

create table t_escalier
(
  id bigint NOT NULL,
  ref character varying(255) NOT NULL,
  bat_id bigint NOT NULL,
  CONSTRAINT t_escalier_pkey PRIMARY KEY (id)
);

 ALTER TABLE t_escalier
    ADD FOREIGN KEY (bat_id)
    REFERENCES t_batiment(id);

create table t_etage
(
  id bigint NOT NULL,
  ref character varying(255) NOT NULL,
  esc_id bigint NOT NULL,
  CONSTRAINT t_etage_pkey PRIMARY KEY (id)
);

 ALTER TABLE t_etage
    ADD FOREIGN KEY (esc_id)
    REFERENCES t_escalier(id);


INSERT INTO t_adresse VALUES (1, 'Allée Adrienne-Lecouvreur 75001 Paris');
INSERT INTO t_adresse VALUES (2, 'Allée Célestin Hennion 75002 Paris');

INSERT INTO t_batiment VALUES (1, 'refBat1', 1);
INSERT INTO t_batiment VALUES (2, 'refBat2', 1);

INSERT INTO t_escalier VALUES (1, 'escalier bat 1 - 1', 1);
INSERT INTO t_escalier VALUES (2, 'escalier bat 1 - 2', 1);
INSERT INTO t_escalier VALUES (3, 'escalier bat 1 - 3', 1);
INSERT INTO t_escalier VALUES (4, 'escalier bat 2 - 1', 2);
INSERT INTO t_escalier VALUES (5, 'escalier bat 2 - 2', 2);
INSERT INTO t_escalier VALUES (6, 'escalier bat 2 - 3', 2);

INSERT INTO t_etage VALUES (1, 'etage escalier 1', 1);
INSERT INTO t_etage VALUES (2, 'etage escalier 2', 2);
INSERT INTO t_etage VALUES (3, 'etage escalier 3', 3);
INSERT INTO t_etage VALUES (4, 'etage escalier 4', 4);
INSERT INTO t_etage VALUES (5, 'etage escalier 5', 5);
INSERT INTO t_etage VALUES (6, 'etage escalier 6', 6);
