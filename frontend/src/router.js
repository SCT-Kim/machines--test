
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MachinesTypeManager from "./components/listers/MachinesTypeCards"
import MachinesTypeDetail from "./components/listers/MachinesTypeDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/machinesTypes',
                name: 'MachinesTypeManager',
                component: MachinesTypeManager
            },
            {
                path: '/machinesTypes/:id',
                name: 'MachinesTypeDetail',
                component: MachinesTypeDetail
            },



    ]
})
