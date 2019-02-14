<template>
  <div class="main">
    <h2>Home</h2>
    <div class="menu">
      <nav>
        <router-link to="/home" class="link">Home</router-link>
        <router-link to="/chat" class="link">Chat</router-link>
        <router-link to="/profile" class="link">Profile</router-link>
      </nav>
      <router-view/>
    </div>
    <div class="users">
      <div class="photo">
        Here should be users photo.
      </div>
      <div class="description">
        Here should be user's description.
      </div>
      <div class="buttons">
        Here should be buttons like/dislike.
      </div>
    </div>
    <div class="footer">
      Here should be footer.
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
