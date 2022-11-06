### Retrofit ? 서버와의 HTTP 통신을 통해 전달된 데이터를 앱에서 특정 형태로 받아볼 수 있게 하는 라이브러리

### 제일 기본적인 서버연결과 값을 보여주는것이며, spring이 켜져 있어야하고 spring과 값이 같아야한다.

          <uses-permission android:name="android.permission.INTERNET"/>
          android:usesCleartextTraffic="true"
          
![1](https://user-images.githubusercontent.com/110442250/191417313-04523643-c772-4e0d-afcc-6b69ca7ffd7f.png)
![2](https://user-images.githubusercontent.com/110442250/191417318-a174c9fd-778f-4137-909e-cd501186af5e.png)
![3](https://user-images.githubusercontent.com/110442250/191417319-fa095a87-d26a-4b94-8573-a8e487209571.png)

          /* 레트로핏2 (REST API서버랑 통신할 수 있게 도와주는 라이브러리 == ajax)*/
          implementation 'com.squareup.retrofit2:retrofit:2.9.0'
          implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
          implementation group: 'com.google.code.gson', name: 'gson', version: '2.9.0'

![4](https://user-images.githubusercontent.com/110442250/191417321-e88b07e0-cd42-4cbd-9162-8b91e801103b.png)
![5](https://user-images.githubusercontent.com/110442250/191417323-ca02f833-7dd2-446d-86d5-ac8136b58b99.png)
![6](https://user-images.githubusercontent.com/110442250/191417326-b954b81c-3a2f-49eb-9a8c-a2dda092c7fb.png)
![7](https://user-images.githubusercontent.com/110442250/191417346-cc6a7348-21ed-492c-a446-e74ccc7c141e.png)


 <hr>
 
 
![8](https://user-images.githubusercontent.com/110442250/191417351-db5bb04a-9670-4928-8d06-b90cbfd91f8c.png)
![9](https://user-images.githubusercontent.com/110442250/191417357-df33ca82-feaf-4507-9520-75efaceba111.png)
![10](https://user-images.githubusercontent.com/110442250/191417359-3a6712fe-5833-4805-8b35-8ffa3b129767.png)
