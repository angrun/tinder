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
          <img src="../images/like.png" class="like"/>
          <img src="../images/dislike.png" class="dislike"/>
        </div>
        <div class="info">
          <div class="infoBox">
            <p class="boldText">Eva</p>
            <p>- 23 y.o</p>
            <p>- Female</p>
            <p>- Tallinn</p>
            <p>- Status: I love animals</p>
            <p class="boldText">Interested in</p>
            <p>- Male</p>
            <p>- From Tallinn</p>
            <p>- under 30 y.o.</p>
            <img src="../images/heart.png" class="heart"/>
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
  export default {
    name: 'Home'
  }
</script>

<style src="../style/MainStyle.css" scoped>
</style>
