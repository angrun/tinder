<template>
  <div class="main">
    <h2>Profile</h2>
    <div class="menu">
      <nav>
        <router-link to="/home" class="link">Home</router-link>
        <router-link to="/chat" class="link">Chat</router-link>
        <router-link to="/profile" class="link">Profile</router-link>
      </nav>
      <router-view/>
    </div>
    <div class="myAccount">
      Here should be users data.
      <div>
        <div class="photo">
          Here should be users photo.
        </div>
        <div class="information">
          Here should be users information.
        </div>
      </div>
      <div class="button">
        Here should be button for information change.
      </div>
    </div>
    <div class="footer">
      Here should be footer.
    </div>
  </div>
</template>

<script>
export default {
  name: 'Profile'
}
</script>

<style src="../style/MainStyle.css" scoped>
</style>
