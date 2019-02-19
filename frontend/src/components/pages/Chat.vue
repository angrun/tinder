<template>
  <div class="main">
    <h2>Chat</h2>
    <div class="menu">
      <nav>
        <div class="navcontent">
          <router-link to="/home" class="link">Home</router-link>
          <router-link to="/chat" class="link">Chat</router-link>
          <router-link to="/profile" class="link">Profile</router-link>
        </div>
      </nav>
      <router-view/>
    </div>
    <div>
      Here should be chat.
      <div class="activeChat">
        <div class="search">
          Search person from chat.
        </div>
        <div class="availableForChat">
          Available users for chat.
        </div>
      </div>
      <div class="messages">
        <div class="body">
          Here should be messages.
          <div class="textFiled">
            Here should be text body.
          </div>
        </div>
      </div>
    </div>
    <div class="footer">
      Here should be footer.
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Chat'
  }
</script>

<style src="../style/MainStyle.css" scoped>
</style>
