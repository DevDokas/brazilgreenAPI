CREATE TABLE IF NOT EXISTS kind(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS flavor(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    icon TEXT
);

CREATE TABLE IF NOT EXISTS helps_with(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS negative_effects(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    icon TEXT
);

CREATE TABLE IF NOT EXISTS positive_effects(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    icon TEXT
);

CREATE TABLE IF NOT EXISTS terpenes(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    short_description TEXT,
    description TEXT
);

CREATE TABLE IF NOT EXISTS strain_flavor(
    id SERIAL PRIMARY KEY,
    strain_id INT NOT NULL,
    flavor_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS strain_helps_with(
    id SERIAL PRIMARY KEY,
    strain_id INT NOT NULL,
    helps_with_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS strain_negative_effects(
    id SERIAL PRIMARY KEY,
    strain_id INT NOT NULL,
    negative_effects_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS strain_positive_effects(
    id SERIAL PRIMARY KEY,
    strain_id INT NOT NULL,
    positive_effects_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS strain_terpenes(
    id SERIAL PRIMARY KEY,
    strain_id INT NOT NULL,
    terpenes_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS strains(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    kind INT NOT NULL,
    description TEXT NOT NULL,
    strain_flavor INT,
    strain_helps_with INT,
    strain_positive_effects INT,
    strain_negative_effects INT,
    strain_terpenes INT,
    thc_concentration FLOAT NOT NULL,
    cbd_concentration FLOAT NOT NULL,
    image TEXT,
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    login varchar(255) UNIQUE NOT NULL,
    password TEXT NOT NULL,
    role TEXT NOT NULL
);