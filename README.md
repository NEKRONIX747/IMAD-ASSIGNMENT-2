IMAD ASSIGNMENT 2 REPORT
This is my app report in this document I will be giving my feedback on how this assignment went and how the app functions I will also be including screenshots as well as commenting on the screenshots of my application.
 This specific app is a quiz game which allows the user to choose true or false to 5 questions and a score counter that will display the score on the last screen. This app also utilises three .kt files as well as three .xml files which in turn produces three screens the first screen is a welcome screen with a short introduction and message about the game. The second screen is where all the magic happens this is the main game screen where there will be three buttons a true button a false button and a next button. The true button is linked to the answers that are true so when the users presses true to a question the message will display correct however if it is a false question the displayed message will be incorrect the same applies to the false button. When a user chooses the correct answer the score counter will increment by one if the answer is incorrect no points will be added or deducted from the overall score which is out of five.
The next button use is to iterate through the questions as well as move onto the next page. A while loop was implemented to help with iterating through the questions.

 ![Screenshot 2025-05-21 180913](https://github.com/user-attachments/assets/2e6f234e-b6d0-4e35-b641-40b40cf068fd)

This is my introduction page to my application this where I have added a background to the apps design and added a short message explaining the purpose of the game and a start button. The start button is used to move onto the main game page. 

 ![Screenshot 2025-05-21 180928](https://github.com/user-attachments/assets/d2854284-6165-412a-9c19-b6b67f8c2b1a)

This is the code behind the start button. This code pretty much allows the user to click the start button and the next page will load.
 
 ![Screenshot 2025-05-21 180949](https://github.com/user-attachments/assets/cece9cff-884f-4f55-97fd-6f980b6e3c36)

This is the UI or user interface for my second screen or the main game screen here you can see three buttons. The true button and false button can be used for all questions however through the use of Boolean array there is only 1 right answer per question. The next button is just there to help the user iterate to the next question and the next screen.
 
 ![Screenshot 2025-05-21 181025](https://github.com/user-attachments/assets/14e73293-9b7f-4cdb-9175-1d4d583d2bc8)

![Screenshot 2025-05-21 181109](https://github.com/user-attachments/assets/bdb678ad-21fc-4fe5-88f9-0d31e59c2bc4)

![Screenshot 2025-05-21 181120](https://github.com/user-attachments/assets/6e8ce9aa-23bf-4882-8e51-77ac4a5548fd)

 The three screen shots above are the code behind the main game screen and this is where all the magic happens. In the first screen shot I have defined my parallel arrays one named questions and the other answers. These two arrays work together as the answers array directly relates to the questions array. The index position of each answer matches the index position of each question. I have also initialised my array to index 0 as well as initialised the score counter to 0 as there has been no score totalled yet. I have also set answerselected to false as no answer has been selected. A bit below that section of code is the variable declaration as well as the linking of my variables from .xml to .kt 
In the second screenshot you can see that this is where I am coding my true and false buttons so that when hit dependant on the current question will get the right answer or wrong answer. This is also directly linked to my feed back text view as the wrong answer will display a text saying incorrect and if it is the right answer a text displaying correct will show in the feedback. 
In the next button code is where I have used a while loop to iterate through the questions as well as linking the tally and totalquestions to be used on the next screen where total questions and score will be displayed.
In the last screen shot is the remainder of my code for the next button.
 
![Screenshot 2025-05-21 181131](https://github.com/user-attachments/assets/cceffc52-f176-408b-b6f1-0f27938ed3df)

This is the UI for my final screen the review screen this screen is to display the users score as well as a message or feedback dependant on the score. The review button is used to show all the questions as well as their corresponding answers this is helpful to the user to see where they went wrong. There is also an exit button which will terminate all process and in doing so close the app.
 
 ![Screenshot 2025-05-21 181147](https://github.com/user-attachments/assets/e52ae5e2-7a9d-4e00-b6ca-a2c4175c6522)

This is the code used for my final screen as you can see on the top of the screenshot is where I called the users score as well as calling the total questions which was five. I had also called both the questions array as well as the answers array. Which are respectively called the stringarray and the booleanarray. After I called the arrays I then proceeded to declare my variables and link the .kt to the .xml. the next line of code is just how I displayed the score to the user. The following lines of code are how the feedback is displayed and how the feedback is understood by the IDE and how the IDE calculates what feedback to give dependant on the score. The last thing in my repart is the exit button as you can see I have used the finishaffinity command wich terminates all process and in turn terminates the app. I will include screen shots of the working app below.
 
 ![Screenshot 2025-05-21 185805](https://github.com/user-attachments/assets/1f17bcaa-5022-4266-a3d4-35c47d01d448)

This is my intro screen.
 
 ![Screenshot 2025-05-21 185818](https://github.com/user-attachments/assets/7213f730-40f5-4b30-9c7f-0abc814bc069)

This is my main game page also my first question I haven’t included all the questions as there will be a demonstration in the video

![Screenshot 2025-05-21 185827](https://github.com/user-attachments/assets/7e0f979f-5e76-44e0-9f6a-e7414695224e)

This is the correct answer feedback.
 
 ![Screenshot 2025-05-21 185848](https://github.com/user-attachments/assets/71bee414-2b5a-4a27-b3d5-2cf5f91d2f6c)

This is the incorrect answer feedback.

![Screenshot 2025-05-21 185903](https://github.com/user-attachments/assets/e7891728-0921-40b1-83f1-58d990ca2e6d)

 This is the score screen which shows feedback based on my score as well as my score.
 
 ![Screenshot 2025-05-21 185913](https://github.com/user-attachments/assets/dfd63b7c-28e2-4eea-8450-5fb9d82fc681)

This is the review button at work when hit it’ll display the answers and there corresponding questions

GitHub

Why do we use GitHub? Well, we use GitHub to not only share our code with our lecturers, but it is also a major platform for like-minded people and can be utilized to streamline the process in the classroom and workspace as you can manage many different projects through the repository system as well as getting valuable input from peers and like-minded individuals. (Zagalsky, Feliciano, Storey, Zhao, Wang. 2015)

GitHub Actions

Why do we use something like GitHub actions? We use GitHub actions or GHA as it is referred to in many studies I have read to allow for more seamless workflow. Another reason why we use GHA is for automated testing of our code which allows peers and lecturers a like to test and make sure our code is efficient and flawless with no room for error. (Kinsman, Wessel, Gerosa, Treude. 2021)

MY LINKS

YouTube Link : https://youtu.be/BRua7kHN71Y


 
REFERENCE LIST

Kinsman, T., Wessel, M., Gerosa, M.A. and Treude, C., 2021, May. How do software developers use github actions to automate their workflows?. In 2021 IEEE/ACM 18th International Conference on Mining Software Repositories (MSR) (pp. 420-431). IEEE.

Author: OpenAI
 AI: ChatGPT
    URL: https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
    
Zagalsky, A., Feliciano, J., Storey, M.A., Zhao, Y. and Wang, W., 2015, February. The emergence of github as a collaborative platform for education. In Proceedings of the 18th ACM conference on computer supported cooperative work & social computing (pp. 1906-1917).

Author: Zhara Bulbulia
Url: https://github.com/zb662000/Assignment2/tree/main
