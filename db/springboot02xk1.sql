create table config
(
    id    bigint auto_increment comment '主键'
        primary key,
    name  varchar(100) not null comment '配置参数名称',
    value varchar(100) null comment '配置参数值'
)
    comment '配置文件' charset = utf8;

create table gonggaoban
(
    id             bigint auto_increment comment '主键'
        primary key,
    addtime        timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    biaoti         varchar(200)                        null comment '标题',
    neirong        longtext                            null comment '内容',
    faburiqi       date                                null comment '发布日期',
    jinglizhanghao varchar(200)                        null comment '经理账号',
    jinglixingming varchar(200)                        null comment '经理姓名'
)
    comment '公告板' charset = utf8;

create table liuyanban
(
    id            bigint auto_increment comment '主键'
        primary key,
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    biaoti        varchar(200)                        null comment '标题',
    zhanghao      varchar(200)                        null comment '账号',
    xingming      varchar(200)                        null comment '姓名',
    liuyanshijian date                                null comment '留言时间',
    liuyanneirong longtext                            null comment '留言内容'
)
    comment '留言板' charset = utf8;

create table token
(
    id            bigint auto_increment comment '主键'
        primary key,
    userid        bigint                              not null comment '用户id',
    username      varchar(100)                        not null comment '用户名',
    tablename     varchar(100)                        null comment '表名',
    role          varchar(100)                        null comment '角色',
    token         varchar(200)                        not null comment '密码',
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '新增时间',
    expiratedtime timestamp default CURRENT_TIMESTAMP not null comment '过期时间'
)
    comment 'token表' charset = utf8;

create table users
(
    id       bigint auto_increment comment '主键'
        primary key,
    username varchar(100)                           not null comment '用户名',
    password varchar(100)                           not null comment '密码',
    role     varchar(100) default '管理员'          null comment '角色',
    addtime  timestamp    default CURRENT_TIMESTAMP not null comment '新增时间'
)
    comment '用户表' charset = utf8;

create table xiangmufenlei
(
    id            bigint auto_increment comment '主键'
        primary key,
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    xiangmufenlei varchar(200)                        not null comment '项目分类'
)
    comment '项目分类' charset = utf8;

create table xiangmufenpei
(
    id               bigint auto_increment comment '主键'
        primary key,
    addtime          timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    fenpeibianhao    varchar(200)                        null comment '分配编号',
    xiangmumingcheng varchar(200)                        null comment '项目名称',
    xiangmufenlei    varchar(200)                        null comment '项目分类',
    youxianji        varchar(200)                        null comment '优先级',
    jiezhiriqi       date                                null comment '截止日期',
    fenpeishijian    date                                null comment '分配时间',
    zhanghao         varchar(200)                        null comment '账号',
    xingming         varchar(200)                        null comment '姓名',
    zhiwei           varchar(200)                        null comment '职位',
    fenpeineirong    longtext                            null comment '分配内容',
    jinglizhanghao   varchar(200)                        null comment '经理账号',
    jinglixingming   varchar(200)                        null comment '经理姓名',
    constraint fenpeibianhao
        unique (fenpeibianhao)
)
    comment '项目分配' charset = utf8;

create table xiangmujindu
(
    id               bigint auto_increment comment '主键'
        primary key,
    addtime          timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    xiangmumingcheng varchar(200)                        null comment '项目名称',
    xiangmufenlei    varchar(200)                        null comment '项目分类',
    xiangmujindu     varchar(200)                        null comment '项目进度',
    tourushijian     int                                 null comment '投入时间',
    chengbenjine     float                               null comment '成本金额',
    shengyutianshu   int                                 null comment '剩余天数',
    yuqimubiao       varchar(200)                        null comment '预期目标',
    jinzhanqingkuang longtext                            null comment '进展情况',
    zhanghao         varchar(200)                        null comment '账号',
    xingming         varchar(200)                        null comment '姓名',
    jinglizhanghao   varchar(200)                        null comment '经理账号',
    jinglixingming   varchar(200)                        null comment '经理姓名',
    progress         float                               null comment '进度值'
)
    comment '项目进度' charset = utf8;

create table xiangmujingli
(
    id             bigint auto_increment comment '主键'
        primary key,
    addtime        timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    jinglizhanghao varchar(200)                        not null comment '经理账号',
    mima           varchar(200)                        not null comment '密码',
    jinglixingming varchar(200)                        not null comment '经理姓名',
    xingbie        varchar(200)                        null comment '性别',
    lianxifangshi  varchar(200)                        null comment '联系方式',
    touxiang       longtext                            null comment '头像',
    constraint jinglizhanghao
        unique (jinglizhanghao)
)
    comment '项目经理' charset = utf8;

create table xiangmutixing
(
    id               bigint auto_increment comment '主键'
        primary key,
    addtime          timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    xiangmumingcheng varchar(200)                        null comment '项目名称',
    xiangmufenlei    varchar(200)                        null comment '项目分类',
    tixingshijian    date                                null comment '提醒时间',
    zhanghao         varchar(200)                        null comment '账号',
    xingming         varchar(200)                        null comment '姓名',
    tixingneirong    longtext                            null comment '提醒内容',
    jinglizhanghao   varchar(200)                        null comment '经理账号',
    jinglixingming   varchar(200)                        null comment '经理姓名'
)
    comment '项目提醒' charset = utf8;

create table xiangmuxinxi
(
    id               bigint auto_increment comment '主键'
        primary key,
    addtime          timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    xiangmubianhao   varchar(200)                        null comment '项目编号',
    xiangmumingcheng varchar(200)                        null comment '项目名称',
    xiangmufenlei    varchar(200)                        null comment '项目分类',
    xiangmuneirong   longtext                            null comment '项目内容',
    fabushijian      date                                null comment '发布时间',
    jinglizhanghao   varchar(200)                        null comment '经理账号',
    jinglixingming   varchar(200)                        null comment '经理姓名',
    constraint xiangmubianhao
        unique (xiangmubianhao)
)
    comment '项目信息' charset = utf8;

create table yonghu
(
    id            bigint auto_increment comment '主键'
        primary key,
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    zhanghao      varchar(200)                        not null comment '账号',
    mima          varchar(200)                        not null comment '密码',
    xingming      varchar(200)                        not null comment '姓名',
    xingbie       varchar(200)                        null comment '性别',
    lianxifangshi varchar(200)                        null comment '联系方式',
    zhiwei        varchar(200)                        null comment '职位',
    touxiang      longtext                            null comment '头像',
    constraint zhanghao
        unique (zhanghao)
)
    comment '用户' charset = utf8;

