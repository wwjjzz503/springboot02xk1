const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot02xk1/",
            name: "springboot02xk1",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于B/S架构的企业项目管理系统的设计与实现"
        } 
    }
}
export default base
