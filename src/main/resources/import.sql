-- Populate clients table
-- Springboot from JPA and Hibernate search for this file

--INSERT INTO clients (name, surname, email, created_at) VALUES ('Sara', 'Borrero', 'sara.borrero@mail.com', '1999-12-08');

insert into regions (id, name) values(1, "Europa");
insert into regions (id, name) values(2, "Asia");
insert into regions (id, name) values(3, "America");
insert into regions (id, name) values(4, "Antartida");
insert into regions (id, name) values(5, "Oceania");
insert into regions (id, name) values(6, "Africa");

insert into clients (region_id, name, surname, email, created_at) values (1, 'Alwyn', 'Unsworth', 'aunsworth0@cbc.ca', '2021-01-14');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Jerry', 'Dodgson', 'jdodgson1@china.com.cn', '2020-10-12');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Faina', 'Bradnock', 'fbradnock2@nhs.uk', '2020-05-29');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Kristofer', 'Fallow', 'kfallow3@pbs.org', '2020-08-12');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Gilburt', 'Ellis', 'gellis4@latimes.com', '2020-09-05');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Gradeigh', 'Lyenyng', 'glyenyng5@comcast.net', '2020-11-25');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Aubry', 'Fumagall', 'afumagall6@webeden.co.uk', '2020-07-26');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Winona', 'Winslett', 'wwinslett7@usatoday.com', '2021-02-26');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Aidan', 'Andreutti', 'aandreutti8@ted.com', '2020-11-01');
insert into clients (region_id, name, surname, email, created_at) values (1, 'Aggie', 'Moyer', 'amoyer9@amazon.com', '2021-01-24');

insert into clients (region_id, name, surname, email, created_at) values (2, 'Stan', 'Clewlow', 'sclewlowa@ezinearticles.com', '2020-07-24');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Willa', 'Clementucci', 'wclementuccib@tuttocitta.it', '2020-04-15');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Megan', 'Thirlwall', 'mthirlwallc@devhub.com', '2020-05-22');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Alister', 'Strowlger', 'astrowlgerd@typepad.com', '2020-08-04');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Ashlen', 'Domel', 'adomele@comcast.net', '2020-09-28');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Clarine', 'Yanuk', 'cyanukf@multiply.com', '2020-05-04');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Rebekah', 'Schlagh', 'rschlaghg@auda.org.au', '2021-03-15');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Lonnard', 'Bowler', 'lbowlerh@ftc.gov', '2020-06-12');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Mord', 'Collecott', 'mcollecotti@independent.co.uk', '2021-02-04');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Merrel', 'Wilmore', 'mwilmorej@so-net.ne.jp', '2021-01-17');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Kizzie', 'Siely', 'ksielyk@liveinternet.ru', '2021-01-09');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Padgett', 'McConachie', 'pmcconachiel@spotify.com', '2020-06-21');
insert into clients (region_id, name, surname, email, created_at) values (2, 'Modestia', 'Paget', 'mpagetm@blogs.com', '2021-01-05');

insert into clients (region_id, name, surname, email, created_at) values (3, 'Alicia', 'Moughton', 'amoughtonn@earthlink.net', '2020-12-29');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Heidie', 'Barcroft', 'hbarcrofto@desdev.cn', '2020-04-25');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Grete', 'Kearn', 'gkearnp@theguardian.com', '2020-06-13');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Rafaelia', 'McWilliam', 'rmcwilliamq@bloglovin.com', '2021-03-13');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Florence', 'Siman', 'fsimanr@xrea.com', '2020-06-21');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Marie', 'Dean', 'mdeans@ezinearticles.com', '2020-12-30');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Rana', 'Wilprecht', 'rwilprechtt@hibu.com', '2020-04-14');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Audy', 'Ferriday', 'aferridayu@abc.net.au', '2020-04-28');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Frederic', 'Barsham', 'fbarshamv@disqus.com', '2021-03-27');
insert into clients (region_id, name, surname, email, created_at) values (3, 'Pieter', 'Bisgrove', 'pbisgrovew@wikipedia.org', '2021-01-15');

insert into clients (region_id, name, surname, email, created_at) values (4, 'Chrisy', 'Crole', 'ccrolex@google.com', '2020-07-24');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Sigismund', 'Guinnane', 'sguinnaney@jiathis.com', '2020-10-06');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Fran', 'Spellacey', 'fspellaceyz@jugem.jp', '2020-07-14');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Tabina', 'Seedhouse', 'tseedhouse10@marriott.com', '2020-07-27');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Giacobo', 'Adamczewski', 'gadamczewski11@livejournal.com', '2020-04-14');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Wilone', 'Chanter', 'wchanter12@wsj.com', '2020-04-22');
insert into clients (region_id, name, surname, email, created_at) values (4, 'Micheline', 'Acors', 'macors13@weebly.com', '2020-12-14');

insert into clients (region_id, name, surname, email, created_at) values (5, 'Ileane', 'Swainson', 'iswainson14@weebly.com', '2020-06-09');
insert into clients (region_id, name, surname, email, created_at) values (5, 'Jenifer', 'Dufall', 'jdufall15@ucoz.ru', '2021-02-17');
insert into clients (region_id, name, surname, email, created_at) values (5, 'Karney', 'Pendleton', 'kpendleton16@chron.com', '2021-01-12');
insert into clients (region_id, name, surname, email, created_at) values (5, 'Kalli', 'Cheson', 'kcheson17@comcast.net', '2020-07-17');
insert into clients (region_id, name, surname, email, created_at) values (5, 'Daryle', 'Tejero', 'dtejero18@unicef.org', '2021-03-21');

insert into clients (region_id, name, surname, email, created_at) values (6, 'Sherwynd', 'Foster', 'sfoster19@cbc.ca', '2020-08-16');
insert into clients (region_id, name, surname, email, created_at) values (6, 'Cedric', 'Dwelly', 'cdwelly1a@sitemeter.com', '2021-02-21');
insert into clients (region_id, name, surname, email, created_at) values (6, 'Crissy', 'Erdely', 'cerdely1b@senate.gov', '2020-08-24');
insert into clients (region_id, name, surname, email, created_at) values (6, 'Yolanda', 'Byrth', 'ybyrth1c@nymag.com', '2021-01-28');
insert into clients (region_id, name, surname, email, created_at) values (6, 'Avivah', 'Vertey', 'avertey1d@paypal.com', '2020-05-14');

insert into users (username, password, enabled) values ('sergio', '$2a$10$suCysdcKQC2vj8UkvVblSuI6IPC.dl2aCcmAiOBOZdxUxjbT4rl3O', 1);
insert into users (username, password, enabled) values ('fernando', '$2a$10$8bFSwdMpEdrCNA6OFtjF3uVzvwZiykdM1J7w9lFGaAQeZcFrkUVvy', 1);
insert into users (username, password, enabled) values ('javier', '$2a$10$55Tp6xddGx.EgyJdY9ZISugQw8Ii6F7.1qhoydPEmELBR/wDl2YqW', 1);

insert into roles (name) values ('ROLE_USER');
insert into roles (name) values ('ROLE_ADMIN');

insert into users_roles (user_id, role_id) values (1,2);
insert into users_roles (user_id, role_id) values (2,1);
insert into users_roles (user_id, role_id) values (3,1);


