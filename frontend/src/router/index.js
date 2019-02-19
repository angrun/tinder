import Vue from 'vue'
import Router from 'vue-router'
import DatingApp from '@/components/pages/DatingApp'
import Profile from '@/components/pages/Profile'
import Home from '@/components/pages/Home'
import Chat from '@/components/pages/Chat'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'DatingApp',
      component: DatingApp
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/profile',
      name: 'Profile',
      component: Profile
    },
    {
      path: '/chat',
      name: 'Chat',
      component: Chat
    }
  ]
})
