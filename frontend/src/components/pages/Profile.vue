<template>
  <div id="page">
    <div id="navigation">
      <nav class="nav">
        <div class="navContent">
          <router-link to="/home" class="link">HOME</router-link>
          <router-link to="/chat" class="link">MESSAGES</router-link>
          <router-link to="/profile" class="link">PROFILE</router-link>
          <router-link to="/profile" class="link">EXPLORE</router-link>
          <img src="../images/gear.png" class="icon"/>
        </div>
      </nav>
    </div>
    <div class="container">
      <img src="../images/bg.png" style="width:100%;">
      <div class="centered">
        <div class="imageContainer">
          <div class="imageBorder"></div>
          <img src="../images/eva.png" class="photo"/>
          <div v-if="editMode">
            <button class="photoButton" v-on:click = "changePhoto">
              <p class="buttonText">Change photo</p>
            </button>
            <button class="saveButton" v-on:click="saveInfo">
              <p class="buttonText">Save changes</p>
            </button>
            <img class="arrowImg" v-on:click="profileHTML" src="../images/arrow.png"/>
          </div>
          <div v-else>
            <button class="buttonEdit" v-on:click = "editHTML">
              <p class="buttonText">Edit</p>
            </button>
          </div>
        </div>
        <div class="info">
          <div class="infoBox" v-if="editMode">
            <p>First name</p>
            <input type="text" placeholder="Placeholder text" :value="user.name" ref="newName"/>
            <p>Last name</p>
            <input type="text" placeholder="Placeholder text" :value="user.surname" ref="newSurname"/>
            <p>Gender</p>
            <input type="text" placeholder="Placeholder text" :value="user.gender" ref="newGender"/>
            <p>Country</p>
            <input type="text" placeholder="Placeholder text" :value="user.country" ref="newCoutry"/>
            <p>City</p>
            <input type="text" placeholder="Placeholder text" :value="user.city" ref="newCity"/>
            <p>Hobby</p>
            <input type="text" placeholder="Placeholder text" value="hobby here"/>
            <p class="boldText">Bio</p>
            <input/>
          </div>
          <div class="infoBox" v-else>
            <p class="boldText">{{user.name}}</p>
            <p>Full name: {{user.name}} {{user.surname}}</p>
            <p>Age: 23</p>
            <p>Gender: {{user.gender}}</p>
            <p>Country: {{user.country}}</p>
            <p>City: {{user.city}}</p>
            <p>Hobby: #photography</p>
            <p class="boldText">Bio</p>
            <p>I love animals</p>
            <p class="boldText">Likes</p>
            <img src="../images/heart.png" class="heart"/>
            <p class="likes">{{user.likes}}</p>
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
      profileHTML: function () {
        this.editMode = false
      },
      saveInfo: function () {
        this.editMode = false
        this.user.name = this.$refs.newName.value
        this.user.surname = this.$refs.newSurname.value
        this.user.country = this.$refs.newCountry.value
        this.user.city = this.$refs.newCity.value
        AXIOS.put('/users/' + this.user)
      },
      getUser: function () {
        AXIOS.get('/users/' + this.id)
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
