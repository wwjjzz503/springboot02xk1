<template>
  <div class="content" :style="{ padding: '16px 30px' }">
    <div
      class="text"
      :style="{
        margin: '0px auto',
        'margin-bottom': '16px',
        fontSize: '24px',
        color: 'rgb(51, 51, 51)',
        textAlign: 'center',
        fontWeight: 'bold',
      }"
    >
      欢迎使用 {{ this.$project.projectName }}
    </div>
    <div class="cardView">
      <div
        class="cards"
        :style="{
          margin: '0 0 20px 0',
          alignItems: 'center',
          justifyContent: 'center',
          display: 'flex',
        }"
      >
        <!--			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"15px 5px 5px 15px","display":"flex"}' v-if="isAuth('xiangmujindu','首页总数')">-->
        <!--				<div :style='{"width":"40px","borderRadius":"15px 0 0 15px","background":"#deecfb","height":"80px"}'></div>-->
        <!--				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>-->
        <!--					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{xiangmujinduCount}}</div>-->
        <!--					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>项目进度总数</div>-->
        <!--				</div>-->
        <!--			</div>-->
      </div>
      <div
        style="
          display: flex;
          align-items: center;
          width: 100%;
          margin-bottom: 10px;
        "
      >
        <el-card style="flex: 1; margin: 0 10px">
          <div id="xiangmujinduChart1" style="width: 100%; height: 400px"></div>
        </el-card>
        <el-card style="flex: 1; margin: 0 10px">
          <div id="xiangmujinduChart2" style="width: 100%; height: 400px"></div>
        </el-card>
      </div>
      <div
        style="
          display: flex;
          align-items: center;
          justify-content: space-between;
          flex: 1;
        "
      >
        <el-card style="flex: 1; margin: 0 10px">
          <div id="xiangmujinduChart3" style="width: 100%; height: 400px"></div>
        </el-card>
        <el-card style="flex: 1; margin: 0 10px">
          <div id="xiangmujinduChart4" style="width: 100%; height: 400px"></div>
        </el-card>
      </div>
    </div>
  </div>
</template>
<script>
//3
import router from "@/router/router-static";
import * as echarts from "echarts";
export default {
  data() {
    return {
      xiangmujinduCount: 0,
      role: "",
    };
  },
  created() {
    this.init();
  },
  computed: {
    isProject() {
      return this.role !== "用户" ? "项目" : "任务";
    },
  },
  mounted() {
    this.getxiangmujinduCount();
    this.xiangmujinduChat1();
    this.xiangmujinduChat2();
    this.xiangmujinduChat3();
    this.xiangmujinduChat4();
  },
  methods: {
    init() {
      if (this.$storage.get("Token")) {
        this.$http({
          url: `${this.$storage.get("sessionTable")}/session`,
          method: "get",
        }).then(({ data }) => {
          if (data) {
            if (data.code != 0) {
              router.push({ name: "login" });
            } else {
              this.role = data.data.role;
              console.log(this.role);
            }
          }
        });
      } else {
        router.push({ name: "login" });
      }
    },
    getxiangmujinduCount() {
      this.$http({
        url: `xiangmujindu/count`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code == 0) {
          this.xiangmujinduCount = data.data;
        }
      });
    },

    xiangmujinduChat1() {
      this.$nextTick(() => {
        var xiangmujinduChart1 = echarts.init(
          document.getElementById("xiangmujinduChart1"),
          "macarons"
        );
        this.$http({
          url: "xiangmuxinxi/chart-interleaved",
          method: "get",
        }).then(({ data }) => {
          console.log(data);
          if (data && data.code === 0) {
            let res = data.data;
            const option = {
              title: {
                text: this.isProject + "进度正负交错图",
              },
              tooltip: {
                trigger: "axis",
                axisPointer: {
                  type: "shadow",
                },
              },
              grid: {
                top: 80,
                bottom: 30,
              },
              xAxis: {
                type: "value",
                position: "top",
                splitLine: {
                  lineStyle: {
                    type: "dashed",
                  },
                },
              },
              yAxis: {
                type: "category",
                axisLine: { show: true },
                axisLabel: { show: true },
                axisTick: { show: true },
                splitLine: { show: true },
                data: res.map((item) => item.name),
              },
              series: [
                {
                  name: "天数",
                  type: "bar",
                  stack: "Total",
                  color: ["red", "blue"],
                  label: {
                    show: true,
                    formatter: "{b}",
                  },
                  data: res.map((i) => {
                    return {
                      value: i.value,
                      itemStyle: {
                        color: i.value >= 0 ? "green" : "red",
                      },
                    };
                  }),
                },
              ],
            };
            // 使用刚指定的配置项和数据显示图表。
            xiangmujinduChart1.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              xiangmujinduChart1.resize();
            };
          }
        });
      });
    },

    xiangmujinduChat2() {
      this.$nextTick(() => {
        var xiangmujinduChart2 = echarts.init(
          document.getElementById("xiangmujinduChart2"),
          "macarons"
        );
        this.$http({
          url: `xiangmuxinxi/chart-pie`,
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            // console.log((data))
            const option = {
              legend: {
                top: "bottom",
              },
              title: {
                text: this.isProject + "成本统计饼状图",
              },
              tooltip: {
                trigger: "item",
                formatter: "{a} <br/>{b} : {c} ({d}%)",
              },
              toolbox: {
                show: true,
                feature: {
                  mark: { show: true },
                  dataView: { show: false, readOnly: false },
                  restore: { show: true },
                  saveAsImage: { show: true },
                },
              },
              series: [
                {
                  name: "项目成本（单位万元）",
                  type: "pie",
                  radius: [30, 100],
                  center: ["50%", "50%"],
                  roseType: "area",
                  itemStyle: {
                    borderRadius: 8,
                  },
                  data: res,
                },
              ],
            };
            // 使用刚指定的配置项和数据显示图表。
            xiangmujinduChart2.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              xiangmujinduChart2.resize();
            };
          }
        });
      });
    },

    xiangmujinduChat3() {
      this.$nextTick(() => {
        var xiangmujinduChart3 = echarts.init(
          document.getElementById("xiangmujinduChart3"),
          "macarons"
        );
        this.$http({
          url: `xiangmuxinxi/chart-progress`,
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            console.log(this.role + "echarts");
            const option = {
              title: {
                text: this.isProject + "进度柱状图",
              },
              tooltip: {
                trigger: "axis",

                axisPointer: {
                  type: "shadow",
                },
              },
              legend: {},
              grid: {
                left: "3%",
                right: "4%",
                bottom: "3%",
                containLabel: true,
              },
              xAxis: {
                type: "value",
                axisLabel: {
                  formatter: "{value}%",
                  align: "center",
                },
              },
              yAxis: {
                type: "category",
                data: res.map((item) => item.name),
              },
              series: [
                {
                  // name: '2011',
                  type: "bar",
                  tooltip: {
                    valueFormatter: (value) => value + "%",
                  },
                  data: res.map((i) => ({
                    value: i.value * 100,
                    itemStyle: {
                      color: "#" + i.value * 100 + "90ff",
                    },
                  })),
                },
              ],
            };
            // 使用刚指定的配置项和数据显示图表。
            xiangmujinduChart3.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              xiangmujinduChart3.resize();
            };
          }
        });
      });
    },
    xiangmujinduChat4() {
      this.$nextTick(() => {
        var xiangmujinduChart4 = echarts.init(
          document.getElementById("xiangmujinduChart4"),
          "macarons"
        );
        this.$http({
          url: `xiangmuxinxi/chart-histogram`,
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            const option = {
              title: {
                text: "项目投入时间折线图",
              },
              tooltip: {
                trigger: "axis",

                axisPointer: {
                  type: "shadow",
                },
              },
              animationDuration: 3000,
              xAxis: {
                type: "category",
                data: res.map((item) => item.name),
              },
              yAxis: {
                type: "value",
              },
              series: [
                {
                  data: res.map((item) => item.value),
                  type: "line",
                  smooth: false,
                  tooltip: {
                    valueFormatter: (value) => value + "天",
                  },
                  areaStyle: {
                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [
                      {
                        offset: 0,
                        color: "rgba(58,77,233,0.8)",
                      },
                      {
                        offset: 1,
                        color: "rgba(58,77,233,0.1)",
                      },
                    ]),
                  },
                },
              ],
            };
            // 使用刚指定的配置项和数据显示图表。
            xiangmujinduChart4.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              xiangmujinduChart4.resize();
            };
          }
        });
      });
    },
  },
};
</script>
<style lang="scss" scoped>
.cardView {
  display: flex;
  flex-wrap: wrap;
  width: 100%;

  .cards {
    display: flex;
    align-items: center;
    width: 100%;
    margin-bottom: 10px;
    justify-content: center;
    .card {
      width: calc(25% - 20px);
      margin: 0 10px;
      /deep/.el-card__body {
        padding: 0;
      }
    }
  }
}
</style>
