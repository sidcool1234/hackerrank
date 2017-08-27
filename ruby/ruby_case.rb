#https://www.hackerrank.com/challenges/ruby-case


def identify_class(obj)
  allowed_classes = ['Hacker','Submission','TestCase','Contest']	
  puts allowed_classes.include?(obj.class.to_s) ?  "It's a #{obj.class.to_s}!" : "It's an unknown model"
end


#https://www.hackerrank.com/challenges/closest-number
def closest_number
  
end