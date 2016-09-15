# spring-session-redis

A sample project that uses spring-session with Radis NoSQL database. It uses basic in memory authentication with credentials "user:password".

Assumes the Redis instance is running in localhost (https://github.com/MSOpenTech/redis/releases) on default port 6379.

http://localhost:8080 sets prompts for login. After successful login it puts the name on session.

http://localhost:8080/repeat prints the user name stored in session.

After server rebounce http://localhost:8080/repeat should print the name instead of prompting for login again.
