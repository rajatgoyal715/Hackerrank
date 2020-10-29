read exp;
printf "%.3f" $(echo $exp | bc -l)
