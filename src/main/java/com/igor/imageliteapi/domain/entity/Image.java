package com.igor.imageliteapi.domain.entity;

import com.igor.imageliteapi.domain.enums.ImageExtension;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "image")
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "image_name")
    private String name;

    @Column(name = "image_size")
    private Long size;

    @Column(name = "image_extension")
    @Enumerated(EnumType.STRING)
    private ImageExtension extension;

    @Column(name = "image_uploadDate")
    @CreatedDate
    private LocalDateTime uploadDate;

    @Column(name = "image_tags")
    private String tags;

    @Column(name = "image_file")
    @Lob
    private byte[] file;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getFileName(){
        return getName().concat(".").concat(getExtension().name());
    }
}
