/**
  * Copyright 2021 bejson.com 
  */
package com.example.myapplication10;

/**
 * Auto-generated: 2021-10-30 1:31:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Result {

    private String title;
    private String share_url;
    private String author;
    private String item_cover;
    private long hot_value;
    private String hot_words;
    private long play_count;
    private long digg_count;
    private int comment_count;
    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setShare_url(String share_url) {
         this.share_url = share_url;
     }
     public String getShare_url() {
         return share_url;
     }

    public void setAuthor(String author) {
         this.author = author;
     }
     public String getAuthor() {
         return author;
     }

    public void setItem_cover(String item_cover) {
         this.item_cover = item_cover;
     }
     public String getItem_cover() {
         return item_cover;
     }

    public void setHot_value(long hot_value) {
         this.hot_value = hot_value;
     }
     public long getHot_value() {
         return hot_value;
     }

    public void setHot_words(String hot_words) {
         this.hot_words = hot_words;
     }
     public String getHot_words() {
         return hot_words;
     }

    public void setPlay_count(long play_count) {
         this.play_count = play_count;
     }
     public long getPlay_count() {
         return play_count;
     }

    public void setDigg_count(long digg_count) {
         this.digg_count = digg_count;
     }
     public long getDigg_count() {
         return digg_count;
     }

    public void setComment_count(int comment_count) {
         this.comment_count = comment_count;
     }
     public int getComment_count() {
         return comment_count;
     }

    @Override
    public String toString() {
        return "Result{" +
                "title='" + title + '\'' +
                ", share_url='" + share_url + '\'' +
                ", author='" + author + '\'' +
                ", item_cover='" + item_cover + '\'' +
                ", hot_value=" + hot_value +
                ", hot_words='" + hot_words + '\'' +
                ", play_count=" + play_count +
                ", digg_count=" + digg_count +
                ", comment_count=" + comment_count +
                '}';
    }
}