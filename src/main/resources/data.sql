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