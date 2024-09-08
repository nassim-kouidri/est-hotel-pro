create table if not exists hotel_room
(
    id          UUID         not null
        constraint pk_hotel_room primary key,
    category    varchar(255) not null,
    number_room int          not null
        constraint uk_number_room unique,
    price       int          not null,
    state       varchar(255) not null,
    available   boolean      not null DEFAULT TRUE
);