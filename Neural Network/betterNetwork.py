import sys
import numpy 
from sklearn.neural_network import MLPClassifier
from datetime import datetime
import math

"""
Read in the training and test files from the command line
or use the default values
"""
trainingFileName = "data/data_train_5000.txt"
testFileName = "data/data_test_10.txt"

if(len(sys.argv) != 1 and len(sys.argv) != 3):
    print("wrong number of args... exiting")
    sys.exit()
elif(len(sys.argv) == 3): 
    trainingFileName = sys.argv[1] # (sys.argv[0] is the script filename)
    testFileName = sys.argv[2]


"""
Read training data into a big matrix (an array of arrays).
Ok for relatively small files but may need a smarter system for large files.
Also read target values into an array.
"""
training_data_matrix = []
training_target_values = [] # i.e. true values

with open(trainingFileName) as train_file:
    for line in train_file:
        all_values = line.split(',')
        training_data_matrix.append(list(map(float, all_values[1:])))
        training_target_values.append(int(all_values[0]))

"""
Create and train the classifier.
MLP = Multi-Layer Perceptron.
"""
classifier = MLPClassifier(solver='adam', activation='relu', alpha=1e-5, early_stopping = True)
classifier.fit(training_data_matrix, training_target_values)


"""
Read in some test data.
"""
test_data_matrix = []
test_target_values = [] # i.e. true values
n=0

with open(testFileName) as test_file:
    for line in test_file:
        all_values = line.split(',')
        test_data_matrix.append(list(map(float, all_values[1:])))
        test_target_values.append(int(all_values[0]))
        print (n)
        n += 1
        

"""
Now test the classifier on the test data and print results

score outputs a percent and it is multiplied by the number or events (len of predictions) to get the score in 'correct out of total' format
"""

correct_matrix = []
predictions = classifier.predict(test_data_matrix)   #may be able to remove
for correct in range(0,len(predictions)):
    if predictions[correct] == test_target_values[correct]:
        correct_matrix[correct] = 1
    else:
        correct_matrix[correct] = 0

print (numpy.sum(correct_matrix))
#print (int(score*len(test_data_matrix)), "out of {} correct".format(len(test_data_matrix)))


"""
Seperating into n bins
"""
max_value = 1 ##This should be set by input or by testing the data for a max value
bins_temp = 0
bins_all = []
bins = int(input("number of bins? "))
bin_width = max_value/bins

## the v'#' is the coordinates. Test before assigning it to the matrix that keeps track of it


for n in len(test_data_matrix):
    v1 = math.floor(test_data_matrix[n][0])
    v2 = math.floor(test_data_matrix[n][1])
    v3 = math.floor(test_data_matrix[n][2])
    v4 = math.floor(test_data_matrix[n][3])
    v5 = math.floor(test_data_matrix[n][4])
    ## matrix with += to keep track of correct if correct   {1}
    ## matrix that keeps track of total for each place      {2}
    ## use numpy to perform matrix calculations on {1}/{2}
    

