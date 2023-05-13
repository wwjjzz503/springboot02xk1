<template>
  <div class="addEdit-block" :style="{ padding: '30px' }" style="width: 100%">
    <el-form
      :style="{
        padding: '30px',
        boxShadow: '0px 4px 10px 0px rgba(0,0,0,0.3020)',
        margin: '0 auto',
        borderColor: 'rgba(230, 242, 254, 1)',
        borderRadius: '6px',
        borderWidth: '30px 0 0 0',
        width: '90%',
        borderStyle: 'solid',
      }"
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="140px"
    >
      <template>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="分配编号"
          prop="fenpeibianhao"
        >
          <el-input
            v-model="ruleForm.fenpeibianhao"
            placeholder="分配编号"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-else-if="ruleForm.fenpeibianhao"
          label="分配编号"
          prop="fenpeibianhao"
        >
          <el-input
            v-model="ruleForm.fenpeibianhao"
            placeholder="分配编号"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="项目名称"
          prop="xiangmumingcheng"
        >
          <el-input
            v-model="ruleForm.xiangmumingcheng"
            placeholder="项目名称"
            clearable
            :readonly="ro.xiangmumingcheng"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="项目名称"
          prop="xiangmumingcheng"
        >
          <el-input
            v-model="ruleForm.xiangmumingcheng"
            placeholder="项目名称"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="项目分类"
          prop="xiangmufenlei"
        >
          <el-input
            v-model="ruleForm.xiangmufenlei"
            placeholder="项目分类"
            clearable
            :readonly="ro.xiangmufenlei"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="项目分类"
          prop="xiangmufenlei"
        >
          <el-input
            v-model="ruleForm.xiangmufenlei"
            placeholder="项目分类"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="select"
          v-if="type != 'info'"
          label="优先级"
          prop="youxianji"
        >
          <el-select
            :disabled="ro.youxianji"
            v-model="ruleForm.youxianji"
            placeholder="请选择优先级"
          >
            <el-option
              v-for="(item, index) in youxianjiOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="优先级"
          prop="youxianji"
        >
          <el-input
            v-model="ruleForm.youxianji"
            placeholder="优先级"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="date"
          v-if="type != 'info'"
          label="截止日期"
          prop="jiezhiriqi"
        >
          <el-date-picker
            format="yyyy 年 MM 月 dd 日"
            value-format="yyyy-MM-dd"
            v-model="ruleForm.jiezhiriqi"
            type="date"
            :readonly="ro.jiezhiriqi"
            placeholder="截止日期"
          ></el-date-picker>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-else-if="ruleForm.jiezhiriqi"
          label="截止日期"
          prop="jiezhiriqi"
        >
          <el-input
            v-model="ruleForm.jiezhiriqi"
            placeholder="截止日期"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="date"
          v-if="type != 'info'"
          label="分配时间"
          prop="fenpeishijian"
        >
          <el-date-picker
            format="yyyy 年 MM 月 dd 日"
            value-format="yyyy-MM-dd"
            v-model="ruleForm.fenpeishijian"
            type="date"
            :readonly="ro.fenpeishijian"
            placeholder="分配时间"
          ></el-date-picker>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-else-if="ruleForm.fenpeishijian"
          label="分配时间"
          prop="fenpeishijian"
        >
          <el-input
            v-model="ruleForm.fenpeishijian"
            placeholder="分配时间"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="select"
          v-if="type != 'info'"
          label="账号"
          prop="zhanghao"
        >
          <el-select
            :disabled="ro.zhanghao"
            @change="zhanghaoChange"
            v-model="ruleForm.zhanghao"
            placeholder="请选择账号"
          >
            <el-option
              v-for="(item, index) in zhanghaoOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-else-if="ruleForm.zhanghao"
          label="账号"
          prop="zhanghao"
        >
          <el-input
            v-model="ruleForm.zhanghao"
            placeholder="账号"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="姓名"
          prop="xingming"
        >
          <el-input
            v-model="ruleForm.xingming"
            placeholder="姓名"
            clearable
            :readonly="ro.xingming"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="姓名"
          prop="xingming"
        >
          <el-input
            v-model="ruleForm.xingming"
            placeholder="姓名"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="职位"
          prop="zhiwei"
        >
          <el-input
            v-model="ruleForm.zhiwei"
            placeholder="职位"
            clearable
            :readonly="ro.zhiwei"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="职位"
          prop="zhiwei"
        >
          <el-input
            v-model="ruleForm.zhiwei"
            placeholder="职位"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="经理账号"
          prop="jinglizhanghao"
        >
          <el-input
            v-model="ruleForm.jinglizhanghao"
            placeholder="经理账号"
            clearable
            :readonly="ro.jinglizhanghao"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="经理账号"
          prop="jinglizhanghao"
        >
          <el-input
            v-model="ruleForm.jinglizhanghao"
            placeholder="经理账号"
            readonly
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          class="input"
          v-if="type != 'info'"
          label="经理姓名"
          prop="jinglixingming"
        >
          <el-input
            v-model="ruleForm.jinglixingming"
            placeholder="经理姓名"
            clearable
            :readonly="ro.jinglixingming"
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '45%',
            margin: '0 2% 20px 0',
            display: 'inline-block',
          }"
          v-else
          class="input"
          label="经理姓名"
          prop="jinglixingming"
        >
          <el-input
            v-model="ruleForm.jinglixingming"
            placeholder="经理姓名"
            readonly
          ></el-input>
        </el-form-item>
      </template>
      <el-form-item
        :style="{
          width: '45%',
          margin: '0 2% 20px 0',
          display: 'inline-block',
        }"
        v-if="type != 'info'"
        label="分配内容"
        prop="fenpeineirong"
      >
        <editor
          style="min-width: 200px; max-width: 600px"
          v-model="ruleForm.fenpeineirong"
          class="editor"
          action="file/upload"
        >
        </editor>
      </el-form-item>
      <el-form-item
        :style="{
          width: '45%',
          margin: '0 2% 20px 0',
          display: 'inline-block',
        }"
        v-else-if="ruleForm.fenpeineirong"
        label="分配内容"
        prop="fenpeineirong"
      >
        <span
          :style="{
            fontSize: '14px',
            lineHeight: '40px',
            color: '#333',
            fontWeight: '500',
            display: 'inline-block',
          }"
          v-html="ruleForm.fenpeineirong"
        ></span>
      </el-form-item>
      <el-form-item :style="{ padding: '0', margin: '0' }" class="btn">
        <el-button
          :style="{
            border: '0',
            cursor: 'pointer',
            padding: '0',
            margin: '0 20px 0 0',
            outline: 'none',
            color: '#333',
            borderRadius: '4px',
            background: 'rgba(185, 216, 255, 1)',
            width: '128px',
            lineHeight: '40px',
            fontSize: '14px',
            height: '40px',
          }"
          v-if="type != 'info'"
          type="primary"
          class="btn-success"
          @click="onSubmit"
          >提交</el-button
        >
        <el-button
          :style="{
            border: '0px solid rgba(64, 158, 255, 1)',
            cursor: 'pointer',
            padding: '0',
            margin: '0',
            outline: 'none',
            color: '#fff',
            borderRadius: '4px',
            background: 'rgba(198, 205, 214, 1)',
            width: '128px',
            lineHeight: '40px',
            fontSize: '14px',
            height: '40px',
          }"
          v-if="type != 'info'"
          class="btn-close"
          @click="back()"
          >取消</el-button
        >
        <el-button
          :style="{
            border: '0px solid rgba(64, 158, 255, 1)',
            cursor: 'pointer',
            padding: '0',
            margin: '0',
            outline: 'none',
            color: '#fff',
            borderRadius: '4px',
            background: 'rgba(198, 205, 214, 1)',
            width: '128px',
            lineHeight: '40px',
            fontSize: '14px',
            height: '40px',
          }"
          v-if="type == 'info'"
          class="btn-close"
          @click="back()"
          >返回</el-button
        >
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {
  isNumber,
  isIntNumer,
  isEmail,
  isPhone,
  isMobile,
  isURL,
  checkIdCard,
} from "@/utils/validate";
export default {
  data() {
    let self = this;
    var validateIdCard = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      id: "",
      type: "",

      ro: {
        fenpeibianhao: false,
        xiangmumingcheng: false,
        xiangmufenlei: false,
        youxianji: false,
        jiezhiriqi: false,
        fenpeishijian: false,
        zhanghao: false,
        xingming: false,
        zhiwei: false,
        fenpeineirong: false,
        jinglizhanghao: false,
        jinglixingming: false,
      },

      ruleForm: {
        fenpeibianhao: this.getUUID(),
        xiangmumingcheng: "",
        xiangmufenlei: "",
        youxianji: "",
        jiezhiriqi: "",
        fenpeishijian: "",
        zhanghao: "",
        xingming: "",
        zhiwei: "",
        fenpeineirong: "",
        jinglizhanghao: "",
        jinglixingming: "",
      },

      youxianjiOptions: [],
      zhanghaoOptions: [],

      rules: {
        fenpeibianhao: [],
        xiangmumingcheng: [],
        xiangmufenlei: [],
        youxianji: [],
        jiezhiriqi: [],
        fenpeishijian: [],
        zhanghao: [],
        xingming: [],
        zhiwei: [],
        fenpeineirong: [],
        jinglizhanghao: [],
        jinglixingming: [],
      },
    };
  },
  props: ["parent"],
  computed: {},
  components: {},
  created() {
    this.ruleForm.jiezhiriqi = this.getCurDate();
    this.ruleForm.fenpeishijian = this.getCurDate();
  },
  methods: {
    // 下载
    download(file) {
      window.open(`${file}`);
    },
    // 初始化
    init(id, type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if (this.type == "info" || this.type == "else") {
        this.info(id);
      } else if (this.type == "logistics") {
        this.logistics = false;
        this.info(id);
      } else if (this.type == "cross") {
        var obj = this.$storage.getObj("crossObj");
        for (var o in obj) {
          if (o == "fenpeibianhao") {
            this.ruleForm.fenpeibianhao = obj[o];
            this.ro.fenpeibianhao = true;
            continue;
          }
          if (o == "xiangmumingcheng") {
            this.ruleForm.xiangmumingcheng = obj[o];
            this.ro.xiangmumingcheng = true;
            continue;
          }
          if (o == "xiangmufenlei") {
            this.ruleForm.xiangmufenlei = obj[o];
            this.ro.xiangmufenlei = true;
            continue;
          }
          if (o == "youxianji") {
            this.ruleForm.youxianji = obj[o];
            this.ro.youxianji = true;
            continue;
          }
          if (o == "jiezhiriqi") {
            this.ruleForm.jiezhiriqi = obj[o];
            this.ro.jiezhiriqi = true;
            continue;
          }
          if (o == "fenpeishijian") {
            this.ruleForm.fenpeishijian = obj[o];
            this.ro.fenpeishijian = true;
            continue;
          }
          if (o == "zhanghao") {
            this.ruleForm.zhanghao = obj[o];
            this.ro.zhanghao = true;
            continue;
          }
          if (o == "xingming") {
            this.ruleForm.xingming = obj[o];
            this.ro.xingming = true;
            continue;
          }
          if (o == "zhiwei") {
            this.ruleForm.zhiwei = obj[o];
            this.ro.zhiwei = true;
            continue;
          }
          if (o == "fenpeineirong") {
            this.ruleForm.fenpeineirong = obj[o];
            this.ro.fenpeineirong = true;
            continue;
          }
          if (o == "jinglizhanghao") {
            this.ruleForm.jinglizhanghao = obj[o];
            this.ro.jinglizhanghao = true;
            continue;
          }
          if (o == "jinglixingming") {
            this.ruleForm.jinglixingming = obj[o];
            this.ro.jinglixingming = true;
            continue;
          }
        }
      }

      // 获取用户信息
      this.$http({
        url: `${this.$storage.get("sessionTable")}/session`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });

      this.youxianjiOptions = "一般重要关键".split(",");
      this.$http({
        url: `option/yonghu/zhanghao`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.zhanghaoOptions = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 下二随
    zhanghaoChange() {
      this.$http({
        url: `follow/yonghu/zhanghao?columnValue=` + this.ruleForm.zhanghao,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          if (data.data.xingming) {
            this.ruleForm.xingming = data.data.xingming;
          }
          if (data.data.zhiwei) {
            this.ruleForm.zhiwei = data.data.zhiwei;
          }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数

    info(id) {
      this.$http({
        url: `xiangmufenpei/info/${id}`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
          //解决前台上传图片后台不显示的问题
          let reg = new RegExp("../../../upload", "g"); //g代表全部
          this.ruleForm.fenpeineirong = this.ruleForm.fenpeineirong.replace(
            reg,
            "../../../springboot02xk1/upload"
          );
        } else {
          this.$message.error(data.msg);
        }
      });
    },

    // 提交
    onSubmit() {
      var objcross = this.$storage.getObj("crossObj");

      //更新跨表属性
      var crossuserid;
      var crossrefid;
      var crossoptnum;
      if (this.type == "cross") {
        var statusColumnName = this.$storage.get("statusColumnName");
        var statusColumnValue = this.$storage.get("statusColumnValue");
        if (statusColumnName != "") {
          var obj = this.$storage.getObj("crossObj");
          if (statusColumnName && !statusColumnName.startsWith("[")) {
            for (var o in obj) {
              if (o == statusColumnName) {
                obj[o] = statusColumnValue;
              }
            }
            var table = this.$storage.get("crossTable");
            this.$http({
              url: `${table}/update`,
              method: "post",
              data: obj,
            }).then(({ data }) => {});
          } else {
            crossuserid = this.$storage.get("userid");
            crossrefid = obj["id"];
            crossoptnum = this.$storage.get("statusColumnName");
            crossoptnum = crossoptnum.replace(/\[/, "").replace(/\]/, "");
          }
        }
      }
      this.$refs["ruleForm"].validate((valid) => {
        if (valid) {
          if (crossrefid && crossuserid) {
            this.ruleForm.crossuserid = crossuserid;
            this.ruleForm.crossrefid = crossrefid;
            let params = {
              page: 1,
              limit: 10,
              crossuserid: this.ruleForm.crossuserid,
              crossrefid: this.ruleForm.crossrefid,
            };
            this.$http({
              url: "xiangmufenpei/page",
              method: "get",
              params: params,
            }).then(({ data }) => {
              if (data && data.code === 0) {
                if (data.data.total >= crossoptnum) {
                  this.$message.error(this.$storage.get("tips"));
                  return false;
                } else {
                  this.$http({
                    url: `xiangmufenpei/${
                      !this.ruleForm.id ? "save" : "update"
                    }`,
                    method: "post",
                    data: this.ruleForm,
                  }).then(({ data }) => {
                    if (data && data.code === 0) {
                      this.$message({
                        message: "操作成功",
                        type: "success",
                        duration: 1500,
                        onClose: () => {
                          this.parent.showFlag = true;
                          this.parent.addOrUpdateFlag = false;
                          this.parent.xiangmufenpeiCrossAddOrUpdateFlag = false;
                          this.parent.search();
                          this.parent.contentStyleChange();
                        },
                      });
                    } else {
                      this.$message.error(data.msg);
                    }
                  });
                }
              } else {
              }
            });
          } else {
            this.$http({
              url: `xiangmufenpei/${!this.ruleForm.id ? "save" : "update"}`,
              method: "post",
              data: this.ruleForm,
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.$message({
                  message: "操作成功",
                  type: "success",
                  duration: 1500,
                  onClose: () => {
                    this.parent.showFlag = true;
                    this.parent.addOrUpdateFlag = false;
                    this.parent.xiangmufenpeiCrossAddOrUpdateFlag = false;
                    this.parent.search();
                    this.parent.contentStyleChange();
                  },
                });
              } else {
                this.$message.error(data.msg);
              }
            });
          }
        }
      });
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.xiangmufenpeiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
  },
};
</script>
<style lang="scss" scoped>
.amap-wrapper {
  width: 100%;
  height: 500px;
}

.search-box {
  position: absolute;
}

.el-date-editor.el-input {
  width: auto;
}

.add-update-preview .el-form-item /deep/ .el-form-item__label {
  padding: 0 20px 0 0;
  color: #666;
  font-weight: 500;
  width: 140px;
  font-size: 14px;
  line-height: 40px;
  text-align: right;
}

.add-update-preview .el-form-item /deep/ .el-form-item__content {
  margin-left: 140px;
}

.add-update-preview .el-input /deep/ .el-input__inner {
  border: 2px solid rgba(198, 205, 214, 1);
  border-radius: 4px;
  padding: 0 12px;
  outline: none;
  color: #333;
  width: 250px;
  font-size: 14px;
  height: 40px;
}

.add-update-preview .el-select /deep/ .el-input__inner {
  border: 2px solid rgba(198, 205, 214, 1);
  border-radius: 4px;
  padding: 0 10px;
  outline: none;
  color: #333;
  width: 200px;
  font-size: 14px;
  height: 40px;
}

.add-update-preview .el-date-editor /deep/ .el-input__inner {
  border: 2px solid rgba(198, 205, 214, 1);
  border-radius: 4px;
  padding: 0 10px 0 30px;
  outline: none;
  color: #333;
  width: 200px;
  font-size: 14px;
  height: 40px;
}

.add-update-preview /deep/ .el-upload--picture-card {
  background: transparent;
  border: 0;
  border-radius: 0;
  width: auto;
  height: auto;
  line-height: initial;
  vertical-align: middle;
}

.add-update-preview /deep/ .upload .upload-img {
  border: 2px dashed rgba(198, 205, 214, 1);
  cursor: pointer;
  border-radius: 6px;
  color: rgba(198, 205, 214, 1);
  width: 150px;
  font-size: 32px;
  line-height: 150px;
  text-align: center;
  height: 150px;
}

.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
  border: 2px dashed rgba(198, 205, 214, 1);
  cursor: pointer;
  border-radius: 6px;
  color: rgba(198, 205, 214, 1);
  width: 150px;
  font-size: 32px;
  line-height: 150px;
  text-align: center;
  height: 150px;
}

.add-update-preview /deep/ .el-upload .el-icon-plus {
  border: 2px dashed rgba(198, 205, 214, 1);
  cursor: pointer;
  border-radius: 6px;
  color: rgba(198, 205, 214, 1);
  width: 150px;
  font-size: 32px;
  line-height: 150px;
  text-align: center;
  height: 150px;
}

.add-update-preview .el-textarea /deep/ .el-textarea__inner {
  border: 2px dashed rgba(198, 205, 214, 1);
  border-radius: 4px;
  padding: 12px;
  outline: none;
  color: #333;
  width: 300px;
  font-size: 14px;
  height: 120px;
}
</style>
