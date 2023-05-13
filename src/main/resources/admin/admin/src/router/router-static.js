import Vue from "vue";
//配置路由
import VueRouter from "vue-router";
Vue.use(VueRouter);
//1.创建组件
import Index from "@/views/index";
import Home from "@/views/home";
import Login from "@/views/login";
import NotFound from "@/views/404";
import UpdatePassword from "@/views/update-password";
import pay from "@/views/pay";
import register from "@/views/register";
import center from "@/views/center";
import xiangmutixing from "@/views/modules/xiangmutixing/list";
import gonggaoban from "@/views/modules/gonggaoban/list";
import xiangmufenlei from "@/views/modules/xiangmufenlei/list";
import xiangmujindu from "@/views/modules/xiangmujindu/list";
import yonghu from "@/views/modules/yonghu/list";
import xiangmufenpei from "@/views/modules/xiangmufenpei/list";
import liuyanban from "@/views/modules/liuyanban/list";
import xiangmujingli from "@/views/modules/xiangmujingli/list";
import xiangmuxinxi from "@/views/modules/xiangmuxinxi/list";
import taskInfo from '@/views/modules/task-info/list';

//2.配置路由   注意：名字
const routes = [
  {
    path: "/index",
    name: "系统首页",
    component: Index,
    children: [
      {
        // 这里不设置值，是把main作为默认页面
        path: "/",
        name: "系统首页",
        component: Home,
        meta: { icon: "", title: "center" },
      },
      {
        path: "/updatePassword",
        name: "修改密码",
        component: UpdatePassword,
        meta: { icon: "", title: "updatePassword" },
      },
      {
        path: "/pay",
        name: "支付",
        component: pay,
        meta: { icon: "", title: "pay" },
      },
      {
        path: "/center",
        name: "个人信息",
        component: center,
        meta: { icon: "", title: "center" },
      },
      {
        path: "/xiangmutixing",
        name: "项目提醒",
        component: xiangmutixing,
      },
      {
        path: "/gonggaoban",
        name: "公告板",
        component: gonggaoban,
      },
      {
        path: "/xiangmufenlei",
        name: "项目分类",
        component: xiangmufenlei,
      },
      {
        path: "/xiangmujindu",
        name: "项目进度",
        component: xiangmujindu,
      },
      {
        path: "/yonghu",
        name: "用户",
        component: yonghu,
      },
      {
        path: "/task-info",
        name: "任务信息",
        component: taskInfo
      },
      {
        path: "/xiangmufenpei",
        name: "项目分配",
        component: xiangmufenpei,
      },
      {
        path: "/liuyanban",
        name: "留言板",
        component: liuyanban,
      },
      {
        path: "/xiangmujingli",
        name: "项目经理",
        component: xiangmujingli,
      },
      {
        path: "/xiangmuxinxi",
        name: "项目信息",
        component: xiangmuxinxi,
      },
    ],
  },
  {
    path: "/login",
    name: "login",
    component: Login,
    meta: { icon: "", title: "login" },
  },
  {
    path: "/register",
    name: "register",
    component: register,
    meta: { icon: "", title: "register" },
  },
  {
    path: "/",
    name: "系统首页",
    redirect: "/index",
  } /*默认跳转路由*/,
  {
    path: "*",
    component: NotFound,
  },
];
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: "hash",
  /*hash模式改为history*/
  routes, // （缩写）相当于 routes: routes
});
const originalPush = VueRouter.prototype.push;
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch((err) => err);
};
export default router;
