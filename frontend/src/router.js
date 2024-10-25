
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveDriveManager from "./components/listers/DriveDriveCards"
import DriveDriveDetail from "./components/listers/DriveDriveDetail"

import IndexerIndexManager from "./components/listers/IndexerIndexCards"
import IndexerIndexDetail from "./components/listers/IndexerIndexDetail"

import VideoProcesingVideoManager from "./components/listers/VideoProcesingVideoCards"
import VideoProcesingVideoDetail from "./components/listers/VideoProcesingVideoDetail"


import NotificationNotoficationManager from "./components/listers/NotificationNotoficationCards"
import NotificationNotoficationDetail from "./components/listers/NotificationNotoficationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/drives',
                name: 'DriveDriveManager',
                component: DriveDriveManager
            },
            {
                path: '/drives/drives/:id',
                name: 'DriveDriveDetail',
                component: DriveDriveDetail
            },

            {
                path: '/indexers/indices',
                name: 'IndexerIndexManager',
                component: IndexerIndexManager
            },
            {
                path: '/indexers/indices/:id',
                name: 'IndexerIndexDetail',
                component: IndexerIndexDetail
            },

            {
                path: '/videoProcesings/videos',
                name: 'VideoProcesingVideoManager',
                component: VideoProcesingVideoManager
            },
            {
                path: '/videoProcesings/videos/:id',
                name: 'VideoProcesingVideoDetail',
                component: VideoProcesingVideoDetail
            },


            {
                path: '/notifications/notofications',
                name: 'NotificationNotoficationManager',
                component: NotificationNotoficationManager
            },
            {
                path: '/notifications/notofications/:id',
                name: 'NotificationNotoficationDetail',
                component: NotificationNotoficationDetail
            },



    ]
})
