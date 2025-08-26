package library.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Base {
    private String id = String.valueOf(UUID.randomUUID());
    private LocalDateTime createdDate = LocalDateTime.now();
    private Boolean visible = Boolean.TRUE;


    public Base() {
    }

    public Base(String id, LocalDateTime createdDate, Boolean visible) {
        this.id = id;
        this.createdDate = createdDate;
        this.visible = visible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", visible=" + visible +
                '}';
    }
}
