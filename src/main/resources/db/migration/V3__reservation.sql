CREATE TABLE IF NOT EXISTS reservation
(
    id                 UUID      NOT NULL
        constraint pk_reservation primary key,
    id_room            UUID      NOT NULL,
    user_reservation   JSONB     NOT NULL,
    start_date         TIMESTAMP NOT NULL,
    end_date           TIMESTAMP NOT NULL,
    number_of_children INT       NOT NULL,
    number_of_adults   INT       NOT NULL,
    price_paid         INT       NOT NULL,
    claim              VARCHAR(255),
    review             BIGINT,
    CONSTRAINT fk_room FOREIGN KEY (id_room) REFERENCES hotel_room (id)
);