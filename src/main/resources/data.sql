insert into users (username,password,enabled) values('user','$2a$10$lq7TvWgz5YBxwJRRIDkcI.5RHmia5YvjNUq/Whf1Vg7uGAIEXM2aS',true);
insert into users (username,password,enabled) values('admin','$2a$10$MW9x4ZebK9jbnNJScx0twOIFDAuxd6WalcrY6b9kvhHNgtJZGimdq',true);

insert into authorities(username,authority) values('user','ROLE_USER');
insert into authorities(username,authority) values('admin','ROLE_ADMIN');