FROM postgres:10-alpine

COPY create.sql /docker-entrypoint-initdb.d/create.sql

ENV POSTGRES_DB=fancy

ENV PGDATA=/data