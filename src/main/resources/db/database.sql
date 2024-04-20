-- Database: userSpotify

-- DROP DATABASE IF EXISTS "userSpotify";

CREATE DATABASE "userSpotify"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- SEQUENCE: public.user_id_user_seq

-- DROP SEQUENCE IF EXISTS public.user_id_user_seq;

CREATE SEQUENCE IF NOT EXISTS public.user_id_user_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.user_id_user_seq
    OWNER TO postgres;

-- Table: public.user_spotify

-- DROP TABLE IF EXISTS public.user_spotify;

CREATE TABLE IF NOT EXISTS public.user_spotify
(
    id_user integer NOT NULL DEFAULT nextval('user_id_user_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    liked_songs integer,
    followed_artists integer,
    followers integer,
    playlists integer,
    image_url character varying COLLATE pg_catalog."default",
    CONSTRAINT "userSpotify_pkey" PRIMARY KEY (id_user)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.user_spotify
    OWNER to postgres;