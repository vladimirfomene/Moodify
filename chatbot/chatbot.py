from flask import Flask
from flask import request
import json
import time
import random
app = Flask(__name__)


current_users = []


test_symp = ""
@app.route('/', methods=['GET', 'POST'])
def hello():
    convo_starters = ["Hey there! How are you feeling today?", "Today is a great day outside! But are you feeling great today?", \
    "I had a great nap...but enough about me, tell me about you.", "Good morning! Or is it actually a good morning?", "Hi hi! What's up with you?"]
    convo_prompters = ["So, how did that make you feel?", "Oh. I see...", "And then what happened?"]
    convo_enders = ["Cool! Remember to drink water and stay hydrated today. :D", "Great! Remember to eat your vegetables today! ;)", \
    "Have fun out there! But use sunscreen if you must."]
    danger_signs = ["I suggest you contact a close friend or family member. Remember, you are not alone!", \
     "Reach out to a loved one. They always have your best interests at heart!", "Contact your loved ones or reach out to emergency helplines"]
     ## have local database of suicide prevention helplines for the user's location?
    user_list = []; convo_started = False
    global current_users
    if len(request.form["message"]) < 2:
        return json.dumps("Hmm... I didn't quite catch that...")
    for user_dict in current_users:
        for e in list(user_dict.keys()):
            user_list.append(e)
    if request.form["user_id"] not in user_list:
        msg = random.choice(convo_starters); convo_started = True
        user_list.append(request.form["user_id"])
        return json.dumps({"message":msg, "flag":0}) # "message" has message string, "flag" can indicate stop chat or something
    elif request.form["user_id"] in user_list:
        print("OLD")
        user_ind = 0
        for i in range(len(current_users)):
            if request.form["user_id"] == list(current_users[i].keys())[0]:
                user_ind = i; break
            convo_started = False
        if "i" in request.form["message"].lower():
            if "fine" in request.form["message"].lower() or "good" in request.form["message"].lower() or "well" in request.form["message"].lower():
                msg = random.choice(convo_enders)
                return json.dumps({"message":msg, "flag":0})
        words = request.form["message"].split(" ")
        for word in words:
            danger_signs_list = ["suicide", "kill"] # have to write more words 
            convo_enders_list = ["goodbye", "bye", "talk to you later", "ttyl"]
            if word in danger_signs_list:
                return json.dumps({"message":random.choice(danger_signs), "flag":1}) # 1 means stop chat
            elif word in convo_enders_list:
                return json.dumps({"message":random.choice(convo_enders), "flag":1}) 
        if test_symp == "":
       	    return json.dumps({"message":"How do you feel?", "flag":0}) 





if __name__ == '__main__':
    app.run(host='127.0.0.1', port=5000, debug=True)