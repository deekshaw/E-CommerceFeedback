package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.model.Feedback;

@Service
public class FeedbackService {
	
	@Autowired
	private MyRepo repo;
	
	private static List<Feedback> feedbacks = new ArrayList<Feedback>();
    private static int feedbackCount = 2;
    
    //Displaying existing Feedback
    public FeedbackService() {
        feedbacks.add(new Feedback(1, "Deeksha", "deeksha@gmail.com", "Book Kite Runner", "Book was in good condition",
               "yes"));
        feedbacks.add(new Feedback(2, "Deeksha", "deeksha@gmail.com", "T-shirt - Levis", "Got the wrong size",
                "no"));        
    }    
    
    //Retrieve and Display Feedback
    public List<Feedback> displayFeedback(String uname) {
    	List<Feedback> feedbackList = new ArrayList<Feedback>();
        for (Feedback feedback : feedbacks) {
            if (feedback.getUname().equalsIgnoreCase(uname)) {
                feedbackList.add(feedback);
            }
        }
        return feedbackList;
    }
    
    public Feedback retrieveFeedback(int id) {
        for (Feedback feedback: feedbacks) {
            if (feedback.getId()==id) {
                return feedback;
            }            
        }
        return null;
    }
    
    //Add Feedback
    public void addFeedback(String name, String email, String product, String feedback, String recommend) {
        feedbacks.add(new Feedback(++feedbackCount,name, email, product, feedback, recommend));
        repo.save(feedbacks);
    }
    
    //Update Feedback
    public void updateFeedback(Feedback feedback){
		feedbacks.remove(feedback);
		feedbacks.add(feedback);
    }
    
    //Delete Feedback
    public void deleteFeedback(int id) {
        Iterator<Feedback> iterator = feedbacks.iterator();
        while (iterator.hasNext()) {
            Feedback feedback = iterator.next();
            if (feedback.getId() == id) {
                iterator.remove();
            }
        }
    }
    

}
