<template>
  <div id="page">
    <div id="navigation">
      <nav class="nav">
        <div class="navContent">
          <router-link to="/home" class="link">HOME</router-link>
          <router-link to="/chat" class="link">MESSAGES</router-link>
          <router-link to="/profile" class="link">PROFILE</router-link>
          <router-link to="/profile" class="link">EXPLORE</router-link>
          <img src="../../../node_modules/icons/gear.png" class="icon"/>
        </div>
      </nav>
    </div>
    <div class="container">
      <img src="~/icons/bg.png" style="width:100%;">
      <div class="centered">
        <div class="imageContainer">
          <div class="imageBorder"></div>
          <img src="~icons/eva.png" class="photo"/>
          <div v-if="editMode">
            <button class="photoButton" v-on:click = "changePhoto">
              <p class="buttonText">Change photo</p>
            </button>
          </div>
          <div v-else>
            <button v-on:click = "editHTML">
              <p class="buttonText">Edit</p>
            </button>
          </div>
        </div>
        <div class="info">
          <div class="infoBox" v-if="editMode">
            <p class="boldText">Eva</p>
            <p>Last name</p><input/>
            <p>Age</p><input/>
            <p>Country</p><input/>
            <p>City</p><input/>
          </div>
          <div class="infoBox" v-else>
            <p class="boldText">Eva</p>
            <p>Full name: Eva Miller</p>
            <p>Age: 23</p>
            <p>Sex: female</p>
            <p>City: Tallinn</p>
            <p>Work: doctor</p>
            <p>Hobby: photography</p>
            <p class="boldText">Status</p>
            <p>I love animals</p>
            <p class="boldText">Likes</p>
            <img src="~icons/heart.png" class="heart"/>
            <p class="likes">316</p>
          </div>
        </div>
      </div>
    </div>
    <div class="footer">
      <div class="navContent"><p class="footerText">About Press Blog Privacy Terms Contact</p></div>
    </div>
  </div>
</template>

<script>
  import {AXIOS} from './http-config'
  export default {
    name: 'profile',
    props: {
      activeUser: Object
    },
    // app initial state
    data() {
      return {
        info: [],
        editMode: false,
        user: {},
        id: 1
      }
    },
    created: function() {
      this.getUser()
    },
    // methods that implement data logic.
    // note there's no DOM manipulation here at all.
    methods: {
      editHTML: function () {
        this.editMode = true
      },
      getUser: function () {
        AXIOS.get(`/user/` + this.id)
          .then(response => {
          this.user = response.data
        console.log(response.data)
      })
      }
    }
  }
</script>

<style src="../style/MainStyle.css" scoped>
</style>
