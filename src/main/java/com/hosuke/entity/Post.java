package com.hosuke.entity;

//import alexp.blog.service.MarkdownConverter;
//import alexp.blog.utils.LocalDateTimePersistenceConverter;
import com.hosuke.service.MarkdownConverter;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Post {

    private Long Id;

    private String title;

    private String shortTextPart;

    private String fullPostText;

    private LocalDateTime dateTime;

    private boolean hidden = false;

    private Collection<Tag> tags = new ArrayList<>();

    private List<Comment> comments = new ArrayList<>();

    private List<PostRating> postRatings = new ArrayList<>();

    public static String shortPartSeparator() {
        return "===cut===";
    }

    public boolean hasShortTextPart() {
        return !StringUtils.isEmpty(shortTextPart);
    }

    public String shortTextPartHtml() {
        return MarkdownConverter.toHtml(getShortTextPart());
    }

    public String fullPostTextHtml() {
        return MarkdownConverter.toHtml(getFullPostText().replace(shortPartSeparator(), ""));
    }

    public List<Comment> topLevelComments() {
        return comments.stream().filter(c -> c.getParentComment() == null).collect(Collectors.toList());
    }

    public int getRatingSum() {
        return postRatings.stream().mapToInt(Rating::getValue).sum();
    }

    public short getUserVoteValue(Long userId) {
        if (userId == null)
            return 0;

        Optional<PostRating> rating = postRatings.stream().filter(r -> r.getUser().getId().equals(userId)).findFirst();
        return rating.isPresent() ? rating.get().getValue() : 0;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTextPart() {
        return shortTextPart;
    }

    public void setShortTextPart(String shortTextPart) {
        this.shortTextPart = shortTextPart;
    }

    public String getFullPostText() {
        return fullPostText;
    }

    public void setFullPostText(String fullPostText) {
        this.fullPostText = fullPostText;
    }

    public Collection<Tag> getTags() {
        return tags;
    }

    public void setTags(Collection<Tag> tags) {
        this.tags = tags;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public List<PostRating> getPostRatings() {
        return postRatings;
    }

    public void setPostRatings(List<PostRating> postRatings) {
        this.postRatings = postRatings;
    }
}