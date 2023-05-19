const menu = {
  list() {
    return [
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-send",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "用户",
                menuJump: "列表",
                tableName: "yonghu",
              },
            ],
            menu: "用户管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "项目经理",
                menuJump: "列表",
                tableName: "xiangmujingli",
              },
            ],
            menu: "项目经理管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-pay",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "项目分类",
                menuJump: "列表",
                tableName: "xiangmufenlei",
              },
            ],
            menu: "项目分类管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-present",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "项目信息",
                menuJump: "列表",
                tableName: "xiangmuxinxi",
              },
            ],
            menu: "项目信息管理",
          },
          
        //   {
        //     child: [
        //       {
        //         appFrontIcon: "cuIcon-send",
        //         buttons: [
        //           "查看",
        //           "修改",
        //           "删除",
        //           "项目进度统计",
        //           "项目成本统计",
        //           "投入时间统计",
        //           "首页总数",
        //           "首页统计",
        //         ],
        //         menu: "项目进度",
        //         menuJump: "列表",
        //         tableName: "xiangmujindu",
        //       },
        //     ],
        //     menu: "项目进度管理",
        //   },
          {
            child: [
              {
                appFrontIcon: "cuIcon-flashlightopen",
                buttons: ["查看", "修改", "删除"],
                menu: "项目提醒",
                menuJump: "列表",
                tableName: "xiangmutixing",
              },
            ],
            menu: "项目提醒管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-circle",
                buttons: ["查看", "修改", "删除"],
                menu: "公告板",
                menuJump: "列表",
                tableName: "gonggaoban",
              },
            ],
            menu: "公告板管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-time",
                buttons: ["查看", "修改", "删除"],
                menu: "留言板",
                menuJump: "列表",
                tableName: "liuyanban",
              },
            ],
            menu: "留言板管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "管理员",
        tableName: "users",
      },
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-album",
                buttons: ["查看"],
                menu: "任务信息",
                menuJump: "列表",
                tableName: "task-info",
              },
            ],
            menu: "任务信息管理",
          },
        //   {
        //     child: [
        //       {
        //         appFrontIcon: "cuIcon-send",
        //         buttons: ["查看", "删除"],
        //         menu: "项目进度",
        //         menuJump: "列表",
        //         tableName: "xiangmujindu",
        //       },
        //     ],
        //     menu: "项目进度管理",
        //   },
        //   {
        //     child: [
        //       {
        //         appFrontIcon: "cuIcon-flashlightopen",
        //         buttons: ["查看"],
        //         menu: "项目提醒",
        //         menuJump: "列表",
        //         tableName: "xiangmutixing",
        //       },
        //     ],
        //     menu: "项目提醒管理",
        //   },
          {
            child: [
              {
                appFrontIcon: "cuIcon-circle",
                buttons: ["查看"],
                menu: "公告板",
                menuJump: "列表",
                tableName: "gonggaoban",
              },
            ],
            menu: "公告板管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-time",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "留言板",
                menuJump: "列表",
                tableName: "liuyanban",
              },
            ],
            menu: "留言板管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "用户",
        tableName: "yonghu",
      },
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-present",
                buttons: ["查看", "分配"],
                menu: "项目信息",
                menuJump: "列表",
                tableName: "xiangmuxinxi",
              },
            ],
            menu: "项目信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-album",
                buttons: ["查看", "删除", "提醒"],
                menu: "任务分配",
                menuJump: "列表",
                tableName: "xiangmufenpei",
              },
            ],
            menu: "任务分配管理",
          },
        //   {
        //     child: [
        //       {
        //         appFrontIcon: "cuIcon-send",
        //         buttons: ["查看"],
        //         menu: "项目进度",
        //         menuJump: "列表",
        //         tableName: "xiangmujindu",
        //       },
        //     ],
        //     menu: "项目进度管理",
        //   },
        //{
        //     child: [
        //       {
        //         appFrontIcon: "cuIcon-album",
        //         buttons: ["查看", "修改", "删除"],
        //        menu: "项目分配",
        //        menuJump: "列表",
        //         tableName: "xiangmufenpei",
        //       },
        //    ],
        //    menu: "项目分配管理",
        //  },
          {
            child: [
              {
                appFrontIcon: "cuIcon-flashlightopen",
                buttons: ["查看", "删除"],
                menu: "项目提醒",
                menuJump: "列表",
                tableName: "xiangmutixing",
              },
            ],
            menu: "项目提醒管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-circle",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "公告板",
                menuJump: "列表",
                tableName: "gonggaoban",
              },
            ],
            menu: "公告板管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-time",
                buttons: ["查看"],
                menu: "留言板",
                menuJump: "列表",
                tableName: "liuyanban",
              },
            ],
            menu: "留言板管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "项目经理",
        tableName: "xiangmujingli",
      },
    ];
  },
};
export default menu;
