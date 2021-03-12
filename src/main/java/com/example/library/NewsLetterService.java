package com.example.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsLetterService {


    private List<Employee> newsletterSubscribers = new ArrayList<>();


    public void registerNewsletterSubscription(Employee employee){
        newsletterSubscribers.add(employee);
    }

    public void unsubscribe(Employee employee){
        newsletterSubscribers.remove(employee);
    }





}
