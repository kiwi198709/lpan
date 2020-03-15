import axios from 'axios';
import qs from 'qs';
// http请求拦截器 请求之前的一些操作
axios.interceptors.request.use(config => {
    if(config.method=='post'){
        config.data=qs.stringify(config.data);//防止post请求参数无法传到后台
    }
    return config
}, error => {
    return Promise.reject(error)
});

var vm = new Vue({
    el: '#vue_det',
    data: {
        site: "慕课网",
        url: "www.imooc.com",
        alexa: "10000"
    },
    methods: {
        details: function() {
            return  this.site + " 程序员的梦工厂";
        }
    }
})
Vue.prototype.$axios = axios;
var url ="/demo/list";
this.$axios.get(url).then(res => {console.log(res)});