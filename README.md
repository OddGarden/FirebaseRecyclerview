# FirebaseRecyclerview



Summary: Simple app with a button. When clicked, a list of helpful resources can be viewed. Each resource can be viewed on the user's default browser. A user can also add valid links to the list. This app uses Firebase Real Time Database.

-----------------------------------------------------------------------------------------------------------------------------

My Two Cents: As I was working with Firebase on android development, I found it interesting that there were several different suggestions on how to setup a recyclerview. Of course the information spans years and some of it is outdated.  I opted to setup a quick example in order to undertand how it works. This example was completed in 2019. This is what I learnt:

--> Make sure to register your app on Firebase. This may seem like a 'duh' step for anyone familiar with Android Dev but for a newbie, this is worth a reminder/mention. The "how to" guide can easily be located on the android documentation here: https://developer.android.com

--> Avoid deep nest structures with firebase. You want the the data to be easily accessible. Take some time to figure this out. In my example:

   ![Alt text](screenshots/firebase_structure.png?raw=true "Firebase Screenshot")
            
--> Use a Model class. In my own simple understanding; this addresses the issue on how to structure the firebase data that will appear on the app. 


End result:


<img src="https://github.com/OddGarden/FirebaseRecyclerview/blob/master/screenshots/main.png" alt="Your image title" width="250"/>

<img src="https://github.com/OddGarden/FirebaseRecyclerview/blob/master/screenshots/addLink.png" alt="Your image title" width="250"/>


 

