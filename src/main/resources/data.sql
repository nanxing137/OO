insert into oo_team(team_name)values('皇马');
insert into oo_team(team_name)values('马竞');
insert into oo_team(team_name)values('火箭');
insert into oo_team(team_name)values('湖人');
insert into oo_team(team_name)values('恒大');
insert into oo_team(team_name)values('国安');

insert into oo_match(team_a_team_id,team_b_team_id,winner_team_id,scores,m_date,address)
values(1,2,1,'2:1',sysdate,'呼和浩特市');


insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(1,'SAMA','password','是了OK?');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(2,'THORNHILL','password','是了OK?');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(3,'1','1','3');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(4,'2','2','是了OK');
insert into oo_match(team_a_team_id,team_b_team_id,winner_team_id,scores,m_date,address,name)
values(1,2,1,'3:0','2007-03-03','内大','篮球测试赛');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(5,'3','3','3');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(6,'4','4','3');
insert into oo_user(team_team_id,uname,upassword,isfootballer)
values(5,'5','5','3');